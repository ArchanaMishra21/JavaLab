/*calculator */
public class Calc {
    public static void main(String[] args){
        int a =Integer.parseInt(args[0]); /* explicit type cast  */
        int b =Integer.parseInt(args[1]); /* explicit type cast  */
        add(a,b); /* function call for addition*/
        sub(a,b); /* function call for subtraction  */
        mul(a,b); /* function call for multiplication */
        div(a,b); /* function call for division  */
    }
    /* function for addition of 2 numbers  */
    public static void add(int a, int b){
        System.out.println(a+b);
    }
    /* function for subtraction of 2 numbers  */
    public static void sub(int a, int b){
        System.out.println(a-b);
    }
    /* function for multiplication of 2 numbers  */
    public static void mul(int a, int b){
        System.out.println(a*b);
    }
    /* function for division of 2 numbers  */
    public static void div(int a, int b){
        System.out.println(a/b);
    }
}
