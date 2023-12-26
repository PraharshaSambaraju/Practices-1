import java.util.*;
public class Intro {
 
    public static void main(String[] args)
    {
        
        Map<Integer, String> map = new HashMap<>();
 
        map.put(1, "Here");
        map.put(2, "I");
        map.put(3, "Am!");
 
        Set set = map.entrySet();
 
        Iterator itr = set.iterator();
 
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry)itr.next();
 
            System.out.println(entry.getKey() + " "
                               + entry.getValue());
        }
    }
}