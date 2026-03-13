[Program-1: WAP to create a Calculator](#code-1)


[Program-2: WAP to show Command Line Arguments](#code-2)


[Program-3: WAP to reverse 1-D array](#code-3)


[Program-4: WAP to perform matrix operations on (3X3) matrix](#code-4)


[Program-5: WAP to perform pattern printing, palindrome, armstrong number, fibonacci series, factorial](#code-5)


[Program-6: WAP to add two distances in meter, cm, mm](#code-6)


[Program-7: WAP to add two times in hour, min, sec](#code-7)


[Program-8: WAP to display different types of inheritance](#code-8)
## code-1
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


## code-2
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


## code-3
```
class ArrayReverse {

    void reverse(int arr[]) {
        int n = arr.length;

        System.out.println("Reversed Array:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class Reverse1DArray {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};  // predefined array

        ArrayReverse obj = new ArrayReverse(); // creating object
        obj.reverse(arr); // calling method using object
    }
}
```
<img width="635" height="110" alt="image" src="https://github.com/user-attachments/assets/5228b052-a6bc-4b7d-b1b0-e207df23c0c7" />


## code-4
```
class MatrixOperations {

    int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
    int b[][] = {{9,8,7},{6,5,4},{3,2,1}};
    int c[][] = new int[3][3];

    void sum() {
        System.out.println("Sum of matrices:");
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    void multiply() {
        System.out.println("Multiplication of matrices:");
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                c[i][j] = 0;
                for(int k=0;k<3;k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    void transpose() {
        System.out.println("Transpose of first matrix:");
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }

    void rowSum() {
        System.out.println("Sum of rows:");
        for(int i=0;i<3;i++) {
            int sum=0;
            for(int j=0;j<3;j++) {
                sum += a[i][j];
            }
            System.out.println("Row " + (i+1) + " sum = " + sum);
        }
    }

    void columnSum() {
        System.out.println("Sum of columns:");
        for(int j=0;j<3;j++) {
            int sum=0;
            for(int i=0;i<3;i++) {
                sum += a[i][j];
            }
            System.out.println("Column " + (j+1) + " sum = " + sum);
        }
    }

    void diagonalSum() {
        int d1=0, d2=0;
        for(int i=0;i<3;i++) {
            d1 += a[i][i];
            d2 += a[i][2-i];
        }
        System.out.println("Sum of primary diagonal = " + d1);
        System.out.println("Sum of secondary diagonal = " + d2);
    }
}

public class Matrix{
    public static void main(String[] args) {

        MatrixOperations obj = new MatrixOperations();

        obj.sum();
        obj.multiply();
        obj.transpose();
        obj.rowSum();
        obj.columnSum();
        obj.diagonalSum();
    }
}
```
<img width="736" height="496" alt="image" src="https://github.com/user-attachments/assets/9c124d26-2ca0-4023-ae25-cde288d60474" />


## code-5
```
class NumberOperations {

    void factorial(int n) {      
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " = " + fact);
    }

    void palindrome(int n) {
        int temp = n, rev = 0, r;
        while(n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        if(temp == rev)
            System.out.println(temp + " is Palindrome");
        else
            System.out.println(temp + " is Not Palindrome");
    }

    void armstrong(int n) {
        int temp = n, sum = 0, r;
        while(n > 0) {
            r = n % 10;
            sum = sum + (r*r*r);
            n = n / 10;
        }
        if(sum == temp)
            System.out.println(temp + " is Armstrong Number");
        else
            System.out.println(temp + " is Not Armstrong Number");
    }

    void fibonacci(int n) {
        int a = 0, b = 1, c;
        System.out.print("Fibonacci Series: " + a + " " + b + " ");
        for(int i = 3; i <= n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
    }

    void pattern(int n) {
        System.out.println("Pattern:");
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class DemoProgram{
    public static void main(String[] args) {

        NumberOperations obj = new NumberOperations();

        obj.factorial(5);
        obj.palindrome(121);
        obj.armstrong(153);
        obj.fibonacci(6);
        obj.pattern(5);
    }
}
```
<img width="669" height="282" alt="image" src="https://github.com/user-attachments/assets/7d5a9c7e-7feb-45d8-a645-17dad54a6962" />

## code-6
```
class Distance {
    int meter, cm, mm;

    Distance(int m, int c, int mi) {
        meter = m;
        cm = c;
        mm = mi;
    }

    void add(Distance d1, Distance d2) {
        mm = d1.mm + d2.mm;
        cm = d1.cm + d2.cm;
        meter = d1.meter + d2.meter;

        // conversion
        cm = cm + (mm / 10);
        mm = mm % 10;

        meter = meter + (cm / 100);
        cm = cm % 100;
    }

    void display() {
        System.out.println("Total Distance = " + meter + " m " + cm + " cm " + mm + " mm");
    }
}

public class DistanceAddition {
    public static void main(String[] args) {

        Distance d1 = new Distance(5, 60, 7);
        Distance d2 = new Distance(3, 80, 6);
        Distance d3 = new Distance(0, 0, 0);

        d3.add(d1, d2);
        d3.display();
    }
}
```
<img width="579" height="194" alt="image" src="https://github.com/user-attachments/assets/74e343cc-4388-442a-958f-b32b55adee00" />

## code-7
```
class Time {
    int hour, min, sec;

    Time(int h, int m, int s) {
        hour = h;
        min = m;
        sec = s;
    }

    void add(Time t1, Time t2) {
        sec = t1.sec + t2.sec;
        min = t1.min + t2.min;
        hour = t1.hour + t2.hour;

        // conversion
        min = min + (sec / 60);
        sec = sec % 60;

        hour = hour + (min / 60);
        min = min % 60;
    }

    void display() {
        System.out.println("Total Time = " + hour + " hr " + min + " min " + sec + " sec");
    }
}

public class TimeAddition {
    public static void main(String[] args) {

        Time t1 = new Time(2, 45, 50);
        Time t2 = new Time(3, 20, 30);
        Time t3 = new Time(0, 0, 0);

        t3.add(t1, t2);
        t3.display();
    }
}
```
<img width="579" height="157" alt="image" src="https://github.com/user-attachments/assets/6d314783-bd4d-418e-a937-bcc34c7ab28e" />

## code-8
```
// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Single Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Multilevel Inheritance
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class InheritanceTypes {
    public static void main(String[] args) {

        // Single Inheritance
        Dog d = new Dog();
        d.eat();
        d.bark();

        System.out.println();

        // Multilevel Inheritance
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();

        System.out.println();

        // Hierarchical Inheritance
        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
```
<img width="533" height="318" alt="image" src="https://github.com/user-attachments/assets/a48f45c0-c2e2-4dd5-b154-2b7061818133" />



