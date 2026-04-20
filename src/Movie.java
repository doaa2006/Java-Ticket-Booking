/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author doaaa
 */
public abstract class Movie {
    String title;
    double price;

    public Movie(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public abstract String getDetails();
}

