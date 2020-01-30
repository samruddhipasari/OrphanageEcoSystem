/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Orphan.OrphanDirectory;
import Business.Role.OrphanManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shlokashah
 */
public class OrphanOrganization extends Organization  {
   
    private OrphanDirectory orphanDirectory;
    
    
    
    public OrphanOrganization() {
        super(Organization.Type.OrphanManager.getValue());
        this.orphanDirectory = new OrphanDirectory();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new OrphanManagerRole());
        return roles;
    }

    public OrphanDirectory getOrphanDirectory() {
        return orphanDirectory;
    }

    public void setOrphanDirectory(OrphanDirectory orphanDirectory) {
        this.orphanDirectory = orphanDirectory;
    }
    
    
}
