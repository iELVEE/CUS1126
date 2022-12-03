public class CopyArrays{
    public static void main(String[] args){
        int[] oldArray = makeReadable(args);
        int[] newArray = new int[oldArray.length * 2];
        copyArrays(oldArray, newArray);
        System.out.println("Old Array: " + printableArray(oldArray) + "\nNew Array: " + printableArray(newArray));
    }

//    program 3
    public static void copyArrays(int[] source, int[] target){
//        iterate through
        for (int i = 0; i < source.length; i++) {
//            copy from source to target
            target[i] = source[i];
        }
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

//    turn array into a string i can print
    public static String printableArray(int[] ary){
//        start the string
        String model = "[";
//        put in each number followed by a comma
        for (int i = 0; i < ary.length; i++) {
            model += ary[i];
            model += ", ";
        }
//        get rid of the last comma and replace with a bracket, return that
        return model.substring(0, model.length() - 2) + "]";
    }
}