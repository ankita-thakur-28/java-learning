public class AbstractClass {

    abstract static class Shape{
        abstract float calculateArea();
    }
    static class Circle extends Shape {
       float radius;

        Circle(float r) {
            radius = r;
        }
         float calculateArea() {
            return(22.0f/7) * radius *radius;
        
         }
    }
     static class Rectangle extends Shape {
        float l, b;

        Rectangle(float l, float b) {
            this.l = l;
            this.b = b;
        }
        float calculateArea(){
            return l * b;
        }
     }   
     public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);

        System.out.println("Circle Area = " + c.calculateArea());
        System.out.println("Rectangle Area = " + r.calculateArea());

     } 
    }
