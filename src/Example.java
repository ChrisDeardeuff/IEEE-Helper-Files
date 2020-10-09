
public class Example {

    public static void main(String[] args) {

        Util.print("Hello World");

        int[] array = {10, 2, 3, 5, 9, 7};
        String[] sArray = {"Cat","Dog","Monkey","Ardvark"};

        Util.print(Util.binarySearch(sArray,"Ardvark"));
        Util.print(Util.binarySearch(array,10));

    }
}
