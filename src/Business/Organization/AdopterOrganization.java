/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdopterManager;
import Business.Role.AdopterRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class AdopterOrganization extends Organization{

    public AdopterOrganization() {
        super(Organization.Type.AdopterManager.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdopterManager());
        roles.add(new AdopterRole());
        return roles;
    }
     
}