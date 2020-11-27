/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM KASIR BARBERSHOP
*/

public class ServicePrice implements ServiceItem{

    private float priceService;
    private float discount;
    private boolean isMember;
    
    public float getPriceService(){
        return priceService;
    }
    
    public void setPriceService(float priceService){
        this.priceService = priceService;
    }
    
    @Override
    public void displayService() {
        
        System.out.println("#*************************#");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("#*******Service List******#");
        System.out.println("1. Haircut : IDR 45K");
        System.out.println("2. Haircut + Hairwash: IDR 55K");
        System.out.println("3. Hairwash Only : IDR 15K");
        System.out.println("#*************************#");
        System.out.println("Choose (1/2/3):");
    }

    @Override
    public float getPrice(int serviceItem) {
        switch(serviceItem){
            case 1:
                priceService = 45000;
            break;
            
            case 2:
                priceService = 55000;
            break;
            
            case 3:
                priceService = 15000;
            break;
            default :
                System.out.println("Pilihan Tidak ada");
        }
        return priceService;
    }

    @Override
    public boolean checkMemberStatus(String statusMember) {
        statusMember = statusMember.toUpperCase();
        if(statusMember.equals('YES')){
            isMember = true;
        } else{
            isMember = false;
        }
        return isMember;
    }

    @Override
    public float getSale(boolean isMember, float parServicePrice) {
        
        return discount;
    }
    
    public float getTotalPay(float priceService, float discount){
        
        return TotalPay;
    }
}
