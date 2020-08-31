package demoxongxoa.Model;

public class Student {

	
	public Student(String id, String name, String classroom) {
		super();
		this.name = name;
		this.classroom = classroom;
		this.id = id;
	}
	public Student() {
		// TODO Auto-generated constructor stub
		
		this.id = "123 st";
		this.name = "ten mac dinh st";
		this.classroom = "lop mac dinh st";
	}
	private String name;
	private String classroom;
	protected String id;
	public String getSuperST() {
		return "student man la anh :3";
	}
	public String getSuperST1() {
		return "student man la anh :3";
	}
	public String getSuperST2(String id,String name) {

		return "student man la anh :3: id"+id+"   name:"+name;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", classroom=" + classroom + ", id=" + id + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassroom() {
		return classroom;
	}
	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
