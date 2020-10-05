
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
    public static int binarySearch(int[] intArray, int value, int left, int right){

        int index = -1;
        int middle = intArray.length / 2;
        int last = right;
        int first = left;

        mergeSort(intArray, 0, intArray.length - 1);

        if(right >= 1){
            if(intArray[middle] == value){
                index = middle;
                return index;
            }
            if(intArray[middle] > value){
                return binarySearch(intArray, value, left , middle - 1);
            }

            return binarySearch(intArray, value, middle + 1 , right);
        }
        //Implement Binary Search for integer here. Update index with the correct index if found.
        //If not fount return index as -1;

        return index;
    }

    /**
     * Perform a Binary Search through a String Array.
     * @param sArray array to be searched.
     * @param value the value to be searched for.
     * @return index, the index of the value if located in array. If not then return -1
     */
    public static int binarySearch(String[] sArray, String value){
        int index = -1;
        //Implement Binary Search for String here. Update index with the correct index if found.
        //If not fount return index as -1;

        return index;
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

        if(right > 1){
            int middle = (left + right) / 2;

            mergeSort(intArr, left, middle);
            mergeSort(intArr,middle+1, right);

            merge(intArr, left, middle, right);
        }

    }
    private static void merge(int[] intArr, int left, int middle, int right){

        int size1 = middle - left + 1;
        int size2 = middle - left + 1;

        int[] leftArray = new int[size1];
        int[] rightArray = new int[size2];

        for(int i = 0; i < size1; i++){
            leftArray[i] = intArr[left + i];
        }
        for(int i = 0; i < size1; i++){
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
        while (index1 < size2) {
            intArr[index3] = leftArray[index1];
            index1++;
            index3++;
        }

        /* Copy remaining elements of R[] if any */
        while (index2 < size2) {
            intArr[index3] = rightArray[index2];
            index2++;
            index3++;
        }
    }
}
