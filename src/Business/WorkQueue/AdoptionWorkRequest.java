/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import static Business.Enterprise.Enterprise.EnterpriseType.Orphanage;
import Business.Enterprise.OrphanageEnterprise;
import Business.Organization.Organization;
import Business.Orphan.Orphan;

/**
 *
 * @author shlokashah
 */
public class AdoptionWorkRequest extends WorkRequest{
   private String type;
   private String boundary;
   private String gender;
   private String ageType;
   private int age;
   private OrphanageEnterprise orphanage;
   private final Organization org;
   private Orphan orphan;

    public OrphanageEnterprise getOrphanage() {
        return orphanage;
    }

    public void setOrphanage(OrphanageEnterprise orphanage) {
        this.orphanage = orphanage;
    }

    public AdoptionWorkRequest(Organization org) {
        this.org = org;
        this.setRequestID(this.getNewID());
        this.orphan = null;
    }
        
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBoundary() {
        return boundary;
    }

    public void setBoundary(String boundary) {
        this.boundary = boundary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAgeType() {
        return ageType;
    }

    public void setAgeType(String ageType) {
        this.ageType = ageType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Orphan getOrphan() {
        return orphan;
    }

    public void setOrphan(Orphan orphan) {
        this.orphan = orphan;
    }
   
    private int getNewID() {
        int maxID = 0;
        
//       if( this.org.getWorkQueue().getWorkRequestList().isEmpty())
//           return 1;
        for(WorkRequest wr: this.org.getWorkQueue().getWorkRequestList()) {
            maxID = Math.max(maxID, wr.getRequestID());
        }
        return maxID+1;
    }
 
}
