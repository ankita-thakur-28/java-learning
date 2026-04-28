public class SuperClass {

    static class Box {
        double width, height, depth;

        Box(double w, double h, double d) {
            width = w;
            height = h;
            depth = d;
        }

        double volume() {
            return width * height * depth;
        }
    }

    static class BoxWeight extends Box {
        double weight;

        BoxWeight(double w, double h, double d, double m) {
            super(w, h, d);
            weight = m;
        }
    }

    public static void main(String[] args) {
        BoxWeight box1 = new BoxWeight(10, 20, 30, 15);

        System.out.println("Volume = " + box1.volume());
        System.out.println("Weight = " + box1.weight);
    }
}