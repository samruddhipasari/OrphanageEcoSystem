/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.ExcessInventory.ExcessInventoryWorkAreaJPanel;
import Business.Network.Network;
import Business.Organization.ExcessInventoryOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class ExcessInventoryRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new ExcessInventoryWorkAreaJPanel(userProcessContainer, account, (ExcessInventoryOrganization) organization, enterprise);
    }
    
}
