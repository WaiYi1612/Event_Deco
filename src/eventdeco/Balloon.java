/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventdeco;

/**
 *
 * @author Wong
 */
public class Balloon {
    private String type;
    private double price;

    public Balloon(){
        
    }

    public Balloon(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    
    
    @Override
    public String toString(){
        return String.format("%-35s RM%6.2f", type, price);
    }
}