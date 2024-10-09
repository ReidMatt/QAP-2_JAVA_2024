//This class tests the MyLine and MyPoint classes

public class TestMyLine {
  
  public static void main(String[] args) {

    //Create MyLine objects using both constructors

    MyLine line1 = new MyLine(1, 2, 3, 4);
    MyLine line2 = new MyLine(new MyPoint(0,0), new MyPoint(4, 3));

    //Test the getLength() method

    System.out.print("Length of line1: " + line1.getLength());
    System.out.print("Lenght of line2: " + line2.getLength());

    //Test the getGradient()method

    System.out.print("Gradient of line1: " + line1.getGradient());
    System.out.print("Gradient of line2: " + line2.getGradient());

    //Test the toString() method

    System.out.print(line1);
    System.out.print(line2);

    //Test setters and getters

    line1.setBeginXY(5, 6);
    line1.setEndXY(7, 8);
    System.out.print("New begin point of line1: " + line2.getBegin());
    System.out.print("New end point of line2: " + line2.getEnd());
  }
}
