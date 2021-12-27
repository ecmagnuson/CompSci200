package LearningOOP;

public class CompareRectangles {
    
    //static block
    static {
        System.out.println("Comparing the areas of 2 rectangles");
    }

    private final int x1;
    private final int x2;
    
    private final int y1;
    private final int y2;
    
    public CompareRectangles(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public double getArea() {
        int xLength = x2 - x1;
        int yLength = y2 - y1;
        
        return xLength * yLength;
    }
    
    public static void main(String[] args) {
        
           CompareRectangles rectangle1 = new CompareRectangles(0,0,10,10);
           CompareRectangles rectangle2 = new CompareRectangles(0,0,5,5);
           
           System.out.println("rectangle 1 area is: " + rectangle1.getArea());
           System.out.println("rectangle 2 area is: " + rectangle2.getArea());
    }
}
