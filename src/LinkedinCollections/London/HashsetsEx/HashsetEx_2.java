package LinkedinCollections.London.HashsetsEx;

import LinkedinCollections.London.Room;

import java.util.ArrayList;
import java.util.Collection;

//Linekdin V6 - Creating  a collection  very goood
public class HashsetEx_2 {
    public static void main(String[] args) {

        Collection c1 = new ArrayList();
        c1.add("Oven");
//        but we can't add primiitive types in colleitons . only objects  //
        // It will needed to be autoboxed to its wrapper.
        c1.add(1L);
        c1.add( new Room("Best Room", "Suite", 2, 12.00));  // adding an object to ArrayList Collection

//try here       c1.stream() .forEach(e -> System.out.println(e.getClass()));
                                            //Here we care casting the element to a type Room
//        .forEach(e -> System.out.println(((Room)e).getName()));  error // this will let me access methods on element
                // we are getting the error mssg. bc  string isn't compatible with Room object.
        // ThtS WHERE WE ENTER GENRICS.



// Vid 02:52
//        GENERICS
        Collection <Room> c2 = new ArrayList<>();
// Try        c2.add("Oven"); // Error
//        but we can't add primiitive types in colleitons . only objects  //
        // It will needed to be autoboxed to its wrapper.
// Try      c2.add(1L); // Error
        c2.add( new Room("Best Room", "Suite", 2, 12.00));  // adding an object to ArrayList Collection
        c2.stream()
                        .forEach(e -> System.out.println( e ));
        System.out.println("16--c1  =" + c1);

    }
}
