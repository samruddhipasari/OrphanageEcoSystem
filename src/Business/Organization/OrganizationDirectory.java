/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.AdopterManager.getValue())){
            organization = new AdopterOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.DonationManager.getValue())){
            organization = new DonationManagementOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ExcessInventory.getValue())){
            organization = new ExcessInventoryOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.InventoryManager.getValue())){
            organization = new InventoryManagementOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.NGOAdmin.getValue())){
            organization = new NGOAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.OrphanManager.getValue())){
            organization = new OrphanOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}