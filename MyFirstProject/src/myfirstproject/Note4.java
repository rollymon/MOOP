/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstproject;

public class Note4 extends Note3{

    @Override
    public void yes(){
        System.out.println("yes");
    }
    @Override
    public void no(){
        
        System.out.println("no");
    }
    private String header;
    private String body;
    private String date;
    
    Note4(String header, String body, String date) {
        this.header=header;
        this.body=body;
        this.date=date;
    }
    
    public String toString(){
        return header + " " + body + " " + date;
    }
}
