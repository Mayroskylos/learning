import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Statistics {
    /**
     * Finds the minimum value of an array.
     *
     * @param array array from which the minimum value will be extracted
     * @return      the minimum value, otherwise NaN
     */
    static double minOfArray(double[] array){
        return StatUtils.min(array);
    }

    /**
     * Finds the maximum value of an array.
     *
     * @param array array from which the maximum value will be extracted
     * @return      the maximum value, otherwise NaN
     */
    static double maxOfArray(double[] array){
        return StatUtils.max(array);
    }

    /**
     * Finds the mean value of an array.
     *
     * @param array array from which the mean value will be extracted
     * @return      the mean value, otherwise NaN
     */
    static double meanOfArray(double[] array){
        return StatUtils.mean(array);
    }

    /**
     * Finds the median value of an array.
     *
     * @param array array from which the median value will be extracted
     * @return      the median value, otherwise NaN
     */
    static double medianOfArray(double[] array){
        return StatUtils.percentile(array, 50);
    }

    /**
     * Sort an array.
     *
     * @param array array that will be sorted
     * @return      sorted array
     */
    static double[] sortArray(double[] array){
        Arrays.sort(array);
        return array;
    }

    /**
     * Prints the array.
     *
     * @param array     array that will be printed
     * @param string    string that will be printed before the array
     */
    static void out(double[] array, String string){
        System.out.println("From " + string);
        for (double value : array) {
            System.out.println( value);
        }
    }

    /**
     * Finds the minimum value of an arrayList.
     *
     * @param arrayList arrayList from which the minimum value will be extracted
     * @return          the minimum value, otherwise NaN
     */
    static double minOfArrayList(ArrayList<Double> arrayList){
        DescriptiveStatistics stats = new DescriptiveStatistics();
        for (double value : arrayList) {
            stats.addValue(value);
        }
        return stats.getMin();
    }

    /**
     * Finds the maximum value of an arrayList.
     *
     * @param arrayList arrayList from which the maximum value will be extracted
     * @return          the maximum value, otherwise NaN
     */
    static double maxOfArrayList(ArrayList<Double> arrayList){
        DescriptiveStatistics stats = new DescriptiveStatistics();
        for (double value : arrayList) {
            stats.addValue(value);
        }
        return stats.getMax();
    }

    /**
     * Finds the mean value of an arrayList.
     *
     * @param arrayList arrayList from which the mean value will be extracted
     * @return          the mean value, otherwise NaN
     */
    static double meanOfArrayList(ArrayList<Double> arrayList){
        DescriptiveStatistics stats = new DescriptiveStatistics();
        for (double value : arrayList) {
            stats.addValue(value);
        }
        return stats.getMean();
    }

    /**
     * Finds the median value of an arrayList.
     *
     * @param arrayList arrayList from which the median value will be extracted
     * @return          the median value, otherwise NaN
     */
    static double medianOfArrayList(ArrayList<Double> arrayList){
        DescriptiveStatistics stats = new DescriptiveStatistics();
        for (double value : arrayList) {
            stats.addValue(value);
        }
        return stats.getPercentile(50);
    }

    /**
     * Sort an arrayList.
     *
     * @param arrayList arrayList that will be sorted
     * @return          sorted arrayList
     */
    static ArrayList<Double> sortArrayList(ArrayList<Double> arrayList){
        Collections.sort(arrayList);
        return arrayList;
    }

    /**
     * Prints the arrayList.
     *
     * @param arrayList arrayList that will be printed
     * @param string    string that will be printed before the array
     */
    static void out(ArrayList<Double> arrayList, String string){
        System.out.println("From " + string);
        for (double value : arrayList) {
            System.out.println( value);
        }
    }

}
