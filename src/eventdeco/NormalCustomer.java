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
public class NormalCustomer extends Person {

    public NormalCustomer() {
    }

    public NormalCustomer(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return " " + name;
    }
   
    public static void RegisterNormal (){
        Scanner n =new Scanner(System.in);
        ArrayList<NormalCustomer> normal = new ArrayList<>();
        System.out.println("Set UserName : ");
        String Name = n.next();
        
        normal.add(new NormalCustomer(Name));
        
        for(NormalCustomer Normal : normal)
            System.out.println("Thanks for your record" + Normal);
    }
    

 
}
