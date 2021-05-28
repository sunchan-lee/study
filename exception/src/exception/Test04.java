package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test04 {

	public static void main(String[] args) {

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("c:/file.txt");
			System.out.println("파일연결완료");
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
		} finally {
			if(fis!=null)try {fis.close();} catch (IOException e) {}
		}

	}

}
