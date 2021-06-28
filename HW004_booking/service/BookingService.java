package com.homework.booking.service;

import com.homework.booking.entity.Bill;
import com.homework.booking.entity.Hotel;
import com.homework.booking.entity.Client;
import com.homework.booking.entity.Room;

public class BookingService {

    public void book(Hotel hotel, Client client, int numberOfPerson) {
        Room[] rooms = hotel.getRooms();
        boolean isFreeRooms = false;
        for (Room r : rooms) {
            if (r.isFree()) {
                isFreeRooms = true;
            }
        }
        if (!isFreeRooms) {
            System.out.println("There are no free rooms in the hotel " + hotel.getName());
        }

        bookRoom(client, numberOfPerson, rooms);
    }

    private void bookRoom(Client client, int numberOfPerson, Room[] rooms) {
        boolean success = false;
        String clientName = client.getName();
        for (Room room : rooms) {
            if (room.getNumberOfPerson() == numberOfPerson) {
                success = true;
                System.out.println("Found a number for a client " + clientName);
                if (client.getBill().getAmount() >= room.getCost()) {
                    Bill clientBill = client.getBill();
                    clientBill.setAmount(clientBill.getAmount() - room.getCost());
                    room.setFree(false);
                    System.out.println("The room was successfully booked " + clientName);
                } else {
                    System.out.println("Not enough money for a client to book a room " + clientName);
                }
            }
        }
        if (!success) {
            System.out.println("There wasn't a suitable number for the client: " + clientName);
        }
    }
}
