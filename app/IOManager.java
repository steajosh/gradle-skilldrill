import java.util.List

public class IOManager{
	// instance vars
	List<Student> studentList = new ArrayList<Student>();

	// methods
	public Student[] readData(file){dostuff;}
	public static void writeData(file, data: Student[]){dostuff;}

	public static void studentGenerator(readData.something()){
		Gson gson = new Gson;
		for(i=0;i < numStudents;i++){
			studentList.add(i, gson.fromJson(readData.something, Student.class));
		}
}
