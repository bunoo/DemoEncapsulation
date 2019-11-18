package demo.encapsulation;

public class AccessStudentDataThroughPublicMethod {

	public static void main(String[] args) {
	
		StudentData stData = new StudentData();
		
		stData.setRollNo(001);
		stData.getRollNo();
		stData.setName("abc");
		stData.getName();
		stData.setDob("01.02.1983");
		stData.getDob();

	}

}
