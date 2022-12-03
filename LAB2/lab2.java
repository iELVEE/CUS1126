public class lab2{
    public static void main(String[] args){
        //selectionsort
        int[] array = {90, 8, 7, 56, 123, 9, 1, 653};
        System.out.println("\nSelection Sort\n");
        System.out.println(printIntArray(array));
        System.out.println(printStringArray(selection(array)));
        System.out.println(printIntArray(array));

        //insertionsort
        array = new int[] {90, 8, 7, 56, 123, 9, 1, 653};
        System.out.println("\nInsertion Sort\n");
        System.out.println(printIntArray(array));
        System.out.println(printStringArray(insertion(array)));
        System.out.println(printIntArray(array));

        //bubblesort
        array = new int[] {90, 8, 7, 56, 123, 9, 1, 653};
        System.out.println("\nBubble Sort\n");
        System.out.println(printIntArray(array));
        System.out.println(printStringArray(bubble(array)));
        System.out.println(printIntArray(array));

        //quicksort
        array = new int[] {90, 8, 7, 56, 123, 9, 1, 653};
        System.out.println("\nQuick Sort\n");
        System.out.println(printIntArray(array));
        quick(array,0, array.length-1);
        System.out.println(printStringArray(quickStates));
        System.out.println(printIntArray(array));

        //mergesort
        array = new int[] {90, 8, 7, 56, 123, 9, 1, 653};
        System.out.println("\nmerge Sort\n");
        System.out.println(printIntArray(array));
        merge(array,0, array.length-1);
        System.out.println(printStringArray(mergeStates));
        System.out.println(printIntArray(array));
    }

    //helper methods
    public static void swap(int[] ary, int first, int second){
        int temp = ary[first];
        ary[first] = ary[second];
        ary[second] = temp;
    }
    public static String printIntArray(int[] ary){
        String printable = "[";
        for (int i = 0; i < ary.length; i++) {
            printable += ary[i];
            printable += ", ";
        }
        return(printable.substring(0, printable.length() - 2) + "]");
    }
    public static String printStringArray(String[] ary){
        String printable = "";
        for (int i = 0; i < ary.length; i++) {
            printable += ary[i];
            printable += "\n";
        }
        return(printable.substring(0, printable.length() - 1));
    }

    //lab methods
    public static String[] selection(int[] ary){
        String[] states = new String[ary.length-1];
        for (int i = 0; i < ary.length-1; i++){
            int minInd = i;
            for (int c = i+1; c < ary.length; c++){
                if (ary[c] < ary[minInd]){
                    minInd = c;
                }
            }
            swap(ary, minInd, i);
            states[i] = printIntArray(ary);
        }
        return states;
    }

    public static String[] insertion(int[] ary){
        String[] states = new String[ary.length-1];
        for (int i = 1; i < ary.length ; i++){
            int current = ary[i];
            int g = i;
            while (g > 0 && ary[g-1] > current){
                ary[g] = ary[g-1];
                g -= 1;
            }
            ary[g] = current;
            states[i-1] = printIntArray(ary);
        }
        return states;
    }

    public static String[] bubble(int[] ary){
        String[] states = new String[13];
        int size = 0;
        for (int i = ary.length-1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (ary[j-1] > ary[j]){
                        swap(ary, j-1, j);
                        states[size] = printIntArray(ary);
                        size++;
                }
            }
        }
        return states;
    }

    public static String[] quickStates = new String[7];
    public static int quickStateIndex = 0;
    public static void quick(int[] ary, int low, int high){
        if (low < high) {
            int pivot = ary[low + (high - low) / 2];
            int l = low;
            int h = high;
            while (l <= h) {
                while (ary[l] < pivot) {
                    l += 1;
                }
                while (ary[h] > pivot) {
                    h -= 1;
                }
                if (l <= h) {
                    swap(ary, l, h);
                    l += 1;
                    h -= 1;
                }
            }
            quickStates[quickStateIndex] = "pivot: " + pivot +", index = " + (low + (high-low)/2) + ", sorting from indexes " + low + " to " + high + ", turns into: ";
            quickStates[quickStateIndex] += printIntArray(ary);
            quickStateIndex += 1;
            if (low < h) {
                quick(ary, low, h);
            }
            if (high > l) {
                quick(ary, l, high);
            }
        }
    }

    public static String[] mergeStates = new String[7];
    public static int mergeStateIndex = 0;
    public static void merge(int[] ary, int low, int high){
        if (low == high){
            return;
        }
        int length = high - low + 1;
        int pivot = low + (high-low) / 2;
        merge(ary, low, pivot);
        merge(ary, pivot+1, high);

        int m1 = pivot - low + 1;
        int m2 = high - pivot;

        int[] m1a = new int[m1];
        int[] m2a = new int[m2];
        for (int i = 0; i < m1; i++) {
            m1a[i] = ary[low+i];
        }
        for (int i = 0; i < m2; i++) {
            m2a[i] = ary[pivot + 1 + i];
        }
        int m1i = 0, m2i = 0;
        int ai = low;
        while(m1i < m1 && m2i < m2){
            if (m1a[m1i] <= m2a[m2i]){
                ary[ai] = m1a[m1i];
                m1i += 1;
            }
            else{
                ary[ai] = m2a[m2i];
                m2i += 1;
            }
            ai += 1;
        }
        while (m1i < m1){
            ary[ai] = m1a[m1i];
            m1i += 1;
            ai += 1;
        }
        while (m2i < m2){
            ary[ai] = m2a[m2i];
            m2i += 1;
            ai += 1;
        }
        mergeStates[mergeStateIndex] = "pivot index: " + pivot + ", merging from indexes " + low + " to " + high + ", turns into ";
        mergeStates[mergeStateIndex] += printIntArray(ary);
        mergeStateIndex += 1;
    }
}