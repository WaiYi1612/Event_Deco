/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventdeco;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jiesh
 */
public class MemberCustomer extends Person {

    private String password;
    private String phoneNo;

    public MemberCustomer(String password, String phoneNo) {
        this.password = password;
        this.phoneNo = phoneNo;
    }

    public MemberCustomer(String name, String password, String phoneNo) {
        super(name);
        this.password = password;
        this.phoneNo = phoneNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " " + name + " " + password + " " + phoneNo;
    }

    public static void RegisterMember() {
        int i;
        Scanner mem = new Scanner(System.in);
        do {
            i = 0;
            ArrayList<MemberCustomer> member = new ArrayList<MemberCustomer>();
            System.out.println("Set UserName : ");
            String MemName = mem.next();
            System.out.println("Username valid : " + MemName.matches("[\\w]{1,20}"));

            System.out.println("Set Password : ");
            String MemPassword = mem.next();
            System.out.println("Password valid : " + MemPassword.matches("[\\w]{1,10}"));

            System.out.println("Set Phone no : ");
            String MemPhone = mem.next();
            System.out.println("Phone No : " + MemPhone.matches("[\\w]{10}"));

            member.add(new MemberCustomer(MemName, MemPassword, MemPhone));
            if (MemName.matches("[\\w]{1,20}") && MemPassword.matches("[\\w]{1,10}") && MemPhone.matches("[\\w]{10}") == false) {
                System.out.println("Username between any word character in range size from 1 to 20");
                System.out.println("Password between any word character in range size from 1 to 10");
                System.out.println("Phone No between any word character in range size 10");
                i++;
            } else {
                for (MemberCustomer Member : member) {
                    System.out.println("Thanks for the register" + Member + "\nThis is your discount code : 123456");
                }
                
            }

        } while (i != 0);
    }
}
