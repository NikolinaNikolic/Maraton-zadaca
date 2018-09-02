import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Zadatak2 {

//	public static void main(String[] args) throws FileNotFoundException {
/*Napisati program koji prolazi kroz fajl maraton.txt, a zatim ispisuje imena ucesnika i njihova vremena sortirane prema
 *  vremenu koje su ostvarili od najmanjeg prema najvecem.
 * 
 */


	    public static void main(String[] args)throws IOException
	    {
	      
	         
	        BufferedReader reader = new BufferedReader(new FileReader("maraton.txt"));
	        ArrayList<Maraton> lista = new ArrayList<Maraton>();
	    
	        String input = reader.readLine();
	         
	        while (input != null)
	        {
	            String[] studenti = input.split(" "); 
	            String ime = studenti[0]; 
	            int vrijeme = Integer.valueOf(studenti[1]);
	           lista.add(new Maraton(ime, vrijeme));
	             
	           input = reader.readLine();
	        }
   
	       Collections.sort(lista, new Comparator<Maraton>(){
	       public int compare(Maraton u1, Maraton u2) {
				return Integer.valueOf(u1.getTime()).compareTo(u2.getTime());
			}
		});
	         
	         
	        for (Maraton student : lista) 
	        {
	            System.out.println(student.ime+" "+student.vrijeme);
	    
	        }
 
	        reader.close();
	         
	      
	    }
	}
		







