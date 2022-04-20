package myfirstproject;
import java.util.Scanner;
import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import static myfirstproject.Note5.addNote;
import static myfirstproject.Note5.createNote;
/**
 *
 * @author spaid
 */
public class MyFirstProject {
    
    public static void main(String[] args) {
       
        List<Note5> noteList = new ArrayList();
            noteList.add(createNote("Name2","body2" , "13.01.2021"));
            noteList.add(createNote("Name","body" , "11.01.2021"));
            noteList.add(createNote("Name1","body1" , "12.01.2021"));
        Set<Note5> set = new TreeSet<Note5>();
        TreeMap<Integer, Note5> map = new TreeMap<Integer, Note5>();
        
        int counter = 0;
        for(Note5 obj : noteList)
        {
            set.add(obj);
            map.put(counter, obj);
            
            counter++;
        }
        noteList.remove(0);
        
        for (int i = 0; i < noteList.size(); i++) {
            System.out.println(noteList.get(i));
        }
        
        for(Note5 obj : set)
        {
            System.out.println(obj);
        }
    }
    
}
