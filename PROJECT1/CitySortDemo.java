import java.util.*;

public class CitySortDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<City> cities = new ArrayList<City>();

        // add following cities and city of your favorite  to your ArrayList:

// "Anchorage", "Alaska"

//"Little Rock", "Arkansas"

//"Fairbanks", "Alaska"));

//"Bumblebee", "Arizona"

//"Springfield", "Oregon"

//"NYC", "NY"
        // add 5 more cities in your list

        //normal array of cities so i can add them to the arraylist more easily
        String[][] cityAry = {{"Anchorage", "Alaska"}, {"Little Rock", "Arkansas"}, {"Fairbanks", "Alaska"}, {"Bumblebee", "Arizona"}, {"Springfield", "Oregon"}, {"NYC", "NY"}, {"Chicago", "Illinois"}, {"Philadelphia", "Pennsylvania"}, {"Phoenix", "Arizona"}, {"Houston", "Texas"}, {"Springfield", "Illinois"}};
        for (String[] c: cityAry){
            cities.add(new City(c[0], c[1]));
        }

        System.out.println("Unsorted cities: ");
        System.out.println(cities);
        Collections.sort(cities);
        System.out.println("\nSorted cities: ");
        System.out.println(cities);

    }

}