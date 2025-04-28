package assignment4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Assignment4 {

	public static void main(String[] args) {
		//Area of cities//
		ArrayList<Integer>AreaofCities= new ArrayList<Integer>();
		AreaofCities.add(571);
		AreaofCities.add(289);
		AreaofCities.add(811);
		AreaofCities.add(362);
		AreaofCities.add(748);
		System.out.println("Total area of 3 and 4 :"+ (AreaofCities.get(3)+AreaofCities.get(4)));
		
		//Top 10 tourist places//
				Set<String> TouristPlace= new HashSet<String>();
				TouristPlace.add("Tajmahal");
				TouristPlace.add("QutubMinar");
				TouristPlace.add("Charminar");
				TouristPlace.add("Red fort");
				TouristPlace.add("Golden Temple");
				TouristPlace.add("Mysore");
				TouristPlace.add("Munnar");
				TouristPlace.add("ooty");
				TouristPlace.add("Wayanad");
				TouristPlace.add("Mangalore");
				System.out.println("All tourist place:" +TouristPlace);
				System.out.println("Size of all tourist place:"+ TouristPlace.size());
				
				// list of top 10 tourist//
				int[]Number= new int[10];
				Number[0]= 5;
				Number[1]=8;
				Number[2]=18;
				Number[3]=9;
				Number[4]=2;
				Number[5]= 11;
				Number[6]= 32;
				Number[7]= 48;
				Number[8]= 53;
				Number[9]= 74;
				System.out.println("Average of 5th and 6th is:"+((Number[5]+Number[6])/2));
				
				// Top 5 highest grossing movies//
				
				ArrayList<String> Movies=new ArrayList<String>();
				Movies.add("Kantara");
				Movies.add("Bahubali");
				Movies.add("KGF");
				Movies.add("RRR");
				Movies.add("Pushpa");
				System.out.println("Third movie of the list:"+ Movies.get(3));
				
				
				
				
				
				
				
				
						
						
						
					
		
	
		
		
		
		
		 
	}

}
