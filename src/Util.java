import java.lang.reflect.Array;

public final class Util {

    /**
     * print calls println and allows the user to not have to type System.out everytime to print
     *
     * @param s the object passed to be printed
     */
    public static void print(Object s){

        System.out.println(s);
    }
    /**
     * printArray prints out given array
     *
     * @param a the array to be printed
     */
    public static void printArray(Object a){

        for (int i = 0; i < Array.getLength(a); i++){
            System.out.print( "[" + Array.get(a,i)+"]");
        }
        System.out.println();
    }

    /**
     * readInput will read lines from command input
     * 
     */
    public static void readInput(){
        // TODO: 10/18/2020  
    }
    //================================================//
    //====================Searches====================//
    //================================================//

    /**
     * Perform a Binary Search through an Integer Array.
     * @param intArray array to be searched.
     * @param value the value to be searched for.
     * @return index, the index of the value if located in array. If not then return -1
     */
    public static int binarySearch(int[] intArray, int value){

        int left = 0;
        int right = intArray.length - 1;

        while(left <= right) {

            int middle = (left + right) >>> 1;

            if (intArray[middle] ==  value) {

                return middle;
            }
            else if (intArray[middle] < value) {
                left = middle + 1;

            }else {
                right = middle - 1;
            }
        }
        //If not found return index as -1
        return -1;
        //Implement Binary Search for integer here. Update index with the correct index if found.
        //If not fount return index as -1;
    }

    /**
     * Perform a Binary Search through a String Array.
     * @param sArray array to be searched.
     * @param value the value to be searched for.
     * @return index, the index of the value if located in array. If not then return -1
     */
    public static int binarySearch(String[] sArray, String value){
        int index;
        int left = 0;
        int right = sArray.length - 1;
        //Implement Binary Search for String here. Update index with the correct index if found.

        while(left <= right) {
                int middle = (left + right) >>> 1;

                if (sArray[middle].equals(value)) {
                    index = middle;
                    return index;
                }
                if (sArray[middle].compareTo(value) > 0) {
                    right = middle;
                    continue;
                }
                left = middle +1;
        }
        //If not found return index as -1
        return -1;
    }

    /**
     * Perform a Binary Search through an Array of doubles.
     * @param dArray array to be searched.
     * @param value the value to be searched for.
     * @return index, the index of the value if located in array. If not then return -1
     */
    public static int binarySearch(double[] dArray, double value){
        int left = 0;
        int right = dArray.length - 1;

        while(left <= right) {

            int middle = (left + right) >>> 1;

            if (dArray[middle] ==  value) {

                return middle;
            }
            else if (dArray[middle] < value) {
                left = ++middle;

            }else {
                right = --middle;
            }
        }
        //If not found return index as -1
        return -1;
        //Implement Binary Search for integer here. Update index with the correct index if found.
        //If not fount return index as -1;
    }

    //================================================//
    //====================Sorts=======================//
    //================================================//

    /**
     * Sort array of integers using merge sort
     * @param intArr array of int
     * @param left starting sort index
     * @param right ending sort index
     */
    public static void mergeSort(int[] intArr, int left, int right){

        if(left < right){
            int middle = (left + right) / 2;

            mergeSort(intArr, left, middle);
            mergeSort(intArr,middle+1, right);

            merge(intArr, left, middle, right);
        }
    }
    // Mergesort helper method to merge two arrays together
    private static void merge(int[] intArr, int left, int middle, int right){

        int size1 = middle - left + 1;
        int size2 = right - middle;

        int[] leftArray = new int[size1];
        int[] rightArray = new int[size2];

        for(int i = 0; i < size1; i++){
            leftArray[i] = intArr[left + i];
        }
        for(int i = 0; i < size2; i++){
            rightArray[i] = intArr[middle + 1 + i];
        }
        int index1 = 0;
        int index2 = 0;

        int index3 = left;

        while (index1 < size1 && index2 < size2){

            if(leftArray[index1] <= rightArray[index2]){
                intArr[index3] = leftArray[index1];
                index1++;
            }else{
                intArr[index3] = rightArray[index2];
                index2++;
            }
            index3++;
        }
        while (index1 < size1) {
            intArr[index3] = leftArray[index1];
            index1++;
            index3++;
        }

        while (index2 < size2) {
            intArr[index3] = rightArray[index2];
            index2++;
            index3++;
        }
    }

    /**
     * MergeSort an array of Strings
     * @param sArr array of strings
     * @param left starting index of sort
     * @param right ending index of sort
     */
    public static void mergeSort(String[] sArr, int left, int right){

        if(left < right){
            int middle = (left + right) / 2;

            mergeSort(sArr, left, middle);
            mergeSort(sArr,middle+1, right);

            merge(sArr, left, middle, right);
        }
    }

    private static void merge(String[] intArr, int left, int middle, int right){

        int size1 = middle - left + 1;
        int size2 = right - middle;

        String[] leftArray = new String[size1];
        String[] rightArray = new String[size2];

        for(int i = 0; i < size1; i++){
            leftArray[i] = intArr[left + i];
        }
        for(int i = 0; i < size2; i++){
            rightArray[i] = intArr[middle + 1 + i];
        }
        int index1 = 0;
        int index2 = 0;

        int index3 = left;

        while (index1 < size1 && index2 < size2){
            //Less than
            if(leftArray[index1].compareTo( rightArray[index2]) < 0 || leftArray[index1].equals(rightArray[index2])){
                intArr[index3] = leftArray[index1];
                index1++;
            }else{
                intArr[index3] = rightArray[index2];
                index2++;
            }
            index3++;
        }
        while (index1 < size1) {
            intArr[index3] = leftArray[index1];
            index1++;
            index3++;
        }

        while (index2 < size2) {
            intArr[index3] = rightArray[index2];
            index2++;
            index3++;
        }
    }


    /**
     * Sort array of doubles using merge sort
     * @param dArr array of doubles
     * @param left starting sort index
     * @param right ending sort index
     */
    public static void mergeSort(double[] dArr, int left, int right){

        if(left < right){
            int middle = (left + right) / 2;

            mergeSort(dArr, left, middle);
            mergeSort(dArr,middle+1, right);

            merge(dArr, left, middle, right);
        }
    }
    // Helper for MergeSort
    private static void merge(double[] dArr, int left, int middle, int right){

        int size1 = middle - left + 1;
        int size2 = right - middle;

        double[] leftArray = new double[size1];
        double[] rightArray = new double[size2];

        for(int i = 0; i < size1; i++){
            leftArray[i] = dArr[left + i];
        }
        for(int i = 0; i < size2; i++){
            rightArray[i] = dArr[middle + 1 + i];
        }
        int index1 = 0;
        int index2 = 0;

        int index3 = left;

        while (index1 < size1 && index2 < size2){

            if(leftArray[index1] <= rightArray[index2]){
                dArr[index3] = leftArray[index1];
                index1++;
            }else{
                dArr[index3] = rightArray[index2];
                index2++;
            }
            index3++;
        }
        while (index1 < size1) {
            dArr[index3] = leftArray[index1];
            index1++;
            index3++;
        }

        while (index2 < size2) {
            dArr[index3] = rightArray[index2];
            index2++;
            index3++;
        }
    }
}
