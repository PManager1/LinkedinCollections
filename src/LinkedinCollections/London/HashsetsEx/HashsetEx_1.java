package LinkedinCollections.London.HashsetsEx;
import java.util.*;

//Linekdin V 5 - Creating  a collection  very goood
public class HashsetEx_1 {

    public static void main(String[] args) {

//    Collection c = new HashSet();  // not specific

    Set c = new HashSet(); // Specific //This works bc Java Hashset implements the Set interface.


//    List c = new HashSet();  // cant do this bc  hashset isn't a type of list.  so incompatible.

//        Collection c1 = new Collection(); // this have no direct implemtnation so this doesnt work.

        List al = new ArrayList();
        al.add(1); al.add("string");
        System.out.println("21--al  =" + al);

//  Topic ; Each colleciotn hvae a construgotr that can accept another collection as an argument.
        Collection <String> c2  = new ArrayList<String>();
        c2.add("st1");c2.add("sBoard");
        System.out.println("24--c2  =" + c2);

        //  Now we will convert c2 colleciotn of array list into a set.
        Set s1 = new HashSet<>(c2);
        System.out.println("29--s1  =" + s1);
        s1.add(23);
        System.out.println("29--s1  =" + s1);


        ArrayList <String> a3  = new ArrayList<String>(); // not good practice
        List <String> a4  = new ArrayList<String>();
        Collection <String> a5  = new ArrayList<String>();
    }

}
