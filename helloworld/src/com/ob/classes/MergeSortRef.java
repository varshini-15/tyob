package com.ob.classes;

public class MergeSortRef {
	
	
	
	public static void merge(int a[],int begin, int mid, int end) {
		
		int i = begin;
		int j = mid +1;
		int[] b = new int[a.length];
		int k = begin;
		
		while(i<=mid && j<=end) {
			if(a[i]<= a[j]) {
				b[k] = a[i];
				i++;
				k++;
			}else {
				b[k] = a[j];
				j++;
				k++;
			}
		}
		
		if(i> mid) {
			while(j <= end) {
				b[k] = a[j];
				j++;
				k++;
			}
		}else {
			while(i <= mid) {
				b[k] = a[i];
				i++;
				k++;
			}
		}
		
		for(int i1=begin; i1<k; i1++) {
            a[i1] = b[i1];
		}
	}

	public static void mergesort(int a[],int begin, int end) {
	       if(begin < end) {
	    	   int mid = (begin+end)/2;
	    	   mergesort(a, begin, mid);
	    	   mergesort(a, mid+1, end);
	    	   merge(a,begin, mid, end);
	       }
		
	}
	
	public static void main(String[] args) {
		
		int begin = 0;
		int[] a= {2,3,1,5,22,0,12};
		int end = a.length-1;
		
		
	     mergesort(a,begin, end);
	     
	     for(int i=0; i<=end; i++) {
	    	 System.out.println(a[i]);
	     }
		
		
		
		
		
		 
		
	}

}