import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a medida em metro: ");
        double metros = scanner.nextDouble();
        scanner.close();
        double centimetros = metros * 100; 
        System.out.print("A medida em centimetros será: " + centimetros);

    }

}