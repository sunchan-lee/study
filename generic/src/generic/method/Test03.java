package generic.method;

import java.util.Arrays;

public class Test03 {
	
	//모든과정 출력하는 함수
	public static void regCourse(Course<?> course) {
		System.out.println("과정명 "+course.getName()+"수강생 "+
				Arrays.toString(course.getStudents()));
		
	}
	
	//학생 과정 출력:: 학생클래스 위는 제한 -> 학생클래스 상속받은 모든클래스 허용
	public static void regCourseStudent(Course<? extends Student> course) {
		System.out.println("과정명 "+course.getName()+"수강생 "+
				Arrays.toString(course.getStudents()));
		
	}
	
	//학생 과정 출략 : 학생 클래스 아래는 제한 -> 학생 클래스 위로 모든클래스 허용
	public static void regCourseSuper(Course<? super Student> course) {
		System.out.println("과정명 "+course.getName()+"수강생 "+
				Arrays.toString(course.getStudents()));
		
	}
	
	//고등학생이상과정++일반인//직장인 제외
	public static void regCourseSuper2(Course<? super HighStudent> course) {
		System.out.println("과정명 "+course.getName()+"수강생 "+
				Arrays.toString(course.getStudents()));
		
	}

	
	
	public static void main(String[] args) {
		Course<Person> personCourse=new Course<Person>("일반인과정", 5);
		
		personCourse.add(new Person());
		personCourse.add(new Worker());
		personCourse.add(new Student());
		personCourse.add(new HighStudent());
		
		regCourse(personCourse);
		
		//워커,, 직장인만 들어갈수 있다.
		Course<Worker> workerCourse=new Course<Worker>("직장인과정", 5);
		Worker worker = new Worker();
		workerCourse.add(worker);
		
		workerCourse.add(new Worker());
		//workerCourse.add(new Person());
		//workerCourse.add(new Student());
		//workerCourse.add(new HighStudent());
		
		regCourse(workerCourse);
		
		//학생과 학생을 상속받은 highstudent만이 들어갈수 있다..
		Course<Student> studentCourse=new Course<Student>("학생과정", 5);
		Student obj=new Student();
		studentCourse.add(obj);
		
		obj=new HighStudent();
		studentCourse.add(obj);
		
		studentCourse.add(new Student());
		studentCourse.add(new HighStudent());
		
		regCourse(studentCourse);
		
		Course<HighStudent> highStudentCourse=new Course<HighStudent>("고등학생과정", 5);
		highStudentCourse.add(new HighStudent());
		
		regCourse(highStudentCourse);
		
		System.out.println("==========");
		
		//regCourseStudent(personCourse);
		//regCourseStudent(studentCourse);
		regCourseStudent(studentCourse);
		regCourseStudent(highStudentCourse);
		
		System.out.println("==========");
		
		//regCourseSuper(workerCourse); //하위제한에 걸림
		regCourseSuper(studentCourse);		
		//regCourseSuper(highStudentCourse);
		regCourseSuper(personCourse);
		
		System.out.println("==========");
		
		regCourseSuper2(personCourse);
		regCourseSuper2(highStudentCourse);
		regCourseSuper2(studentCourse);
		//regCourseSuper2(workerCourse);

	}

}
