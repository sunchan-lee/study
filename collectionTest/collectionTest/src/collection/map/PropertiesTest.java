package collection.map;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties properties = new Properties();
		//클래스파일 기준으로 데이터 상대경로를 이용해서 properties 파일을 읽어들일때
		String path=PropertiesTest.class.getResource("dataSource.Properties").getPath();
		System.out.println(path);
		properties.load(new FileReader(path));
		System.out.println("==========");
		
		String driver=(String) properties.get("driver");
		String url=(String) properties.get("url");
		String username=(String) properties.get("username");
		String password=(String) properties.get("password");
		
		System.out.println(driver);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		
		System.out.println("==========");
		//key 중복 불가 set 계열과 흡사한 특징을 지니고 있다.
		Set<Object> set=properties.keySet();
		for(Object obj:set) {
			
			String value=(String)properties.get(obj);
			
			System.out.println(obj+"="+value);
		}

	}

}
