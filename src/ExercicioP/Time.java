package ExercicioP;
import java.util.Scanner;
public class Time {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Digite o nome do primeiro time: ");
        String time1 = input.nextLine();

        System.out.println("Digite a quantidade de gols marcados pelo primeiro time: ");
        int gols1 = input.nextInt();

        System.out.println("Digite o nome do segundo time: ");
        String time2 = input.nextLine();

        System.out.println("Digite a quantidade de gols marcados pelo segundo time: ");
        int gols2 = input.nextInt();

        if (gols1 > gols2) {
            System.out.println("O Time" +time1+ "venceu o time" +time2+ "por" +gols1+ "a" +gols2);
        } else {
            System.out.println("O Time" + time2 + "venceu o time" + time1 + "por" + gols2 + "a" + gols1);
        }
        }


    }

