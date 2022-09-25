package hmwrk3_collections;

import java.util.*;

public class InformationUtil {

    private static Set<String> set;

    static {
        set = new TreeSet<>();
        set.add("Ozgenur");
        set.add("Furkan");
        set.add("Atlas");
        set.add("Nehir");
    }

    public static Collection<String> getCollection() {
        return set;
    }

    public static List getPhoneList(){
        List phones = new ArrayList();
        phones.add(0542520);
        phones.add(0536610);
        phones.add(0544770);
        phones.add(0545347);
        return phones;
    }

    public static List getCity(){
        List cities=new ArrayList();
        cities.add("Ankara");
        cities.add("Kocaeli");
        cities.add("Mersin");
        cities.add("Gaziantep");
        return cities;
    }




    }

