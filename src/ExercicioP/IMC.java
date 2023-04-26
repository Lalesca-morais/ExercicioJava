package ExercicioP;
import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
        double peso;
        double altura;

        Scanner leia = new Scanner(System.in);
        System.out.println("Informe seu peso: ");
        peso = leia.nextDouble();
        System.out.println("Informe sua altura: ");
        altura = leia.nextDouble();
        double imc;
        imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Classificação:magreza");
        }else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Classificação:normal");
        }else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Classificação:sobrepeso");
        }else if (imc >= 30.0 && imc <= 39.9) {
            System.out.println("Classificação:obesidade");
        }else {
            System.out.println("Classificação:obesidade grave");
        }
    }
}
