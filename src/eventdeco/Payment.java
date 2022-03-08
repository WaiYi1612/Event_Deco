/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventdeco;
import java.time.LocalDate;
/**
 *
 * @author Wong
 */
public class Payment {
    private Cart cart;
    private static int invoicenum = 100;

    public Payment(Cart cart) {
        this.cart = cart;
    }

    public static double grandTotal(){
        return Cart.getGrandTotal();
    }
  public static String GenerateReceiptHeader(){
    String receiptHeader =String.format("\n\n%45s \n%40s %s \n%43s %s\n ",
                                "Event Deco", "Date: ", LocalDate.now(),
                                "Invoice No.:",invoicenum);
    invoicenum++;
return receiptHeader;
  }

 
}
