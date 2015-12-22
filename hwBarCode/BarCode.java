public class BarCode {//implements Comparable{
    // instance variables
    private String _zip;
    private int _checkDigit;
    private static String[] barScheme = {"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::","||:::"};

    // constructors
    //precondtion: zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //               or zip contains a non digit
    //               _zip and _checkDigit are initialized.
    public BarCode(String zip) {
	if (!(zip.length() == 5)){
	    throw new IllegalArgumentException("Must be of length 5 you fool!");
	}
	for (int x = 0; x < zip.length();x++){
	    if (Character.getNumericValue(zip.charAt(x)) == -1){
		throw new IllegalArgumentException("Must be numerical you fool!");
	    }
	}
	_zip = zip;
	_checkDigit = checkSum();
    }

    // postcondition: Creates a copy of a bar code.
    public BarCode(BarCode x){}


    //post: computes and returns the check sum for _zip
    private int checkSum(){
	int ans = 0;
	for (int i = 0; i < _zip.length();i++){
	    ans += Character.getNumericValue(_zip.charAt(i));
	}
        return ans%10;
    }

    //postcondition: format zip + check digit + barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){
	return "";
    }


    public boolean equals(Object other){
	return this == other ||
	       (other instanceof  BarCode &&
	       _zip.equals(((BarCode)other)._zip));
    }
    // postcondition: false if the object is not a BarCode, 
    // false if it is a non-matching barcode
    // true when they match.


    public int compareTo(Comparable other){
	return toString().compareTo(other.toString());
    }
    // postcondition: compares the zip + checkdigit

    public static void main(String[]args){
	BarCode test = new BarCode("12355");
    }
}
