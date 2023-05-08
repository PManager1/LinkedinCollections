package LinkedinCollections.London;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Room cambridge = new Room ( "Room one", "continental", 1, 120.20 );
        Room manchester = new Room ( "Room Two", "continental", 2, 120.23 );


        Collection<Room> rooms = List.of(cambridge, manchester);
        double total = CalculateRevenueUsingCollections(rooms);
//        double total = CalculateRevenue(cambridge, manchester);
        System.out.println("14--total = "+ total );

    }


    public static double CalculateRevenueUsingCollections ( Collection<Room> rooms) {

        return rooms.stream()
                .mapToDouble(r -> r.getRate())
//                .distinct()
                .sum();
        

    }

    public static double CalculateRevenue (Room r1, Room r2) {
        Double result  = r1.getRate() * r1.getCapacity() + r2.getRate() * r2.getCapacity();
        return result;
    }



}



//    System.out.println("23--l1 = "+ total );
//
//
//
//            }
//
//public static double CalculateRevenue (Room r1, Room r2) {
//        Double result  = r1.getRate() * r1.getCapacity() + r2.getRate() * r2.getCapacity();
//        return result;
//        }
//
//        }
