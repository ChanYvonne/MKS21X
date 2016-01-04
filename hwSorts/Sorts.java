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
	    }
	    nextIndex++;
	}
    }

    public static void selectionSort(int[] data){
	int startIndex = 0;
	int value = 0;
	while (startIndex < data.length - 1){
	    value = data[startIndex];
	    for (int x = startIndex; x < data.length;x++){
		if (value > data[x]){
		    value = data[x];
		}
	    }
	    data[startIndex] = value;
	    startIndex ++;
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
