/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventdeco;
import java.util.Scanner;



/**
 *
 * @author jiesh
 */
public class Staff extends Person implements Login{
    
     private String Staffpassword;
     
     
     public Staff(){
       
     }

    public Staff(String Staffpassword) {
        this.Staffpassword = Staffpassword;
    }

    public Staff(String name,String Staffpassword) {
         super(name);
        this.Staffpassword = Staffpassword;
    }
     
    /**
     *
     */
    @Override
    public void login(){
   int i=0;
        do{
       // Person staff= new Staff("cc","111111");
        
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Staff Name : ");
        String staffname = input1.next();
        
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Password : ");
        String password = input2.next();
    
        if(staffname.equals(name) && password.equals(Staffpassword)){
            System.out.println("Have a help for the customer !");
            System.out.println("Welcome, back!");
            i=0;
            
        }else if(staffname.equals(name)){
            System.out.println("Invalid password");
            i++;
           
        }else if(password.equals(Staffpassword)){
            System.out.println("Invalid Username");
            i++;
            
        }else{
            System.out.println("Invalid Username & Password!");
            i++;
            
        }
        
    }while(i!=0);
        }
    
} 


interface Login{
    public abstract void login();
}



