package Generics_Form;

import java.util.Comparator;

public class Generics_Example  {
	public static void main(String arg[]) {
		car[] cars = new car[5];
		cars[0] = new car(1322, "Black", 1000);
		cars[1] = new car(1562, "White", 9000);
		cars[2] = new car(8982, "Red", 2300);
		cars[3] = new car(2432, "Yellow", 4500);
		cars[4] = new car(8762, "Blue", 7800);
		display(cars);
		//bubbleSort(cars);
		//System.out.println("******");
		//display(cars);
		/*bubbleSort(cars,new Speed_Comparator());
		System.out.println("******===*******");
		display(cars);*/
		bubbleSort(cars,new Price_Comarator());
		System.out.println("******========*******");
		display(cars);
	}

	public static <T> void display(T[] arr) {
		for (T val : arr) {
			System.out.println(val + " ");
		}
	}

	/*public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
		for (int count = 0; count <= arr.length - 2; count++) {
			for (int j = 0; j <= arr.length - count - 2; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}*/
	
	
	
	/*public static <T> void bubbleSort(T[] arr,Comparator<T> comp) {
		for (int count = 0; count <= arr.length - 2; count++) {
			for (int j = 0; j <= arr.length - count - 2; j++) {
				if (comp.compare(arr[j],arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}*/
	
	
	
	
	
	public static <T> void bubbleSort(T[] arr,Comparator<T> comp) {
		for (int count = 0; count <= arr.length - 2; count++) {
			for (int j = 0; j <= arr.length - count - 2; j++) {
				if (comp.compare(arr[j],arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
