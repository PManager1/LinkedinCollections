package LinkedinCollections.London;

import java.util.*;

public class RoomService {

    // Declare a collection to store room Inventory
    private Collection <Room> inventory;


    public RoomService () {  // Constructor
    // intialize collection & assign it to the room Inventory

         this.inventory = new HashSet<>();
//        this.inventory = new LinkedHashSet<>(); // for mantinng the order of hte insertion use LinkedHashSet

//        Grab all the rooms from here

    }


    public Collection<Room> getInventory(){

        //  Return the room inventory
//        return inventory;
        return new HashSet<>(this.inventory);  // we do this to prevent the collection from modification.
//        we only want to send a copy of thhe inventory,  not the original one.

    }

    public void createRoom(String name, String type, int capacity, double rate){

//    jay thinking -    Add a new Room to Room Inventory using the provided parameters.
//    jay thinking         new r1 = new (this.name, this.type, this.capacity, this.rate );

                               // Here new operator will call the construcot and we pass in all the params , will create a room instantce tht will be added to our collection.
          this.inventory.add( new Room( name, type, capacity, rate) );
    }

    public void createRooms(Room[] rooms){
        // Add the array of rooms into the collection
//        this.inventory.addAll( new rooms );
//        Before we can add the rooms array into a collection, we first need to conver the array into a collection.

        this.inventory.addAll(Arrays.asList(rooms));
    }

    public void removeRoom(Room room){
        // Remove the rooms from the room inventory.
        this.inventory.remove(room);
    }

//NEW METHODS   F-3 V-10
    public Boolean hasRoom(Room room){
//        Return boolean if room inventory contains a specific Room

        return this.inventory.contains(room);
    }

    public Room[] asArray(){
//  Returns all rooms as an array in the ***** Order*** they were added.
        return this.inventory.toArray( new Room[0]);
        // in line 16 use this :    //        this.inventory = new LinkedHashSet<>(); // for mantinng the order of hte insertion use LinkedHashSet
    }

    public Collection<Room> getByType (String type) {

/*       Returns a new Collection of rooms where Room type matches the provided string.
       The orignal Room Inventory collection must not be modified. */

        Collection <Room> copy = new HashSet<>(this.inventory);  // bc we dont wanna modify the original collection. so create a copy.
                copy.removeIf( r -> !r.getType().equals(type));

        return null;
    }
}
