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
public class Decor {
    private String type;
    private double price;
    private String description;

    public Decor(){
        
    }

    public Decor(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   

    @Override
    public String toString(){
        return String.format("%-20s RM%6.2f      %-40s", type,price,description);
    }
    
}