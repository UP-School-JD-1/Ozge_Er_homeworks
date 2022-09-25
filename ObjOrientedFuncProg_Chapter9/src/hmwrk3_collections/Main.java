package hmwrk3_collections;
import java.util.TreeSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Map map = new HashMap();

        TreeSet set = (TreeSet) InformationUtil.getCollection();
        List list =InformationUtil.getPhoneList();
        Iterator iterator=set.iterator();
        Iterator iterator2=list.iterator();
        while(iterator.hasNext() && iterator2.hasNext()){
            String name=(String) iterator.next();
            Integer number=(Integer) iterator2.next();
            map.put(name,number);
        }

        Set keySet=map.keySet();
        Iterator iterator3=keySet.iterator();
        while(iterator3.hasNext()){
            String name=(String) iterator3.next();
            System.out.println(name+"-"+map.get(name));
        }



    }
}
