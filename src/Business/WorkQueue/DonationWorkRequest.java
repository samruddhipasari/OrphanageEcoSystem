/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Organization.Organization;

/**
 *
 * @author Samruddhi
 */
public class DonationWorkRequest extends WorkRequest {

    private int foodQuantity;
    private int clothingQuantity;
    private int miscQuantity;
    private int moneyQuantity;
    private final Organization org;

    public DonationWorkRequest(Organization org) {
        this.foodQuantity = 0;
        this.clothingQuantity = 0;
        this.miscQuantity = 0;
        this.moneyQuantity = 0;
        this.org = org;
        this.setRequestID(this.getNewID());
    }
    
    public int getFoodQuantity() {
        return foodQuantity;
    }

    public void setFoodQuantity(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public int getClothingQuantity() {
        return clothingQuantity;
    }

    public void setClothingQuantity(int clothingQuantity) {
        this.clothingQuantity = clothingQuantity;
    }

    public int getMiscQuantity() {
        return miscQuantity;
    }

    public void setMiscQuantity(int miscQuantity) {
        this.miscQuantity = miscQuantity;
    }

    public int getMoneyQuantity() {
        return moneyQuantity;
    }

    public void setMoneyQuantity(int moneyQuantity) {
        this.moneyQuantity = moneyQuantity;
    }
    
    private int getNewID() {
        int maxID = 0;
        for(WorkRequest wr: this.org.getWorkQueue().getWorkRequestList()) {
            maxID = Math.max(maxID, wr.getRequestID());
        }
        return maxID+1;
    }
    
}
