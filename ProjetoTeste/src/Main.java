//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main ( String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro núemro: ");
        String primeiroNumero = sc.nextLine();

        System.out.println("Digite o valor do segundo número: ");
        String segundoNumero = sc.nextLine();

        System.out.println("Digite ou escreva a operação que deseja: ");
        String operacaoDesejada = sc.nextLine();

        double num1 = 0;
        double num2 = 0;
        boolean entradaValida = true;


        try {
            num1 = Double.parseDouble(primeiroNumero);
            num2 = Double.parseDouble(segundoNumero);
            }catch(NumberFormatException e){
            System.out.println("Entrada inválida, certifique-se de colocar somente números!");
            entradaValida = false;
            }

        if (entradaValida){
            double resultado = 0F;
            boolean operacaoValida = true;


        switch (operacaoDesejada){
            case "+":
            case "soma":
                resultado = num1 + num2;
                break;
            case "-":
            case "subtração":
                resultado = num1 - num2;
                break;
            case "*":
            case "multiplicação":
                resultado = num1 * num2;
                break;
            case "/":
            case "divisão":
                if(num2 != 0){
                    resultado = num1 / num2;
                }else{
                    System.out.println("Divisão por zero não é permitido");
                    operacaoValida = false;
                } break;
            default:
                System.out.println("Operação inválida.");
                operacaoValida = false;
                break;
        }
        if(operacaoValida){
            System.out.println("O resultado é: " + resultado);
        }

    }
        sc.close();
    }

}
