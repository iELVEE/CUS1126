public class ArrayMaxMinPrinter {
    public static void main(String[] args){
//        print the min and max of the turned numbers
        printMaxMin(makeReadable(args));
    }

//    Lab program 2
    public static void printMaxMin(int[] array){
//        turn the ones we want into placeholder values
        int max = array[0];
        int min = array[0];
//        iterate through the array
        for (int i = 0; i < array.length; i++) {
//            find the max
            if (max < array[i]){
                max = array[i];
            }
//            find the min
            if (min > array[i]){
                min = array[i];
            }
        }
//        finish up
        System.out.println("min = " + min + ", max = " + max);
    }

//    Turn the numbers we get from the console from a string into an int so printSum actually works
    public static int[] makeReadable(String[] numbers){
//        the int[] array that we will return for printSum
        int[] newNumbers = new int[numbers.length];
//        turn the args from the console into int one by one
        for (int i = 0; i < numbers.length; i++) {
            newNumbers[i] = Integer.parseInt(numbers[i]);
        }
//        finish up
        return newNumbers;
    }
}