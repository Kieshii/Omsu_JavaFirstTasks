import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class Vector3DArrayTest {

    private Vector3DArray varray = new Vector3DArray(5);
    @BeforeMethod
    public void setUp() {
        Vector3D vector3D = new Vector3D(1.0, 2.0, 3.0);
        varray.changeElement(vector3D, 0);
        Vector3D v = new Vector3D(2.0, 3.0, 2.0);
        varray.changeElement(v, 3);
    }

    @Test
    public void testLength() {
        assertEquals(varray. varrayLength(), 5);
    }

    @Test
    public void testGetElement() {
        assertEquals(varray.getElement(0), new Vector3D(1,2,3));
    }

    @Test
    public void testChangeElement() {
        Vector3D vector3D = new Vector3D(1, 2, 3);
        varray.changeElement(vector3D, 0);
        assertEquals(varray.getElement(0), vector3D);
        vector3D.setX(10);
        assertEquals(varray.getElement(0), vector3D);
    }

    @Test
    public void testGetMaxLength() {
        double length = new Vector3D(2, 3, 2).vectorLength();
        assertEquals(varray.longestVector(), length);
    }

    @Test(dependsOnMethods = {"testGetMaxLength"})
    public void testFindIndex() {
        Vector3D v = new Vector3D(2, 3, 2);
        assertEquals(varray.searchVector(v), 3);
    }

    @Test
    public void testFindIndexZ() {
        Vector3D v = new Vector3D(2, 3, 100);
        assertEquals(varray.searchVector(v), -1);
    }

    @Test
    public void testGetSumOfVectors() {
        Vector3D sum = new Vector3D(3, 5, 5);
        assertEquals(varray.sumArrayVectors(), sum);
    }

    @Test
    public void testGetLinearCombination()  {
        double[] coef = {1, 2, 0, 1};
        Vector3D actual = varray.linearCombination(coef);
        assertEquals(actual, new Vector3D());
    }

    @Test
    public void testGetLinearCombinationWell()  {
        double[] сoef = {1, 2, 0, 0, 1};
        assertEquals(varray.linearCombination(сoef), new Vector3D(1, 2, 3));
    }

    @Test
    public void testGetPointShiftArray() {
        Point3D point = new Point3D(1.0, 1.0, 1.0);
        Point3D[] expected = new Point3D[5];
        for (int i = 0; i < 5; i++) {
            expected[i] = new Point3D(1.0, 1.0, 1.0);
        }
        expected[0] = new Point3D(2.0, 3.0, 4.0);
        expected[3] = new Point3D(3.0, 4.0, 3.0);
        Assert.assertEquals(varray.pointShiftArray(point), expected);
    }
}