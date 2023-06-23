import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe a primeira nota do aluno: ");
        double n1 = ler.nextDouble();
        System.out.println("");

        System.out.print("Informe a primeira nota do aluno: ");
        double n2 = ler.nextDouble();
        System.out.println("");

        System.out.print("Informe a primeira nota do aluno: ");
        double n3 = ler.nextDouble();
        System.out.println("");

        ler.close();

        double media = (n1 + n2 + n3) / 3;

        if(media <= 9 && media >= 7){
            System.out.printf("Aprovado! Nota media: %2.2f",media);
        }

        if(media < 7 && media >= 0){
            System.out.printf("Reprovado! Nota media: %2.2f",media);
        }

        if(media == 10){
            System.out.printf("Aprovado com distincao! Nota media: %2.2f",media);
        }
    }
}
