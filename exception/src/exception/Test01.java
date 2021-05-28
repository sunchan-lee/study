package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test01 {

	public static void main(String[] args) {
		
		//0으로 나눌수 없다.
		//System.out.println(10/0);
		
		//널인데 뭘합니까
		//String str=null;
		//str.split("/");
		
		//문자열인데
		//String no1="1ㅁ";
		//int num1=Integer.parseInt(no1);
		
		//문자열을 정수로 바꿀려면 이렇게 해야한다.
		//String no2="100";
		//int num2=Integer.parseInt(no2);
		//System.out.println(num2+10);
		
		File file=new File("c:/filepath/a.text");
		try {
			FileInputStream fis=new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); //exception 관련된 내용을 프린트 함.
			System.out.println("파일이 존재하지 않습니다.");
		}
		System.out.println("아래쪽 정상 실행");
		
		try {
			//예외가 발생되는 예상코드
		}catch(Exception e){
			//예외가 발생했을때 처리하는 부분
		}finally {
			//예외던 정상이던 무조건 처리하는 영역
			//필수는 아니고 선택.
		}

	}

}
