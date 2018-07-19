import java.util.ArrayList;
import java.util.Arrays;

public class AscendingMinimaAlgorithm {
    /**
     * Applies the ascending minima algorithm to an array.
     *
     * @param array                 array to which the ascending minima algorithm will be applied
     * @param ascendingMinimaArray  the initial array of the ascending minima algorithm (should be empty when called)
     * @return                      the array that the ascending minima algorithm exports
     */
    static double[] ascendingMinima(double[] array, double[] ascendingMinimaArray){
        double[] newascendingMinimaArray = ascendingMinimaArray;
        int index = minimumIndex(array);
        if ( index >= 0 ){
            newascendingMinimaArray = new double[ascendingMinimaArray.length+1];
            System.arraycopy(ascendingMinimaArray, 0, newascendingMinimaArray, 0, ascendingMinimaArray.length);
            newascendingMinimaArray[ascendingMinimaArray.length] = array[index];
            array = Arrays.copyOfRange(array, index+1, array.length);
            newascendingMinimaArray = ascendingMinima(array, newascendingMinimaArray);
        }
        return newascendingMinimaArray;
    }

    /**
     * Applies the ascending minima algorithm to an array.
     *
     * @param array array to which the ascending minima algorithm will be applied
     * @return      the array that the ascending minima algorithm exports
     */
    static double[] ascendingMinima(double[] array){
        double[] newAma = new double[0];
        int index = minimumIndex(array);
        if ( index >= 0 ){
            double[] subArray = Arrays.copyOfRange(array, index+1, array.length);
            double[] ama = ascendingMinima(subArray);
            newAma = new double[ama.length+1];
            System.arraycopy(ama, 0, newAma, 1, ama.length);
            newAma[0] = array[index];
        }
        return newAma;
    }

    /**
     * Finds the index of the minimum value in the array.
     *
     * @param array array from which the index of the minimum value will be returned
     * @return      the index of the minimum value in the array
     */
    private static int minimumIndex(double[] array){
        double min =  Statistics.minOfArray(array);
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if ( min == array[i])
                index = i;
        }
        return index;
    }

    /**
     * Applies the ascending minima algorithm to an arrayList.
     *
     * @param arrayList                 arrayList to which the ascending minima algorithm will be applied
     * @param ascendingMinimaArrayList  the initial arrayList of the ascending minima algorithm (should be empty when called)
     * @return                          the arrayList that the ascending minima algorithm exports
     */
    static ArrayList<Double> ascendingMinima(ArrayList<Double> arrayList, ArrayList<Double> ascendingMinimaArrayList){
        int index = minimumIndex(arrayList);
        if ( index >= 0){
            ascendingMinimaArrayList.add(arrayList.get(index));
            ArrayList<Double> subArrayList =  new ArrayList<>(arrayList.subList(index+1, arrayList.size()));
            ascendingMinimaArrayList = ascendingMinima(subArrayList, ascendingMinimaArrayList);
        }

        return ascendingMinimaArrayList;
    }

    /**
     * Applies the ascending minima algorithm to an arrayList.
     *
     * @param arrayList arrayList to which the ascending minima algorithm will be applied
     * @return          the arrayList that the ascending minima algorithm exports
     */
    static ArrayList<Double> ascendingMinima( ArrayList<Double> arrayList){
        int index = minimumIndex(arrayList);
        ArrayList<Double> ama = new ArrayList<>();
        if ( index >= 0){
            ArrayList<Double> subArrayList =  new ArrayList<>(arrayList.subList(index+1, arrayList.size()));
            ama = ascendingMinima(subArrayList);
            ama.add(0, arrayList.get(index));
        }
        return ama;
    }

    /**
     * Finds the index of the minimum value in the arrayList.
     *
     * @param arrayList array from which the index of the minimum value will be returned
     * @return          the index of the minimum value in the arrayList
     */
    private static int minimumIndex(ArrayList<Double> arrayList) {
        return arrayList.indexOf(Statistics.minOfArrayList(arrayList));
    }
}
