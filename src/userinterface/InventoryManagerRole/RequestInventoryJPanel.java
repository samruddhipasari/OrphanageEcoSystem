/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InventoryManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ExcessInventoryOrganization;
import Business.Organization.InventoryManagementOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ShortageWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class RequestInventoryJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private Network network;
    /**
     * Creates new form RequestLabTestJPanel
     */
    public RequestInventoryJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem business, Network network) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        this.network = network;
        valueLabel.setText(enterprise.getName());
        populateComboBox();
        clearField();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitRequestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        reqQuantJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        categoryJComboBox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitRequestJButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        submitRequestJButton.setText("Submit Request");
        submitRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitRequestJButtonActionPerformed(evt);
            }
        });
        add(submitRequestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 480, 180, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Inventory Category");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 210, 40));

        backJButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 170, 40));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 130, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, 30));

        reqQuantJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqQuantJTextFieldActionPerformed(evt);
            }
        });
        add(reqQuantJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 190, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Required Quantity");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 200, 40));

        categoryJComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        categoryJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        categoryJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryJComboBoxActionPerformed(evt);
            }
        });
        add(categoryJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 192, 190, 40));
    }// </editor-fold>//GEN-END:initComponents

    
    private void populateComboBox() {
        categoryJComboBox.removeAllItems();
        categoryJComboBox.addItem("");
        for (ShortageWorkRequest.Category cat : ShortageWorkRequest.Category.values()) {
            categoryJComboBox.addItem(cat.getValue());
        }
    }
    
    private void clearField(){
        categoryJComboBox.setSelectedItem("");
        reqQuantJTextField.setText("");
    }
    private void submitRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitRequestJButtonActionPerformed

        // pass InveOrganisation
        
        Organization org1 = null;
        Organization org2 = null;
        
            
        for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()){
            for (Organization organization : e.getOrganizationDirectory().getOrganizationList()){
                if (organization instanceof InventoryManagementOrganization){
                    org1 = (InventoryManagementOrganization) organization;
                }
                else if (organization instanceof ExcessInventoryOrganization){
                    org2 = (ExcessInventoryOrganization) organization;
                }   
            }
        }
        
        ShortageWorkRequest request = new ShortageWorkRequest(org1);
        try{
            String category = categoryJComboBox.getSelectedItem().toString();
            request.setCategory(ShortageWorkRequest.Category.getCategory(category));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please Select a Category");
            return;
        }
        
        try{
            int reqQuantity = Integer.parseInt(reqQuantJTextField.getText());
            request.setRequestedQuantity(reqQuantity);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please Enter a Required Quantity");
            return;
        }

        request.setSender(userAccount);
        request.setStatus("Requested");
        
        
        if (org1!=null){
            org1.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        }
        
        if (org2!=null){
            org2.getWorkQueue().getWorkRequestList().add(request);
            //userAccount.getWorkQueue().getWorkRequestList().add(request);
        }
        
        JOptionPane.showMessageDialog(null, "Shoratge Request Submitted");
        clearField();
    }//GEN-LAST:event_submitRequestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        InventoryManagerWorkAreaJPanel dwjp = (InventoryManagerWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    private void categoryJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryJComboBoxActionPerformed

    }//GEN-LAST:event_categoryJComboBoxActionPerformed

    private void reqQuantJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqQuantJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reqQuantJTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox<String> categoryJComboBox;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField reqQuantJTextField;
    private javax.swing.JButton submitRequestJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
