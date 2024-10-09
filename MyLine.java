//This class models a line definded by two MyPoint objects: begin and end points

public class MyLine {

  private MyPoint begin;
  private MyPoint end;

  //Constructors

  public MyLine(int x1, int y1, int x2, int y2) {
    this.begin = new MyPoint(x1, y1);
    this.end = new MyPoint(x2, y2);
  }

  public MyLine(MyPoint begin, MyPoint end) {
  this.begin = begin;
  this.end = end;
}

//Getter and setter for the begin point

public MyPoint getBegin() {
  return begin;
}

public void setBegin(MyPoint begin) {
  this.begin = begin;
}

//Getter and setter for the end point

public MyPoint getEnd() {
  return end;
}

public void setEnd(MyPoint end) {
  this.end = end;
}

//Getters for x and y of the begin point

public int getBeginX() {
  return begin.getX();
}

public int getBeginY() {
  return begin.getY();
}

//Setters for x and y of the begin point
public void setBeginX(int x) {
  begin.setX(x);
}

public void setBeginY(int y) {
  begin.setY(y);
}

//Getters for x and y of the end point/**

public int getEndX() {
  return end.getX();
}

public int getEndY() {
  return end.getY();
}

//Setters for x and y of the end point
public void setEndX(int x) {
  end.setX(x);
}

public void setEndY(int y) {
  end.setY(y);
}

//Return an array containing the x and y of the begin point
public int[] getBeginXY() {
  return begin.getXY();
}

//Return an array containing the x and y of the end point

public int[] getEndXY() {
  return end.getXY();
}

//Set both x and y for the begin point

public void setBeginXY(int x, int y) {
  begin.setXY(x, y);
}

//Set both x and y for the end point

public void setEndXY(int x, int y) {
  end.setXY(x, y);
}


//Calculate the lenght of the line
public double getLength() {
  return begin.distance(end);
}

//Calculate the gradient of the line
public double getGradient() {
  int xDiff = getEndX() - getBeginX();
  int yDiff = getEndY() - getBeginY();
  return Math.atan2(yDiff, xDiff);
}

//Override toString method for better readability @Override
@Override
public String toString() {
  return "MyLine [begin=" + begin + ", end=" + end + "]";
}

}

 
