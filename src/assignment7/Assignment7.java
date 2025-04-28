package assignment7;

public class Assignment7 {
	static int creditscore = 720;
	static String CustomerName = "John Doe";
	static float income = 55000.0f;
	static boolean employed= true;
	static float DtiRatio = 35.0f;
	

	public static void main(String[] args) {
		if (creditscore > 750) {
			System.out.println("Loan is Aprroved");
		}
		else if (creditscore<=750&&  creditscore >=650) {
			if(income >= 50000){
				if (employed== true) {
					if (DtiRatio<40.0) {
						System.out.println("Loan approved for customer");
						
					}else {
						System.out.println("Loan is Denied");
						
		
					
					}
					
				}else {
					System.out.println("Loan is Denied, Customer is not Eligible");
				}
		}else {
					System.out.println("Loan is Denied");
				}
			}
			
					
				
	

	}

	}

