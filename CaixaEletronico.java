import java.util.Scanner;
//ARQUIVO .JAVA CRIADO COM LAÇO SIMPLES USANDO IF/ELSE
public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 550.0;           

        System.out.println("Digite o valor a ser sacado: ");
        double valorSolicitado = scanner.nextDouble();


        if (valorSolicitado <= saldo) { 
        saldo = saldo - valorSolicitado;
        System.out.println("Saque realizado com sucesso!");
        System.out.println("O saldo atual é: " + saldo);
    } else {
        System.out.println("O saldo atual não é suficiente");
    }
    scanner.close();
}
}
