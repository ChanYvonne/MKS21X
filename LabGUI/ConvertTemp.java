public class ConvertTemp{

    public static double CtoF(double cel){
	return cel*1.8 + 32.0;
    }

    public static double FtoC(double far){
	return (far - 32.0)/1.8; 
    }

    public static void main(String[]args){
	System.out.println(CtoF(-40.0));
	System.out.println(CtoF(100.0));
	System.out.println(FtoC(212.0));
    }
}
