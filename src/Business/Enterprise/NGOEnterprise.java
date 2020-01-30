/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Role.Role;
import Business.WorkQueue.ShortageWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class NGOEnterprise extends Enterprise {
    
    
    private int foodCount;
    private int clothingCount;
    private int miscCount;
    private int money;

    public int getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(int foodCount) {
        this.foodCount = foodCount;
    }

    public int getClothingCount() {
        return clothingCount;
    }

    public void setClothingCount(int clothingCount) {
        this.clothingCount = clothingCount;
    }

    public int getMiscCount() {
        return miscCount;
    }

    public void setMiscCount(int miscCount) {
        this.miscCount = miscCount;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    /*
    public int[] getRequested() {
        int[] counts = new int[4];
        for(WorkRequest wr: this.getWorkQueue().getWorkRequestList()) {
            ShortageWorkRequest swr = (ShortageWorkRequest) wr; 
            if(swr.getCategory().getValue().equals("Food"))
                counts[0]+=(swr.getRequestedQuantity()-swr.getDonatedQuantity());
            else if(swr.getCategory().getValue().equals("Clothing"))
                counts[1]+=(swr.getRequestedQuantity()-swr.getDonatedQuantity());
            if(swr.getCategory().getValue().equals("Money"))
                counts[2]+=(swr.getRequestedQuantity()-swr.getDonatedQuantity());
            if(swr.getCategory().getValue().equals("Miscellaneous"))
                counts[3]+=(swr.getRequestedQuantity()-swr.getDonatedQuantity());
        }
        
        return counts;
    }
    
    */
    public NGOEnterprise(String name){
        super(name,EnterpriseType.NGO);
        this.foodCount = 25;
        this.clothingCount = 18;
        this.miscCount = 1000;
        this.money = 0;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
