### 姓名：陶元
### 学号：2019322059
### 班级：计G191

## 实验目的
分析学生选课系统
使用GUI窗体极其组件设计窗体界面
完成学生选课过程业务逻辑编程
基于文件包存并读取数据
处理异常
## 业务要求
一、系统角色分析及类设计
例如：学校有人员，分为教师和学生，教师教授课程，学生选择课程。
定义每种角色人员的属性，极其操作方法。
属性实例：  人员（编号，姓名，性别）
           教师（编号，姓名，性别，所授课程）
           学生（编号，姓名，性别，所选课程）
           课程（编号，课程名称，上课地点）


## 代码
package classalter;

public class Personal {
	int id;
	String name;
	String sex;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String toString(){
//		System.out.println("toString is operating");
		return id+name+sex;
	}
	public Personal(int id,String name,String sex){
		this.id=id;
		this.name=name;
		this.sex=sex;
	}

}


package classalter;

public class Student extends Personal {


	private Course course;
	private Teather teather;
	
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Teather getTeather() {
		return teather;
	}
	public void setTeather(Teather teather) {
		this.teather = (Teather) teather;
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
		
	
	public Student(int id, String name, String sex,Course course,Teather teather) {
		super(id, name, sex);
		
			this.course=course;
			this.teather=teather;
		
	
	}



## 实验心得：
通过本次实验，初步实现了学生选课系统窗口的初步设计并能实现学生，教师的选课，退课功能。
