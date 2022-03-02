public class Vector3DArray {
    private  final Vector3D[] array;

    public Vector3DArray(int size){
        array = new Vector3D[size];
        for (int i=0; i<size; i++){
            array[i] = new Vector3D();
        }
    }
    public int varrayLength(){
        return array.length;
    }
    public Vector3D getElement(int i){
        return this.array[i];
    }
    public void changeElement(Vector3D vector, int index){
        array[index] = vector;
    }

    public double longestVector(){
        double length = 0;
        for (int i = 0; i < varrayLength(); i++){
            if (length < array[i].vectorLength()){
                length = array[i].vectorLength();
            }
        }
        return length;
    }

    public int searchVector(Vector3D vector){
        for (int i = 0; i<varrayLength(); i++){
            if ((Math.abs(vector.get_x() - array[i].get_x()) <= 5e-20) && (Math.abs(vector.get_y() - array[i].get_y()) <= 5e-20) && (Math.abs(vector.get_z() - array[i].get_z()) <= 5e-20)) {
                return i;
            }
        }
        return -1;
    }

    public Vector3D sumArrayVectors(){
        Vector3D sum = new Vector3D();
        Vector3DProcessor vr = new Vector3DProcessor();
        for (int i = 0; i < varrayLength(); i++){
            sum = vr.vectorSum(sum, array[i]);
        }
        return sum;
    }

    public Vector3D linearCombination(double[] arrayCoefficients) {
        Vector3D resultVector = new Vector3D();
        if (arrayCoefficients.length == array.length) {
            for (int i = 0; i < arrayCoefficients.length; i++) {
                resultVector = new Vector3D(resultVector.get_x() + array[i].get_x() * arrayCoefficients[i], resultVector.get_y() + array[i].get_y() * arrayCoefficients[i], resultVector.get_z() + array[i].get_z() * arrayCoefficients[i]);
            }
        }
        return resultVector;
    }

    public Point3D[] pointShiftArray(Point3D point) {
        if (point == null) {
            throw new IllegalArgumentException("NULL");
        }
        Point3D[] data = new Point3D[this.array.length];
        for (int i = 0; i < this.array.length; i++) {
            data[i] = new Point3D(
                    point.get_x() + array[i].get_x(),
                    point.get_y() + array[i].get_y(),
                    point.get_z() + array[i].get_z()
            );
        }
        return data;
    }
}
