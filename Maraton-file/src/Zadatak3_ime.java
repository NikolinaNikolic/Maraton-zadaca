import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3_ime {

	public static void main(String[] args) throws FileNotFoundException {
/*
 * Napisati program koji pita korisnika da unese ime, a zatim ispisuje vrijeme koje je ucesnik pod tim imenom ostvario u
 *  maratonu citajuci ga iz fajla.
 */

		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite ime");
		String ime=unos.next();
		
	int vrijeme;
		FileReader file=new FileReader("maraton.txt");

		ArrayList<String> lista = new ArrayList<>();
		Scanner input=new Scanner(file);
		boolean postoji = false;
		while (input.hasNext()) {
			if (input.next().equals(ime)) {
				vrijeme=input.nextInt();
				postoji=true;
				System.out.println("Vrijeme je" +vrijeme);
			}}
			if(!postoji) {
				System.out.println("Ne postoji");
			input.close();
			unos.close();
			}
		

	}}	

		
	
