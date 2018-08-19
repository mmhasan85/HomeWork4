package OOP.encapsulation;

public class TestStudent {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Hasan");
		student.setStID("8308_TN");
		student.setAge(30);
		
		
		System.out.println("Name:" + student.getName() +" "+ "ID:" + student.getStID() +" "+ "Age:" + student.getAge() );

	}

}
