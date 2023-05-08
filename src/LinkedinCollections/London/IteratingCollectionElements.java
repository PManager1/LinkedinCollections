package LinkedinCollections.London;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratingCollectionElements {
    public static void main(String[] args) {
        Room cambridge = new Room ( "Room Cambridge", "continental", 1, 120.20 );
        Room manchester = new Room ( "Room Manchester", "continental", 2, 120.23 );
        Room oxford = new Room ( "Room Oxford", "continental", 2, 100.00 );


        Collection<Room> rooms = new ArrayList<>(Arrays.asList(cambridge,manchester,oxford));

        System.out.println(rooms.getClass());

/* Doesnt really work.
        System.out.println("rooms =" + rooms ) ;
        for (int i=0; i< rooms.size(); i++){
            System.out.println("rooms =" + rooms.toString()  ) ;
        }
*/
                            // invoke iterator method on our collection
        Iterator<Room> iterator = rooms.iterator();  // this is a factory method tht returns a new instance of a iterator.

//    This works!!!
        System.out.println(iterator.next().getName() );
        System.out.println(iterator.next().getName() );

//More effective than above method.
            while (iterator.hasNext()) {
                Room next =  iterator.next();
                System.out.println(next.getName());
            }

        for (Room room: rooms) {
            System.out.println("39--  " +  room.getName());
        }

        rooms.stream()
                .forEach(r-> System.out.println("43=   "+ r.getName()));
                
    }
}

