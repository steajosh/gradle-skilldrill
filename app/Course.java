// Course class
public class Course{
	// instance vars
	int number;
	String subject;
	String title;

	// constructor
	public Course(int number, String subject, String title){
		this.number = number;
		this.subject = subject;
		this.title = title;
	}

	// methods
	public static void setNumber(int num){number = num;}
	public int getNumber(){return number;}
	public static void setSubject(String subj){subject = subj;}
	public String getSubject(){return subject;}
	public static void setTitle(String title){this.title = title;}
	public String getTitle(){return title;}
	public String toString(){return subject+number.toString()+title}
}
