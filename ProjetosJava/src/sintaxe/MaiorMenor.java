package sintaxe;

public class MaiorMenor {
    public static void main(String[] args) {
        //dois valores reais quaisquer
        double x = 12.34, y =56.78;

        //armazena em max o maior valor entre x e y
        double max = x>y ? x : y;

        //valor inteiro qualquer
        int a = 100;

        //exibe se o valor é ou nao maior que 50
        System.out.println("A= " + a + (a>50 ? " é" : " nao é") + " maior  que 50.");
    }
}
