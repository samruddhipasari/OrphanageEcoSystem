/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DonorRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.NGOEnterprise;
import Business.Organization.AdopterOrganization;
import Business.Organization.DonationManagementOrganization;
import Business.Organization.ExcessInventoryOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DonationWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author prathmesh
 */
public class ProcessDonationReqJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private NGOEnterprise enterprise;
    private UserAccount userAccount;
    /**
     * Creates new form ProcessDonationReqJPanel
     */
    public ProcessDonationReqJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = (NGOEnterprise) enterprise;
        this.userAccount = account;
        
        initializeReqQuant();
        txtClothes1.setEnabled(false);
        txtFood1.setEnabled(false);
        txtMisc1.setEnabled(false);
        txtMoney1.setEnabled(false);
        
        txtClothes.setText("0");
        txtFood.setText("0");
        txtMoney.setText("0");
        txtMisc.setText("0");
    }
    
    private void initializeReqQuant(){
        
        ExcessInventoryOrganization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof ExcessInventoryOrganization){
                org = (ExcessInventoryOrganization) organization;
                break;
            }
        }
        
        int[] req = org.getRequested();
        txtFood1.setText(String.valueOf(req[0]));
        txtClothes1.setText(String.valueOf(req[1]));
        txtMoney1.setText(String.valueOf(req[2]));
        txtMisc1.setText(String.valueOf(req[3]));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        btnReqDonation = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtMisc = new javax.swing.JTextField();
        txtMoney = new javax.swing.JTextField();
        lblFood = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtClothes = new javax.swing.JTextField();
        txtFood = new javax.swing.JTextField();
        txtMoney1 = new javax.swing.JTextField();
        lblFood1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtClothes1 = new javax.swing.JTextField();
        txtFood1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMisc1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setText("<value>");

        btnReqDonation.setText("Donate");
        btnReqDonation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReqDonationActionPerformed(evt);
            }
        });

        jLabel8.setText("Money:");

        jLabel1.setText("Miscellaneous Items:");

        lblFood.setText("Food Quantity:");

        jLabel2.setText("Clothes:");

        lblFood1.setText("Food Quantity:");

        jLabel3.setText("Clothes:");

        jLabel9.setText("Money:");

        jLabel4.setText("Miscellaneous Items:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Required Items: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Donation: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFood1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClothes1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMoney1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMisc1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFood1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFood, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClothes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMoney, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMisc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFood, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(66, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReqDonation, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(valueLabel)))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFood))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtClothes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMisc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFood1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFood1))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtClothes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMoney1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMisc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(183, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReqDonation)
                        .addGap(96, 96, 96))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReqDonationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReqDonationActionPerformed

        String money = txtMoney.getText();
        String food = txtFood.getText();
        String clothes = txtClothes.getText();
        String misc = txtMisc.getText();
        
        DonationManagementOrganization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof DonationManagementOrganization){
                org = (DonationManagementOrganization) organization;
                break;
            }
        }
        
        DonationWorkRequest donationWorkRequest = new DonationWorkRequest(org);
        
        
        try{
            int mon = Integer.parseInt(txtMoney.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please Enter a correct value");
            return;
        }
        try{
            int clo = Integer.parseInt(txtClothes.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please Enter a correct value");
            return;
        }
        try{
            int misc1 = Integer.parseInt(txtMisc.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please Enter a correct value");
            return;
        }
        try{
            int foo = Integer.parseInt(txtFood.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please Enter a correct value");
            return;
        }
        
        if((money.isEmpty() || money.equals("0")) && (food.isEmpty()|| food.equals("0")) && (misc.isEmpty()|| misc.equals("0")) && (clothes.isEmpty()|| clothes.equals("0"))){
            JOptionPane.showMessageDialog(null, "Please Enter Some Quantity");
            return;
        }
        
        donationWorkRequest.setClothingQuantity(Integer.parseInt(clothes));
        donationWorkRequest.setFoodQuantity(Integer.parseInt(food));
        donationWorkRequest.setMiscQuantity(Integer.parseInt(misc));
        donationWorkRequest.setMoneyQuantity(Integer.parseInt(money));
        donationWorkRequest.setSender(userAccount);
        
        if (org!=null){
//          org.getUserAccountDirectory().getUserAccountList();
            org.getWorkQueue().getWorkRequestList().add(donationWorkRequest);
        }
        JOptionPane.showMessageDialog(null, "Donation Request created successfully");
    }//GEN-LAST:event_btnReqDonationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReqDonation;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblFood;
    private javax.swing.JLabel lblFood1;
    private javax.swing.JTextField txtClothes;
    private javax.swing.JTextField txtClothes1;
    private javax.swing.JTextField txtFood;
    private javax.swing.JTextField txtFood1;
    private javax.swing.JTextField txtMisc;
    private javax.swing.JTextField txtMisc1;
    private javax.swing.JTextField txtMoney;
    private javax.swing.JTextField txtMoney1;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
