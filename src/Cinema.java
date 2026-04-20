/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author doaaa
 */
public class Cinema {
    String name;
    String location;

    public Cinema(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getCinemaInfo() {
        return "Cinema: " + name + "\nLocation: " + location;
    }
}
