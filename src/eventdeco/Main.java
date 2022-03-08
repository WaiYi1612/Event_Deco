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
import java.util.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Package[] packarr = {//shows the item for balloon package
            new Package("Hot air balloon with flower", 200, "4 mini balloon with text and alternative colour of flower"),
            new Package("Bubble Balloon", 150, "4 transparent balloon with decoration in it"),
            new Package("Happy Birthday Balloon Set", 40, "Balloon with happy birthday words and numbers balloon")};
        Balloon[] ballarr = {//shows the item for balloon
            new Balloon("Letter Balloon big[A-Z]", 55),
            new Balloon("Letter Balloon small[A-Z]", 8),
            new Balloon("Latex balloon", 6),
            new Balloon("Number Balloon ", 6)};

        Bouquet[] bouqarr = {//shows the item for Bouquet
            new Bouquet("True Romance", 199, "Small", "One in million roses with Ferrero Rocher"),
            new Bouquet("Sweet Garden", 199, "Small", "Lily of the valley combine with sweet peas and luna"),
            new Bouquet("Sweetheart", 299, "Medium", "10 boost pink roses, cherry and sweet garden plus chocolate basket"),
            new Bouquet("Moonlight", 399, "Large", "One in hundreds moonlight with 20 purple"),
            new Bouquet("Purple Passion", 399, "Large", "Purple Roses, white gerbera, dark purple statice and white statice")};

        Flower[] flowarr = {//shows the item for flower
            new Flower("Roses", 8, "Small"),
            new Flower("Tulips", 10, "Small"),
            new Flower("Delphinium", 40, "Large"),
            new Flower("Oriental Lilly", 30, "Medium"),
            new Flower("Hydrangea", 30, "Medium")};

        Theme[] themearr = {//shows the item for Theme package
            new Theme("Desert", 150, "Desert Photo props,orange party banner, camel picture paper plate and cup and cactus hat."),
            new Theme("Sea", 200, "Sea Photo props, Mermaid balloon, blue party banner,fish picture paper plate and cup and shell hat."),
            new Theme("Garden", 255, "Garden Photo props, Lovely swan  balloon and cute duck balloon, flower picture of paper plate, straw and cup."),
            new Theme("Unicorn", 350, "Unicorn Photo props, 15 pinky balloon decor, unicorn candle(cost RM100) and white unicorn picture paper plate and cup. "),
            new Theme("Space Party", 450, "Universe Photo props, two rocket pic threat bags, rocket model candle, Star hat and space plate and cup. ")};

        Decor[] decoarr = {//shows the item for deco
            new Decor("Party Banner", 30, "Customize"),
            new Decor("Party sash", 25, "Customize"),
            new Decor("Paper plate", 25, "Consist of 100"),
            new Decor("Cup", 25, "Consist of 100"),
            new Decor("Threat Bags", 50, "Consist of 20"),
            new Decor("Candle", 15, "Consist of 10"),
            new Decor("Napkins", 20, "Consist of 3"),
            new Decor("Hat", 15, "Consist of 5"),
            new Decor("Wooden Cutlery", 50, "Consist of 10")};

        int eventNo, productNo, BalloonNo, flowerNo, EDecorNo, quantity, cust, payment, CashReceived, i, code = 0;
        char cont = 'y', conf;
        String eventName;
        double grandTotal = 0.0, GTotal = 0.0, WTotal = 0.0, BTotal = 0.0;
        do {

            getMainPage();//let user choose to sign in or exit
            System.out.println("Key in the number of choice: ");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Key in the number of choice: ");
            }
            cust = scanner.nextInt();
            switch (cust) {
                case 3:
                    break;
                case 2:
                    System.out.println("Daily Sales Report");
                    System.out.println("\nGraduation: \tRM " + GTotal);
                    System.out.println("\nWedding   : \tRM" + WTotal);
                    System.out.println("\nBirthday  : \tRM" + BTotal);
                    break;
            }
        } while (cust == 2 || cust > 3);
        while (cust == 1) {
            i = -1;
            EventList.restLineNo();
            EventList[] eventLists = new EventList[50];

            getEvent();//Sign In

            do {
                grandTotal = 0.0;
                System.out.println("1.Graduation\n2.Wedding\n3.Birthday");//choose event
                System.out.print("Which event would you organised:");
                while (!scanner.hasNextInt()) {
                    scanner.next();
                    System.out.print("Which event would you organised:");
                }
                eventNo = scanner.nextInt();
            } while (eventNo != 1 && eventNo != 2 && eventNo != 3);

            cont = 'y';
            while (cont == 'y') {
                int DecorNo = 0, PackageNo = 0, bouqNo = 0;
                while (DecorNo == 0 && PackageNo == 0 && bouqNo == 0) {
                    do {
//                        if (DecorNo == 0 && PackageNo == 0 && bouqNo == 0){
//                            i--;
//                        }                       
                        if (cont == 'y') {

                            i++;
                        }
                        System.out.println("1.Balloon\n2.Flower\n3.Decoration Item");
                        //choose product to look at the details
                        System.out.print("Which product you need:");
                        //loop to confirm it is integer with no error
                        while (!scanner.hasNextInt()) {
                            scanner.next();
                            System.out.print("Which product you need:");
                        }
                        productNo = scanner.nextInt();
                    } while (productNo != 1 && productNo != 2 && productNo != 3);
                    //product number choosen
                    switch (productNo) {
                        case 1:
                            do {
                                BalloonNo = 7;
                                displayBalloonPackage(packarr);
                                //display balloon package menu 
                                do {
                                    System.out.print("Which type of package would you need: ");
                                    while (!scanner.hasNextInt()) {
                                        scanner.next();
                                        System.out.print("Which type of package would you need: ");
                                    }
                                    PackageNo = scanner.nextInt();
                                    //when customer key in the number that does not contain in menu it will ask again
                                    if (PackageNo > 4) {
                                        System.out.println("Sorry, maybe you have key in a wrong number.Please try again");
                                    }
                                } while (PackageNo > 4);
                                if (PackageNo == 4) {
                                    displayBalloon(ballarr);
                                    //display balloon menu 
                                    do {
                                        System.out.print("Which type of package would you need: ");
                                        while (!scanner.hasNextInt()) {
                                            scanner.next();
                                            System.out.print("Which type of package would you need: ");
                                        }
                                        BalloonNo = scanner.nextInt();
                                        if (BalloonNo > 4) {
                                            System.out.println("Sorry, maybe you have key in a wrong number.Please try again");
                                        }
                                        if (BalloonNo != 0) {
                                            //ask user for quantity
                                            BalloonNo -= 1;
                                            System.out.print("Enter the quantity needed: ");
                                            while (!scanner.hasNextInt()) {
                                                scanner.next();
                                                System.out.print("Enter the quantity needed: ");
                                            }
                                            quantity = scanner.nextInt();

                                            eventLists[i] = new EventList(ballarr[BalloonNo], quantity);
                                            eventLists[i].setProductNo(productNo);
                                            eventLists[i].setPackageNo(PackageNo);

                                            BalloonNo += 1;
                                        }
                                    } while (BalloonNo > 4);
                                } else if (PackageNo != 0) {
                                    PackageNo -= 1;
                                    System.out.print("Enter the quantity needed: ");
                                    while (!scanner.hasNextInt()) {
                                        scanner.next();
                                        System.out.print("Enter the quantity needed: ");
                                    }
                                    quantity = scanner.nextInt();

                                    eventLists[i] = new EventList(packarr[PackageNo], quantity);
                                    eventLists[i].setProductNo(productNo);
                                    eventLists[i].setPackageNo(PackageNo);

                                    PackageNo += 1;
                                }
                            } while (BalloonNo == 0);
                            break;
                        case 2:
                            do {
                                flowerNo = 7;
                                displayFlowerBouquet(bouqarr);
                                //display flower bouquet menu 
                                do {
                                    System.out.print("Which type of bouquet would you need : ");
                                    while (!scanner.hasNextInt()) {
                                        scanner.next();
                                        System.out.print("Which type of bouquet would you need : ");
                                    }
                                    bouqNo = scanner.nextInt();
                                    if (bouqNo > 6) {
                                        System.out.println("Sorry, maybe you have key in a wrong number.Please try again");
                                    }
                                } while (bouqNo > 6);
                                if (bouqNo == 6) {
                                    displayFlowerFlower(flowarr);
                                    //display flower menu 
                                    do {
                                        System.out.print("Which type of bouquet would you need : ");
                                        while (!scanner.hasNextInt()) {
                                            scanner.next();
                                            System.out.print("Which type of bouquet would you need : ");
                                        }
                                        flowerNo = scanner.nextInt();
                                        if (flowerNo > 5) {
                                            System.out.println("Sorry, maybe you have key in a wrong number.Please try again");
                                        }
                                        if (flowerNo != 0) {
                                            flowerNo -= 1;
                                            System.out.print("Enter the quantity needed: ");
                                            while (!scanner.hasNextInt()) {
                                                scanner.next();
                                                System.out.print("Enter the quantity needed: ");
                                            }
                                            quantity = scanner.nextInt();

                                            eventLists[i] = new EventList(flowarr[flowerNo], quantity);
                                            eventLists[i].setProductNo(productNo);
                                            eventLists[i].setBouqNo(bouqNo);
                                            flowerNo += 1;
                                        }
                                    } while (flowerNo > 5);
                                } else if (bouqNo != 0) {
                                    bouqNo -= 1;
                                    System.out.print("Enter the quantity needed: ");
                                    while (!scanner.hasNextInt()) {
                                        scanner.next();
                                        System.out.print("Enter the quantity needed: ");
                                    }
                                    quantity = scanner.nextInt();

                                    eventLists[i] = new EventList(bouqarr[bouqNo], quantity);
                                    eventLists[i].setProductNo(productNo);
                                    eventLists[i].setBouqNo(bouqNo);
                                    bouqNo += 1;
                                }

                            } while (flowerNo == 0);
                            break;
                        case 3:
                            do {
                                EDecorNo = 7;
                                displayDecorTheme(themearr);
                                //display theme package menu 
                                do {
                                    System.out.print("Which decoration item would you need : ");
                                    while (!scanner.hasNextInt()) {
                                        scanner.next();
                                        System.out.print("Which decoration item would you need : ");
                                    }
                                    DecorNo = scanner.nextInt();
                                    if (DecorNo > 6) {
                                        System.out.println("Sorry, maybe you have key in a wrong number.Please try again");
                                    }

                                } while (DecorNo > 6);
                                if (DecorNo == 6) {
                                    displayDecor(decoarr);
                                    //display deco menu 
                                    do {
                                        System.out.print("Which decoration item would you need : ");
                                        while (!scanner.hasNextInt()) {
                                            scanner.next();
                                            System.out.print("Which decoration item would you need : ");
                                        }
                                        EDecorNo = scanner.nextInt();
                                        if (EDecorNo > 9) {
                                            System.out.println("Sorry, maybe you have key in a wrong number.Please try again");
                                        } else if (EDecorNo != 0) {
                                            EDecorNo -= 1;
                                            System.out.print("Enter the quantity needed: ");
                                            while (!scanner.hasNextInt()) {
                                                scanner.next();
                                                System.out.print("Enter the quantity needed: ");
                                            }
                                            quantity = scanner.nextInt();

                                            eventLists[i] = new EventList(decoarr[EDecorNo], quantity);
                                            eventLists[i].setProductNo(productNo);
                                            eventLists[i].setDecorNo(DecorNo);
                                            EDecorNo += 1;
                                        }
                                    } while (EDecorNo > 9);
                                } else if (DecorNo != 0) {
                                    DecorNo -= 1;
                                    System.out.println("Enter the quantity needed: ");
                                    while (!scanner.hasNextInt()) {
                                        scanner.next();
                                        System.out.print("Enter the quantity needed: ");
                                    }
                                    quantity = scanner.nextInt();

                                    eventLists[i] = new EventList(themearr[DecorNo], quantity);
                                    eventLists[i].setProductNo(productNo);
                                    eventLists[i].setDecorNo(DecorNo);
                                    DecorNo += 1;
                                }

                            } while (EDecorNo == 0);//return to last menu page
                            break;
                    }

                }
                grandTotal = grandTotal + eventLists[i].subTotal();
                System.out.println("Do you need another product (y/n)");//need more than one items
                cont = scanner.next().charAt(0);

            }

            displayCart(eventLists);
            System.out.println("---------------------------------------------------");

            System.out.printf("\t%60s %10.2f\n\n\n\n\n\n\n", "Grand Total: ", grandTotal);

            do {
                System.out.print("Do you have a discount code:(y/n)");
                conf = scanner.next().charAt(0);
                if (conf == 'y') {
                    System.out.print("Key in the code: ");
                    while (!scanner.hasNextInt()) {
                        scanner.next();
                        System.out.print("Key in the code: ");
                    }
                    code = scanner.nextInt();

                    if (code == 123456) {
                        System.out.println("RM10 cash rebate will be given.");
                        grandTotal = grandTotal - 10;
                    } else {
                        System.out.println("Sorry, the code is wrong.");
                    }
                }
            } while (conf == 'y' && code != 123456);
            Cart.setGrandTotal(grandTotal);
            //choose payment method
            do {
                System.out.print("Pay with [1]cash or [2]card:");
                while (!scanner.hasNextInt()) {
                    scanner.next();
                    System.out.print("Pay with [1]cash or [2]card:");
                }
                payment = scanner.nextInt();
                scanner.nextLine();
            } while (payment != 1 && payment != 2);
            if (payment == 1) { //pay by cash
                do {
                    System.out.print("Please enter paid amount: RM");
                    while (!scanner.hasNextInt()) {
                        scanner.next();
                        System.out.print("Please enter paid amount: RM");
                    }
                    CashReceived = scanner.nextInt();
                } while (CashReceived < grandTotal);
                Cash.setCashReceived(CashReceived);
                System.out.println(Payment.GenerateReceiptHeader());
                displayCart(eventLists);
                System.out.printf("\n%90s%6.2f", "Grand Total (RM): ", grandTotal);
                System.out.print(Cash.generateReceiptCash());
            } else if (payment == 2) { //pay by card
                int y = 0;
                int a = 0;
                String cardNo, expMonth = null, expYear = null;
                do {
                    System.out.printf("Enter Card No: "); //4440967484181607
                    cardNo = scanner.nextLine();
                    if (CreditCard.isNumeric(cardNo)) {
                        y = y + 1;
                        System.out.printf("Enter Expiry Month: ");
                        expMonth = scanner.nextLine();
                        if (CreditCard.isNumeric(expMonth)) {
                            a = Integer.parseInt(expMonth);
                            if (a >= 1 && a <= 12) {
                                y = y + 1;
                                System.out.printf("Enter Expiry Year: ");
                                expYear = scanner.nextLine();
                                if (CreditCard.isNumeric(expYear)) {
                                    a = Integer.parseInt(expYear);
                                    if (a >= 2020 && a <= 2030) {
                                        y = y + 1;
                                    } else {
                                        System.out.println("Year only can be 2020 - 2030.");
                                        System.out.println("");
                                    }
                                } else {
                                    System.out.println("Invalid, please enter numbers only!!!!!!");
                                }
                            } else {
                                System.out.println("Month only can be 1 - 12.");
                                System.out.println("");
                            }
                        } else {
                            System.out.println("Invalid, please enter numbers only!!!!!!");
                        }
                    } else {
                        System.out.println("Invalid, please enter numbers only!!!!!!");
                    }
                    if (y == 3) { //valid credit card
                        if (CreditCard.cardNo(cardNo, expMonth, expYear)) {
                            System.out.println("Valid");
                            System.out.println(Payment.GenerateReceiptHeader());
                            displayCart(eventLists);
                            System.out.printf("\n%90s%6.2f", "Grand Total (RM): ", grandTotal);
                            System.out.print(CreditCard.generateReceiptCard());
                        } else {
                            System.out.println("Invalid");
                            grandTotal = 0;
                        }
                    } else {
                        y = 0;
                    }
                } while (y == 0);
            }
            switch (eventNo) {
                case 1:
                    eventName = "Graduation";
                    GTotal += grandTotal;
                    break;
                case 2:
                    eventName = "Wedding";
                    WTotal += grandTotal;
                    break;
                default:
                    eventName = "Birthday";
                    BTotal += grandTotal;
                    break;
            }// event Name

            do {
                getMainPage();
                System.out.println("Key in the number of choice: ");
                while (!scanner.hasNextInt()) {
                    scanner.next();
                    System.out.println("Key in the number of choice: ");
                }
                cust = scanner.nextInt();

                switch (cust) {
                    case 3:
                        break;
                    case 2:
                        System.out.println("Daily Sales Report");
                        System.out.println("\nGraduation: \tRM " + GTotal);
                        System.out.println("\nWedding   : \tRM" + WTotal);
                        System.out.println("\nBirthday  : \tRM" + BTotal);
                        break;
                }
            } while (cust == 2);

        }
    }

    public static void getMainPage() {
        System.out.println("\n\nEvent Deco\n");
        System.out.println("1. Login and Sign in");
        System.out.println("2. Sales Report");
        System.out.println("3. Exit");
    }

    public static void displayBalloonPackage(Package[] packarr) {
        int i;
        System.out.println("\t\t\t\t\t---------------------");
        System.out.println("\t\t\t\t\t| Package Selection |");
        System.out.println("\t\t\t\t\t---------------------");
        System.out.printf("\n%-3s %-27s %-8s %-15s\n", "No.", "Type", "Price", "Description");
        for (i = 0; i < packarr.length; i++) {
            System.out.println(" " + (i + 1) + ". " + packarr[i]);
        }
        System.out.println(" " + ++i + ". " + "Others");
        System.out.println(" " + "0. " + "Return");
    }

    public static void displayBalloon(Balloon[] ballarr) {
        int i;
        System.out.println("\t\t\t\t\t---------------------");
        System.out.println("\t\t\t\t\t| Balloon Selection |");
        System.out.println("\t\t\t\t\t---------------------");
        System.out.printf("\n%-3s %-35s %-10s\n", "No.", "Type", "Price");
        for (i = 0; i < ballarr.length; i++) {
            System.out.println(" " + (i + 1) + ". " + ballarr[i]);
        }
        System.out.println(" " + "0. " + "Return");
    }

    public static void displayFlowerBouquet(Bouquet[] bouqarr) {
        int i;
        System.out.println("\t\t\t\t\t---------------------");
        System.out.println("\t\t\t\t\t| Bouquet Selection |");
        System.out.println("\t\t\t\t\t---------------------");
        System.out.printf("\n%-3s %-15s %-10s %-15s\n", "No", "Type", "Price", "Description");
        for (i = 0; i < bouqarr.length; i++) {
            System.out.println(" " + (i + 1) + ". " + bouqarr[i]);
        }

        System.out.println(" " + ++i + ". " + "Others");
        System.out.println(" " + "0. " + "Return");
    }

    public static void displayFlowerFlower(Flower[] flowarr) {
        int i;
        System.out.println("\t\t\t\t\t--------------------");
        System.out.println("\t\t\t\t\t| Flower Selection |");
        System.out.println("\t\t\t\t\t--------------------");
        System.out.printf("\n%-3s %-15s %-10s %-15s\n", "No", "Type", "Price", "Size");
        for (i = 0; i < flowarr.length; i++) {
            System.out.println(" " + (i + 1) + ". " + flowarr[i]);
        }

        System.out.println(" " + "0. " + "Return");
    }

    public static void displayDecorTheme(Theme[] themearr) {
        int i;
        System.out.println("\t\t\t\t\t------------------");
        System.out.println("\t\t\t\t\t| Theme Selection|");
        System.out.println("\t\t\t\t\t------------------");
        System.out.printf("\n%-3s %-15s %-10s   %-15s\n", "No.", "Type", "Price", "Description");
        for (i = 0; i < themearr.length; i++) {
            System.out.println(" " + (i + 1) + ". " + themearr[i]);
        }
        System.out.println(" " + ++i + ". " + "Others");
        System.out.println(" " + "0. " + "Return");
    }

    public static void displayDecor(Decor[] decoarr) {
        int i;
        System.out.println("\t\t\t------------------------");
        System.out.println("\t\t\t| Decoration Selection |");
        System.out.println("\t\t\t------------------------");
        System.out.printf("\n%-3s  %-20s  %-10s %-15s\n", "No.", "Type", "Price", "Description");
        for (i = 0; i < decoarr.length; i++) {
            System.out.println(" " + (i + 1) + ". " + decoarr[i]);
        }
        System.out.println(" " + "0. " + "Return");
    }

    public static void displayCart(EventList[] eventLists) {
        System.out.println("\n\n");
        System.out.println("-------------");
        System.out.printf("\n%-3s %-40s %-10s  %-5s   %-6s", "No", "Product Name", "Unit Price(RM)", "Quantity", "Total Price(RM)");
        System.out.printf("\n%-3s %-40s %-10s   %-5s   %-6s\n", "--", "---------", "--------------", "----------", "-----------------");
        double grandTotal = 0.0;
        //System.out.println(eventLists[0]);
        for (int i = 0; i < eventLists.length; ++i) {
            if (eventLists[i] == null) {
                continue;
            }
            System.out.println(eventLists[i]);

        }
    }

    public static void getEvent() {
        System.out.println("                              \033[034m\u263AWelcome\u263A\033[0m                                               ");
        System.out.println("\t\t\t\033[36m----------------------\033[0m");
        System.out.println("                         \033[36m| Event Order Shop |\033[0m                                  ");
        System.out.println("\t\t\t\033[36m----------------------\033[0m");
        int choose;
        do {

            System.out.println("1.Staff Login");
            System.out.println("2.Member Customer");
            System.out.println("3.Normal Customer");
            System.out.println("Choose [1/2/3]");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Choose [1/2/3]");
            }
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    Login obj = new Staff("cc", "111111");
                    obj.login();
                    break;
                case 2:
                    MemberCustomer.RegisterMember();
                    break;
                case 3:
                    NormalCustomer.RegisterNormal();
                    break;
                default:
                    System.out.println("Choose 1 or 2 or 3");
                    break;
            }

        } while (choose != 1 && choose != 2 && choose != 3 && choose != 4);

    }

}
