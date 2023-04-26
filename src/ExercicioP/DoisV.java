package ExercicioP;
import java.util.Scanner;
public class DoisV {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um valor");
        int num1 = entrada.nextInt();
        System.out.println("Digite outro valor");
        int num2 = entrada.nextInt();
        if (num1 > num2) {
            System.out.println("O número"  +num1+ " é maior que"  +num2);
        }else
            System.out.println("O número"  +num2+ " é maior que"  +num1);

    }
}
