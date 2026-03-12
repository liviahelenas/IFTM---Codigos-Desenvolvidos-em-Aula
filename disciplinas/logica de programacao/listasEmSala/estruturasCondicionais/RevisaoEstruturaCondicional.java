
import java.util.Scanner;

public class RevisaoEstruturaCondicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número correspondente ao mês: ");
        int nMes = sc.nextInt();
        if (nMes == 1) {
            System.out.println("Janeiro");

            /// else if: da pra tratar com condições com artitmetica
        } else if(nMes == 2) {
                System.out.println("Fevereiro");
            } else {
            System.out.println("tratar erros e condições");
        }


        }
    }
