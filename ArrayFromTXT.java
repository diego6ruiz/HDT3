/*
 * Diego Ruiz
 * Javier Alvarez
 * 
*/

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayFromTXT {
	
	public ArrayFromTXT() {
	}
	
	public ArrayList<Integer> generateArray(String filename) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		 try {
	            Scanner input = new Scanner(new File(filename));
	            while (input.hasNextLine()) {
	                String line = input.nextLine();
	                int linea = Integer.parseInt(line);
	                numeros.add(linea);
	            }
	            input.close();
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
		 return numeros;
	}


	
}
