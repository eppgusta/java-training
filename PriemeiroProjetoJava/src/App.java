import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scana = new Scanner(System.in);
        

        System.out.println("Digite um número: ");
        int num1 = scana.nextInt();
        scana.nextLine();


        System.out.println("Digite o segundo número: ");
        int num2 = scana.nextInt();
        scana.nextLine();


        System.out.println("Digite um dos seguintes operadores matemáticos: +, -, /, *");
        String oper = scana.nextLine();
        



        switch(oper) {
            case "+":
                System.out.printf("A soma de %d + %d é igual a %d. \n", num1 , num2, num1 + num2);

                break;

            case "-":
                System.out.printf("A subtração de %d + %d é igual a %d. \n", num1 , num2, num1 - num2);

                break;
            
            case "*":
                System.out.printf("A multiplicação de %d + %d é igual a %d. \n", num1 , num2, num1 * num2);

            break;

            case "/":
                System.out.printf("A divisão de %d + %d é igual a %d. \n", num1 , num2, num1 / num2);

            break;
        }

       
        
    }
}
