import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class AscendingMinimaAlgorithmTest {

    /**
     * test of double[] ascendingMinima(double[] array, double[] ascendingMinimaArray)
     */
    @Test
    void ascendingMinima() {
        double[] array = new double[0];
        double[] ascendingMinimaArrayGiven = new double[0];
        double[] ascendingMinimaArray = AscendingMinimaAlgorithm.ascendingMinima(array, ascendingMinimaArrayGiven);
        double[] solution = new double[0];
        assertArrayEquals(solution, ascendingMinimaArray, "Solution of AMA in an empty array should be empty array");

        array = new double[]{6,1,4,3,2,5};
        ascendingMinimaArray = AscendingMinimaAlgorithm.ascendingMinima(array, ascendingMinimaArrayGiven);
        solution = new double[]{1,2,5};
        assertArrayEquals(solution, ascendingMinimaArray, "Solution of AMA in the {6, 1, 4, 3, 2, 5} should be {1, 2, 5}");

        array = new double[]{6,5,4,3,2,1};
        ascendingMinimaArray = AscendingMinimaAlgorithm.ascendingMinima(array, ascendingMinimaArrayGiven);
        solution = new double[]{1};
        assertArrayEquals(solution, ascendingMinimaArray, "Solution of AMA in the {6, 5, 4, 3, 2, 1} should be {1}");

        array = new double[]{1,2,3,4,5,6};
        ascendingMinimaArray = AscendingMinimaAlgorithm.ascendingMinima(array, ascendingMinimaArrayGiven);
        solution = array;
        assertArrayEquals(solution, ascendingMinimaArray, "Solution of AMA in the {1,2,3,4,5,6} should be {1,2,3,4,5,6}");

        array = new double[]{6,5,4,3,2,1,1};
        ascendingMinimaArray = AscendingMinimaAlgorithm.ascendingMinima(array, ascendingMinimaArrayGiven);
        solution = new double[]{1};
        assertArrayEquals(solution, ascendingMinimaArray, "Solution of AMA in the {6, 5, 4, 3, 2, 1, 1} should be {1}");

        array = new double[]{1,9,Double.NEGATIVE_INFINITY,3,-1,Double.POSITIVE_INFINITY,2,2,3};
        ascendingMinimaArray = AscendingMinimaAlgorithm.ascendingMinima(array, ascendingMinimaArrayGiven);
        solution = new double[]{Double.NEGATIVE_INFINITY,-1,2,3};
        assertArrayEquals(solution, ascendingMinimaArray,
                "Solution of AMA in the {1, 9, NEGATIVE_INFINITY, 3, -1, POSITIVE_INFINITY, 2, 2, 3} should be {NEGATIVE_INFINITY, -1, 2, 3}");

        array = new double[]{Double.NEGATIVE_INFINITY,Double.NEGATIVE_INFINITY,Double.NEGATIVE_INFINITY};
        ascendingMinimaArray = AscendingMinimaAlgorithm.ascendingMinima(array, ascendingMinimaArrayGiven);
        solution = new double[]{Double.NEGATIVE_INFINITY};
        assertArrayEquals(solution, ascendingMinimaArray,
                "Solution of AMA in the {NEGATIVE_INFINITY, NEGATIVE_INFINITY, NEGATIVE_INFINITY} should be {NEGATIVE_INFINITY}");

        array = new double[]{Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY};
        ascendingMinimaArray = AscendingMinimaAlgorithm.ascendingMinima(array, ascendingMinimaArrayGiven);
        solution = new double[]{Double.POSITIVE_INFINITY};
        assertArrayEquals(solution, ascendingMinimaArray,
                "Solution of AMA in the {POSITIVE_INFINITY, POSITIVE_INFINITY, POSITIVE_INFINITY} should be {POSITIVE_INFINITY}");

    }

    /**
     * test of double[] ascendingMinima(double[] array)
     */
    @Test
    void ascendingMinima1() {
        double[] array = new double[0];
        double[] ascendingMinimaArray = AscendingMinimaAlgorithm.ascendingMinima(array);
        double[] solution = new double[0];
        assertArrayEquals(solution, ascendingMinimaArray, "Solution of AMA in an empty array should be empty array");

        array = new double[]{6,1,4,3,2,5};
        ascendingMinimaArray = AscendingMinimaAlgorithm.ascendingMinima(array);
        solution = new double[]{1,2,5};
        assertArrayEquals(solution, ascendingMinimaArray, "Solution of AMA in the {6, 1, 4, 3, 2, 5} should be {1, 2, 5}");

        array = new double[]{6,5,4,3,2,1};
        ascendingMinimaArray = AscendingMinimaAlgorithm.ascendingMinima(array);
        solution = new double[]{1};
        assertArrayEquals(solution, ascendingMinimaArray, "Solution of AMA in the {6, 5, 4, 3, 2, 1} should be {1}");

        array = new double[]{1,2,3,4,5,6};
        ascendingMinimaArray = AscendingMinimaAlgorithm.ascendingMinima(array);
        solution = array;
        assertArrayEquals(solution, ascendingMinimaArray, "Solution of AMA in the {1,2,3,4,5,6} should be {1,2,3,4,5,6}");

        array = new double[]{6,5,4,3,2,1, 1};
        ascendingMinimaArray = AscendingMinimaAlgorithm.ascendingMinima(array);
        solution = new double[]{1};
        assertArrayEquals(solution, ascendingMinimaArray, "Solution of AMA in the {6, 5, 4, 3, 2, 1, 1} should be {1}");

        array = new double[]{1,9,Double.NEGATIVE_INFINITY,3,-1,Double.POSITIVE_INFINITY,2,2,3};
        ascendingMinimaArray = AscendingMinimaAlgorithm.ascendingMinima(array);
        solution = new double[]{Double.NEGATIVE_INFINITY,-1,2,3};
        assertArrayEquals(solution, ascendingMinimaArray,
                "Solution of AMA in the {1, 9, NEGATIVE_INFINITY, 3, -1, POSITIVE_INFINITY, 2, 2, 3} should be {NEGATIVE_INFINITY, -1, 2, 3}");

        array = new double[]{Double.NEGATIVE_INFINITY,Double.NEGATIVE_INFINITY,Double.NEGATIVE_INFINITY};
        ascendingMinimaArray = AscendingMinimaAlgorithm.ascendingMinima(array);
        solution = new double[]{Double.NEGATIVE_INFINITY};
        assertArrayEquals(solution, ascendingMinimaArray,
                "Solution of AMA in the {NEGATIVE_INFINITY, NEGATIVE_INFINITY, NEGATIVE_INFINITY} should be {NEGATIVE_INFINITY}");

        array = new double[]{Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY};
        ascendingMinimaArray = AscendingMinimaAlgorithm.ascendingMinima(array);
        solution = new double[]{Double.POSITIVE_INFINITY};
        assertArrayEquals(solution, ascendingMinimaArray,
                "Solution of AMA in the {POSITIVE_INFINITY, POSITIVE_INFINITY, POSITIVE_INFINITY} should be {POSITIVE_INFINITY}");
    }

    /**
     * test of ArrayList<Double> ascendingMinima(ArrayList<Double> arrayList, ArrayList<Double> ascendingMinimaArrayList)
     */
    @Test
    void ascendingMinima2() {
        ArrayList<Double> arrayList = new ArrayList<>();
        ArrayList<Double> ascendingMinimaArrayListGiven = new ArrayList<>();
        ArrayList<Double> solution = new ArrayList<>();
        ArrayList<Double> ascendingMinimaArrayList = AscendingMinimaAlgorithm.ascendingMinima(arrayList, ascendingMinimaArrayListGiven);
        assertEquals(solution, ascendingMinimaArrayList, "Solution of AMA in an empty array should be empty array");

        arrayList.add(6.0);
        arrayList.add(1.0);
        arrayList.add(4.0);
        arrayList.add(3.0);
        arrayList.add(2.0);
        arrayList.add(5.0);
        ascendingMinimaArrayList = AscendingMinimaAlgorithm.ascendingMinima(arrayList, ascendingMinimaArrayListGiven);
        solution.add(1.0);
        solution.add(2.0);
        solution.add(5.0);
        assertEquals(solution, ascendingMinimaArrayList, "Solution of AMA in the list {6, 1, 4, 3, 2, 5} should be {1, 2, 5}");

        arrayList.set(1, 5.0);
        arrayList.set(5, 1.0);
        ascendingMinimaArrayListGiven.clear();
        ascendingMinimaArrayList = AscendingMinimaAlgorithm.ascendingMinima(arrayList, ascendingMinimaArrayListGiven);
        solution.clear();
        solution.add(1.0);
        assertEquals(solution, ascendingMinimaArrayList, "Solution of AMA in the list {6, 5, 4, 3, 2, 1} should be {1}");

        arrayList.add(1.0);
        ascendingMinimaArrayListGiven.clear();
        ascendingMinimaArrayList = AscendingMinimaAlgorithm.ascendingMinima(arrayList, ascendingMinimaArrayListGiven);
        // solution is the same
        assertEquals(solution, ascendingMinimaArrayList, "Solution of AMA in the list {6, 5, 4, 3, 2, 1, 1} should be {1}");

        arrayList.clear();
        arrayList.add(1.0);
        arrayList.add(2.0);
        arrayList.add(3.0);
        arrayList.add(4.0);
        arrayList.add(5.0);
        arrayList.add(6.0);
        ascendingMinimaArrayListGiven.clear();
        ascendingMinimaArrayList = AscendingMinimaAlgorithm.ascendingMinima(arrayList, ascendingMinimaArrayListGiven);
        solution = arrayList;
        assertEquals(solution, ascendingMinimaArrayList, "Solution of AMA in the list {1,2,3,4,5,6} should be {1,2,3,4,5,6}");

        arrayList.clear();
        arrayList.add(1.0);
        arrayList.add(9.0);
        arrayList.add(Double.NEGATIVE_INFINITY);
        arrayList.add(3.0);
        arrayList.add(-1.0);
        arrayList.add(Double.POSITIVE_INFINITY);
        arrayList.add(2.0);
        arrayList.add(2.0);
        arrayList.add(3.0);
        ascendingMinimaArrayListGiven.clear();
        ascendingMinimaArrayList = AscendingMinimaAlgorithm.ascendingMinima(arrayList, ascendingMinimaArrayListGiven);
        solution.clear();
        solution.add(Double.NEGATIVE_INFINITY);
        solution.add(-1.0);
        solution.add(2.0);
        solution.add(3.0);

        assertEquals(solution, ascendingMinimaArrayList,
                "Solution of AMA in the list {1, 9, NEGATIVE_INFINITY, 3, -1, POSITIVE_INFINITY, 2, 2, 3} should be {NEGATIVE_INFINITY, -1, 2, 3}");


        arrayList.clear();
        arrayList.add(Double.NEGATIVE_INFINITY);
        arrayList.add(Double.NEGATIVE_INFINITY);
        arrayList.add(Double.NEGATIVE_INFINITY);
        ascendingMinimaArrayListGiven.clear();
        ascendingMinimaArrayList = AscendingMinimaAlgorithm.ascendingMinima(arrayList, ascendingMinimaArrayListGiven);
        solution.clear();
        solution.add(Double.NEGATIVE_INFINITY);
        assertEquals(solution, ascendingMinimaArrayList,
                "Solution of AMA in the list {NEGATIVE_INFINITY, NEGATIVE_INFINITY, NEGATIVE_INFINITY} should be {NEGATIVE_INFINITY}");

        arrayList.clear();
        arrayList.add(Double.POSITIVE_INFINITY);
        arrayList.add(Double.POSITIVE_INFINITY);
        arrayList.add(Double.POSITIVE_INFINITY);
        ascendingMinimaArrayListGiven.clear();
        ascendingMinimaArrayList = AscendingMinimaAlgorithm.ascendingMinima(arrayList, ascendingMinimaArrayListGiven);
        solution.clear();
        solution.add(Double.POSITIVE_INFINITY);
        assertEquals(solution, ascendingMinimaArrayList,
                "Solution of AMA in the list {POSITIVE_INFINITY, POSITIVE_INFINITY, POSITIVE_INFINITY} should be {POSITIVE_INFINITY}");
    }

    /**
     * test of ArrayList<Double> ascendingMinima( ArrayList<Double> arrayList)
     */
    @Test
    void ascendingMinima3() {
        ArrayList<Double> arrayList = new ArrayList<>();
        ArrayList<Double> solution = new ArrayList<>();
        ArrayList<Double> ascendingMinimaArrayList = AscendingMinimaAlgorithm.ascendingMinima(arrayList);
        assertEquals(solution, ascendingMinimaArrayList, "Solution of AMA in an empty array should be empty array");

        arrayList.add(6.0);
        arrayList.add(1.0);
        arrayList.add(4.0);
        arrayList.add(3.0);
        arrayList.add(2.0);
        arrayList.add(5.0);
        ascendingMinimaArrayList = AscendingMinimaAlgorithm.ascendingMinima(arrayList);
        solution.add(1.0);
        solution.add(2.0);
        solution.add(5.0);
        assertEquals(solution, ascendingMinimaArrayList, "Solution of AMA in the list {6, 1, 4, 3, 2, 5} should be {1, 2, 5}");

        arrayList.set(1, 5.0);
        arrayList.set(5, 1.0);
        ascendingMinimaArrayList = AscendingMinimaAlgorithm.ascendingMinima(arrayList);
        solution.clear();
        solution.add(1.0);
        assertEquals(solution, ascendingMinimaArrayList, "Solution of AMA in the list {6, 5, 4, 3, 2, 1} should be {1}");

        arrayList.add(1.0);
        ascendingMinimaArrayList = AscendingMinimaAlgorithm.ascendingMinima(arrayList);
        // solution is the same
        assertEquals(solution, ascendingMinimaArrayList, "Solution of AMA in the list {6, 5, 4, 3, 2, 1, 1} should be {1}");

        arrayList.clear();
        arrayList.add(1.0);
        arrayList.add(2.0);
        arrayList.add(3.0);
        arrayList.add(4.0);
        arrayList.add(5.0);
        arrayList.add(6.0);
        ascendingMinimaArrayList = AscendingMinimaAlgorithm.ascendingMinima(arrayList);
        solution = arrayList;
        assertEquals(solution, ascendingMinimaArrayList, "Solution of AMA in the list {1,2,3,4,5,6} should be {1,2,3,4,5,6}");

        arrayList.clear();
        arrayList.add(1.0);
        arrayList.add(9.0);
        arrayList.add(Double.NEGATIVE_INFINITY);
        arrayList.add(3.0);
        arrayList.add(-1.0);
        arrayList.add(Double.POSITIVE_INFINITY);
        arrayList.add(2.0);
        arrayList.add(2.0);
        arrayList.add(3.0);
        ascendingMinimaArrayList = AscendingMinimaAlgorithm.ascendingMinima(arrayList);
        solution.clear();
        solution.add(Double.NEGATIVE_INFINITY);
        solution.add(-1.0);
        solution.add(2.0);
        solution.add(3.0);

        assertEquals(solution, ascendingMinimaArrayList,
                "Solution of AMA in the list {1, 9, NEGATIVE_INFINITY, 3, -1, POSITIVE_INFINITY, 2, 2, 3} should be {NEGATIVE_INFINITY, -1, 2, 3}");


        arrayList.clear();
        arrayList.add(Double.NEGATIVE_INFINITY);
        arrayList.add(Double.NEGATIVE_INFINITY);
        arrayList.add(Double.NEGATIVE_INFINITY);
        ascendingMinimaArrayList = AscendingMinimaAlgorithm.ascendingMinima(arrayList);
        solution.clear();
        solution.add(Double.NEGATIVE_INFINITY);
        assertEquals(solution, ascendingMinimaArrayList,
                "Solution of AMA in the list {NEGATIVE_INFINITY, NEGATIVE_INFINITY, NEGATIVE_INFINITY} should be {NEGATIVE_INFINITY}");

        arrayList.clear();
        arrayList.add(Double.POSITIVE_INFINITY);
        arrayList.add(Double.POSITIVE_INFINITY);
        arrayList.add(Double.POSITIVE_INFINITY);
        ascendingMinimaArrayList = AscendingMinimaAlgorithm.ascendingMinima(arrayList);
        solution.clear();
        solution.add(Double.POSITIVE_INFINITY);
        assertEquals(solution, ascendingMinimaArrayList,
                "Solution of AMA in the list {POSITIVE_INFINITY, POSITIVE_INFINITY, POSITIVE_INFINITY} should be {POSITIVE_INFINITY}");
    }

    /**
     * test of ArrayList<Double> ascendingMinima2( ArrayList<Double> arrayList)
     */
    @Test
    void ascendingMinima4() {
        ArrayList<Double> arrayList = new ArrayList<>();
        ArrayList<Double> solution = new ArrayList<>();
        ArrayList<Double> ascendingMinimaArrayList = AscendingMinimaAlgorithm.ascendingMinima2(arrayList);
        assertEquals(solution, ascendingMinimaArrayList, "Solution of AMA in an empty array should be empty array");

        arrayList.add(6.0);
        arrayList.add(1.0);
        arrayList.add(4.0);
        arrayList.add(3.0);
        arrayList.add(2.0);
        arrayList.add(5.0);
        ascendingMinimaArrayList = AscendingMinimaAlgorithm.ascendingMinima2(arrayList);
        solution.add(1.0);
        solution.add(2.0);
        solution.add(5.0);
        assertEquals(solution, ascendingMinimaArrayList, "Solution of AMA in the list {6, 1, 4, 3, 2, 5} should be {1, 2, 5}");

        arrayList.set(1, 5.0);
        arrayList.set(5, 1.0);
        ascendingMinimaArrayList = AscendingMinimaAlgorithm.ascendingMinima2(arrayList);
        solution.clear();
        solution.add(1.0);
        assertEquals(solution, ascendingMinimaArrayList, "Solution of AMA in the list {6, 5, 4, 3, 2, 1} should be {1}");

        arrayList.add(1.0);
        ascendingMinimaArrayList = AscendingMinimaAlgorithm.ascendingMinima2(arrayList);
        // solution is the same
        assertEquals(solution, ascendingMinimaArrayList, "Solution of AMA in the list {6, 5, 4, 3, 2, 1, 1} should be {1}");

        arrayList.clear();
        arrayList.add(1.0);
        arrayList.add(2.0);
        arrayList.add(3.0);
        arrayList.add(4.0);
        arrayList.add(5.0);
        arrayList.add(6.0);
        ascendingMinimaArrayList = AscendingMinimaAlgorithm.ascendingMinima2(arrayList);
        solution = arrayList;
        assertEquals(solution, ascendingMinimaArrayList, "Solution of AMA in the list {1,2,3,4,5,6} should be {1,2,3,4,5,6}");

        arrayList.clear();
        arrayList.add(1.0);
        arrayList.add(9.0);
        arrayList.add(Double.NEGATIVE_INFINITY);
        arrayList.add(3.0);
        arrayList.add(-1.0);
        arrayList.add(Double.POSITIVE_INFINITY);
        arrayList.add(2.0);
        arrayList.add(2.0);
        arrayList.add(3.0);
        ascendingMinimaArrayList = AscendingMinimaAlgorithm.ascendingMinima2(arrayList);
        solution.clear();
        solution.add(Double.NEGATIVE_INFINITY);
        solution.add(-1.0);
        solution.add(2.0);
        solution.add(3.0);

        assertEquals(solution, ascendingMinimaArrayList,
                "Solution of AMA in the list {1, 9, NEGATIVE_INFINITY, 3, -1, POSITIVE_INFINITY, 2, 2, 3} should be {NEGATIVE_INFINITY, -1, 2, 3}");


        arrayList.clear();
        arrayList.add(Double.NEGATIVE_INFINITY);
        arrayList.add(Double.NEGATIVE_INFINITY);
        arrayList.add(Double.NEGATIVE_INFINITY);
        ascendingMinimaArrayList = AscendingMinimaAlgorithm.ascendingMinima2(arrayList);
        solution.clear();
        solution.add(Double.NEGATIVE_INFINITY);
        assertEquals(solution, ascendingMinimaArrayList,
                "Solution of AMA in the list {NEGATIVE_INFINITY, NEGATIVE_INFINITY, NEGATIVE_INFINITY} should be {NEGATIVE_INFINITY}");

        arrayList.clear();
        arrayList.add(Double.POSITIVE_INFINITY);
        arrayList.add(Double.POSITIVE_INFINITY);
        arrayList.add(Double.POSITIVE_INFINITY);
        ascendingMinimaArrayList = AscendingMinimaAlgorithm.ascendingMinima2(arrayList);
        solution.clear();
        solution.add(Double.POSITIVE_INFINITY);
        assertEquals(solution, ascendingMinimaArrayList,
                "Solution of AMA in the list {POSITIVE_INFINITY, POSITIVE_INFINITY, POSITIVE_INFINITY} should be {POSITIVE_INFINITY}");
    }

}