package exception;

public class Test03 {

	public static void main(String[] args) {
		
		String [] str = {"123","문자열"};
		try {
		String str1=str[0];
		String str2=str[1];
		//String str3=str[3];
		
		int n1=Integer.parseInt(str1);
		int n2=Integer.parseInt(str2);
		System.out.println(n1+n2);
		}catch(ArrayIndexOutOfBoundsException e) { // 세부적인 exception 처리가 위쪽
			System.out.println("인덱스 범위 아님");
		}catch (NumberFormatException e) {		   // 처리범위가 넓은 예외처리가 아래쪽에 배치
			System.out.println("숫자형 문자열이 아님");
		}finally {
			System.out.println("고치고 실행해주세요");
		}

	}

}
