import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;

public class TestLearning {


    @BeforeAll
    public static void init(){
        System.out.println("Before All init() method called");
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        System.out.println("Hello from the test side");
    }

    @Test
    public void testArray(){
        double size = 6;
        double[] array = new double[(int)size];
        for(int i=0;i<array.length;i++)
        {
            array[i] = Math.random();// * (i - array.length/2 + 0.5) / 100;
        }
//        App.out(array);
//
//        System.out.println("Sorted:");
//        App.out(App.sortArrayList(array));

        double minimum = Statistics.minOfArray(array);
//        System.out.println("Min is :" + minimum);
        double maximum = Statistics.maxOfArray(array);
//        System.out.println("Max is :" + maximum);
        double mean = Statistics.meanOfArray(array);
//        System.out.println("Mean is :" + mean);
        double med = Statistics.medianOfArray(array);
//        System.out.println("Median is :" + med);
    }

    @Test
    public void testAMAinArrayList(){
        double size = 6;
        ArrayList<Double> arrayList = new ArrayList<>((int)size);
//        for(int i=0;i<size;i++)
//        {
//            arrayList.add(Math.random());
//        }
        arrayList.add(6.0);
        arrayList.add(1.0);
        arrayList.add(4.0);
        arrayList.add(3.0);
        arrayList.add(2.0);
        arrayList.add(5.0);
        ArrayList<Double> ama1 = new ArrayList<>();
        ama1 = AscendingMinimaAlgorithm.ascendingMinima(arrayList, ama1);
        ArrayList<Double> ama2 = AscendingMinimaAlgorithm.ascendingMinima(arrayList);

        ArrayList<Double> solution = new ArrayList<>(3);
        solution.add(1.0);
        solution.add(2.0);
        solution.add(5.0);

        assertEquals(solution, ama1);
        assertEquals(solution, ama2);
    }

    @Test
    public void testAMAinArray(){
        double size = 6;
        double[] array = new double[(int)size];
        for(int i=0;i<array.length;i++)
        {
            array[i] = Math.random();// * (i - array.length/2 + 0.5) / 100;
        }
        array = new double[]{6,1,4,3,2,5};

        double[] ama1 = new double[0];
        ama1 = AscendingMinimaAlgorithm.ascendingMinima(array, ama1);
        double[] ama2 = AscendingMinimaAlgorithm.ascendingMinima(array);
        double[] solution = new double[]{1,2,5};
        assertTrue(Arrays.equals(solution, ama1));
        assertTrue(Arrays.equals(solution, ama2));
    }






}
