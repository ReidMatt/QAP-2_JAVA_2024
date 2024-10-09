//This class model a rectangle using two MyPoint instances for the top-left and bottom-right corners

public class MyRectangle {
  private MyPoint topLeft;
  private MyPoint bottomRight;

  //Constructors
  public MyRectangle(int x1, int y1, int x2, int y2) {
  this.topLeft = new MyPoint(x1, y1);
  this.bottomRight = new MyPoint(x2, y2);
}

public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
  this.topLeft = topLeft;
  this.bottomRight = bottomRight;
}

//Getter and setter for topLeft point

public MyPoint getTopLeft() {
  return topLeft;
}

public void setTopLeft(MyPoint topLeft) {
  this.topLeft = topLeft;
}

//Getter and setter for bottomRight point

public MyPoint getBottomRight() {
  return bottomRight;
}

public void setBottomRight(MyPoint bottomRight) {
  this.bottomRight = bottomRight;
}

//Method to calculate the width of the rectangle

public int getWidth() {
  return Math.abs(bottomRight.getX() - topLeft.getX());
}

//Method to calculate the height of the rectangle
public int getHeight() {
  return Math.abs(topLeft.getX() - bottomRight.getX());
}

//Method to calculate the are of the rectangle

public int getArea() {
  return getWidth() * getHeight();
}

//Method to calculate the perimeter of the rectangle
public int getPerimeter() {
  return 2 * (getWidth() + getHeight());
}

//Override the toString()method for better readability @Override
public String toString() {
  return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + ", width=" + getWidth() + ", height=" + getHeight() + "]";
}

}