import java.util.*;
import java.io.*;
public class Driver{
    public static void main(String[]args){
	/*
	Random rangen = new Random(13524);
	int[] test = new int[10000];
	for (int x = 0; x < test.length; x ++){
	    test[x] = rangen.nextInt(10000);
	}
	//Sorts.printArray(test);
	Sorts.insertionSort(test);
	Sorts.selectionSort(test);
	Arrays.sort(test);
	//Sorts.printArray(test);
	*/
	int[] dogs = {10,9,8,7,6,5,4,3,2,1,0};
	int[] cats = {2,5,4,7,3,8,9,0,1};
	/*
	Sorts.printArray(dogs);
	//Sorts.insertionSort(dogs);
	//Sorts.selectionSort(dogs);
	Sorts.printArray(dogs);	
	*/
	Sorts.printArray(cats);
	//Sorts.insertionSort(cats);
	//Sorts.selectionSort(cats);
	Sorts.bubbleSort(cats);
	Sorts.printArray(cats);	
    }
}
