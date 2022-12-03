public class City implements Comparable<City>{

    private String name;

    private String state;

    public City(String name, String state)   {
//complete constructor
        this.name = name;
        this.state = state;
    }

// write getter and setter for instance variables
    public String name(){
        return this.name;
    }
    public void name(String name){
        this.name = name;
    }
    public String state(){
        return this.state;
    }
    public void state(String state){
        this.state = state;
    }

    public int compareTo(City other)   {

// complete compareTo method.

// note: compare by city name, if city has the same name, compare them by state.

        //if this city comes before other, return -1
        //              ex: this = "a", "a" ;other = "b", "a"; return -1
        //if this city comes after other, return 1
        //              ex: this = "b", "a"; other = "a", "a"; return 1
        //if this city is the same as other, return 0
        //              ex: this = "a", "a"; other = "a", "a"; return 0

        //because im comparing ascii values, uppercase will screw up values
        String lowerName = name().toLowerCase();
        String lowerState = state().toLowerCase();
        String lowerOtherName = other.name().toLowerCase();
        String lowerOtherState = other.state().toLowerCase();
        //since we want the strings only compared by letter and unaffected by length, truncate name and state to same length
        if (Integer.compare(lowerName.length(), lowerOtherName.length()) < 0){
            lowerOtherName = lowerOtherName.substring(0,lowerName.length());
        }
        else if (Integer.compare(lowerName.length(), lowerOtherName.length()) > 0){
            lowerName = lowerName.substring(0,lowerOtherName.length());
        }
        if (Integer.compare(lowerState.length(), lowerOtherState.length()) < 0){
            lowerOtherState = lowerOtherState.substring(lowerState.length());
        }
        else if (Integer.compare(lowerState.length(), lowerOtherState.length()) > 0){
            lowerState = lowerState.substring(lowerOtherState.length());
        }
        //spaces have their own ascii value and dont count for alphabetical, so ignore them
        lowerName = lowerName.replaceAll("\\s", "");
        lowerOtherName = lowerOtherName.replaceAll("\\s", "");
        lowerState = lowerState.replaceAll("\\s", "");
        lowerOtherState = lowerOtherState.replaceAll("\\s", "");

        for (int i = 0; i < lowerName.length(); i++) {
            if (lowerName.charAt(i) < lowerOtherName.charAt(i)){
                return -1;
            }
            else if (lowerName.charAt(i) > lowerOtherName.charAt(i)){
                return 1;
            }
        }

        //this runs only if the city names are the same
        for (int i = 0; i < lowerOtherState.length(); i++) {
            if (lowerState.charAt(i) < lowerOtherState.charAt(i)) {
                return -1;
            }
            else if (lowerState.charAt(i) > lowerOtherState.charAt(i)){
                return 1;
            }
        }

        //this runs if both state and name were the same
        return 0;
    }

    public String toString()   {

//compete toString method, to print name of city and state
        String tabbing = "\t";
        if (name().length() < 10){
            tabbing = "\t\t";
        }

        return "\nCity: " + name() + tabbing + ", State: " + state();

    }

}