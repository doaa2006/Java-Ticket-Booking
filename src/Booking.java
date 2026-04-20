/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author doaaa
 */
public class Booking {
     private User user;
    private Movie movie;
    private Cinema cinema;
    private int tickets;

    public Booking(User user, Movie movie, Cinema cinema, int tickets) {
        this.user = user;
        this.movie = movie;
        this.cinema = cinema;
        this.tickets = tickets;
    }

    public String getBookingDetails() {
        double totalPrice = movie.price * tickets;
        return """
               ------ Booking Details ------
               User: """ + user.getName() + "\n" +
               cinema.getCinemaInfo() + "\n" +
               movie.getDetails() + "\n" +
               "Tickets: " + tickets + "\n" +
               "Total Price: $" + totalPrice;
    }
}
