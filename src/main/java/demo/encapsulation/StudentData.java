package demo.encapsulation;

public class StudentData {

	/* In accordance with the OOPs design principles, member data of a class should not be directly accessible from the outside world.
	   In this example, member data is <<private>>, hence it can not be directly accessed from other classes. In case of inheritance,
	   the member data of the parent class needs to be declared as protected. */
	
	private int rollNo;
	private  String name;
	private String dob;
	
	/* In line with the OOPs design principles, outside world should be able to access the data members only through methods so that 
	   log statements can be maintained. So essentially we are binding the data in public methods, wherein we can maintain log
	   statements. This process is called Encapsulation. It is served by <<getters>> and <<setters>>. Through <<set()>> method, we 
	   set/change/initialize the value of data members and through <<get()>> method, we access the value */
	
	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		
		/* 1st place: Since the method has a return type, so if anything which we want to get printed on the console should must be 
		written before the return statement, else it will throw error, "unreachable code" */
		System.out.println ("Roll no accessed");
		return rollNo;
		/* 2nd place: Since the method has a return type, so <<System.out.println ("Roll no accessed");>> throws error, 
	    unreachable code". Hence it is written at 1st place */
	}
	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
		System.out.println ("Roll no changed");
	}
	/**
	 * @return the name
	 */
	public String getName() {
		System.out.println ("Name accessed");
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
		System.out.println ("Name changed");
	}
	/**
	 * @return the dob
	 */
	public String getDob() {
		System.out.println ("dob accessed");
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
		System.out.println ("dob changed");
	}
	
	
	
	
	
}
