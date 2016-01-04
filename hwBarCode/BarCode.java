public class BarCode implements Comparable{
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
	for (int x = 0; x < zip.length(); x++){
	    if (!(Character.getNumericValue(zip.charAt(x)) < 10)){
		throw new RuntimeException("Must be numerical you fool!");
	    }
	}
	if (!(zip.length() == 5)){
	    throw new RuntimeException("Must be of length 5 you fool!");
	}else{
	_zip = zip;
	_checkDigit = checkSum();
	_zip = zip + String.valueOf(_checkDigit);
	}
    }

    // postcondition: Creates a copy of a bar code.
    public BarCode(BarCode x){
	_zip = x.getPrezip();
	BarCode newone = new BarCode(_zip);
	_checkDigit = checkSum();
	_zip +=  String.valueOf(_checkDigit);
    }

    public String getPrezip(){
	return _zip.substring(0,_zip.length()-1);
    }

    //post: computes and returns the check sum for _zip
    private int checkSum(){
	int ans = 0;
	for (int i = 0; i < _zip.length();i++){
	    ans += Character.getNumericValue(_zip.charAt(i));
	}
	ans = ans %10;
        return ans;
    }

    //postcondition: format zip + check digit + barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){
	String ans = "";
	for (int x = 0; x < _zip.length()-1; x++){
	    ans += barScheme[Character.getNumericValue(_zip.charAt(x))];
	}
	return ans;
    }


    public boolean equals(Object other){
	return this == other ||
	       (other instanceof  BarCode &&
	       _zip.equals(((BarCode)other)._zip));
    }
    // postcondition: false if the object is not a BarCode, 
    // false if it is a non-matching barcode
    // true when they match.


    public int compareTo(Object other){
	return toString().compareTo(other.toString());
    }
    // postcondition: compares the zip + checkdigit

    public static void main(String[]args){
	//System.out.println(Character.getNumericValue('a'));
	BarCode test = new BarCode("12359");
	//BarCode test2 = new BarCode("oribg");
	BarCode test3 = new BarCode("92452");
	BarCode test4 = new BarCode(test);
	System.out.println(test);
	System.out.println(test4);
	//System.out.println(test2);
	System.out.println(test.equals(test4));
	System.out.println(test.compareTo(test4));
    }
}
