package Comparator;

import Main.Person;
import java.util.Comparator;

public class FullnameComparator implements Comparator<Person>{
    @Override
    public int compare(Person p1, Person p2)
    {
        return p1.getFullname().compareTo(p2.getFullname());
    }
}
