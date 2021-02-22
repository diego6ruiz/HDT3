import java.io.BufferedWriter;
import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException; // Import the IOException class to handle errors
import java.util.ArrayList;

public class TXTGenerator {
	private int numero;
	private ArrayList<Integer> numeros = new ArrayList<Integer>();
	
	public TXTGenerator() {
	}
	
	public void generateTXT(String filename, ArrayList<Integer> array){
		File out = new File(filename);
        FileWriter fw = null;
        // Try block: Most stream operations may throw IO exception
        try {
            // Create file writer object
            fw = new FileWriter(out);
            // Wrap the writer with buffered streams
            BufferedWriter writer = new BufferedWriter(fw);
            for (int i: array) {
            	writer.write(i + "\n");
                i ++;
            }
            // Close the stream
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
				
	}
	
	public void generateRandomTXT(int num){
		File out = new File("random.txt");
        FileWriter fw = null;
        // Try block: Most stream operations may throw IO exception
        try {
            // Create file writer object
            fw = new FileWriter(out);
            // Wrap the writer with buffered streams
            BufferedWriter writer = new BufferedWriter(fw);
            for (int i = 1 ; i <= num; i ++) {
                numero = (int) (Math.random() * num + 1 );
                if (numeros.contains  (numero)) {
                i --;
                } else  {
                numeros.add(numero);
                writer.write(numero + "\n");
                }
            }
            // Close the stream
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
				
	}
}
