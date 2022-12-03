public class hw2{
    public static void main(String[] args){
        //check if we actually got a string or if the input is just empty
        if (args.length == 0){
            System.out.println("You didn't give me a String");
        }
        //reverses string inputed when run
        else{
            System.out.println("Original String:" + args[0]);
            System.out.println("Reversed String:" + reverse(args[0]));
        }
    }

    public static String reverse(String str){
        //base case: checks if string is empty
        if (str.equals("") || str == null){
            return "";
        }
        //recursion case: gives rest of the string with the beginning attached to the end
        else{
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }
}