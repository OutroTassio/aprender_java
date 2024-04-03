package sintaxe;
import java.util.Scanner;
public class EntradaSaida {
    public static void main(String[] args) {
        System.out.println("Olá"); //mensagem inicial
        System.out.println("Digite um número inteiro: ");//Exibe mensagem
        Scanner s = new Scanner(System.in); //Prepara a entrada de dados
        int valor = s.nextInt(); //Declara e inicia variável
        System.out.println("Valor = " + valor); //exibe o valor lido
        
        System.out.println("-------------------------------------------------------------------------------------");
        /*
         * O tipo string  permite armazenar texto (palavras simples ou frases) e pode ser lido como
         * next(), que retorna apenas a primeira palavra fornecida, ou nextLine(), capaz de ler uma linha inteira.
         */
        System.out.println("Digite uma palavra: "); //mensafem para orientar usuário
        String palavra = s.next();
        s.nextLine();
        System.out.print("Digite uma frase: "); //mensagem para orientar usuário
        String frase = s.nextLine(); 

        System.out.println("A palavra digitada foi " + palavra + "\ne a frase foi " + frase);
        
        s.close(); //Fecha objeto leitor
    }
}
