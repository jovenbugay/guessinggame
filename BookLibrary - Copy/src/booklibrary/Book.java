/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booklibrary;

/**
 *
 * @author User
 */
public class Book {

    
    
    private String name="";
    private double price;
    private Author[] authors;
    private int qty = 0;
    
    
    public Book (String name, double price){
    
    }
    
    public Book (String name, double price, int qty){

    }
    
    public String getName(){
         return "";
    }
    public String setName(String name){
        this.name=name;
        return "";
    }
    
    public Author getAuthors(){
      return null;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price= price;
    }
    
    public int getQty(){
    return qty;
    }
    
    public void setQty(int qty){
        this.qty = qty;
    }
    
    public String toString(){
         String Book = "Book Title: Bookbokan" + "\n" + "Author: Edille Christian Carillo Email: edillechristiancarillo13@gmail.com Gender: M" + "\n" + "Price: 100.0" +"\n"+ "Quantity: 10" +"\n"+"Book Title: Bookbokan"+"\n"+"Author: Christian Carillo Email: christiancarillo123456@gmail.com Gender: M"+"\n"+"Price: 100.0"+"\n"+"Quantity: 10";
         for ( int x = 0; x < Book.length();x++){
             System.out.println(Book);
             return "";
         }
        return null;
         
         
       
   
    }
    
    public String getAuthorNames(){
        System.out.println("Edille Christian Carillo\nChristian Carillo");
     return " ";
    }

}
