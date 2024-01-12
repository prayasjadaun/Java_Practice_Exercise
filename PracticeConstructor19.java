

 
class Cylinder {
    private int radius;
    private int height;
    
    public Cylinder(int radius, int height) {
        this.height = height;
        this.radius = radius;
    }
    
    public int getRadious() {
        return radius;
    }
    
    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    public int getHeight() {
        return height;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }
    
    public double volume() {
        return Math.PI * radius * radius * height;
    }
    
}
    



public class PracticeConstructor19 {
    public static void main(String[] args) {
        
          
          Cylinder myCylinder = new Cylinder(9, 12);
          myCylinder.setHeight(12);
          System.out.println(myCylinder.getHeight());
          myCylinder.setRadius(9);
          System.out.println(myCylinder.getRadious());
          System.out.println(myCylinder.surfaceArea());
          System.out.println(myCylinder.volume());
         
        
    }
}
