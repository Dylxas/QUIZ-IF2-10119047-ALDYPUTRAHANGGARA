/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM KASIR BARBERSHOP
*/

public class Customer extends ServicePrice implements CustomerInvoice{
    
    private String name;
    private String email;
    private boolean member;
   
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getEmail(){
        return name;
    }
    
    public void setEmail(String Email){
        this.email = email;
    }
    
    public boolean isMember(){
        return member;
    }
    
    public void setMember(boolean member ){
        this.member = member;
    }

    @Override
    public String currentTime() {
        Date waktu = new Date();

        SimpleDateFormat format = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss");
        return format.format(waktu);
    }
    
}
