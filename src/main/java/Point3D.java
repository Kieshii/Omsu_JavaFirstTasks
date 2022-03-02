import java.util.Objects;
import java.util.Scanner;

public class Point3D {
    protected double x = 0;
    protected double y = 0;
    protected double z = 0;

    public Point3D(){
        x = 0.0;
        y = 0.0;
        z = 0.0;
    }
    public Point3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double get_x(){
        return x;
    }
    public double get_y(){
        return y;
    }
    public double get_z(){
        return z;
    }
    public void set_x(double x){
        this.x = x;
    }
    public void set_y(double y){
        this.y = y;
    }
    public void set_z(double z){
        this.z = z;
    }

    @Override
    public String toString() {
        return "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public boolean pointCheckEquality(Point3D pointOne) {
        boolean pointEquality = false;
        if ((Math.abs(pointOne.get_x() - x) <= 5e-20) && (Math.abs(pointOne.get_y() - y) <= 5e-20) && (Math.abs(pointOne.get_z() - z) <= 5e-20)) {
            pointEquality = true;
        }
        return pointEquality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3D point3D = (Point3D) o;
        return Double.compare(point3D.x, x) == 0 && Double.compare(point3D.y, y) == 0 && Double.compare(point3D.z, z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите координаты точки в трехмерном простанстве:");
        double x = s.nextDouble();
        double y = s.nextDouble();
        double z = s.nextDouble();
        Point3D pointOne = new Point3D(x, y, z);
        System.out.println("Введите координаты второй точки в трехмерном простанстве:");
        x = s.nextDouble();
        y = s.nextDouble();
        z = s.nextDouble();
        Point3D pointTwo = new Point3D(x, y, z);
        boolean equality = false;
        equality = pointOne.pointCheckEquality(pointTwo);
        if (equality == true) {
            System.out.println("Заданные точки равны.");
        } else {
            System.out.println("Заданные точки не равны.");
        }
        equality = pointOne.pointCheckEquality(pointOne);
        if (equality == true) {
            System.out.println("Первая точка равна сама себе.");
        } else {
            System.out.println("Первая точка не равна сама себе.");
        }
    }
}


