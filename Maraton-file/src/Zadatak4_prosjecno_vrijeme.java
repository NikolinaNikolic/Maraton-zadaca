import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak4_prosjecno_vrijeme {

	public static void main(String[] args) throws FileNotFoundException {
	/*
	 * Napisati program koji prolazi kroz fajl maraton.txt i ispisuje prosjecno vrijeme koje je bilo potrebno ucesnicima da
	 *  zavrse maraton.
	 */
int zbir=0;

		FileReader file=new FileReader("maraton.txt");

ArrayList<Integer> lista = new ArrayList<>();
Scanner input=new Scanner(file);

while (input.hasNext()) {
	
String ime = input.next();

lista.add(input.nextInt());
}
for(int i=0; i<lista.size();i++) {

	    zbir += lista.get(i);
	   
	
}
System.out.println("Zbir je :" +zbir);
	   System.out.println("Prosjek je :" + (zbir/lista.size()));

}
	

}