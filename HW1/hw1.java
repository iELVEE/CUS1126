public static int findLargest(int[] ary){
    int largest = ary[0];
        for (int i = 1 ; i < ary.length ; i++){
            if (ary[i] > largest){
                largest = ary[i];
        }
        }
        return largest
        }

        int[] testary = [5,6,12,43,1,7,54,2,65,231,43];
System.out.println(findLargest(testary));