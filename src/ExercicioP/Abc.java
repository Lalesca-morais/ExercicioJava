package ExercicioP;
import java.util.Scanner;
public class Abc {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite o valor de A");
        int numA = entrada.nextInt();

        System.out.println("Digite o valor de B");
        int numB = entrada.nextInt();

        System.out.println("Digite o valor de C");
        int numC = entrada.nextInt();

        System.out.println("Digite o valor de D");
        int numD = entrada.nextInt();

        System.out.println("Digite o valor de E");
        int numE = entrada.nextInt();

        System.out.println("Digite o valor de F");
        int numF = entrada.nextInt();

        if (numA == numB) {
            System.out.println("O Valor"  +numA+ "é igual ao valor"  +numB);
        }else if (numC != numD) {
            System.out.println("O Valor"  +numC+ "é diferente de"  +numD);
        }else if (numE > numF) {
            System.out.println("O Valor"  +numE+ "é maior de"  +numF);
        }

    }
}
