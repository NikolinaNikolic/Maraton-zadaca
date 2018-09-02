import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Zadatak6_linije {

	public static void main(String[] args) {
	/*
	 * Napisati program koji ispisuje koliko ima linija u fajlu koji se nalazi na sledecoj adresi:
http://www.textfiles.com/science/astronau.txt
	 */
int brojac=0;

		        try {
		        	URL file = new URL("http://www.textfiles.com/science/astronau.txt");
		            BufferedReader bf = new BufferedReader(new InputStreamReader(file.openStream()));

		            while((bf.readLine())!=null) {
		                if(bf.readLine().length() > 0) {
		                    brojac++;
		                }
		            }
		            bf.close();
		        }
		        catch (IOException e) {
		            
		            e.printStackTrace();
		        }
		        System.out.println("Broj linija je " + brojac);
		}
	}


