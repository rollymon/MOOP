/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstproject;

/**
 *
 * @author spaid
 */
public class Note2 {
    private String header;
    private String body;
    private String date;
    
    public String getHeader(){
        return header;
    }
    public void setHeader(String head){
        header = head;
    }
    public String getBody(){
        return body;
    }
    public void setBody(String text){
        body = text;
    }
    public String getDate(){
        return date;
    }
    public void setDate(String dt){
        date = dt;
    }
    
    public String toString(){
        return "Note{"
        + "Title: '" + header + '\''
        + ",main text: " + body 
        + ",date: " + date + '}';       
    }
    public void Message(){
        System.out.println("Done");
    }
}
