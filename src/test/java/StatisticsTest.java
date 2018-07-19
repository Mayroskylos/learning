import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsTest {

    @Test
    void minOfArray() {
        double[] array = new double[0];
        assertEquals( Double.NaN, Statistics.minOfArray(array), "Min of empty array should be not a number");
        array = new double[]{1.0, 2.0, 3.0, 4.0, 5.0};
        assertEquals( 1.0, Statistics.minOfArray( array ), "Min of {1.0, 2.0, 3.0, 4.0, 5.0} should be 1" );
        array = new double[]{Double.NEGATIVE_INFINITY, 2.0, 3.0, 4.0, 5.0};
        assertEquals( Double.NEGATIVE_INFINITY, Statistics.minOfArray( array ), "Min of {NEGATIVE_INFINITY, 2.0, 3.0, 4.0, 5.0} should be negative infinity" );
        array = new double[]{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
        assertEquals( Double.POSITIVE_INFINITY, Statistics.minOfArray( array ), "Min of {POSITIVE_INFINITY, POSITIVE_INFINITY} should be positive infinity" );
    }

    @Test
    void maxOfArray() {
        double[] array = new double[0];
        assertEquals( Double.NaN, Statistics.maxOfArray(array), "Max of empty array should be not a number");
        array = new double[]{1.0, 2.0, 3.0, 4.0, 5.0};
        assertEquals( 5.0, Statistics.maxOfArray( array ), "Max of {1.0, 2.0, 3.0, 4.0, 5.0} should be 5" );
        array = new double[]{Double.POSITIVE_INFINITY, 2.0, 3.0, 4.0, 5.0};
        assertEquals( Double.POSITIVE_INFINITY, Statistics.maxOfArray( array ), "Max of {POSITIVE_INFINITY, 2.0, 3.0, 4.0, 5.0} should be positive infinity" );
        array = new double[]{Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY};
        assertEquals( Double.NEGATIVE_INFINITY, Statistics.maxOfArray( array ), "Max of {NEGATIVE_INFINITY, NEGATIVE_INFINITY} should be negative infinity" );
    }

    @Test
    void meanOfArray() {
        double[] array = new double[0];
        assertEquals( Double.NaN, Statistics.meanOfArray(array), "Mean of empty array should be not a number");
        array = new double[]{1.0, 2.0, 3.0, 4.0, 5.0};
        assertEquals( 3.0, Statistics.meanOfArray( array ), "Mean of {1.0, 2.0, 3.0, 4.0, 5.0} should be 3" );
        array = new double[]{Double.POSITIVE_INFINITY, 2.0, 3.0, 4.0, 5.0};
        assertEquals( Double.NaN, Statistics.meanOfArray( array ), "Mean of {POSITIVE_INFINITY, 2.0, 3.0, 4.0, 5.0} should be not a number" );
        array = new double[]{Double.NEGATIVE_INFINITY, 2.0, 3.0, 4.0, 5.0};
        assertEquals( Double.NaN, Statistics.meanOfArray( array ), "Mean of {NEGATIVE_INFINITY, 2.0, 3.0, 4.0, 5.0} should be not a number" );
        array = new double[]{Double.NEGATIVE_INFINITY, 0.0, 1.0, Double.POSITIVE_INFINITY};
        assertEquals( Double.NaN, Statistics.meanOfArray( array ), "Mean of {NEGATIVE_INFINITY, 0.0, 1.0, POSITIVE_INFINITY} should be not a number" );
    }

    @Test
    void medianOfArray() {
        double[] array = new double[0];
        assertEquals( Double.NaN, Statistics.medianOfArray(array), "Median of empty array should be not a number");
        array = new double[]{1.0, 2.0, 3.0, 4.0, 5.0};
        assertEquals( 3.0, Statistics.medianOfArray( array ), "Median of {1.0, 2.0, 3.0, 4.0, 5.0} should be 3" );
        array = new double[]{1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        assertEquals( 3.5, Statistics.medianOfArray( array ), "Median of {1.0, 2.0, 3.0, 4.0, 5.0, 6.0} should be 3,5" );
        array = new double[]{1.0, 2.0, 3.0, 4.0, Double.POSITIVE_INFINITY};
        assertEquals( 3.0, Statistics.medianOfArray( array ), "Median of {1.0, 2.0, 3.0, 4.0, POSITIVE_INFINITY} should be 3" );
        array = new double[]{Double.NEGATIVE_INFINITY, 2.0, 3.0, 4.0, 5.0};
        assertEquals( 3.0, Statistics.medianOfArray( array ), "Median of {NEGATIVE_INFINITY, 2.0, 3.0, 4.0, 5.0} should be 3" );
        array = new double[]{Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY};
        assertEquals( Double.NaN, Statistics.medianOfArray( array ), "Median of {NEGATIVE_INFINITY, POSITIVE_INFINITY} should be not a number" );
        array = new double[]{Double.NEGATIVE_INFINITY, 0.0, Double.POSITIVE_INFINITY};
        // Kind of problem
        assertEquals( Double.NaN, Statistics.medianOfArray( array ), "Median of {NEGATIVE_INFINITY, 0.0, POSITIVE_INFINITY} should be 0 but is giving not a number" );
        array = new double[]{Double.NEGATIVE_INFINITY, -1.0, 1.0, Double.POSITIVE_INFINITY};
        assertEquals( 0.0, Statistics.medianOfArray( array ), "Median of {NEGATIVE_INFINITY, -1.0, 1.0, POSITIVE_INFINITY} should be 0" );
    }

    @Test
    void sortArray() {
        int size = 100;
        double[] array = new double[size];
        for(int i=0;i<array.length;i++)
        {
            array[i] = Math.random() * 100 - 50;
        }
        assertTrue(isSorted(Statistics.sortArray(array)), "Array should be sorted");
    }

    private boolean isSorted(double[] data){
        for(int i = 1; i < data.length; i++){
            if(data[i-1] > data[i]){
                return false;
            }
        }
        return true;
    }

    @Test
    void out() {
        int size = 2;
        double[] array = new double[size];
        for(int i=0;i<array.length;i++)
        {
            array[i] = Math.random() * 100 - 50;
        }
        Statistics.out( array, "Test array" );
    }

    @Test
    void minOfArrayList() {
        ArrayList<Double> arrayList = new ArrayList<>();
        assertEquals( Double.NaN, Statistics.minOfArrayList(arrayList), "Min of empty array list should be not a number");
        arrayList.add(1.0);
        arrayList.add(2.0);
        arrayList.add(3.0);
        arrayList.add(4.0);
        arrayList.add(5.0);
        assertEquals( 1.0, Statistics.minOfArrayList( arrayList ), "Min of list {1.0, 2.0, 3.0, 4.0, 5.0} should be 1" );
        arrayList.set(1, Double.NEGATIVE_INFINITY);
        assertEquals( Double.NEGATIVE_INFINITY, Statistics.minOfArrayList( arrayList ), "Min of list {NEGATIVE_INFINITY, 2.0, 3.0, 4.0, 5.0} should be negative infinity" );
        arrayList.clear();
        arrayList.add(Double.POSITIVE_INFINITY);
        arrayList.add(Double.POSITIVE_INFINITY);
        assertEquals( Double.POSITIVE_INFINITY, Statistics.minOfArrayList( arrayList ), "Min of list {POSITIVE_INFINITY, POSITIVE_INFINITY} should be positive infinity" );
    }

    @Test
    void maxOfArrayList() {
        ArrayList<Double> arrayList = new ArrayList<>();
        assertEquals( Double.NaN, Statistics.maxOfArrayList(arrayList), "Max of empty array list should be not a number");
        arrayList.add(1.0);
        arrayList.add(2.0);
        arrayList.add(3.0);
        arrayList.add(4.0);
        arrayList.add(5.0);
        assertEquals( 5.0, Statistics.maxOfArrayList( arrayList ), "Max of list {1.0, 2.0, 3.0, 4.0, 5.0} should be 5" );
        arrayList.set(1, Double.POSITIVE_INFINITY);
        assertEquals( Double.POSITIVE_INFINITY, Statistics.maxOfArrayList( arrayList ), "Max of list {POSITIVE_INFINITY, 2.0, 3.0, 4.0, 5.0} should be positive infinity" );
        arrayList.clear();
        arrayList.add(Double.NEGATIVE_INFINITY);
        arrayList.add(Double.NEGATIVE_INFINITY);
        assertEquals( Double.NEGATIVE_INFINITY, Statistics.maxOfArrayList( arrayList ), "Max of list {NEGATIVE_INFINITY, NEGATIVE_INFINITY} should be negative infinity" );
    }

    @Test
    void meanOfArrayList() {
        ArrayList<Double> arrayList = new ArrayList<>();
        assertEquals( Double.NaN, Statistics.meanOfArrayList(arrayList), "Mean of empty array list should be not a number");
        arrayList.add(1.0);
        arrayList.add(2.0);
        arrayList.add(3.0);
        arrayList.add(4.0);
        arrayList.add(5.0);
        assertEquals( 3.0, Statistics.meanOfArrayList( arrayList ), "Mean of list {1.0, 2.0, 3.0, 4.0, 5.0} should be 3" );
        arrayList.set(1, Double.POSITIVE_INFINITY);
        assertEquals( Double.NaN, Statistics.meanOfArrayList( arrayList ), "Mean of list {POSITIVE_INFINITY, 2.0, 3.0, 4.0, 5.0} should be not a number" );
        arrayList.set(1, Double.NEGATIVE_INFINITY);
        assertEquals( Double.NaN, Statistics.meanOfArrayList( arrayList ), "Mean of list {NEGATIVE_INFINITY, 2.0, 3.0, 4.0, 5.0} should be not a number" );
        arrayList.clear();
        arrayList.add(Double.NEGATIVE_INFINITY);
        arrayList.add(0.0);
        arrayList.add(1.0);
        arrayList.add(Double.POSITIVE_INFINITY);
        assertEquals( Double.NaN, Statistics.meanOfArrayList( arrayList ), "Mean of list {NEGATIVE_INFINITY, 0.0, 1.0, POSITIVE_INFINITY} should be not a number" );
    }

    @Test
    void medianOfArrayList() {
        ArrayList<Double> arrayList = new ArrayList<>();
        assertEquals( Double.NaN, Statistics.medianOfArrayList(arrayList), "Median of empty array list should be not a number");
        arrayList.add(1.0);
        arrayList.add(2.0);
        arrayList.add(3.0);
        arrayList.add(4.0);
        arrayList.add(5.0);
        assertEquals( 3.0, Statistics.medianOfArrayList( arrayList ), "Median of list {1.0, 2.0, 3.0, 4.0, 5.0} should be 3" );
        arrayList.add(6.0);
        assertEquals( 3.5, Statistics.medianOfArrayList( arrayList ), "Median of list {1.0, 2.0, 3.0, 4.0, 5.0, 6.0} should be 3.5" );
        arrayList.remove(6.0);
        arrayList.set(1, Double.POSITIVE_INFINITY);
        assertEquals( 4.0, Statistics.medianOfArrayList( arrayList ), "Median of list {2.0, 3.0, 4.0, 5.0, POSITIVE_INFINITY} should be 4" );
        arrayList.set(1, Double.NEGATIVE_INFINITY);
        assertEquals( 3.0, Statistics.medianOfArrayList( arrayList ), "Median of list {NEGATIVE_INFINITY, 2.0, 3.0, 4.0, 5.0} should be not a number" );
        arrayList.clear();
        arrayList.add(Double.NEGATIVE_INFINITY);
        arrayList.add(Double.POSITIVE_INFINITY);
        assertEquals( Double.NaN, Statistics.medianOfArrayList( arrayList ), "Median of list {NEGATIVE_INFINITY, POSITIVE_INFINITY} should be not a number" );
        arrayList.add(-1.0);
        assertEquals( Double.NaN, Statistics.medianOfArrayList( arrayList ), "Median of list {NEGATIVE_INFINITY, -1.0, POSITIVE_INFINITY} should be -1 but is giving not a number" );
        arrayList.add(1.0);
        assertEquals( 0.0, Statistics.medianOfArrayList( arrayList ), "Median of list {NEGATIVE_INFINITY, -1.0, 1.0, POSITIVE_INFINITY} should be not a number" );


    }

    @Test
    void sortArrayList() {
        int size = 1000;
        ArrayList<Double> arrayList = new ArrayList<>(size);
        for(int i=0;i<size;i++)
        {
            arrayList.add(Math.random());
        }
        assertTrue(isSorted(Statistics.sortArrayList(arrayList)), "Array list should be sorted");
    }

    private boolean isSorted(ArrayList<Double> data){
        for(int i = 1; i < data.size(); i++){
            if(data.get(i-1) > data.get(i)){
                return false;
            }
        }
        return true;
    }

    @Test
    void out1() {
        int size = 2;
        ArrayList<Double> arrayList = new ArrayList<>(size);
        for(int i=0;i<size;i++)
        {
            arrayList.add(Math.random() * 100 - 50);
        }
        Statistics.out( arrayList, "Test array list" );
    }
}