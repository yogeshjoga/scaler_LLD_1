package recursion_patterns;

public class Patt {


    public static void main(String[] args) {

     //   pat(5,0);
        pat1(0,5);


    }



    public static void pat(int n, int c){
        if(n == 0) return;
        if(n > c){
            System.out.print("* ");
            pat(n, c+1);
        }else{
            System.out.println();
            pat(n-1, 0);
        }
    }

    public static void pat1(int n,int c){
        if(n == 5) return;

        if(c != 0){
            System.out.print("* ");
            pat1(n,c-1);
        }else{

            System.out.println();
            pat1(n+1, 5);
        }
    }

}
