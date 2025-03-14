// coding task 3

public class Shape2D {
    public int length;
    public int breadth;
    public int height;
    public int base;
    public String name;
    public int side1;
    public int side2;
    public int side3;
    public Shape2D() {
        length=5;
        name="Square";
        System.out.println("A Square has been created with length: " + length);
    }
    public Shape2D(int l, int w) {
        length=l;
        breadth=w;
        name="Rectangle";
        System.out.println("A Rectangle has been created with length: " + length + " and breadth: " + w);
    }
    public Shape2D(int a, int b, String n) {
        name=n;
        height=a;
        base=b;
        System.out.println("A Triangle has been created with height: " + height + " and base: " + base);
    }
    public Shape2D(int a, int b, int c) {
        name="Triangle2";
        side1=a;
        side2=b;
        side3=c;
        System.out.println("A Triangle has been created with the following sides: " + a + ", " + b + ", " + c);
    }
    public void area() {
        if(name=="Square") {
            System.out.println("The area of the Square is: " + 1.0*length*length);
        }
        else if(name=="Rectangle") {
            System.out.println("The area of the Rectangle is: " + 1.0*length*breadth);
        }
        else if(name=="Triangle") {
            System.out.println("The area of the Triangle is: " + 0.5*height*base);
        }
        else if(name=="Triangle2") {
            double s=(side1+side2+side3)/2;
            System.out.printf("The area of the Triangle is: %.3f" , Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)));
        }
    }
}
