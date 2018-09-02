import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

public class Zadatak5_najbolji_maratonci {

	public static void main(String[] args) throws FileNotFoundException {

		 Scanner input = new Scanner(new File("maraton.txt"));

	     java.io.PrintWriter output=new java.io.PrintWriter("najbolji.txt");

	        String ime = "";
	        int rez = 0;
	      String lista="";
	
	        while (input.hasNext()) {
	        	
	           ime = input.next();
	           rez = input.nextInt();
	      
	            for(int i=0;i<ime.length();i++) {
	          
	            	if(rez<300) {
	    		 lista = ime+rez;
	            	System.out.println(lista );
	           
	        }
	            		   				
	    }
	          
	            output.println(lista);    	    
   
	}
	       
	        output.close(); 
	       input.close();  
	      
}
	 
}

