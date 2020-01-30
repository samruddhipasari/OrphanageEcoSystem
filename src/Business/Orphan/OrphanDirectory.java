/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Orphan;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shlokashah
 */
public class OrphanDirectory {
    
    private ArrayList<Orphan> orphanList;

    public OrphanDirectory() {
        this.orphanList = new ArrayList();
        /*
        Orphan orphan1 = new Orphan("Sudha", 12, "India", "Girl", "Available");
        Orphan orphan2 = new Orphan("Sarika", 15, "Pakistan", "Girl", "Adopted");
        Orphan orphan3 = new Orphan("Priyank", 10, "Germany", "Boy", "Available");
        Orphan orphan4 = new Orphan("Kevin", 3, "USA", "Boy", "Available");
        Orphan orphan5 = new Orphan("Sun", 18, "China", "Boy", "Adopted");
        
        */
        /*
        Orphan orphan1 = addOrphan();
        orphan1.setName("Sudha");
        orphan1.setAge(12);
        orphan1.setCountry("India");
        orphan1.setGender("Girl");
        orphan1.setStatus("Available");
        */
        
        
        
    }

    public ArrayList<Orphan> getOrphanList() {
        return orphanList;
    }

    public void setOrphanList(ArrayList<Orphan> orphanList) {
        this.orphanList = orphanList;
    }
    
    public Orphan addOrphan(){
        Orphan orphan = new Orphan();
        orphanList.add(orphan);
        return orphan;
    }
    
}
