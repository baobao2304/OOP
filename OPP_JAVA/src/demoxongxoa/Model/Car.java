package demoxongxoa.Model;

public class Car {

	public Car() {
		// TODO Auto-generated constructor stub
	}
	public String id;
	public String name;
	public String device;
	
	
	
	public Car(String id, String name, String device) {
		super();
		this.id = id;
		this.name = name;
		this.device = device;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDevice() {
		return device;
	}
	public void setDevice(String device) {
		this.device = device;
	}
	
	
	
}
