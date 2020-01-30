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
public class ShortageWorkRequest extends WorkRequest{
    private final Organization org;
    
    private Category category;
    private int requestedQuantity;
    private int donatedQuantity;

    public ShortageWorkRequest(Organization org) {
        this.org = org;
        this.donatedQuantity = 0;
        this.setRequestID(this.getNewID());
    }

    
   
    
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        if(category == null)
            throw new IllegalArgumentException();
        this.category = category;
    }
    
    public int getRequestedQuantity() {
        return requestedQuantity;
    }

    public void setRequestedQuantity(int requestedQuantity) {
        this.requestedQuantity = requestedQuantity;
    }

    public int getDonatedQuantity() {
        return donatedQuantity;
    }

    public void setDonatedQuantity(int donatedQuantity) {
        this.donatedQuantity = donatedQuantity;
    }
    
    private int getNewID() {
        int maxID = 0;
        for(WorkRequest wr: this.org.getWorkQueue().getWorkRequestList()) {
            maxID = Math.max(maxID, wr.getRequestID());
        }
        return maxID+1;
    }
    
    public static enum Category {
        FOOD("Food"),
        CLOTHING("Clothing"),
        MONEY("Money"),
        MISC("Miscellaneous");

        
        private String value;
        
        private Category(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }        
        
        public static Category getCategory(String value) {
            for(Category cat: values())
                if(cat.value.equals(value))
                    return cat;
            return null;
        }
        
    }
}
