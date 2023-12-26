import java.util.*;
 
class Intro {
    public static void main(String args[])
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("I'm");
        list.add("Here");
 
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}