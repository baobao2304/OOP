package demoxongxoa;

import java.util.Scanner;

import demoxongxoa.Model.Bike;
import demoxongxoa.Model.Student;

public class test {

	public test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();

		
		
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
		
		System.out.println("vi du ve ke thua");
		SuperST spSt = new SuperST("id 1","ten a","lop a");
		System.out.println("call lop ke thua su dung ham cha");
		System.out.println("call gia tri cha tu gia tri con   super study"+spSt.toString());
		System.out.println("call ham cua con "+spSt.getSuperST());
		
		System.out.println("vi du ve tinh da hinh");
		Student st1 = new SuperST();
		System.out.println("call da hinh ra :"+st1.getSuperST());
		
		System.out.println("overload overiding in java");
		System.out.println("override");
		st1.getSuperST1();
		System.out.println("overroad");
		System.out.println(st1.getSuperST2("id st2","name st2"));
		
		System.out.println("abtract demo");
		Bike bk = new SuperBike();
		bk.motobike();
		
		System.out.println("interface demo");
		Cat ct = new Cat();
		ct.animal1();
	}

}