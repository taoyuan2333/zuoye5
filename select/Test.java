package select;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		 Course course=new Course(1, "中国", "北京",3,3);
		 Teacher teather=new Teacher(1, "范老师", "man",course);
		 Student student=new Student(1, "陶某", "man",course,teather);
		 System.out.println(student.toString());
		 student.delete();
//		 student.setCourse(null);
//		 student.setTeather(null);
		 student.putcourse();
		 
	}
	

}
