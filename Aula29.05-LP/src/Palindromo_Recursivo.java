public class Palindromo_Recursivo {
    public static void main(String[] args) {
        String palavra = "ARARA";
        int resultado = isPalindromo(palavra, 0, palavra.length() - 1);
        // (palavra = 'arara', 'A', 'A')
        System.out.println("Resultado: " + resultado);
    }

    public static int isPalindromo(String palavra, int left, int right) {
        if(left >= right)  // if 'A' >= 'A'
            return 1;

        if(palavra.charAt(left) != palavra.charAt(right)) // 'A' != 'A'
            return 0;

        return  isPalindromo(palavra, left + 1, right - 1);
    }
}
