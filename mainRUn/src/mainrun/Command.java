/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainrun;

/**
 *
 * @author TECHNICAL
 */
interface Command {
    void execute();
}

class BookTicketCommand implements Command {
    private String movie;
    private String theater;
    private int seatNumber;

    public BookTicketCommand(String movie, String theater, int seatNumber) {
        this.movie = movie;
        this.theater = theater;
        this.seatNumber = seatNumber;
    }

    @Override
    public void execute() {
        TicketBookingSystem.getInstance().bookTicket(movie, theater, seatNumber);
    }
}

