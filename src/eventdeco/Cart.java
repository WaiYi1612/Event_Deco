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
public class Cart {
    private static double grandTotal;
    private static EventList[] eventList;
    
    public Cart(){
        
    }

    public static double getGrandTotal() {
        return grandTotal;
    }

    public static void setGrandTotal(double grandTotal) {
        Cart.grandTotal = grandTotal;
    }

    public static EventList[] getEventList() {
        return eventList;
    }

    public static void setEventList(EventList[] eventList) {
        Cart.eventList = eventList;
    }

   
   
    
    
}
