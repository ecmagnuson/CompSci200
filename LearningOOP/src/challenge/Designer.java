package challenge;

public class Designer extends Employee {
    private String object;

    public void setObject(String setObject) {
       object = setObject;
    }

    @Override
    public void printInfo() {
       System.out.println(name + " designs " + object);
    }
 }
