/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author doaaa
 */
public class ComedyMovie extends Movie {
    public ComedyMovie(String title, double price) {
        super(title, price);
    }

    @Override
    public String getDetails() {
        return "Movie: " + title + "\nGenre: Comedy\nTicket Price: $" + price;
    }
    
}
