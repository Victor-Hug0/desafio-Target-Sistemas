public class Main {
    public static void main(String[] args) {

        int indice = 13;
        int soma = 0;
        int k = 0;
        while(k<indice){
            k+=1;
            soma+=k;
        }

        System.out.println("1 - " + soma);

        System.out.println("-------------------------");


        int n = 13;

        System.out.println("2 - Sequência de Fibonacci com " + n + " números:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
            if (n == fibonacci(i)){
                System.out.println(n + " está na sequência de fibonacci!");
            }
        }

        System.out.println("\n-------------------------");

        System.out.println("3 - a) 1, 3, 5, 7, 9, 11, 13\n" +
                "b) 2, 4, 8, 16, 32, 64, 128, 256, 512\n" +
                "c) 0, 1, 4, 9, 16, 25, 36, 49, 64, 81\n" +
                "d) 4, 16, 36, 64, ____\n" +
                "e) 1, 1, 2, 3, 5, 8, 13, 21, 34, 55\n" +
                "f) 2,10, 12, 16, 17, 18, 19,\n");

        System.out.println("-------------------------");

        System.out.println("4 - Ligar o primeiro interruptor e esperar a lâmpada esquentar.\n" +
                "Desligar o primeiro interruptor.\n" +
                "Ligar o segundo interruptor.\n" +
                "Entrar na sala onde estão as lâmpadas.");

        System.out.println("A lâmpada que está acesa corresponde ao interruptor que foi ligado.\n" +
                "A lâmpada apagada e quente corresponde ao interruptor que foi ligado e desligado.\n" +
                "A lâmpada apagada e fria corresponde ao interruptor que nunca foi tocado.");

        System.out.println("------------------------");

        System.out.println("5 - " + inverterString("teste"));

    }

    public static int fibonacci(int n){
        if (n <= 1){
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static String inverterString(String string){

        char[] chars = string.toCharArray();
        int end = string.length()-1;
        for (int i = 0; i < end; i++) {
            char temp = chars[i];
            chars[i] = chars[end];
            chars[end] = temp;
            end--;
        }

        return new String(chars);
    }
}