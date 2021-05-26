package generic.method;

//와일드카드<?>, 		:제한이 없음 * 모든것
//타입파라미터를 대치하는 구체적인 타입으로 모든 클래스나 인터페이스 타입이 올수 있다..
//타입 파라미터를 대치하는 구체적인 타입으로 상위 타입이나 ㅐ하위타입만 올수 있다.
//<? extends ...>,  : upper bounded wildcard(상위클래스 제한) -> .. 타입 상속받은(하위) 타입만 허용
//<? super ...>     : lower bounded wildcard(하위클래스 제한) -> .. 타입 위로 혀용

class Person{}						//일반인
class Worker extends Person{}		//직장인
class Student extends Person{}		//학생
class HighStudent extends Student{}	//고등학생


public class Course<T> {
	private String name;	//교육과정이름
	private T[] students;	//수강생
	
	public Course(String name, int n) {
		this.name=name;
		//students=(T[n]); 타입 파라미터로 배열선언 불가
	}
	
	public void add(T t) {
		for(int i=0; i<students.length; i++) {
			if(students[i]==null) {
				students[i]=t;
				break;
			}
		}
	}
	

	public T[] getStudents() {
		return students;
	}

	public void setStudents(T[] students) {
		this.students = students;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}


	
	
	

}
