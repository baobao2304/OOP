package demoxongxoa;

import demoxongxoa.Model.Student;

public class SuperST extends Student{
	// khoi tao class
	private String name;
	private String classroom;
	private String id;
	// khoi tao mac dinh 
	public SuperST() {
		
		this.id = "123 sp";
		this.name = "ten mac dinh sp";
		this.classroom = "lop mac dinh sp";
	}
	//@Override from student
	@Override
	public String getSuperST1() {
		return "super study man la anh :3";
	}
	//overload from student
	public String getSuperST2(String id,String name) {

		return "student man la anh :3   id:"+id+"	name:"+name;
	}
	public SuperST(String id, String name, String classroom) {
		// TODO Auto-generated constructor stub
		super(id,name,classroom);
		this.id = id;
		this.name = name;
		this.classroom = classroom;
	}
	
	public String getSuperST() {
		return "super man la anh :3";
	}
}
