package sintaxe;
import java.util.Scanner;
public class EntradaSaidaSimples {
    public static void main(String[] args) {
        System.out.println("Olá"); //mensagem inicial
        System.out.println("Digite um número inteiro: ");//Exibe mensagem
        Scanner s = new Scanner(System.in); //Prepara a entrada de dados
        int valor = s.nextInt(); //Declara e inicia variável
        System.out.println("Valor = " + valor); //exibe o valor lido
        s.close(); //Fecha objeto leitor
    }
}
