package OOP.encapsulation;

public class Student {
	
	private String name;
	private String StID;
	private int age;
	
    public String getName() {
		return name;
		
    }
    
    public void setName (String name) {
	this.name=name;
    }
    
    public String getStID() {
    	return StID;
    }
    public void setStID(String StID) {
    	this.StID=StID;
    }
    
    public int getAge() {
    	return age;
    	
    }
    
    public void setAge(int age) {
    	this.age = age;
    }


}
