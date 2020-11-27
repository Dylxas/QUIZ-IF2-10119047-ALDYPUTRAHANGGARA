/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10119047.aldyputrahanggara;

import data.ServicePrice;
import data.Customer;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM KASIR BARBERSHOP
*/

public class QUIZIF210119047ALDYPUTRAHANGGARA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        Customer customer = new Customer();
        
        System.out.println("====PROGRAM KASIR ROCK n ROLL HAIRCUT====");
        System.out.print("Customer Name :");
        customer.setName(input.next());
        
        System.out.print("Customer Email :");
        customer.setEmail(input.next());
        
        ServicePrice servicePrice = new ServicePrice();
        
        servicePrice.displayService();
        servicePrice.getPrice(input.nextInt());
        
        System.out.println("Are you a member (yes/no) :");
    }
    
}
