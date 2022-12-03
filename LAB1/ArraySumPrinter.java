public class ArraySumPrinter {
    public static void main(String[] args){
//        print the sum of the turned numbers
        System.out.println(printSum(makeReadable(args)));
    }

    //    Lab program 1
    public static int printSum(int[] array){
//        keeping track of the sum
        int sum = 0;
//        loop through the array and add to the sum
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
//        return the sum
        return sum;
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