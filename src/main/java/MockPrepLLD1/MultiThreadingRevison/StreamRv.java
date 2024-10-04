package MockPrepLLD1.MultiThreadingRevison;

import MockPrepLLD1.Inher;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamRv {


    public static void main(String[] args) {

        List<Integer> li = new ArrayList<Integer>();
        li.add(10);
      //  li.add(12212);
        li.add(1);
        li.add(2);
        li.add(3);

        Optional<Integer> sum = li.stream().reduce((a, b) -> a+b);
        System.out.println(sum);

        List<Integer> even = li.stream().filter( a -> a % 2 == 0).collect(Collectors.toList());
        System.out.println(even);

        List<String> st = new ArrayList<>();
        st.add("A");
        st.add("B");
        st.add("C");
        st.add("D");
        st.add("E");
        st.add("Yogesh");
        st.add("aYogesh");
        st.add("aBalue");
        st.add("Balue");
        st.add("teja");
        st.add("Siri");

        List<Character> len = st.stream().filter(a -> a.startsWith("a")).map(a -> a.charAt(0)).map(Character::toUpperCase).collect(Collectors.toList());
        System.out.println(len);
    }
}
