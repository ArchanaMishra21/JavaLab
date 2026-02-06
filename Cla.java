/*command line arguments with type cating*/
public class Cla {
    public static void main(String[] args){
            int a= Integer.parseInt(args[0]); /* expicit type casting */
            System.out.println(a);
            System.out.println(((Object)a).getClass()); /*type check for object a */
            System.out.println(args[1]);
            System.out.println(((Object)args[1]).getClass()); /*type check for args */

    }
}
