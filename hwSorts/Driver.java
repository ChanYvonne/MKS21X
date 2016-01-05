public class Driver{
    public static void main(String[]args){
	int[] cats = {1,9,2,7,3,10,8,5};
	Sorts.printArray(cats);
	//Sorts.insertionSort(cats);
	Sorts.selectionSort(cats);
	Sorts.printArray(cats);	
	int[] dogs = {10,9,8,7,6,5,4,3,2,1,0};
	Sorts.printArray(dogs);
	//Sorts.insertionSort(dogs);
	Sorts.selectionSort(dogs);
	Sorts.printArray(dogs);	
    }
}
