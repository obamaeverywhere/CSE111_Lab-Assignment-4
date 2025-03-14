public class Triangle {
    public int side1;
    public int side2;
    public int side3;
    public int perimeter;
    public Triangle(int a, int b, int c) {
        side1=a;
        side2=b;
        side3=c;
    }
    public void triangleDetails() {
        perimeter=side1+side2+side3;
        System.out.println("Three sides of the triangle are: " + side1 + ", " + side2 + ", " + side3);
        System.out.println("Perimeter: " + perimeter);
    }
    public String printTriangleType() {
        if(side1==side2) {
            if(side2==side3) {
                return "This is an Equilateral Triangle.";
            }
            else return "This is an Isosceles Triangle.";
        }
        else return "This is a Scalene Triangle.";
    }
    public void compareTrinagles(Triangle t) {
        if(this!=t) {
            if(this.side1==t.side1 && this.side2==t.side2 && this.side3==t.side3) {
                System.out.println("Addresses are different but the sides of the triangles are equal.");
            }
            else if(this.perimeter==t.perimeter) {
                System.out.println("Only the perimeter of both triangles is equal.");
            }
            else System.out.println("Addresses, length of the sides and perimeter all are different.");
        }
        
        else {
            System.out.println("These two triangle objects have the same address.");
        }
    }
}
