package algo2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
	
	public static void maximum_act(List<Integer> act) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of activities");
		int n;
		n=sc.nextInt();
		List<Integer> list2=new ArrayList<Integer>();

		Integer begin=0;
		Integer end=0;
		for(int i=0;i<n;i++) {
			for(int z=0;z<2;z++) {
				   act.add(sc.nextInt());
				}
			
			if(act.get(0)>end) {
				int element=act.get(0);
				begin=element;
				
				int element2=act.get(1);
				end=element2;
				
				list2.addAll(act);
				act.clear();
			}
			act.clear();
			
		}

		for(int x=0;x<list2.size();x++) {
			if(x%2==0) {
				System.out.print("{");
				System.out.print(list2.get(x)+" , ");
			}
			
			
			if(x%2!=0) {
				System.out.print(list2.get(x));
				System.out.print("}");
			}
		}
	}
	public static void main(String[] args) {

		List<Integer> list2=new ArrayList<Integer>();
		maximum_act(list2);
		
	}
}
