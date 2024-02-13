package task10_programs;

	public class Person {
	    
	    private String name;
	    private int age;
	    
	    // Constructor
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	    
	    // Getter methods
	    public String getName() {
	        return name;
	    }
	    
	    public int getAge() {
	        return age;
	    }
	    
	     
	    public static void main(String[] args) {
	        Person person = new Person("John", 30);
	        System.out.println("Name: " + person.getName());
	        System.out.println("Age: " + person.getAge());
	    }
	}


