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
public class BookLibrary {

    
    public static void main(String[] args) { 
        
        Author name = new Author();
        Author name1 = new Author ();
        Author gender = new Author();
       
        
        name.setName("Edille Christian Carillo");
        System.out.println(name.getName());
        
        name1.setEmail("edillechristiancarillo13@gmail.com");
        System.out.println(name1.getEmail());
        
        gender.setGender('M');
        System.out.println(gender.getGender());
        
        name.setName("Christian Carillo");
        System.out.println(name.getName());
        
        name1.setEmail("christiancarillo123456@gmail.com");
        System.out.println(name1.getEmail());
        
        gender.setGender('M');
        System.out.println(gender.getGender()); 
        
        System.out.println("\n");
        
        Book booklat = new Book("Bookbokan",100.0);
        Book booklatan = new Book("Bookbokan",100.0,10);
        Book Author = new Book("",0);
   
        
        
        System.out.println("\n");
        System.out.println(booklat.getAuthorNames());
        
        System.out.println("\n");
        System.out.println(booklat.toString());
         }
   
}
