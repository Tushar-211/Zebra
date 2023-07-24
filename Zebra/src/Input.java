import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Input {
	public static void main(String[] args) throws IOException {
		//FileInputStream fileInputStream = null;
		//Scanner scanner = null;
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("C:\\Users\\tusha\\OneDrive\\Desktop\\new.txt");
			fileWriter.write("Tushar");
			System.out.println("sucess");
			}

		catch (IOException e) {
			e.printStackTrace();
		} finally {
			fileWriter.close();
			//scanner.close();
		}
	}
}
