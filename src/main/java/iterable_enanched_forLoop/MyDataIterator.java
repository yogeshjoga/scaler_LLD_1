package iterable_enanched_forLoop;


import java.util.Iterator;

public class MyDataIterator implements Iterator<Integer> {

    private MyData myData;

    public MyDataIterator(MyData myData){
        this.myData = myData;
    }


    public boolean hasNext(){
        return myData != null;
    }


    public Integer next(){
        Integer i = myData.data;
        myData = myData.next;
        return i;
    }

}