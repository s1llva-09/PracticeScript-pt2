import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MotocicletaAVenda moto = new MotocicletaAVenda(2021, 15000.0);

        System.out.println("-----Informações do Automóvel-----");
        System.out.println("Informe o ano do automóvel:");
        int anoCarro = sc.nextInt();
        System.out.println("Informe o preço de venda do automóvel:");
        double precoCarro = sc.nextDouble();

        AutomovelAVenda carro = new AutomovelAVenda(anoCarro, precoCarro);
        System.out.println(carro.exibirInfo());
        sc.close();

        System.out.println("\nInformações da Motocicleta:");
        System.out.println(moto.exibirInfo());
    }
}
