
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Zadatak7 {

	public static void main(String[] args) throws FileNotFoundException {
		
/*
 * Napisati program koji ucitava imena iz fajla imena.txt, a zatim ih ispisuje sortirane po abecedi.
 */
		FileReader file=new FileReader("imena.txt");

	       String ime;
	       

	       ArrayList<String> lista = new ArrayList<>();
			 Scanner input=new Scanner(file);
			 
		    while (input.hasNext()) {
		        ime = input.next();
		        lista.add(ime);
		    }
		   
		      for (int i = 0; i < lista.size(); i++) {
		           
		         lista.sort(String.CASE_INSENSITIVE_ORDER);
		                 

		      System.out.println(lista.get(i));
}
}

}