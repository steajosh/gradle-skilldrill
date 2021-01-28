import java.util.List;

// Student Class
public class Student{
	// instance vars
	String firstName;
	String lastName;
	List<Course> courseList;

	// constructors
	public Student(String firstName, String lastName, List<Course> courseList){
		this.firstName = firstName;
		this.lastName = lastName;
		this.courseList = courseList;
	}

	// methods
	public static void setFirstName(String name){
		firstName = name;
	}
	public String getFirstName(){return firstName;}
	public static void setLastName(String name){
		lastName = name;
	}
	public String getLastName(){return lastName;}
	public String toString(){return firstName+lastName;}
}

