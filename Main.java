import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("What kind of shape do you want to find the Area of? "); 
    System.out.println( "Rectangle " + "or " + "Circle " + "or " + "Triangle "); 
    String Shape = sc.next();
    if (Shape.equals("Rectangle"))
    {
    System.out.println("Enter Length");
    double length = sc.nextDouble();
    System.out.println("Enter Breadth");
    double breadth = sc.nextDouble();
    System.out.println("Enter units");
    String units = sc.next();
    double area = areaOfRectangle(length, breadth);
    System.out.println("Area of the rectangle is " + area + " Square " + units);  
    }else if(Shape.equals("Circle"))
    {
      System.out.println("Enter the radius");
      double r = sc.nextDouble();
      double area = areaOfCircle(r);
      System.out.println("Enter the units");
      String units = sc.next();
      System.out.println("Area of the circle is " + area + " Square " + units);
    }else{
      System.out.println("Enter the height");
      double height = sc.nextDouble();
      System.out.println("Enter the length");
      double length = sc.nextDouble();
      System.out.println("Enter the units");
      double area = areaOfTriangle(height, length);
      String units = sc.next();
      System.out.println("Area of the triangle is " + area + " Square " + units);
    }
  
  }
  
  static double areaOfRectangle(double length, double breadth)
  {
    double area = length * breadth;
    return area;
  }

  static double areaOfCircle(double r)
  {
    double pi = 3.14;
    double areaOfCircle = pi * r * r;
    return areaOfCircle;
  }

  static double areaOfTriangle(double height, double length)
  {
    double area = 0.5 * height * length;
    return area;
  }
 //
}