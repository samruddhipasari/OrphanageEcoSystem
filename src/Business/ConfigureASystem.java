package Business;

import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.Role.AdminRole;
import Business.Role.AdopterManager;
import Business.Role.AdopterRole;
import Business.Role.DonationManagerRole;
import Business.Role.DonorRole;
import Business.Role.ExcessInventoryRole;
import Business.Role.InventoryManagerRole;
import Business.Role.NGOAdminRole;
import Business.Role.OrphanManagerRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import com.db4o.User;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        

        Person person = system.getPersonDirectory().createPerson("Bug Busters", "887 Huntington Avenue" , "bugbusters@gmail.com", "8572653865");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sa", "sa", person, new SystemAdminRole());
        
        Network network = system.createAndAddNetwork();
        network.setName("Boston");
        
        Enterprise enterprise = system.getNetworkList().get(0).getEnterpriseDirectory().createAndAddEnterprise("NGO Enterprise", Enterprise.EnterpriseType.NGO);
        
        
        Person p = enterprise.getPersonDirectory().createPerson("Samruddhi","85-A Park Avenue Hill" , "sam01@gmail.com", "8575647865");
        UserAccount u = enterprise.getUserAccountDirectory().createUserAccount("Samruddhi", "samruddhi", p, new NGOAdminRole());
        
        Organization org = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.NGOAdmin);
        org.setName("NGO Admin Organization");
        org.getUserAccountDirectory().getUserAccountList().add(u);
        
        Person p1 = enterprise.getPersonDirectory().createPerson("Shloka","7 Darling Street" , "shlo01@gmail.com", "8234653865");
        UserAccount u1 = enterprise.getUserAccountDirectory().createUserAccount("Shloka", "shloka", p1, new ExcessInventoryRole());
        
        Organization org1 = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.ExcessInventory);
        org1.setName("Excess Inventory Organization");
        org1.getUserAccountDirectory().getUserAccountList().add(u1);
        
        Person p2 = enterprise.getPersonDirectory().createPerson("Prathamesh","81 Boylston Street" , "prat1234@gmail.com", "8572234455");
        UserAccount u2 = enterprise.getUserAccountDirectory().createUserAccount("Prathamesh", "prathamesh", p2, new DonationManagerRole());
        
        Organization org2 = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.DonationManager);
        org2.setName("Donation Management Organization");
        org2.getUserAccountDirectory().getUserAccountList().add(u2);
        
        Person p7 = enterprise.getPersonDirectory().createPerson("Shruti","887 Fenway Park" ,"shruti12@gmail.com", "8571234465");
        UserAccount u7 = enterprise.getUserAccountDirectory().createUserAccount("Shruti", "shruti", p7, new DonorRole());
        org2.getUserAccountDirectory().getUserAccountList().add(u7);
        
        Person p3 = enterprise.getPersonDirectory().createPerson("Nipesh","8 Mission Hill" , "nipesh12@gmail.com", "8572653865");
        UserAccount u3 = enterprise.getUserAccountDirectory().createUserAccount("Nipesh", "nipesh", p3, new AdopterRole());
        
        Organization org3 = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.AdopterManager);
        org3.setName("Adopter Organization");
        org3.getUserAccountDirectory().getUserAccountList().add(u3);

        p = enterprise.getPersonDirectory().createPerson("Manan","8-A Washington Street" , "manan@gmail.com", "8572653865");
        u = enterprise.getUserAccountDirectory().createUserAccount("Manan", "manan", p, new AdopterManager());
        org3.getUserAccountDirectory().getUserAccountList().add(u);


        /*----------------------------------------------------------------------------------------------------------------------------------------*/
        
        Enterprise orphanage = system.getNetworkList().get(0).getEnterpriseDirectory().createAndAddEnterprise("Orphanage Enterprise", Enterprise.EnterpriseType.Orphanage);
        
        Person p4 = orphanage.getPersonDirectory().createPerson("Sanjali","98 George Street" , "sanju2435@gmail.com", "8572653809");
        u = orphanage.getUserAccountDirectory().createUserAccount("Sanjali", "sanjali", p4, new AdminRole());
        
        Organization org4 = orphanage.getOrganizationDirectory().createOrganization(Organization.Type.Admin);
        org4.setName("Admin Organization");
        org4.getUserAccountDirectory().getUserAccountList().add(u);
        
        Person p5 = orphanage.getPersonDirectory().createPerson("Preeti","7 Mainhouse Park" , "preet123@gmail.com", "8572651235");
        u = orphanage.getUserAccountDirectory().createUserAccount("Preeti", "preeti", p5, new InventoryManagerRole());
        
        Organization org5 = orphanage.getOrganizationDirectory().createOrganization(Organization.Type.InventoryManager);
        org5.setName("Inventory Managemnet Organization");
        org5.getUserAccountDirectory().getUserAccountList().add(u);
        
        Person p8 = orphanage.getPersonDirectory().createPerson("Rohit","12 Mainland Street" , "rohit56@gmail.com", "8902653865");
        u = orphanage.getUserAccountDirectory().createUserAccount("Rohit", "rohit", p8, new OrphanManagerRole());
        
        Organization org8 = orphanage.getOrganizationDirectory().createOrganization(Organization.Type.OrphanManager);
        org8.setName("Orphan Management Organization");
        org8.getUserAccountDirectory().getUserAccountList().add(u);
        

        return system;
    }
    
}
