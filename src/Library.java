
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jacob Nørgaard
 */
public class Library {
    
    private ArrayList<IndexCard> indexCards;
    private ArrayList<Patron> patrons;
    
    public Library()
    {
        indexCards = new ArrayList<>();
    }
    
    public void addIndexCard(IndexCard indexCard)
    {
        indexCards.add(indexCard);
    }
    
    public void removeIndexCard(IndexCard indexCard)
    {
        patrons.remove(indexCard);
    }  
    
    public void addPatron(Patron patron)
    {
        patrons.add(patron);
    }
    
    public void removePatron(Patron patron)
    {
        patrons.remove(patron);
    }
    
    public Patron findPatron(String employeeID)
    {
        int index = 0;
        Patron patron;
        
        while(index < patrons.size()) {
            patron = patrons.get(index);
            if(patron.getEmployeeID().equals(employeeID))
                return patron;
        }
        return null;
    }
    
    /*public Material findMaterial(String materialID)
    {

    }*/
    
}
