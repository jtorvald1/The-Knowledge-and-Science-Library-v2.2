
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
public class IndexCard {
    
    private String specClass;
    private String title;
    private String author;
    private String publisher;
    private String editor;
    private String year;
    private ArrayList<Material> materials;
    private ArrayList<Reservation> reservations;

    public IndexCard(String specClass, String title, String author, String publisher, String editor, String year) {
        this.specClass = specClass;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.editor = editor;
        this.year = year;
        materials = new ArrayList<>();
        reservations = new ArrayList<>();
    }   
    
}
