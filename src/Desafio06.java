import java.util.Scanner;

public class Desafio06 {
    public static void main(String[] args) {
        int c = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Bem vindo à Calculadora Mágica.");

        while(c != 7) {
            System.out.println("Digite 1 para calcular 10% do numero");
            System.out.println("Digite 2 para calcular quantos % voce quer calcular");
            System.out.println("Digite 3 para ver ser o número é par");
            System.out.println("Digite 4 para ver ser o número é ímpar");
            System.out.println("Digite 5 para calcular a raiz de primeiro grau");
            System.out.println("Digite 6 para calcular a raiz de segundo grau");
            System.out.println("Digite 7 para sair");

            c = s.nextInt();

            int valor1, valor2, valor3;
            double resultado, resultado2, porcentagem, porcentagem2;

            switch (c) {
                default:
                    System.out.println("Desculpe, digite um número válido.");
                    System.out.println();
                    break;
                case 1:
                    System.out.println("Digite o valor que deseja fazer a operação.");
                    valor1 = s.nextInt();
                    resultado = valor1 * 0.1;
                    System.out.println("O resultado de 10% de " + valor1 + " é: " + resultado);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja fazer a operação.");
                    valor1 = s.nextInt();
                    System.out.println("Digite a porcentagem da operação.");
                    porcentagem = s.nextDouble();
                    porcentagem2 = porcentagem / 100;
                    resultado = valor1 * porcentagem2;
                    System.out.println("O resultado de "+ porcentagem +"% de "+ valor1 +" é: "+ resultado);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja fazer a operação.");
                    valor1 = s.nextInt();
                    resultado = valor1 % 2;
                    if(resultado == 0) {
                        System.out.println(valor1 +" é um número par");
                    }else {
                        System.out.println(valor1 +" não é um número par");
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Digite o valor que deseja fazer a operação.");
                    valor1 = s.nextInt();
                    resultado = valor1 % 2;
                    if(resultado == 1) {
                        System.out.println(valor1 +" é um número ímpar");
                    }else {
                        System.out.println(valor1 +" não é um número ímpar");
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Sabendo que uma equação de primeiro grau é definida por: y=ax+b");
                    System.out.println("Qual o valor de a");
                    valor1 = s.nextInt();
                    System.out.println("Qual o valor de b");
                    valor2 = s.nextInt();
                    if(valor1 < 0){
                        valor1 = valor1 * -1;
                    }
                    resultado = valor2 / valor1;
                    System.out.println("A raiz da equação: y="+ valor1 +"x+"+ valor2 +". É x="+ resultado);
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Sabendo que uma equação de segundo grau é definida por: y=ax²+bx+c");
                    System.out.println("Qual o valor de A");
                    valor1 = s.nextInt();
                    if(valor1 == 0){
                        System.out.println("O valor de A não pode ser 0");
                        break;
                    }
                    System.out.println("Qual o valor de B");
                    valor2 = s.nextInt();
                    System.out.println("Qual o valor de C");
                    valor3 = s.nextInt();
                    int delta = ((valor2*valor2)-(4*valor1*valor3));
                    if(delta >= 0){
                        resultado = (-valor2 + Math.sqrt(delta)) / (2*valor1);
                        resultado2 = (-valor2 - Math.sqrt(delta)) / (2*valor1);
                        System.out.println("O valor do delta é: "+ delta);
                        System.out.println("A equação: y="+ valor1 +"x²+"+ valor2 +"x+c. Tem o valor da primeira raiz: "+ resultado +", e da segunda raiz : "+ resultado2);
                        System.out.println();
                        break;
                    }else {
                        System.out.println("Não podemos resolver a equação pois o delta é menor que 0");
                        System.out.println();
                        break;
                    }
                case 7:
                    System.out.println("Muito obrigado por usar a Calculadora Mágica. Volte sempre.");
                    System.out.println();
                    break;
            }

        }
    }
}