/* escreva um algoritmo que calcule a qtde de dinheiro gasto por um fumante ao longo de sua vida. o programa deverá
   solicitar o nº de cigarros fumados por dia, o tempo de fumante e o preço médio do maço

   1 maço = 20 cigarros
   
   retorne o nº de cigarros fumados ao longo da vida e o total gasto
*/


import java.util.Scanner;

public class Main {
    static int tempoFumante;
    static int qtdeCigarros;
    static float precoMedioMaco;
    float totalCigarros;
    float totalGasto;

    void setVariaveis(int tempF, int qtCig, float precoMed){
        this.tempoFumante = tempF;
        this.qtdeCigarros = qtCig;
        this.precoMedioMaco = precoMed;
    }
    float calcularTotCigFumados(){
        return totalCigarros = qtdeCigarros * 365 * tempoFumante;
    }

    float calcularTotalGasto(){
        return totalGasto = (totalCigarros/20) * precoMedioMaco;
    }

    public static void main(String[] args) {
        Main obj = new Main();

        Scanner scn = new Scanner(System.in);

        System.out.print("Período de tempo, em anos, de fumante: ");
        tempoFumante = scn.nextInt();

        System.out.print("Quantidade de cigarros fumados p/ dia: ");
        qtdeCigarros = scn.nextInt();

        System.out.print("Preço médio do maço de cigarro: ");
        precoMedioMaco = scn.nextFloat();

        obj.setVariaveis(obj.tempoFumante, obj.qtdeCigarros, obj.precoMedioMaco);

        System.out.println("Nº de cigarros fumados ao longo da vida: " + obj.calcularTotCigFumados());
        System.out.println("Total gasto: R$ " + obj.calcularTotalGasto());
    }
}
