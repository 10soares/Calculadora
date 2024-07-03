package calculadora;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int n1;
        int n2;
        double resultado;
        char operacao;
        
        while (true) {
            System.out.println("\nEscolha a operação desejada:");
            System.out.println("1: Adição");
            System.out.println("2: Subtração");
            System.out.println("3: Multiplicação");
            System.out.println("4: Divisão");
            System.out.println("5: Sair");
            operacao = scan.next().charAt(0);
            
            if (operacao == '5') {
                System.out.println("Encerrando o programa...");
                break;
            }
            
            System.out.printf("%nDigite o valor 1: ");
            n1 = scan.nextInt();
            
            System.out.printf("%nDigite o valor 2: ");
            n2 = scan.nextInt();
            
            try {
                switch (operacao) {
                    case '1':
                        resultado = met_operacoes.adicao(n1, n2);
                        System.out.printf("%nA soma de %d com %d é igual a %.2f", n1, n2, resultado);
                        break;
                    case '2':
                        resultado = met_operacoes.subtracao(n1, n2);
                        System.out.printf("%nA subtração de %d com %d é igual a %.2f", n1, n2, resultado);
                        break;
                    case '3':
                        resultado = met_operacoes.multiplicacao(n1, n2);
                        System.out.printf("%nA multiplicação de %d com %d é igual a %.2f", n1, n2, resultado);
                        break;
                    case '4':
                        resultado = met_operacoes.divisao(n1, n2);
                        System.out.printf("%nA divisão de %d por %d é igual a %.2f", n1, n2, resultado);
                        break;
                    default:
                        System.out.println("Operação inválida. Tente novamente.");
                        break;
                }
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
        
        scan.close();
    }
}
