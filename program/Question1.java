package org.jalan.program;

import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {
	
	public static ArrayList<Integer> check(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j< arr.length; j++) {
            	for(int k=j+1; k<arr.length; k++) {
            		if (arr[i]+arr[j]+arr[k]==0) {
            			ArrayList<Integer> ar = new ArrayList<>();
            			ar.add(arr[i]);
            			ar.add(arr[j]);
            			ar.add(arr[k]);
            			return ar;
            		}
            	}
            }
        }
        return null;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array: ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter the Positive or Negative number only: ");
		for(int i=0; i<size; i++) {
			int num=sc.nextInt();
			if(num==0) {
				System.out.println("zero is not allowed.");
				return;
			}
			arr[i]=num;
		}
		sc.close();
		
		ArrayList<Integer> a=check(arr);
        if (a!=null) {
            System.out.println(a);
        } 
        else {
            System.out.println("No such element found.");
        }
    }
}