package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test05 {

	//예외처리 함 try catch
	public static void main(String[] args) {
		try {
			fileInput();
			fileOutput();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private static void fileOutput() throws FileNotFoundException {
		
	}

	//throws - 예외처리 안함
	private static void fileInput() throws FileNotFoundException {
		FileInputStream fis=null;
		fis = new FileInputStream("file.txt");
		
	}

}
