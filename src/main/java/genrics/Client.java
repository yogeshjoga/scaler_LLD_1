package genrics;

public class Client {

    public static void main(String[] args) {

        Client client = new Client();
        Pair<Integer,String> p = new Pair<>();
        p.setFirst(143);
        p.setSecond("Hello");

        System.out.println(p.getFirst());

        hello("Hello");
        hello(123287);
        client.make("hellohjdfijdifj");

    }


    public static <T>  void hello(T val){
        System.out.println(val);
    }

    /**
     *
     * @param val
     * @param <T>
     *
     *     Genrics of the methods creationsnoon
     */
    public <T> void make(T val){
        System.out.println(val);
    }




}
