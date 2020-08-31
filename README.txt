Default: 
	+ Truy cập trong nội bộ package

Private: 
	+ Truy cập trong nội bộ lớp

Public: 
	+ Thành phần công khai, truy cập tự do từ bên ngoài

Protected: 
	+ Thành phần được bảo vệ, bị hạn chế truy nhập từ bên ngoài

Abstract"  
	+ Trên các phương thức - khi các lớp con phải cung cấp việc triển khai thực tế, 
	nhưng bạn muốn gọi các phương thức này (bất kể chúng được triển khai như thế nào) trong lớp này.
	+ trên các lớp - để biểu thị rằng lớp có thể có các phương thức trừu tượng.
static :
	+ được sử dụng để được sử dụng khi bạn không cần một thể hiện của một lớp (tức là đối tượng) để sử dụng nó:
	+ cho các trường - khi bạn muốn có một trường toàn cầu
	+ cho các phương thức - khi bạn cần các hàm tiện ích không phụ thuộc vào trạng thái đối tượng
Final:
	+ chỉ định giá trị 1 lần không thể thay đổi
	+ trên các lớp và phương thức khi không muốn mở rộng ghi đè thì sử dụng nó
	ex: 
		public "final" void namefun()
		final int employed = 123;
	
	
  Access Modifier
	+ Access modifier là các "từ" dùng trước các khai báo của một class
ex:
	"public" class SuperST
	"public" String getSuperST1()

  Public Access Modifier
	+ Có thể truy cập ở bất cứ đâu. Nó có phạm vi rộng nhất trong tất cả Modifier
	+ Nếu lớp public chúng ta đang cố gắng truy cập là trong một package khác, 
      thì lớp public này vẫn cần được import trước khi truy cập.
    
  Private Access Modifier
	+ Có phạm vi truy cập mang tính hạn chế nhất. Lớp và interface không thể là private.
	+ Biến được khai báo private có thể được truy cập 
      bên ngoài lớp nếu như có tạo phương thức public getter cho biến đó tại lớp đó.
	+"Sử dụng Private Access Modifier trong Java là cách chủ yếu để một đối tượng 
      bao đóng chính nó và ẩn dữ liệu với bên ngoài, giúp an toàn dữ liệu với bên ngoài."

  Protected Access Modifier
	+ Có thể truy cập bên trong package và bên ngoài package nhưng chỉ thông qua tính kế thừa.
	+ Không thể áp dụng cho lớp và interface. Các phương thức và trường có thể khai báo protected, 
      tuy nhiên các "phương thức và trường trong một interface không thể khai báo là protected".
  Default Access Modifier
        + không khai báo một cách rõ ràng một Access Modifier cho một lớp, trường, phương thức, ... 
	+ chỉ có thể truy cập bên trong package.

  Access Modifier và tính kế thừa trong Java
	+ Các phương thức được khai báo public trong một lớp cha cũng phải là public trong tất cả lớp con.
	+ Các phương thức được khai báo protected trong một lớp cha phải hoặc là protected hoặc public trong các lớp con; chúng không thể là private.
	+ Các phương thức được khai báo mà không có điều khiển truy cập (không sử dụng modifier nào) có thể được khai báo private trong các lớp con.
	+ Các phương thức được khai báo private không được kế thừa, do đó không có qui tắc nào cho chúng.


  Scope of Variables In Java
	+ là phạm vi hoạt động của biến tại thời điểm biên dịch thực thi
	+ khi bạn không có khởi tạo tham số mặt định như các biến đã được khai báo với 1 giá trị  thì 
	nếu bạn khởi tạo  mới 1 class "test t = new test();" thì nó sẽ tự mặt định các giá trị biến như các giá trị bạn 
	đã cho trước.
	EX: các trường hợp:
	+ TH1  1 biến trong 1 hàm ,các biến cục bộ sẽ không tồn tại trong 1 hàm khi quá trình thực thi kết thúc 
		class Test
		{
    			private int x;
    			public void setX(int x)
    			{
        			this.x = x;
    			}
		}

	+ TH2 khi bạn không có khởi tạo tham số mặt định như các biến đã được khai báo với 1 giá trị  thì 
	nếu bạn khởi tạo  mới 1 class "test t = new test();" thì nó sẽ tự mặt định các giá trị biến như các giá trị bạn 
	đã cho trước.
			public class Test 
			{ 
    				static int x = 11; 
   				private int y = 33; 
    				public void method1(int x) 
    				{ 
        				Test t = new Test(); 
        				this.x = 22; 
        				y = 44; 
  
        				System.out.println("Test.x: " + Test.x); 
        				System.out.println("t.x: " + t.x); 
        				System.out.println("t.y: " + t.y); 
        				System.out.println("y: " + y); 
    				} 
  
    				public static void main(String args[]) 
    				{ 
        				Test t = new Test(); 
        				t.method1(5); 
    				} 
			} 
	+ TH3 các biến xử lý trong dấu {} có thể được hiểu dưới ví dụ sau 

			public class Test 
			{ 
				public static void main(String args[]) 
				{ 
					{ 
						// The variable x has scope within 
						// brackets 
						int x = 10; 
						System.out.println(x); 
					} 
		
					// Uncommenting below line would produce 
					// error since variable x is out of scope. 

					// System.out.println(x); 
				} 
			} 
			Output:

			10



	Primitive type and reference type ;
		Primitive type 
			+ boolean
			+ Interger
				+ int
				+ long
				+ char
				+ byte
				+ short
			+ Float Point
				+ float
				+ double
		Reference type
			+ class
			+ array
			+ enum
			+ interface
		Null Type
		
				
Garbage Collection in Java(Thu gom rác)
	Học để làm gì ?
		+ Học cái này để optimize app , nó có công việc tạo và hủy các đối tượng nó giúp tránh lỗi tràn bộ nhớ hay liên quan đến bộ nhớ với xác suất thấp nhất
		+ mục tiêu lớn nhất của  Garbage Collection  là giúp giải phóng bộ nhớ các đối tượng k thể truy cập
	EX:
		Integer i = new Integer(4);
		// the new Integer object is reachable  via the reference in 'i' 
		i = null;
		// the Integer object is no longer reachable. 
	
	Khi nào thì cần thu gom giải phóng bộ nhớ ?
		+ vô hiệu hóa biến tham chiếu  (Null)
		+ chỉ định lại biến tham chiếu
		+ Đối tượng được tạo bên trong phương thức
		+ Đảo Cô lập
	Using System.gc() method : dùng để khởi tạo trình thu gom rác 
	Using Runtime.getRuntime().gc() method :khởi tạo gom rác ứng dụng giao diện đang chạy

	Chú ý : cả 2 đều như nhau và không đảm bảo rằng trình thu gom rác sẽ được chạy

	tóm tắt lại những gì đã học:
		OOP có gì ?
			kế thừa , đa hình , bao đóng , trừ tượng
nguồn : 
https://viblo.asia/p/private-public-protected-va-default-trong-java-WAyK80yWKxX

https://stackoverflow.com/questions/5083232/usage-patterns-for-private-static-final-public-abstract-keywords-in-java

https://www.geeksforgeeks.org/variable-scope-in-java/

https://javarevisited.blogspot.com/2015/09/difference-between-primitive-and-reference-variable-java.html#:~:text=Reference%20variables%20are%20not%20pointers,denotes%20the%20absence%20of%20value

https://www.geeksforgeeks.org/garbage-collection-java/
