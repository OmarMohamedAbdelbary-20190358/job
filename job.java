package algo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class job 
{
    
    String name;
    int deadline;
    int profit;
  
    
    public job() {}
  
    public job(String name, int deadline, int profit)
    {
        this.name = name;
        this.deadline = deadline;
        this.profit = profit;
    }
  
    
    static void bestjob(ArrayList<job> arr, int t)
    {
        
        int n = arr.size();
  
        
        Collections.sort(arr,(x1, x2) -> x2.profit - x1.profit);
  
        
        boolean result[] = new boolean[t];
  
        
        String job[] = new String[t];
  
        
        for (int i = 0; i < n; i++) 
        {
            
            for (int j= Math.min(t - 1, arr.get(i).deadline - 1); j >= 0; j--) {
  
                
                if (result[j] == false) 
                {
                    result[j] = true;
                    job[j] = arr.get(i).name;
                    break;
                }
            }
        }
  
        
        for (String jb : job) 
        {
            System.out.print(jb + " ");
        }
        System.out.println();
    }
  
    
    public static void main(String args[])
    {
        ArrayList<job> arr = new ArrayList<job>();

        System .out.println("enter number of operation");
       
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0;
        
        for(int i=0;i<n;i++) {
        	String c=sc.next();
        	int a=sc.nextInt();
        	int b=sc.nextInt();
        	arr.add(new job(c,a,b));
        	if(a>max) {
        	    max=a;
        	    
        	}
        }
        job job = new job();
        job.bestjob(arr,max);
    }
}
