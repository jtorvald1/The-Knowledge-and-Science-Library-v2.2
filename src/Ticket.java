
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jacob Nørgaard
 */
public class Ticket {
    
    private String category;
    private String title;
    private String author;
    private Date loanDate;
    
    public Ticket(String category, String title, String author, Date loanDate) {
        this.category = category;
        this.title = title;
        this.author = author;
        this.loanDate = loanDate;
        
    }      
}
