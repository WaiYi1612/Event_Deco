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
public class CreditCard extends Payment{
    private static int creditCardNo;
    private int cardMonth;
    private int cardYear;
    
    
    public CreditCard(Cart cart){
        super(cart);
    }

    public static int getCreditCardNo() {
        return creditCardNo;
    }

    public static void setCreditCardNo(int creditCardNo) {
        CreditCard.creditCardNo = creditCardNo;
    }


    public int getCardMonth() {
        return cardMonth;
    }

    public void setCardMonth(int cardMonth) {
        this.cardMonth = cardMonth;
    }

    public int getCardYear() {
        return cardYear;
    }

    public void setCardYear(int cardYear) {
        this.cardYear = cardYear;
    }
    
    public static boolean cardNo(String cardNo, String expMonth, String expYear){
        // convert input to int
        int[] creditCardNo = new int[cardNo.length()];
        int[] cardMonth = new int[expMonth.length()];
        int[] cardYear = new int[expYear.length()];
        int x;
        
        //add up last 2 digit of month and year and total them up
        for (int i = 0; i <expMonth.length(); i++){
            cardMonth[i] = Integer.parseInt(expMonth.substring(i, i + 1));}
        
        for (int i = 2; i <expYear.length(); i++){
            cardYear[i] = Integer.parseInt(expYear.substring(i, i + 1));}
            
        x = cardMonth[0] + cardMonth[1] + cardYear[2] + cardYear[3];  

                               
        for (int i = 0; i < cardNo.length(); i++){
            creditCardNo[i] = Integer.parseInt(cardNo.substring(i, i + 1));
        }
        
        // starting from right, double each other digit, if greater than 9 mod 10 + 1 to remainder
        for (int i = creditCardNo.length - 2; i >= 0; i = i -2){
            int newValue = creditCardNo[i];
            newValue = newValue * 2;
            if(newValue > 9){
                newValue = newValue % 10 + 1;
            }
            creditCardNo[i] = newValue;
        }
        
        // add up all digit
        int total = 0;
        for (int i = 0; i < creditCardNo.length; i++){
            total += creditCardNo[i];
        }
        
        // if number is multiple of 10, it is valid
        if(total % 10 == 0){
            if (x <= creditCardNo[15])
                return true;
        }else{
            return false;
        }
        return false;
    }

    
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
public static String generateReceiptCard(){
    return String.format("\n%-29s\n", "Paid with Card", creditCardNo);
}
}



