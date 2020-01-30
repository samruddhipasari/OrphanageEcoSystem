/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.DonorRole;
import Business.Role.FinanceManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class FinanceManagementOrganization extends Organization{

    public FinanceManagementOrganization() {
        super(Organization.Type.FinanceManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FinanceManagerRole());
        return roles;
    }
     
   
    
    
}
