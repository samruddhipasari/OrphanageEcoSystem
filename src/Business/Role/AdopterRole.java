/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.AdopterOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.AdopterRole.AdopterWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.InventoryManagerRole.InventoryManagerWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class AdopterRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new AdopterWorkAreaJPanel(userProcessContainer, account, (AdopterOrganization)organization, enterprise,network);
    }
    
    
}
