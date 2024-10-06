# job
Job Scheduling Problem in Java
This repository contains an implementation of the Job Scheduling Problem in Java. The goal is to schedule a set of jobs with deadlines and profits in such a way that the profit is maximized. Only one job can be scheduled at a time, and each job must be completed before its deadline.

Problem Description
Given n jobs where each job has:

name: A unique identifier for the job.
deadline: The latest time by which the job must be completed.
profit: The profit earned for completing the job.
The task is to schedule these jobs in such a way that the total profit is maximized, while ensuring that each job is completed before its deadline.

Features
Sort Jobs by Profit: The jobs are sorted in descending order of profit to maximize the total earnings.
Greedy Scheduling: The most profitable jobs are scheduled in the latest available time slots before their deadlines.
Job Scheduling Output: The code outputs the names of the scheduled jobs that maximize the profit.
Class Structure
job
A class representing a job with three attributes:

name: The name of the job.
deadline: The deadline by which the job must be completed.
profit: The profit earned from completing the job.
Methods
bestjob(ArrayList<job> arr, int t): This method implements the core job scheduling logic using a greedy approach:
Sorts the jobs by profit in descending order.
Schedules jobs in the latest available time slots before their deadlines.
Prints the list of scheduled jobs.
main(String[] args):
Takes input from the user, including the number of jobs and their details (name, deadline, and profit).
Calls the bestjob method to find and print the optimal job sequence for maximum profit.
