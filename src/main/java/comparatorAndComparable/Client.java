package comparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client  {

    public static void main(String[] args) {


        List<Students> stud = new ArrayList<Students>();

        stud.add(new Students("yogi",23));
        stud.add(new Students("blue",24));
        stud.add(new Students("yellow",25));
        stud.add(new Students("red",26));
        stud.add(new Students("kong",27));
        stud.add(new Students("sam baby",28));

        /**
         * let's implement the comparator
         * okay
         *
         */
        Comparator<Students> comp = (i, j) -> (i.getName().compareTo(j.getName()));

        Collections.sort(stud, comp);

        for(Students i : stud){
            System.out.println(i);
        }

    }
}
