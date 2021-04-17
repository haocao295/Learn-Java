
package Bookmgr;

import java.util.ArrayList;


public class book {
    private String id;
    private String name;
    private String type;
    private Double price;
   
    
    private String typeb[] = {"Fiction", "Sciences", "Comic", "Self-help"};
    
    
    public book(){
        
    }

    public book(String id, String name, String type, Double price ) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
       
    }

    book(String id, String name, int type, Double price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    
    
    
}
