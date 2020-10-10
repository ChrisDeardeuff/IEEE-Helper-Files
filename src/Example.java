
public class Example {

    public static void main(String[] args) {

        Util.print("Hello World");

        int[] array = {2, 3, 7, 10, 5, 9};
        String[] sArray = {"Cat","Dog","Monkey","Ardvark"};
        double[] dArray = {2.3,3.14,0.0,9.2,10.1, -10.1};

        Util.printArray(array);
        Util.mergeSort(array , 0,array.length - 1);
        Util.printArray(array);
        Util.print(Util.binarySearch(array,5));


        Util.printArray(sArray);
        Util.mergeSort(sArray, 0 , sArray.length - 1);
        Util.printArray(sArray);
        Util.print(Util.binarySearch(sArray,"Monkey"));

        Util.printArray(dArray);
        Util.mergeSort(dArray,0,dArray.length - 1);
        Util.printArray(dArray);
        Util.print(Util.binarySearch(dArray,3.14));

    }
}
