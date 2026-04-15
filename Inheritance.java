 class Parent {
        int x, y;

        void displayXY() {
            System.out.println("x=" + x + "y=" + y);
        }
    }

    class Child extends Parent {
        int z;

        void calculateSum() {
            System.out.println("Sum = " + (x + y + z));
        }
    }
    
    public class Inheritance {
     public static void main(String[] args) {
        Child obj = new Child();
        obj.x = 5;
        obj.y = 6;
        obj.z = 7;

        obj.displayXY();
        obj.calculateSum();
     }
}
