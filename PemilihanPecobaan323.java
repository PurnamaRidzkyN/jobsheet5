
import java.util.Scanner;
public class PemilihanPecobaan323 {
 public static void main(String[] args) {
    
 
    double angka1,angka2,hasil;
    char operator;

    Scanner input00 = new Scanner(System.in);
    System.out.print("Masukan angka pertama : ");
    angka1 = input00.nextDouble();
    System.out.print("Masukan angka kedua : ");
    angka2 = input00.nextDouble();
    System.out.println("Masukan operator (+ - * /): ");
    operator = input00.next().charAt(0);

    switch (operator) {
    case '+':
    hasil= angka1 + angka2;
    System.out.println(angka1 + " + " + angka2 + "=" + hasil);
    case '-':
    hasil= angka1 - angka2;
    System.out.println(angka1 + " - " + angka2 + "=" + hasil);
    break;
    case '*':
    hasil= angka1 * angka2;
    System.out.println(angka1 + " * " + angka2 + "=" + hasil);
    break;
    case '/':
    hasil= angka1 / angka2;
    System.out.println(angka1 + " / " + angka2 + "=" + hasil);
    break;
    
    
    }
    }
}