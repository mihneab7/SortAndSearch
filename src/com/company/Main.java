package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int [] array={4,2,3,16,9,8,7,10,13};
	int [] sortedArray;
	int n=array.length;
	int inter,i,swap=-1;
	while (swap!=0) {
		swap=0;
		for(i=0; i<n-1; i++) {
			if (array[i]>array[i+1]) {
				inter=array[i];
				array[i]=array[i+1];
				array[i+1]=inter;
				swap+=1;
			}
		}
	}
	sortedArray=array;
	int x=2,start=0,end=n-1,mid;
	while (start<=end) {
		mid=(start+end)/2;
			if (x == sortedArray[mid]) {
				System.out.println("yes");
				System.exit(0);
			}
			if (x > sortedArray[mid]) {
				start=mid+1;
			}
			if (x < sortedArray[mid]) {
				end=mid-1;
			}
		}
	System.out.println("no");
    }
}
