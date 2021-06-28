package com.homework.booking;

import com.homework.booking.entity.Bill;
import com.homework.booking.entity.Client;
import com.homework.booking.entity.Hotel;
import com.homework.booking.entity.Room;
import com.homework.booking.service.BookingService;


public class Main {

    public static void main(String[] args) {

        Bill loriBill = new Bill(10000);
        Client loriClient = new Client("Lori", "Cat", "+380452", "lori@cat.xyz", loriBill);

        Bill baxBill = new Bill(12000);
        Client baxClient = new Client("Bax", "Cat", "+380215", "bax@cat.xyz", baxBill);

        Room[] californiaHotelRooms = new Room[]{new Room(1, 1500, true),
                new Room(3, 3500, true), new Room(2, 2500, true)};
        Hotel californiaHotel = new Hotel("California", californiaHotelRooms);

        Room[] sanFranciscoHotelRooms = new Room[]{new Room(2, 2800, true),
                new Room(3, 14000, true), new Room(1, 2000, true)};
        Hotel sanFranciscoHotel = new Hotel("SanFrancisco", sanFranciscoHotelRooms);

        BookingService bookingService = new BookingService();
        bookingService.book(californiaHotel, loriClient, 2);
        System.out.println("\n");
        bookingService.book(californiaHotel, loriClient, 4);
        System.out.println("\n");
        bookingService.book(sanFranciscoHotel, baxClient, 3);
    }

}

