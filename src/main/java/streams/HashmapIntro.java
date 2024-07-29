package streams;

import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HashmapIntro {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("yogi", 5);
        map.put("teja",23);
        map.put("balu",29);
        map.put("siri",21);
    }



    public void myThread(){


        ExecutorService es = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {

        }

    }

}
