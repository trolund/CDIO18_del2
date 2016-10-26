


import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

// Use this class to supply testdata to other classes. Everything is static.
public class Testdata {
	
	// Make constructor private to prevent instantiation
	private void Testdata(){}
	
	static private Scanner inputfile = null;           // input file
	static private String filename = "testdata.txt";   // name of test data input file
	static private int[] linedata = new int[10];       // data extracted from one line of input file
	static private int lineIndex;                      // index to data field in current line

	static protected Scanner getScanner () {
		if (inputfile == null) {
			try {
				inputfile = new Scanner(new File(filename)); // open file
			}
			catch (IOException e) { // error message if the file cannot be opened
	            System.out.println("Cannot read file " + filename + " in " + System.getProperty("user.dir"));
	        }			
		}
		return inputfile;
	}
	
	static void readNextLine () {
		getScanner();
        if (inputfile.hasNextLine()) {
            String line = inputfile.nextLine();  // read one line
            String[] fields = line.split(",");   // split the comma-separated line into fields            
            for (int i = 0; i < fields.length; i++) {
            	int value = Integer.parseInt(fields[i].trim()); // converert each field to an integer
            	linedata[i] = value;
            }	        
        }
        else { // there are no more lines in the file
			System.out.println("End of file " + filename);
			inputfile.close();	
			Arrays.fill(linedata, 0);
		}
        lineIndex = 0;
	}
	
	static public int[] getDice(int numberOfDice) {
		readNextLine();
		lineIndex = 2;
		return Arrays.copyOfRange(linedata, 0, numberOfDice);
	}
	
    static public int getUserDecision() {
    	if (lineIndex >= linedata.length) {
    		return 0;
    	}
    	int result = linedata[lineIndex];
    	lineIndex++;
    	return result;
    }


}
