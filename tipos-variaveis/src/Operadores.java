import java.util.Date;

public class Operadores {
    @SuppressWarnings("unused")
    public static void main(String[] args) throws Exception {

        // classe Operadores.java
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        // classe Operadores.java
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        // aqui acima se imprimir, vai sair duas palavras juntas

        // qual o resultado das expressoes abaixo?
        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao); // aqui o resultao vai ser 31
        // os três primeiros 1s são int, mas o último é string.

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);
        // aqui vai ser 1111 pois ele somou 1 e depois usou o texto,
        // identificando a concatenação e seguindo com essa lógica.

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);
        // realizou somente concatena~]ao, por identificar antes

        concatenacao = "1" + 1 + 1 + 1;
        // realizou somente concatena~]ao, por identificar antes

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);
        // imprimiu 13, pois concatenou o primeiro 1 mais 3 somados entre parênteses.

        // Unários
        // classe Operadores.java
        int numero = 5;

        // Imprimindo o numero negativo
        System.out.println(-numero);

        // mas se eu pedir para imprimir novamente, ele vai estar negativo.
        // para ficar negativo é preciso alterar a variável para receber -numero
        // Para torná-lo positivo novamente, é necessário a operação de multiplicação

        // incrementando numero em mais 1 numero, imprime 6
        numero++; // é amesma coisa que numero = numero + 1;
        System.out.println(numero);

        // incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

        // ordem de precedencia conta aqui
        System.out.println(++numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);

    }

}
