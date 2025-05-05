package assignment8;

import java.util.ArrayList;
import java.util.List;

public class Assignment8 {

	public static void main(String[] args) {
	
		List<Integer> amount =new ArrayList<Integer>();
		
		amount.add(50000);
		amount.add(-2000);
		amount.add(3000);
		amount.add(-15000);
		amount.add(-200);
		amount.add(-300);
		amount.add(4000);
		amount.add(-3000);
		int credittrans= 0;
		int debittrans= 0;
		int creditamount= 0;
		int debitamount= 0;
		for ( int i=0; i<amount.size();i++) {
			if (amount.get(i)>0) {
				credittrans++;
			}
				
				else if(amount.get(i)<0) {
					debittrans++;
					
					
				}
				
			}
		System.out.println("------------total credit /debit---------");
		
		System.out.println("Total credit transaction="+ credittrans);
		System.out.println("Total debit transaction="+ debittrans);
		
		System.out.println(" ---------Total number of transaction------------");
		for (int i=0;i< amount.size();i++){
			if(amount.get(i)>=0) {
				System.out.println("credittrans=" +amount.get(i));
			}
			else if(amount.get(i)<0) {
				System.out.println("debittrans=" +amount.get(i));
			}
			
			if(amount.get(i)>=0) {
				creditamount += amount.get(i);
			}
			else if(amount.get(i)<0) {
				debitamount+= amount.get(i);
				System.out.println("--------- Total amount of transaction-------"); 
				
				System.out.println("total amount creditrans="+ creditamount);
				System.out.println("total amount debittrans="+ debitamount);
				
				System.out.println("---------Suspicious credit transaction-------"); 
				
				if(amount.get(i)>=10000){
					System.out.println("suspicious credittrans="+ amount.get(i));
					
			}
				else if(amount.get(i)>=10000){
					System.out.println("suspicious debittrans="+ amount.get(i));
					
				}
				}
			System.out.println("------Total Balance-----");
			System.out.println("Total Balance="+(creditamount+debitamount));
		}
	}
}

				
			
		
		
	
	
		
		
		


