public class Sorts{
    
    public static void insertionSort(int[] data){
	int nextIndex = 1;
	int value = 0;
	int shift = 0;
	while (nextIndex < data.length){
	    value = data[nextIndex];
	    if (value < data[nextIndex-1]){
		while (nextIndex > 0 && data[nextIndex-1] > value){
		    nextIndex--;
		    shift++;
		}
		for (int x = nextIndex + shift; x > nextIndex; x--){
		    data[x] = data[x-1];
		}
		data[nextIndex] = value;
		shift = 0;
		printArray(data);
	    }
	    nextIndex++;
	}
    }

    public static void selectionSort(int[] data){
	int startIndex = 0;
	int switchIndex = 0;
	int value = 0;
	while (startIndex < data.length){
	    value = data[startIndex];
	    for (int x = startIndex; x < data.length;x++){
		if (value > data[x]){
		    value = data[x];
		    switchIndex = x;
		}
	    }
	    printArray(data);
	    data[switchIndex] = data[startIndex];
	    data[startIndex] = value;
	    startIndex ++;
	    value = 0;
	}
    }

    public static void bubbleSort(int[]data){
	int value = 0;
	int endIndex = data.length;
	boolean change = false;
	boolean stop = false;
	while (endIndex > 0 || stop == false){
	    for (int x = 0; x < endIndex-1; x++){
		value = data[x];
		if (data[x] > data[x+1]){
		    data[x] = data[x+1];
		    data[x+1] = value;
		    change = true;
		}
		value = 0;
	    }
	    printArray(data);
	    endIndex --;
	    if (change == false){
		stop = true;
	    }
	    change = false;
	}
    }
    
    public static void fillWithRandom(int[]data){
	for (int x = 0; x < data.length; x++){
	    data[x] = Math.random()*Integer.MAX_VALUE;
	}
    }

    public static void printArray(int[]data){
        String ans = "";
	for (int x = 0; x < data.length-1; x ++){
	    ans+= " " + data[x] + ",";
	}
	System.out.println("[" + ans + " " + data[data.length-1] + "]");	
    }
    
}
