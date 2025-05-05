package assignment12;

public class Assignment12 {
	
 public static double pow(double x, int n) {
	 
	 if (n==0)
		 return 1;
	 if (n<0) {
		 x=1/x;
		 n =-n;
	 }
	 return fastpow(x,n);
 }
 private static double fastpow(double x, int n) {
	 if (n==0)
		 return 1;
	 double half = fastpow(x,n/2);
	 if (n % 2 ==0) {
		 return half * half;
	 }else {
		 return half * half * x;
		 
	 }
 }
	 
	 
	 

	public static void main(String[] args) {

	double x = 2.0000;
	int n = 0;
	
	System.out.println("pow (" +x +", "+n +")= "+pow(x,n));
	}
	
	

	}



