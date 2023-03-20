import java.util.*;

/* These are actually 1 interface and 4 parent class on which interface is implemented 
and their 4 child and public classes and one class with main method 
*/
interface ThreeD {
    double TotalSurfaceArea();
    double LateralSurfaceArea();
    double CurvedSurfaceArea();
    double SurfaceArea();
    double LengthofDiagonal();
    double Volume();
    void execute();
}

class Sphere implements ThreeD{
    int rad;
    Sphere(int rad) {
        this.rad = rad;
    }
    @Override 
    public double SurfaceArea() {
        return 4* 3.14 * this.rad* this.rad;
    }
    @Override 
    public double Volume() {
        return 1.67* 3.14 *Math.pow(this.rad, 3);
    }
    @Override 
    public void execute() {
        System.out.printf("Surface area: ", SurfaceArea());
        System.out.printf("Volume: ", Volume());
    }
    @Override 
    public double TotalSurfaceArea() {
        return 0;
    }
    @Override 
    public double LengthofDiagonal() {
        return 0;
    }
    @Override 
    public double LateralSurfaceArea() {
        return 0;
    }
    @Override 
    public double CurvedSurfaceArea() {
        return 0;
    }
};
class newSphere extends Sphere{
    int rad;
    newSphere(int rad) {
        super(rad);
    }
    
    @Override
    public void execute() {
        System.out.printf("Surface area: ", SurfaceArea());
        System.out.printf("Volume: ", Volume());
    }
}
class Cube implements ThreeD{
    int side;
    Cube(int side) {
        this.side= side;
    }
    @Override
    public double TotalSurfaceArea() {
        return 6*side*side;
    }
    @Override
    public double LateralSurfaceArea() {
        return 4*side*side;
    }
    @Override
    public double Volume() {
        return Math.pow(side, 3);
    }
    @Override
    public double LengthofDiagonal() {
        return side* 1.73;
    }
    @Override
    public void execute() {
        System.out.printf("Total Surface area: %.2f\n", this.TotalSurfaceArea());
        System.out.printf("Lateral Surface area: %.2f\n", this.LateralSurfaceArea());
        System.out.printf("Volume: %.2f\n", this.Volume());
        System.out.printf("Length of Diagonal: %.2f\n", this.LengthofDiagonal());
    }
    @Override 
    public double SurfaceArea() {
        return 0;
    }
    @Override 
    public double CurvedSurfaceArea() {
        return 0;
    }
};
public class newCube extends Cube{
    int side;
    newCube(int side) {
        super(side);
    }
    @Override
    public void execute() {
        System.out.printf("Total Surface area: %.2f\n", TotalSurfaceArea());
        System.out.printf("Lateral Surface area: %.2f\n", LateralSurfaceArea());
        System.out.printf("Length of Diagonal: %.2f\n", LengthofDiagonal());
        System.out.printf("Volume: %.2f\n", Volume());
    }
}
class Cuboid implements ThreeD{
    int len;
    int brea;
    int hei;
    Cuboid(int len, int brea, int hei) {
        this.len = len;
        this.brea= brea;
        this.hei = hei;
    }
    @Override 
    public double TotalSurfaceArea() {
        return 2* (this.len*this.brea + this.brea*this.hei + this.hei*this.len);
    }
    @Override 
    public double LateralSurfaceArea() {
        return 2*(this.len + this.brea) *this.hei;
    }
    @Override 
    public double Volume() {
        return this.len*this.brea*this.hei;
    }
    @Override 
    public double LengthofDiagonal() {
        return Math.sqrt(Math.pow(this.len, 2) + Math.pow(this.brea, 2) + Math.pow(this.hei, 2));
    }
    @Override
    public void execute() {
        System.out.printf("Total Surface area: %.2f\n", this.TotalSurfaceArea());
        System.out.printf("Lateral Surface area: %.2f\n", this.LateralSurfaceArea());
        System.out.printf("Length of Diagonal: %.2f\n", this.LengthofDiagonal());
        System.out.printf("Volume: %.2f\n", this.Volume());
    }
    @Override 
    public double SurfaceArea() {
        return 0;
    }
    
    @Override
    public double CurvedSurfaceArea() {
        return 0;
    }
};
class newCuboid extends Cuboid{
    int len; 
    int brea; 
    int hei; 
    newCuboid(int len, int brea, int hei) {
        super(len, brea, hei);
    }
    @Override
    public void execute() {
        System.out.printf("Total Surface area: %.2f\n", TotalSurfaceArea());
        System.out.printf("Lateral Surface area: %.2f\n", LateralSurfaceArea());
        System.out.printf("Length of Diagonal: %.2f\n", LengthofDiagonal());
        System.out.printf("Volume: %.2f\n", Volume());        
    }
};
class Cylinder implements ThreeD{
    int radi;
    int heig;
    Cylinder(int radi, int heig) {
        this.radi= radi;
        this.heig= heig;
    }
    @Override 
    public double TotalSurfaceArea() {
        return 2*3.14*this.radi* (this.heig + this.radi);
    }
    @Override 
    public double CurvedSurfaceArea() {
        return 2*3.14* this.radi*this.heig;
    }
    @Override 
    public double Volume() {
        return 3.14* this.radi*this.radi*this.heig;
    }
    @Override 
    public void execute() {
        System.out.printf("Total Surface area: ", this.TotalSurfaceArea());
        System.out.printf("Curved Surface area: ", this.CurvedSurfaceArea());
        System.out.printf("Volume: ", this.Volume());
    }
    
    @Override 
    public double LateralSurfaceArea() {
        return 0;
    }
    @Override 
    public double LengthofDiagonal() {
        return 0;
    }
    @Override 
    public double SurfaceArea() {
        return 0;
    }
};
class newCylinder extends Cylinder{
    newCylinder(int radi, int heig) {
        super(radi, heig);
    }
    @Override
    public void execute() {
        System.out.printf("Total Surface area: ", TotalSurfaceArea());
        System.out.printf("Curved Surface area: ", CurvedSurfaceArea());
        System.out.printf("Volume: ", Volume());
    }
}

public class ShapeExec {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        while (true) {
            System.out.println("Select one:\n1.Sphere\n2.Cube\n3.Cuboid\n4.Cylinder\n5.Exit");
            System.out.print("Enter your choice(1-5): ");
            int choice= obj.nextInt();
            System.out.println();
            if (choice == 1) {
                int radius = obj.nextInt();
                newSphere mySphere = new newSphere(radius);
                mySphere.execute();
            }
            else if (choice == 2) {
                int sides = obj.nextInt();
                newCube mycube = new newCube(sides);
                mycube.execute();
            }
            else if (choice == 3) {
                int length = obj.nextInt();
                int breadth= obj.nextInt();
                int height = obj.nextInt();
                newCuboid mycuboid = new newCuboid(length, breadth, height);
                mycuboid.execute();
            }
                else if (choice == 4) {
                int radii = obj.nextInt();
                int heigh = obj.nextInt();
                newCylinder mycylinder = new newCylinder(radii, heigh);
                mycylinder.execute();
            }
            else if (choice == 5) {
                break;
            }
            else {
                System.out.println("Invalid choice");
            }
            System.out.println();
            System.out.print("Do you want to continue: ");
            String cont= obj.next();
            if (cont.equalsIgnoreCase("n")) {
                break;
            }
            System.out.println();
        }
        obj.close();
    }
}
