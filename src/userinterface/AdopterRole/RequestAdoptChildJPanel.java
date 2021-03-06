/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdopterRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.Orphanage;
import Business.Enterprise.NGOEnterprise;
import Business.Enterprise.OrphanageEnterprise;
import Business.Network.Network;
import Business.Organization.AdopterOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AdoptionWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class RequestAdoptChildJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private NGOEnterprise enterprise;
    private AdopterOrganization org;
    private UserAccount userAccount;
    private Date resolveDate;
    private Network network;
    /**
     * Creates new form RequestLabTestJPanel
     */
    public RequestAdoptChildJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = (NGOEnterprise) enterprise;
        this.org = (AdopterOrganization) organization;
        this.userAccount = account;
        this.network=network;
        valueLabel.setText(enterprise.getName());
        getOrphanages();
    }
    
    private void getOrphanages(){
        orphanageJComboBox.removeAllItems();
        orphanageJComboBox.addItem("");
        
        for(Enterprise e: network.getEnterpriseDirectory().getEnterpriseList()){
            if(e instanceof OrphanageEnterprise){
                orphanageJComboBox.addItem(e);
            }
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        requestTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        typeAdoptionComboBox = new javax.swing.JComboBox<>();
        adoptionBoundariesComboBox = new javax.swing.JComboBox<>();
        genderComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ageTypeComboBox = new javax.swing.JComboBox<>();
        ageYearsTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        orphanageJComboBox = new javax.swing.JComboBox<>();

        jLabel4.setText("jLabel4");

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        requestTestJButton.setText("Submit Request");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 520, 170, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Message");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 100, 40));

        messageJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageJTextFieldActionPerformed(evt);
            }
        });
        add(messageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 180, 40));

        backJButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 160, 50));

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 130, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("Type of Adoption:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setText("Adoption Boundaries:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setText("Child Gender: ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, 40));

        typeAdoptionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Open Adoption", "Closed Adoption" }));
        typeAdoptionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeAdoptionComboBoxActionPerformed(evt);
            }
        });
        add(typeAdoptionComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 180, 40));

        adoptionBoundariesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "","Domestic Adoption", "International Adoption" }));
        add(adoptionBoundariesComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 180, 40));

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Boy", "Girl"}));
        genderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderComboBoxActionPerformed(evt);
            }
        });
        add(genderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 180, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setText("Child Age Type:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, -1, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setText("Age (Approx):");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 100, 40));

        ageTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Embroys", "Infants", "Foster Children", "Special Needs Children", "Twin or Sibling", "Adults"}));
        ageTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTypeComboBoxActionPerformed(evt);
            }
        });
        add(ageTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 180, 40));
        add(ageYearsTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 180, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel9.setText("Child Requirements Request");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 220, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Orphanage:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, 50));

        orphanageJComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        orphanageJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orphanageJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orphanageJComboBoxActionPerformed(evt);
            }
        });
        add(orphanageJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 180, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        //TODO: create text fields
        
        String message = messageJTextField.getText();
        String type =typeAdoptionComboBox.getSelectedItem().toString(); 
        String boundry =adoptionBoundariesComboBox.getSelectedItem().toString(); 
        String gender =genderComboBox.getSelectedItem().toString(); 
        String ageType=ageTypeComboBox.getSelectedItem().toString();
        //int age = Integer.parseInt(ageYearsTxt.getText());
        
        if(ageYearsTxt.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Please Enter a Age");
            return; 
        }
        
        try{
            int reqQuantity = Integer.parseInt(ageYearsTxt.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please Enter a Valid Age");
            return;
        }
        
        if(orphanageJComboBox.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null, "Please Select Orphanage");
            return;
        }
        
        if(typeAdoptionComboBox.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null, "Please Select Type of Adoption");
            return;
        }
        
        if(adoptionBoundariesComboBox.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null, "Please Select Valid Boundry");
            return;
        }
        
        if(genderComboBox.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null, "Please Select a Gender");
            return;
        }
        
        if(ageTypeComboBox.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null, "Please Select Age Type");
            return;
        }
        
        int age = Integer.parseInt(ageYearsTxt.getText());
        
        AdoptionWorkRequest request = new AdoptionWorkRequest(org);
        request.setType(type);
        request.setBoundary(boundry);
        request.setGender(gender);
        request.setAgeType(ageType);
//      System.out.println("Adopter: "+ userAccount.getPerson().getName());
        request.setSender(userAccount);
        request.setAge(age);
        request.setStatus("Requested");
        request.setMessage(message);
        
//        request.setReceiver(enterprise );
        OrphanageEnterprise e1 = null;
        for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()){
            
                if (e instanceof OrphanageEnterprise){
                    e1 = (OrphanageEnterprise) e;
                }  
            
        }
       
        request.setOrphanage(e1);   
        
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);   
        }
        JOptionPane.showMessageDialog(null, "Request Sent successfully");
        ageYearsTxt.setEditable(false);
        messageJTextField.setEditable(false);
        ageYearsTxt.setText("");
        messageJTextField.setText("");
        
        
        
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AdopterWorkAreaJPanel dwjp = (AdopterWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    private void typeAdoptionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeAdoptionComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeAdoptionComboBoxActionPerformed

    private void orphanageJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orphanageJComboBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_orphanageJComboBoxActionPerformed

    private void genderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderComboBoxActionPerformed

    private void ageTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTypeComboBoxActionPerformed

    private void messageJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageJTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> adoptionBoundariesComboBox;
    private javax.swing.JComboBox<String> ageTypeComboBox;
    private javax.swing.JTextField ageYearsTxt;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JComboBox<Object> orphanageJComboBox;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JComboBox<String> typeAdoptionComboBox;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
