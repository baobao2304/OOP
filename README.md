# OPP

KẾ THỪA
public class SuperST extends Student{
public SuperST(String id, String name, String classroom) {
		// TODO Auto-generated constructor stub
		super(id,name,classroom);
		this.id = id;
		this.name = name;
		this.classroom = classroom;
	}
	
  
    class Employee {
    float salary = 1000;
}
 
class Programmer extends Employee {
    int bonus = 150;
}
 
public class InheritanceSample1 {
    public static void main(String args[]) {
        Programmer p = new Programmer();
        System.out.println("Programmer salary is: " + p.salary);
        System.out.println("Bonus of Programmer is: " + p.bonus);
    }
}
Kết quả:

Programmer salary is: 1000.0
Bonus of Programmer is: 150

ĐA HÌNH
(class student and class SuperST)


//@Override from student
	@Override
	public String getSuperST1() {
		return "super study man la anh :3";
	}
	//overload from student
	public String getSuperST2(String id,String name) {

		return "student man la anh :3   id:"+id+"	name:"+name;
	}
  
  
TRỪU TƯỢNG


 public abstract class Bike {

	 public abstract void motobike(); 
}

public interface Animal {
	public void animal1();
}	

public class SuperBike extends Bike {
	@Override
	public  void motobike(){
		  System.out.println("bike motobike sp bike");
	}  
}
public class Cat implements Animal{
	@Override
	public void animal1() {
		// TODO Auto-generated method stub
		System.out.println("day la con cat nha :))))))))");
	}
}

BAO ĐÓNG  
các thuộc tính trên chỉ xài được trong class của nó đều đặt là private 
muốn gọi lại dùng chỉ được gọi từ getter setter

Scanner sc  = new Scanner(System.in);
		System.out.println("vi du ve dong goi");
		System.out.println("Name:");
		String stName = sc.nextLine();
		System.out.println("Classroom");
		String stClr = sc.nextLine();
		System.out.println("id:");
		String stID = sc.nextLine();
		//bao đóng
		st.setName(stName);
		st.setClassroom(stClr);
		st.setId(stID);




class Car{
  private Wheels wheel;
  private Battery battery;
  
  /*Ở đâu đó trong project, ta khởi tạo những objects mà đc yêu cầu bởi class này
    Có 2 cách để implement dependency injection
    1. Dựa vào constructor
    2. Dựa vào Setter method
  */
  
  // Dựa vào constructor
  Car(Wheel wh, Battery bt) {
    this.wh = wh;
    this.bt = bt;
  }
  
  // Dựa vào Setter method
  void setWheel(Batter bt){
    this.bt = bt;
  }
  ...  
  ...
}
