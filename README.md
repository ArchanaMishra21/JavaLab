[Program-1: WAP to create a Calculator]#assi-1
[Program-2: WAP to show Command Line Arguments]#assi-2











##assi-1
```
public class Calc {
    public static void main(String[] args){
        int a =Integer.parseInt(args[0]);
        int b =Integer.parseInt(args[1]);
        add(a,b);
        sub(a,b); 
        mul(a,b); 
        div(a,b);
    }
   
    public static void add(int a, int b){
        System.out.println(a+b);
    }
  
    public static void sub(int a, int b){
        System.out.println(a-b);
    }
   
    public static void mul(int a, int b){
        System.out.println(a*b);
    }
    
    public static void div(int a, int b){
        System.out.println(a/b);
    }
}
```
<img width="917" height="239" alt="image" src="https://github.com/user-attachments/assets/84d6b717-5c20-4d8e-96b7-054ca24cd9d4" /> 


##assi-2
```
public class Cla {
    public static void main(String[] args){
            int a= Integer.parseInt(args[0]); 
            System.out.println(a);
            System.out.println(((Object)a).getClass()); 
            System.out.println(args[1]);
            System.out.println(((Object)args[1]).getClass()); 

    }
}
```
<img width="918" height="247" alt="image" src="https://github.com/user-attachments/assets/f56898e9-cc75-40b3-8751-eeee9d23f20e" />
