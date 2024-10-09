//This class tests the MyRectangle and MyPoint classes

public class TestMyRectangle {
  public static void main (String[] args) {

    MyRectangle rect1 = new MyRectangle(1, 5, 6, 1);
    MyRectangle rect2 = new MyRectangle(new MyPoint(3,8), new MyPoint(10,2));

    //Test the toString() method
    System.out.print(rect1);
    System.out.print(rect2);

    //Test the getArea() and getPerimeter()methods
    System.out.print("Area of rect1: " + rect1.getArea());
    System.out.print("Perimeter of rect1: " + rect1.getPerimeter());

    System.out.print("Area of rect2: " + rect2.getArea());
    System.out.print("Perimeter of rect2: " + rect2.getPerimeter());

    //Test the setters
    rect1.setTopLeft(new MyPoint(0,5));
    rect1.setBottomRight(new MyPoint(5,0));
    System.out.print("Updated rect1: " + rect1);
  }
}
