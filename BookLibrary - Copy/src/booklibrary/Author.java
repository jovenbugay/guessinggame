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
public class Author {
     private String name="";
    private String email="";
    private char gender;
   
    
    public String getName(){
        return name;
    }
    public String setName(String name){
        this.name = name;
        return name;
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    
    public char getGender(){
        return gender;
    }
    public void setGender(char gender){
        this.gender=gender;
    }
    
    
}
