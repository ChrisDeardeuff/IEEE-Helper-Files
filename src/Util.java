
public final class Util {

    /**
     * print call println and allows the user to not have to type System.out everytime to print
     *
     * @param s the object passed to be printed
     */
    public static void print(Object s){

        System.out.println(s);
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

        int index = -1;
        int left = 0;
        int right = intArray.length;

        mergeSort(intArray, 0, intArray.length - 1);

        while(true) {

            if (right >= left) {
                int middle = left + (right - 1) / 2;

                if (intArray[middle] == value) {
                    index = middle;
                    return index;
                }
                if (intArray[middle] > value) {
                    right = middle - 1;
                    continue;
                }

                left = middle +1;
                continue;
            }
            return -1;
        }
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
        int index = -1;
        int left = 0;
        int right = sArray.length;
        //Implement Binary Search for String here. Update index with the correct index if found.

        while(true) {

            if (right >= left) {
                int middle = left + (right - 1) / 2;

                if (sArray[middle].equals(value)) {
                    index = middle;
                    return index;
                }
                if (sArray[middle].compareTo(value) > 0) {
                    right = middle - 1;
                    continue;
                }

                left = middle +1;
                continue;
            }
            return -1;
        }
        //If not found return index as -1;
    }

    /**
     * Perform a Binary Search through an Array of doubles.
     * @param dArray array to be searched.
     * @param value the value to be searched for.
     * @return index, the index of the value if located in array. If not then return -1
     */
    public static int binarySearch(double[] dArray, double value){
        int index = -1;
        //Implement Binary Search for String here. Update index with the correct index if found.
        //If not fount return index as -1;

        return index;
    }

    //================================================//
    //====================Sorts=======================//
    //================================================//

    public static void mergeSort(int[] intArr, int left, int right){

        if(left < right){
            int middle = (left + right) / 2;

            mergeSort(intArr, left, middle);
            mergeSort(intArr,middle+1, right);

            merge(intArr, left, middle, right);
        }
    }

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
}
