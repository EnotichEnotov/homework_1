//Номер 1
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =  in.nextInt();
        System.out.println((n/100) + (n % 10)+(n / 10 % 10));
        System.out.println(n+1);
    }
}
*/



//Номер 2
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a =  in.nextInt();
        int b =  in.nextInt();
        int n =  in.nextInt();
        System.out.println( n*a + n*b/100 + " " +  n*b%100 );
    }
}
 */



//Номер 3
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =  in.nextInt();
        int a = n / 3600;
        int b = n % 3600 / 60;
        int c = n % 3600 % 60;
        System.out.print(a + ":");
        if (b/10 !=0){
            System.out.print(b + ":");
        }
        else{
            System.out.print("0" + b + ":");
        }
        if (c/10 !=0){
            System.out.print(c);
        }
        else{
            System.out.print("0" + c);
        }
    }
}
 */



/*
//Номер 4
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.ENGLISH);
        float x = in.nextFloat();
        if ( (x>= -2.0f && x <= 3.0f) || (x>= 6.0f && x <= 9.0f)) {
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
    }
}

 */



/*
//Номер 5
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int k = 0;
        if ( (100 <= a) & (a <= 999) & (a % 5 == 0) ) {
            k+=1;
        }
        if ( (100 <= b) & (b <= 999) & (b % 5 == 0) ) {
            k+=1;
        }
        if ( (100 <= c) & (c <= 999) & (c % 5 == 0) ) {
            k+=1;
        }
        if (k >= 2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}

 */