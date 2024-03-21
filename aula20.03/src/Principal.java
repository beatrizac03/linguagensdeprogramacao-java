import java.util.Scanner;

public class Principal {
    private static int numeroCigarrosAoLongoVida(int anosFumando, int cigarrosDia){
        return anosFumando * 365 * cigarrosDia;
    }

    private static double totalGastoVida(int totalCigarrosVida, double precoMedio){
        return (totalCigarrosVida / 20) * precoMedio;
    }

    private static double totalTempoVidaPerdidoAoLongoDaVida(int totalCigarrosVida){
        return (totalCigarrosVida * 11) / 60;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite  o numero de anos fumando: ");
        int anosFumando = scn.nextInt();

        System.out.println("Digite o numero de cigarros fumados por dia: ");
        int cigarrosDia = scn.nextInt();

        System.out.println("Digite o preço medio do maço de cigarros: ");
        double precoMedio = scn.nextDouble();

        int totalCigarrosVida = numeroCigarrosAoLongoVida(anosFumando, cigarrosDia);
        double totalGastoVida = totalGastoVida(totalCigarrosVida, precoMedio);
        double tempoVidaPerdido = totalTempoVidaPerdidoAoLongoDaVida(totalCigarrosVida);

        System.out.println("Total de cigarros fumados na vida: " + totalCigarrosVida);
        System.out.println("Total gasto na vida: " + totalCigarrosVida);
        System.out.println("Total de tempo perdido em horas: " + tempoVidaPerdido);
    }

}
