import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, forneça a sua altura - duas ou mais casas decimais após a vírgula: ");
        double alturaUsuario = Double.parseDouble(sc.nextLine());
        System.out.println("Por favor, forneça o seu  peso -duas ou mais casas decimais após a vírgula: ");
        double pesoUsuario = Double.parseDouble(sc.nextLine());
        double IMC = pesoUsuario / (alturaUsuario*alturaUsuario);
        System.out.println("O seu IMC calculado foi " + IMC);
        sc.close();
    }
}
