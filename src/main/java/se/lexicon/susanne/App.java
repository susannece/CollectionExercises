package se.lexicon.susanne;

import java.util.*;

public class App
{
    public static void main( String[] args )
    {
//Create a new list and populate it with the days of the week.
        ArrayList<String> week = new ArrayList<>();
        week.add("Monday");
        week.add("Tuesday");
        week.add("Wednesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");
        week.add("Sunday");
// 1. print the out the list.
        System.out.println("Ex1: " + week);

// 2. iterate through the list and print out each element separately.
// iterate through the list using for-loop
        System.out.println("Ex2: ");
        for (String s : week) {
            System.out.println(s);
        }
// iterate through the list using while-loop
        Iterator<String> rator = week.iterator();
        while (rator.hasNext() ) {
            System.out.print(" - " + rator.next());
        }
        System.out.println();

//3. Create a new list and populate it with the days of the week excluding THURSDAY.
// Lastly, insert the weekday THURSDAY into the right position in the list.
        week.remove("Thursday");
        System.out.println("Ex3: " + week);
        week.add(3,"Thursday");
        System.out.println(week);

//4. create a new list out of the first three elements of the first list using a subList.
        ArrayList<String> subWeek = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            subWeek.add(week.get(i));
        }
        System.out.println("Ex4: " + subWeek);

// Create a new hashset and populate it with the days of the week.
        HashSet<String> hashWeek = new HashSet<>();
        hashWeek.add("Monday");
        hashWeek.add("Tuesday");
        hashWeek.add("Wednesday");
        hashWeek.add("Thursday");
        hashWeek.add("Friday");
        hashWeek.add("Saturday");
        hashWeek.add("Sunday");
//5. print the set out and pay attention to the order of the elements.
        System.out.println("Ex5: " + hashWeek);

        HashSet<String> clone = new HashSet<>();
        System.out.println(clone.clone());

//6. convert the hashSet to an arrayList.
        System.out.println("Ex6: ");
        ArrayList<String> list = new ArrayList<>();
        Iterator<String> itr = hashWeek.iterator();

        while (itr.hasNext()){
                list.add( itr.next());
            }
        System.out.println(list);

// Create a new hashSet and populate it with random names.
        HashSet<String> names = new HashSet<>();
        names.add("Lena");
        names.add("Arne");
        names.add("Tomas");
        names.add("Stina");
        names.add("Bert");

//7. Then convert the hashSet to an arrayList.
// Lastly, manually sort the list in alphabetical order and print it out.
        System.out.println("Ex7: ");
        System.out.println("Not sorted: " + names);

// Create new array and add names from HashSet names
        ArrayList<String> list1 = new ArrayList<>();
        System.out.println("toArray " + list1 + " is empty");
        itr = names.iterator();
        while (itr.hasNext()){
            list1.add(itr.next());
        }
//the short code for converting HashSett to an arraylist
        Object[] arr = names.toArray();
        System.out.println( "arr " + Arrays.toString(arr));

// sort with Collections method sort()
        Collections.sort(list1);
        for (String s : list1 ) {
            System.out.println(s);
        }

// sort manually

//8. sort the names in alphabetical order using only a Set or a child of Set.


//9. Create a new hashMap of type <Integer,String> and populate it with elements containing an id(Integer) and a car brand(String). Lastly, print out the entire hashMap.
//10. Create a new hashMap of type <Integer,String> and populate it with elements containing an id(Integer) and a car brand(String). Lastly, print out only the keys.
//11. Create a new hashMap of type <Integer,String> and populate it with elements containing an id(Integer) and a car brand(String). Lastly, print out only the values.
//12. Create a new class and call it Car. Add fields for Id, Brand and Model + getters and setters Create a new hashMap of type <Integer,Car> and populate it with elements

    }
}
