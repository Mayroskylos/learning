import java.util.ArrayList;
import java.util.Arrays;

class AscendingMinimaAlgorithm {
    /**
     * Applies the ascending minima algorithm to an array with recursive method.
     *
     * @param array                 array to which the ascending minima algorithm will be applied
     * @param ascendingMinimaArray  the initial array of the ascending minima algorithm (should be empty when called)
     * @return                      the array that the ascending minima algorithm exports
     */
    static double[] ascendingMinima(double[] array, double[] ascendingMinimaArray){
        double[] newAscendingMinimaArray = ascendingMinimaArray;
        int index = minimumIndex(array);
        if ( index >= 0 ){
            newAscendingMinimaArray = new double[ascendingMinimaArray.length+1];
            System.arraycopy(ascendingMinimaArray, 0, newAscendingMinimaArray, 0, ascendingMinimaArray.length);
            newAscendingMinimaArray[ascendingMinimaArray.length] = array[index];
            array = Arrays.copyOfRange(array, index+1, array.length);
            newAscendingMinimaArray = ascendingMinima(array, newAscendingMinimaArray);
        }
        return newAscendingMinimaArray;
    }

    /**
     * Applies the ascending minima algorithm to an array with recursive method.
     *
     * @param array array to which the ascending minima algorithm will be applied
     * @return      the array that the ascending minima algorithm exports
     */
    static double[] ascendingMinima(double[] array){
        double[] newAscendingMinimaArray = new double[0];
        int index = minimumIndex(array);
        if ( index >= 0 ){
            double[] subArray = Arrays.copyOfRange(array, index+1, array.length);
            double[] ama = ascendingMinima(subArray);
            newAscendingMinimaArray = new double[ama.length+1];
            System.arraycopy(ama, 0, newAscendingMinimaArray, 1, ama.length);
            newAscendingMinimaArray[0] = array[index];
        }
        return newAscendingMinimaArray;
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
     * Applies the ascending minima algorithm to an arrayList with recursive method.
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
     * Applies the ascending minima algorithm to an arrayList with recursive method.
     *
     * @param arrayList arrayList to which the ascending minima algorithm will be applied
     * @return          the arrayList that the ascending minima algorithm exports
     */
    static ArrayList<Double> ascendingMinima( ArrayList<Double> arrayList){
        int index = minimumIndex(arrayList);
        ArrayList<Double> ascendingMinimaArrayList = new ArrayList<>();
        if ( index >= 0){
            ArrayList<Double> subArrayList =  new ArrayList<>(arrayList.subList(index+1, arrayList.size()));
            ascendingMinimaArrayList = ascendingMinima(subArrayList);
            ascendingMinimaArrayList.add(0, arrayList.get(index));
        }
        return ascendingMinimaArrayList;
    }

    /**
     * Applies the ascending minima algorithm to an arrayList with straightforward method.
     *
     * @param arrayList arrayList to which the ascending minima algorithm will be applied
     * @return          the arrayList that the ascending minima algorithm exports
     */
    static ArrayList<Double> ascendingMinima2( ArrayList<Double> arrayList){
        int index = minimumIndex(arrayList);
        ArrayList<Double> ascendingMinimaArrayList = new ArrayList<>();
        while ( index >= 0){
            ascendingMinimaArrayList.add(arrayList.get(index));
            arrayList =  new ArrayList<>(arrayList.subList(index+1, arrayList.size()));
            index = minimumIndex(arrayList);
        }
        return ascendingMinimaArrayList;
    }
    /**
     * Finds the index of the minimum value in the arrayList.
     *
     * @param arrayList array from which the index of the minimum value will be returned
     * @return          the index of the minimum value in the arrayList
     */
    private static int minimumIndex(ArrayList<Double> arrayList) {
        return arrayList.lastIndexOf(Statistics.minOfArrayList(arrayList));
    }
}
