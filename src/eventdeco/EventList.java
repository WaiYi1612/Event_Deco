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
public class EventList {

    private static int nextLineNo = 0;
    private int lineNo;
    private String eventName;
    private Balloon ballonList;
    private Flower flowerList;
    private Decor decorList;
    private Theme themelist;
    private Bouquet bouqlist;
    private Package packlist;
    private int quantity;
    private int productNo;
    private int PackageNo;
    private int bouqNo;
    private int DecorNo;

    public EventList() {
        lineNo = ++nextLineNo;
    }

    public static void restLineNo() {
        nextLineNo = 0;
    }

    public EventList(String eventName) {
        this.eventName = eventName;
    }

    public EventList(Balloon ballonList, int quantity) {
        lineNo = ++nextLineNo;
        this.ballonList = ballonList;
        this.quantity = quantity;
    }

    public EventList(Flower flowerList, int quantity) {
        lineNo = ++nextLineNo;
        this.flowerList = flowerList;
        this.quantity = quantity;
    }

    public EventList(Decor decorList, int quantity) {
        lineNo = ++nextLineNo;
        this.decorList = decorList;
        this.quantity = quantity;
    }

    public EventList(Theme themelist, int quantity) {
        lineNo = ++nextLineNo;
        this.themelist = themelist;
        this.quantity = quantity;
    }

    public EventList(Bouquet bouqlist, int quantity) {
        lineNo = ++nextLineNo;
        this.bouqlist = bouqlist;
        this.quantity = quantity;
    }

    public EventList(Package packlist, int quantity) {
        lineNo = ++nextLineNo;
        this.packlist = packlist;
        this.quantity = quantity;
    }

    public static void setNextLineNo(int nextLineNo) {
        EventList.nextLineNo = nextLineNo;
    }

    public void setLineNo(int lineNo) {
        this.lineNo = lineNo;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setBallonList(Balloon ballonList) {
        this.ballonList = ballonList;
    }

    public void setFlowerList(Flower flowerList) {
        this.flowerList = flowerList;
    }

    public void setDecorList(Decor decorList) {
        this.decorList = decorList;
    }

    public void setThemelist(Theme themelist) {
        this.themelist = themelist;
    }

    public void setBouqlist(Bouquet bouqlist) {
        this.bouqlist = bouqlist;
    }

    public void setPacklist(Package packlist) {
        this.packlist = packlist;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProductNo(int productNo) {
        this.productNo = productNo;
    }

    public void setPackageNo(int PackageNo) {
        this.PackageNo = PackageNo;
    }

    public void setBouqNo(int bouqNo) {
        this.bouqNo = bouqNo;
    }

    public void setDecorNo(int DecorNo) {
        this.DecorNo = DecorNo;
    }

    public static int getNextLineNo() {
        return nextLineNo;
    }

    public int getLineNo() {
        return lineNo;
    }

    public String getEventName() {
        return eventName;
    }

    public Balloon getBallonList() {
        return ballonList;
    }

    public Flower getFlowerList() {
        return flowerList;
    }

    public Decor getDecorList() {
        return decorList;
    }

    public Theme getThemelist() {
        return themelist;
    }

    public Bouquet getBouqlist() {
        return bouqlist;
    }

    public Package getPacklist() {
        return packlist;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getProductNo() {
        return productNo;
    }

    public int getPackageNo() {
        return PackageNo;
    }

    public int getBouqNo() {
        return bouqNo;
    }

    public int getDecorNo() {
        return DecorNo;
    }

    private double getPricePack() {

        return packlist.getPrice();
    }

    public double getPriceBalloon() {
        double BalloonPrice = 0;
        switch (productNo) {
            case 1:
                switch (PackageNo) {
                    case 0:
                    case 1:
                    case 2:
                        BalloonPrice = packlist.getPrice();
                        break;
                    case 4:
                        BalloonPrice = ballonList.getPrice();
                        break;

                }
        }
        return BalloonPrice;
    }

    public double getPriceFlower() {
        double FlowerPrice = 0;
        switch (productNo) {
            case 2:
                switch (bouqNo) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        FlowerPrice = bouqlist.getPrice();
                        break;
                    case 6:
                        FlowerPrice = flowerList.getPrice();
                        break;

                }
        }
        return FlowerPrice;
    }
     public double getPriceDecor() {
        double DecorPrice = 0;
        switch (productNo) {
           case 3:
               switch (DecorNo){
                   case 0:
                   case 1:
                   case 2:
                   case 3:
                   case 4:                     
                       DecorPrice = themelist.getPrice();
                       break;                       
                   case 6:
                       DecorPrice = decorList.getPrice();
                       break;
                   
               } 
        }
        return DecorPrice;
     }
public String getBalloonP() {
        String balloon = "";
        switch (productNo) {
            case 1:
                switch (PackageNo) {
                    case 0:
                    case 1:
                    case 2:
                        balloon = packlist.getType();
                        break;
                    case 4:
                        balloon = ballonList.getType();
                        break;

                }
        }
        return balloon;
    }

    public String getFlowerP() {
        String flower = "";
        switch (productNo) {
            case 2:
                switch (bouqNo) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        flower = bouqlist.getType();
                        break;
                    case 6:
                        flower = flowerList.getType();
                        break;
                }
        }
        return flower;
    }
public String getDecorP() {
        String decor = "";
        switch (productNo) {
           case 3:
               switch (DecorNo){
                   case 0:
                   case 1:
                   case 2:
                   case 3:
                   case 4:   
                       decor = themelist.getType();
                       break;     
                   case 6:
                       decor = decorList.getType();
                       break;
                                     
               }   
        }
        return decor;
}
    public double subTotal() {
        double price =0;
        switch(productNo){
            case 1:
                price = getPriceBalloon();
                break;
            case 2:
                price = getPriceFlower();
                break;
            case 3:
                price = getPriceDecor();
                break;
        }
        return price * quantity;
    }

    @Override
    public String toString() {
        switch(productNo){
            case 1:
             return String.format("%-3d %-40s RM%6.2f           %-10d    RM%6.2f", lineNo, getBalloonP(), getPriceBalloon(), quantity, subTotal());
            
            case 2:
                return String.format("%-3d %-40s RM%6.2f           %-10d    RM%6.2f", lineNo, getFlowerP(), getPriceFlower(), quantity, subTotal());
    }
        return String.format("%-3d %-40s RM%6.2f           %-10d    RM%6.2f", lineNo, getDecorP(), getPriceDecor(), quantity, subTotal());
    }
}
