package select;

public class Student extends Personal {


	private Course course;
	private Teacher teather;
	
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Teacher getTeather() {
		return teather;
	}
	public void setTeather(Teacher teather) {
		this.teather = (Teacher) teather;
	}
	public void putcourse(){
		if(course==null){
			System.out.println("Not to choose course");
		}else{
		this.toString();
		}
	}
	public String toString(){
	
//		System.out.println("Student toString is operating");
		return id+name+sex+course+teather.getName();
	}
		
	
	public Student(int id, String name, String sex,Course course,Teacher teather) {
		super(id, name, sex);
		
			this.course=course;
			this.teather=teather;
		
	
	}
	public Course delete() {
		return course=null;
	}

}