/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainrun;

/**
 *
 * @author TECHNICAL
 */

// Singleton: Ticket Booking System
class TicketBookingSystem {
    private static TicketBookingSystem instance;

    private TicketBookingSystem() {}

    public static synchronized TicketBookingSystem getInstance() {
        if (instance == null) {
            instance = new TicketBookingSystem();
        }
        return instance;
    }

    public void bookTicket(String movie, String theater, int seatNumber) {
        System.out.println("Ticket booked for " + movie + " at " + theater + " for seat " + seatNumber);
    }
}