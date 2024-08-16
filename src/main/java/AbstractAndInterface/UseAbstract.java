package AbstractAndInterface;

public abstract class UseAbstract {


    public int myNum;
    public int ph;
    public String myName;


   public UseAbstract(int num, String name, int ph) {
       this.myNum = num;
       this.myName = name;
       this.ph = ph;
   }

   public abstract int add(int num);
   public abstract int sub(int num);

}
