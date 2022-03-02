import java.util.Objects;

public class Vector3D {/*16. Разработайте класс main.Vector3D (вектор в трехмерном пространстве). Вектор хранится
в виде набора своих координат. Методы:
1) конструктор без параметров (создает нулевой вектор),
2) конструктор по координатам,
3) конструктор по двум точкам (main.Point3D),
4) длина вектора,
5) проверка равенства с заданным вектором.*/
        private double x, y, z;

        public Vector3D() {
        }

        public Vector3D(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }


    public Vector3D(Point3D begin, Point3D end) {
            this.x = end.get_x() - begin.get_x();
            this.y = end.get_y() - begin.get_y();
            this.z = end.get_z() - begin.get_z();
        }

        public double get_x() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double get_y() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

        public double get_z() {
            return z;
        }

        public void setZ(double z) {
            this.z = z;
        }

        public void vectorPrint() {
            System.out.println("[" + x + "," + y + "," + z + "]");
        }

        public double vectorLength() {
            return Math.sqrt(x * x + y * y + z + z);
        }

        public boolean vectorEqualityCheck(Vector3D vector) {
            boolean vectorEqualityCheck = false;
            if ((Math.abs(vector.get_x() - x) <= 5e-20) && (Math.abs(vector.get_y() - y) <= 5e-20) && (Math.abs(vector.get_z() - z) <= 5e-20)) {
                vectorEqualityCheck = true;
            }
            return vectorEqualityCheck;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector3D vector3D = (Vector3D) o;
        return Objects.equals(x, vector3D.x) && Objects.equals(y, vector3D.y)
                && Objects.equals(z, vector3D.z);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    @Override
    public String toString() {
        return  "x=" + x +
                ", y=" + y +
                ", z=" + z;
    }
}

