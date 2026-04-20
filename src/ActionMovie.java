/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author doaaa
 */
public class ActionMovie extends Movie {
    public ActionMovie(String title, double price) {
        super(title, price);
    }

    @Override
    public String getDetails() {
        return "Movie: " + title + "\nGenre: Action\nTicket Price: $" + price;
    }
}

