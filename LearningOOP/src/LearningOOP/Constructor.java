package LearningOOP;


public class Constructor {  
	
	//The constructor. Same name as the class. Used to initialize objects
	Constructor()  
    {  
        System.out.println("Invoking Constructor.");  
    }  
	
	//callable method non-static. possible because we've invoked an object
	public void print() {
		System.out.println("Invoking a Method.");
	}
	
	Constructor(String name) {
		System.out.println(name);
	}
	
	public void lastName(String name) {
		System.out.println("What is your last name: " + name);
		
	}

    public static void main(String[] args) {  
    	
    	//This is creating a new object "obj" and using a constructor.
    	Constructor obj = new Constructor();  
    	
    	//This invokes the method
    	obj.print();
    	
    	
    	// Overloaded constructor
    	Constructor myName = new Constructor("Elliott");  
    	myName.lastName("");
    	
    	
    }       
}  