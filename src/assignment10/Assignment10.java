package assignment10;

public class Assignment10 {

	public static void main(String[] args) {
	
		int[] value = new int [7];
		value[0]= 12;
		value[1]= 34;
		value[2]= 11;
		value[3]= 36;
		value[4]= 87;
		value[5]= 98;
		value[6]= 93;
		
		 int[] raw =new int[7];
		 int temp1= 100;
		 int temp2= 0;
		 //system.out.println("max value="+value.length);
		 
		  for(int i=0; i<raw.length; i++) {
			  //system.out.println("max value= "+value[i]);
			  temp1= 100;
			  for(int j=0; j<value.length;j++) {
				  if (temp1>value[j]) {
					  if (temp2<value[j]) {
						  raw[i]= value[j];
						  temp1= value[j];
						  
					  }
				  }
					  
				  }
				  temp2=raw[i];
				  System.out.println("max value="+ temp2);
				  
				  
				  }
				  System.out.println("Second and third highest number is"+ raw[4]+""+raw[5]);
			  }
		  }
	

	
	
					  
				  
			  
			  
		  
		




