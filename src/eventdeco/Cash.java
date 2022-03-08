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
public class Cash extends Payment{

  private static double CashReceived;
  
  public Cash (Cart cart){
      super(cart);
  }

    public static double getCashReceived() {
        return CashReceived;
    }

    public static void setCashReceived(double CashReceived) {
        Cash.CashReceived = CashReceived;
    }

    

    public static double CashTrenderd(){
        return (CashReceived - Cart.getGrandTotal());
    }
    
    public static String generateReceiptCash(){
        return String.format("\n%90s%6.2f\n%90s%6.2f\n%-90s\n", 
                "Cash Received (RM):", CashReceived, "Change (RM):", CashTrenderd(), "Paid with Cash");
    }
}