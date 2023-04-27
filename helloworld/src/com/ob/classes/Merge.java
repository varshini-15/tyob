package com.ob.classes;

public class Merge {
	public static void merge(int a[], int l, int mid, int h) {
		int b[] = new int[a.length];
		int i = l;
		int j = mid + 1;
		int k = l;
		while(i <= mid && j <= h) {
			if(a[i] < a[j]) {
				b[k] = a[i];
				i++;
				
			} else {
				b[k] = a[j];
				j++;
			}
			k++;
		}
		
		if(i > mid) {
			while(j <= h) {
				b[k] = a[j];
				k++;
				j++;
			}
			
		} else {
			while(i <= mid) {
				b[k] = a[i];
				k++;
				i++;
			}
		}
		for(int x = l;x <= h;x++) {
			a[x] = b[x];
		}
	
	}
	
	public static void mergeSort(int a[], int l, int h) {
		if(l < h) {
			int mid = (l + h )/ 2;
			mergeSort(a, l, mid);
			mergeSort(a, mid + 1, h);
			merge(a,l, mid, h);
			
		}
	}
	
	public static void main(String[] args) {
		int a[] = { 9, 8, 7, 6, 5, 2, 1 };
		mergeSort(a, 0, a.length - 1);
		for(int i = 0;i < a.length - 1;i++) {
			System.out.println(a[i]);
		}
	}
}
