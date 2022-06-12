import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.*;

public class vidu {
    public static void main(String[] args){
        Collection collection = new ArrayList();
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toUpperCase() + " ");
        }
        System.out.println();
    }
}