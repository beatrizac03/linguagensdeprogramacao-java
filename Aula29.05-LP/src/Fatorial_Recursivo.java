public class Fatorial_Recursivo {
    public static void main(String[] args) {
        int num = 5;
        int resultado = calcularFatorial(num);
        System.out.println("O fatorial de " + num + " é " + resultado);

    }
        public static int calcularFatorial(int n) {
            if(n == 0) {
                return 1;
            } else {
                return n * calcularFatorial(n - 1);
            }
        }

        public static int calcularFatorial2(int n) {
            return (n == 0) ? 1 : n * calcularFatorial(n - 1);
        }
}
