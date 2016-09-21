package com.felight.operations;

import java.util.Scanner;

import org.omg.CORBA.ExceptionList;

public class Project1 {
	
	public static void Bubblesort(int[] array) {
		int n = array.length;
		int k;
		int temp;
		for (int m = n; m >= 0; m--) {
			for (int i = 0; i < n - 1; i++) {
				k = i + 1;
				if (array[i] > array[k]) {
			
					temp = array[i];
					array[i] = array[k];
					array[k] = temp;;
				}
			}
		}
	}
	
	public static void InsertionSort(int[] array){
		int temp;
		for (int i = 1; i < array.length; i++) {
			for(int j = i ; j > 0 ; j--){
				if(array[j] < array[j-1]){
					temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
	}
	
	public static void SelectionSort(int[] array){

		for (int i = 0; i < array.length - 1; i++){
			int index = i;
			for (int j = i + 1; j < array.length; j++)
				if (array[j] < array[index])
						index = j;
				int smallerNumber = array[index];
					array[index] = array[i];
					array[i] = smallerNumber;
		}
	}
	
	class QuickSort {

	    private int input[];
	    private int length;

	    public void sort(int[] numbers) {

	        if (numbers == null || numbers.length == 0) {
	            return;
	        }
	        this.input = numbers;
	        length = numbers.length;
	        quickSort(0, length - 1);
	    }
	    
	    private void quickSort(int low, int high) {
	        int i = low;
	        int j = high;

	        int pivot = input[low + (high - low) / 2];
	        while (i <= j) {
	          
	            while (input[i] < pivot) {
	                i++;
	            }
	            while (input[j] > pivot) {
	                j--;
	            }
	            if (i <= j) {
	                swap(i, j);
	                i++;
	                j--;
	            }
	        }

	        
	        if (low < j) {
	            quickSort(low, j);
	        }

	        if (i < high) {
	            quickSort(i, high);
	        }
	    }

	    private void swap(int i, int j) {
	        int temp = input[i];
	        input[i] = input[j];
	        input[j] = temp;
	    }
	}

	
	public static void main(String[] args) {
		Project1 p1 = new Project1();
		QuickSort q1 = p1.new QuickSort();
		MyMergeSort mms = new MyMergeSort();
		
		int SizeOfArray =0;
		Scanner in = new Scanner(System.in);
		while(true){
		System.out.println("Enter The Size Of Array");
		try{SizeOfArray = in.nextInt();
		}catch(Exception e){
			System.out.println("Please Enter a Valid Number");
			in.nextLine();
			continue;
		}
		int[] Array = new int[SizeOfArray];
		methodA1(Array);
		}
		
		
		
		}


	private static void methodA1(int[] array) {
		// TODO Auto-generated method stub
		public static void methodA(int[] array){
			
			while(true){
		int ch = 0;
		System.out.println("\nChoose Complixity");
		System.out.println("\n 1.Best Case.");
		System.out.println(" 2.Average Case.");
		System.out.println(" 3.Worst Case");
		System.out.println("\nEnter Case Number:");
		try{ch = in.nextInt();
		}catch(Exception e){
			System.out.println("Enter a Valid Case Number");
			in.nextLine();
			continue;
		}
		
		switch(ch){
			case 1:for(int i=0;i <Array.length;i++)
					Array[i]=i+1;
					System.out.println(" Array Of Size "+Array.length+" is Generated For Best Case Scenario");
					break;
			case 2:for(int i=0;i <Array.length;i++)
					Array[i]=(int)(Math.random()*1000);
					System.out.println(" Array Of Size "+Array.length+" is Generated For Average Case Scenario");
					break;
			case 3:for(int i=0;i <Array.length;i++)
					Array[i]=Array.length-i;
					System.out.println(" Array Of Size "+Array.length+" is Generated For Worst Case Scenario");
					break;
					
			default:System.out.println("Invalid Case Number");
		}
		
		}
		
		System.out.println("\nChoose Algorithm:");
		System.out.println("\n 1. Bubble Sort:");
		System.out.println(" 2. Selection Sort:");
		System.out.println(" 3. Merge Sort:");
		System.out.println(" 4. Insertion Sort:");
		System.out.println(" 5. Quick Sort:");
		System.out.println(" 6. Heap Sort:");
		System.out.println(" 7. Benchmark All:");
		System.out.println(" 8. Start Over:");
		System.out.println(" 9. Exit:");
		
		int Alg = in.nextInt();
		
		switch(Alg){
		case 1:	long start1 = System.currentTimeMillis();
				Bubblesort(Array.clone());
				long end1 = System.currentTimeMillis();
				System.out.println(end1-start1);
				break;
		case 2:	long start2 = System.currentTimeMillis();
				SelectionSort(Array.clone());
				long end2 = System.currentTimeMillis();
				System.out.println(end2-start2);
				break;
		case 3:	long start3 = System.currentTimeMillis();
				mms.sort(Array.clone());
				long end3 = System.currentTimeMillis();
				System.out.println(end3-start3);
				break;
		case 4:	long start4 = System.currentTimeMillis();
				InsertionSort(Array.clone());
				long end4 = System.currentTimeMillis();
				System.out.println(end4-start4);
				break;
		case 5:	long start5 = System.currentTimeMillis();
				q1.sort(Array.clone());
				long end5 = System.currentTimeMillis();
				System.out.println(end5-start5);
				break;
		case 6:	long start6 = System.currentTimeMillis();
				long end6 = System.currentTimeMillis();
				System.out.println(end6-start6);
				break;
		case 7:	long start11 = System.currentTimeMillis();
				Bubblesort(Array.clone());
				long end11 = System.currentTimeMillis();
				System.out.println(end11-start11);
				long start21 = System.currentTimeMillis();
				SelectionSort(Array.clone());
				long end21 = System.currentTimeMillis();
				System.out.println(end21-start21);
				long start31 = System.currentTimeMillis();
				mms.sort(Array.clone());
				long end31 = System.currentTimeMillis();
				System.out.println(end31-start31);
				long start41 = System.currentTimeMillis();
				InsertionSort(Array.clone());
				long end41 = System.currentTimeMillis();
				System.out.println(end41-start41);
				long start51 = System.currentTimeMillis();
				q1.sort(Array.clone());
				long end51 = System.currentTimeMillis();
				System.out.println(end51-start51);
				long start61 = System.currentTimeMillis();
				long end61 = System.currentTimeMillis();
				System.out.println(end61-start61);
				break;
		case 8:	main(args); 
		case 9:	System.exit(0);
				
		default:System.out.println("Invalid Algorithm Number");
	}
	}

	
}
