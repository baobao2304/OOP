package demoxongxoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import demoxongxoa.Model.Bike;
import demoxongxoa.Model.Student;

public class test {
	// ex: from scope
	test i;
	static int x = 11; 
    private int y = 33; 
    public void method1(int x) 
    { 
    	test t = new test(); 
        this.x = 22; 
        y = 44; 
  
        System.out.println("Test.x: " + test.x); 
        System.out.println("t.x: " + t.x); 
        System.out.println("t.y: " + t.y); 
        System.out.println("y: " + y); 
    } 
    public  void exDongGoi() {
    	//bao đóng
		Student st = new Student();
    	Scanner sc  = new Scanner(System.in);
		System.out.println("vi du ve dong goi");
		System.out.println("Name:");
		String stName = sc.nextLine();
		System.out.println("Classroom");
		String stClr = sc.nextLine();
		System.out.println("id:");
		String stID = sc.nextLine();
		
				st.setName(stName);
				st.setClassroom(stClr);
				st.setId(stID);
    }
    public static void exKeThua() {

		// ke thua
		System.out.println("vi du ve ke thua");
		SuperST spSt = new SuperST("id 1","ten a","lop a");
		System.out.println("call lop ke thua su dung ham cha");
		System.out.println("call gia tri cha tu gia tri con   super study"+spSt.toString());
		System.out.println("call ham cua con "+spSt.getSuperST());
    }
    public static void exDaHinh() {
    	//da hinh
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
    public void exAssignVariable() {
    	//Assigning value using Assignment Variable
    	
    	int i = 20;
    	int j = i;
    	j++; // will not affect i, j will be 21 but i will still be 20

    	System.out.printf("value of i and j after modification i: %d, j: %d %n", i, j);

    	List<String> list = new ArrayList(2);
    	List<String> copy = list;  

    	copy.add("EUR"); // adding a new element into list, it would be visible to both list and copy
    	copy.add("Dollar");
    	copy.add("Dollar2");
    	System.out.printf("value of list and copy after modification list:\\n  %s, \n copy: %s %n", list, copy);

    	
//    	Output : 
//    		value of i and j after modification i: 20, j: 21 
//    		value of list and copy after modification list: [EUR], copy: [EUR]
//    	    Read more: https://javarevisited.blogspot.com/2015/09/difference-between-primitive-and-reference-variable-java.html#ixzz6WWV2W0qP
//    	khi 1 biến 1  set 1 giá trị và khởi tạo  biến 2 = biến 1 thì:
//    		biến 2 khi thay đổi thì biến 1 sẽ không thay đổi
//    	khi 1 list  set tạo mới cho list 2 = list 1  và add data vào list 2  thì:
//    		cả list 2 sẽ được add data đồng thời lúc đó list1 cũng được add data
    }
    public void exEqual() {
    	int i = 20;
    	int j = 20;

    	if (i == j) {
    	    System.out.println("i and j are equal");
    	}

    	String JPY = new String("JPY");
    	String YEN = new String("JPY");
//      	String JPY = "JPY";
//    	String YEN = "JPY";
    	if (JPY == YEN) {
    	    System.out.println("JPY and YEN are same");
    	}

    	if (JPY.equals(YEN)) {
    	    System.out.println("JPY and YEN are equal by equals()");
    	}
    	
//    	Output :
//    	i and j are equal
//    	JPY and YEN are equal by equals()
//    	khi 2 biến khác nhau được set giá trị bầng nhau thì chúng bằng nhau
//    	khi 2 biến khác nhau được khởi tạo mới với biến tham chiếu  với giá trị bằng nhau chúng k bằng nhau
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test t = new test(); 
		
//	    t.method1(5); 
//		
//	    t.exDongGoi();
//	    exKeThua();
//	    exDaHinh();
//		t.exAssignVariable();
//		t.exEqual();
		
		
		test t1 = new test(); 
		test t2 = new test(); 
	          
	        // Nullifying the reference variable 
	        t1 = null; 
	          
	        // requesting JVM for running Garbage Collector 
	        System.gc(); 
	          
	        // Nullifying the reference variable 
	        t2 = null; 
	          
	        // requesting JVM for running Garbage Collector 
			 Runtime.getRuntime().gc(); 
		// de mo 
	}
	 @Override
	    // finalize method is called on object once  
	    // before garbage collecting it 
	    protected void finalize() throws Throwable 
	    { 
	        System.out.println("Garbage collector called"); 
	        System.out.println("Object garbage collected : " + this); 
	    } 
}