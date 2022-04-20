package myfirstproject;
public abstract class Note3 implements Add{
    private String header;
    private String body;
    private String date;
    
    public void add(){
        System.out.println("Added");
    }
    
    public abstract void yes();
    public abstract void no();
    
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
}
