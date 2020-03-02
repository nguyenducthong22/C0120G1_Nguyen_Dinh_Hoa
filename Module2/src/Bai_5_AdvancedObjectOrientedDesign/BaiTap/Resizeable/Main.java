package Bai_5_AdvancedObjectOrientedDesign.BaiTap.Resizeable;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(3, "red", true);
        Shape rectangle = new Rectangle(3, 4, "Blue", true);
        Shape square = new Square(3, "yellow", true);

        Shape[] shapes = new Shape[3];
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = square;
        for (Shape s : shapes) {
            if (s instanceof Colorable) {
                System.out.println(((Square) s).getArea());
                ((Square) s).howToColor();
            }

            if (s instanceof Circle) {
                System.out.println(((Circle) s).getArea());
                ((Circle)s).resize(Math.random()*100+1);
                System.out.println(((Circle) s).getArea());
            }
            else if (s instanceof Square) {
                System.out.println(((Square) s).getArea());
                ((Square)s).resize(Math.random()*100+1);
                System.out.println(((Square) s).getArea());
            }
            else if (s instanceof Rectangle) {
                System.out.println(((Rectangle) s).getArea());
                ((Rectangle)s).resize(Math.random()*100+1);
                System.out.println(((Rectangle) s).getArea());
            }
        }


    }
}
