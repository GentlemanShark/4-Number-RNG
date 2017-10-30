import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class RandomNumberGen {
	private static Random r = new Random();
	
	public static void main(String[] args) {
		try {
			PrintStream myconsole = new PrintStream(new File("E://java.txt"));
			System.setOut(myconsole);
			for(int i = 0; i<10; i++) {
				myconsole.print(generateRandom(0,9));
				myconsole.print(generateRandom(0,9));
				myconsole.print(generateRandom(0,9));
				myconsole.print(generateRandom(0,9));
				myconsole.println("");
			}
		}
		catch(FileNotFoundException fx) {
			System.out.println(fx);
		}
		
	}
	
	public static int generateRandom(int min, int max) {
		return r.nextInt(max-min+1) + min;
	}
}

// Signed by: Ya boi GentlemanShark