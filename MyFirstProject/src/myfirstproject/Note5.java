/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstproject;
import java.util.Scanner;
/**
 *
 * @author spaid
 */
public class Note5 implements Comparable <Note5>{
    private String header;
    private String body;
    private String date;
    
    public Note5(){
    
    }
    
    public Note5(String header, String body, String date)
    {
        setHeader(header);
        setBody(body);
        setDate(date);
    }
    
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
    public int compareTo(Note5 note) {
        if (note == null) {
            return 1;
        }
        if (header.compareTo(note.header) > 0) {
            return 1;
        }
        if (header.compareTo(note.header) < 0) {
            return -1;
        }
        if (body.compareTo(note.body) > 0) {
            return 1;
        }
        if (body.compareTo(note.body) < 0) {
            return -1;
        }
        if (date.compareTo(note.date) > 0) {
            return 1;
        }
        if (date.compareTo(note.date) < 0) {
            return -1;
        }
        
        return 0;
    }
    
    public static Note5 addNote() {
        Note5 note = new Note5();
        Scanner sc = new Scanner(System.in);
        System.out.print("Header: ");
        note.setHeader(sc.nextLine());
        System.out.print("Body: ");
        note.setBody(sc.nextLine());
        System.out.print("Date: ");
        note.setDate(sc.nextLine());
        
        return note;
    } 
    public static Note5 createNote(String header, String body, String date) {
        Note5 note = new Note5(header, body, date);
        return note;
    } 
}
