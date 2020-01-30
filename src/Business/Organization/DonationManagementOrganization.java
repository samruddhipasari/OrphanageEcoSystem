/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.DonationManagerRole;
import Business.Role.DonorRole;
import Business.Role.InventoryManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class DonationManagementOrganization extends Organization{

    public DonationManagementOrganization() {
        super(Organization.Type.DonationManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DonationManagerRole());
        roles.add(new DonorRole());
        return roles;
    }
     
   
    
    
}
