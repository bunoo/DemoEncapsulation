package no.encapsulation;

public class AccessStudentDataDirectly {

	public static void main(String[] args) {
	
		StudentData stData = new StudentData();
		stData.name = "abc";
		stData.rollNo = 123;
		stData.dob = "01.02.1983";

		/* We cannot define a non-static method under <<main()>> method. So there is no way of printing any kind of log statement. We can define only static static method under <<main()>>.
		 
		 * public void showStudentData() {
			System.out.println (The student data is modified);
			System.out.println(stData.name);
			System.out.println(stData.rollNo);
			System.out.println(stData.dob);
		}*/
		
		
		/* Hence go ahead and display the data directly without any method */
		
		System.out.println (stData.name);
		System.out.println(stData.rollNo);
		System.out.println(stData.dob);
		
	}
}