

package userinterface.OrphanOrganizationJPanel;

import userinterface.AdministrativeRole.*;
import Business.Enterprise.Enterprise;
import Business.Enterprise.OrphanageEnterprise;
import Business.Organization.AdopterOrganization;
import Business.Organization.Organization;
import Business.Organization.OrphanOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AdoptionWorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.AdopterOrganisationJPanel.AdopterOrganisationWorkAreaJPanel;

/**
 *
 * @author  raunak
 */
public class OrphanMangerWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private OrphanageEnterprise enterprise;
    private UserAccount account;
    private AdoptionWorkRequest adoptionWorkRequest;
    private OrphanOrganization orphanOrganization;

    
    /** Creates new form AdminWorkAreaJPanel */
    public OrphanMangerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.orphanOrganization = (OrphanOrganization)organization;
        this.enterprise= (OrphanageEnterprise)enterprise;
      
        valueLabel.setText(enterprise.getName());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        addOrphansJButton = new javax.swing.JButton();
        manageAdoptionsJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Manager Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        addOrphansJButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        addOrphansJButton.setText("Add Orphans");
        addOrphansJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrphansJButtonActionPerformed(evt);
            }
        });
        add(addOrphansJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 280, 50));

        manageAdoptionsJButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        manageAdoptionsJButton.setText("Manage Adoption Request");
        manageAdoptionsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAdoptionsJButtonActionPerformed(evt);
            }
        });
        add(manageAdoptionsJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 280, 50));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 120, 30));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addOrphansJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrphansJButtonActionPerformed

        AddOrphanJPanel addOrphan = new AddOrphanJPanel(userProcessContainer, orphanOrganization);
        userProcessContainer.add("AddOrphanJPanel", addOrphan);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_addOrphansJButtonActionPerformed

    private void manageAdoptionsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAdoptionsJButtonActionPerformed

        OrphanOrganisationWorkAreaJPanel manageAdoptionJPanel = new OrphanOrganisationWorkAreaJPanel(userProcessContainer, account, orphanOrganization, enterprise);
        userProcessContainer.add("manageAdoptionJPanel", manageAdoptionJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageAdoptionsJButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOrphansJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageAdoptionsJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
