
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Zadatak1 {

	public static void main(String[] args) throws FileNotFoundException {
	/*Napisati program koji prolazi kroz fajl maraton.txt i ispisuje ime i vrijeme ucesnika koji je najbrze istrcao maraton.
	
		 * 
		 */


	
	 Scanner input = new Scanner(new File("maraton.txt"));

	        String ime="";
	        int vrijeme;
	       int najbrze_vrijeme=0 ;
	
	        while (input.hasNext()) {
	        	
	           ime = input.next();
	           vrijeme = input.nextInt();
	           
	        
	       
	            for(int i=0;i<ime.length();i++) {
	          
	            	if(vrijeme>najbrze_vrijeme) {
	           		najbrze_vrijeme=vrijeme;
	            		
	            	System.out.print(ime );
	           
	        }
	            				
	    }
	           
	            
	}
	 
	        System.out.println(najbrze_vrijeme); 
	        input.close();             
}
}	



