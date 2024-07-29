package iterable_enanched_forLoop;

import java.util.Iterator;

public class MyData implements Iterable<Integer> {
     int data;
     MyData next;

    // constructor

    public MyData(int data){
        this.data = data;
        this.next = null;
    }

    public Iterator<Integer> iterator(){
        return new MyDataIterator(this);
    }
}

