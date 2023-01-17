import java.util.Scanner;
public class alan {
    public static void main(String[] args){
        int a,b,c;
        
        Scanner input= new Scanner(System.in);

        System.out.print("1. Kenarı uzunluğunu giriniz : ");
        a = input.nextInt();
        System.out.print("2. Kenarı uzunluğunu giriniz : ");
        b = input.nextInt();
        System.out.print("3. Kenarı uzunluğunu giriniz : ");
        c = input.nextInt();

        double u = (a+b+c) / 2;

        double cevre = 2*u;
        System.out.println("Üçgenin Çevresi : " + cevre);

        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin Alanı : " + alan);
 }
} 
 /* 
        int a,b;
        double c; 

        Scanner inp = new Scanner(System.in);

        System.out.print("1. kenarı giriniz : ");
        a = inp.nextInt();
        System.out.print("2. kenarı giriniz : ");
        b = inp.nextInt();

        c = Math.sqrt((a * a) + (b * b ));


        System.out.println("Hiptenüs : " + c);
   
*/
