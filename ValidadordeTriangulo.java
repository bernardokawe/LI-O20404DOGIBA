import java.util.Scanner;

public class ValidadordeTriangulo {
    public static void main(String[] args) {
        // declaração de variáveis
        int a, b, c; // Lados de um triângulo

        // Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        // presentação
        System.out.println("\n\t\t\t -- Validador de Triângulo --\n");

        // Entradas
        System.out.print("informe o lado A:");
        a = entrada.nextInt();
        System.out.print("Informe o lado B:");
        b = entrada.nextInt();
        System.out.print("Informe o lado C:");
        c = entrada.nextInt();

        // Procedimento
        if ((a < (b + c)) && (b < (a + c)) && (c < (a + b))) {
            // É triangulo
            System.out.printf("\n%d, %d e %d forma um triângulo!\n", a, b, c);
            if (( a == b ) || (b == c) || (a == c)){
            System.out.println("Triângulo isóceles");    
        } else if ((a == b) && (b == c)){
            System.out.println("Triângulo equilátero");
        } else {
            System.out.println("Triângulo escaleno");
        }
        } else {
            // Não é triangulo
            System.out.printf("\n%d, %d e %d não foma um triangulo\n", a, b, c);
        }
    }

}