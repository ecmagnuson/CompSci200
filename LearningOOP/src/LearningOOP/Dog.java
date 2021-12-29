package LearningOOP;

class DogAtt {
    
    private String name;
    private int age;
    
    DogAtt(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}

public class Dog {
    
    public static void main(String[] args) {
        
        DogAtt dog = new DogAtt("Bo", 2);
        
        dog.setName("May");
        System.out.println(dog.getName());
    }
}
