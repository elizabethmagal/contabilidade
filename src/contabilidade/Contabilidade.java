
package contabilidade;
import java.util.Scanner;

/**
 *
 * @author bmaga
 */
public class Contabilidade {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar dados da empresa
        System.out.print("Nome da empresa: ");
        String nomeEmpresa = scanner.nextLine();
        Pagamento pagamentos = new Pagamento(nomeEmpresa);

        // Cadastro de impostos
        while (true) {
            System.out.print("Tipo de imposto (PIS/IPI) ou 'pare' para encerrar: ");
            String tipoImposto = scanner.nextLine();

            if (tipoImposto.equalsIgnoreCase("PIS")) {
                System.out.print("Valor total de débito: ");
                double debito = scanner.nextDouble();
                System.out.print("Valor total de crédito: ");
                double credito = scanner.nextDouble();
                pagamentos.adicionarImposto(new PIS(debito, credito));
                scanner.nextLine(); // Limpar o buffer do teclado
            } else if (tipoImposto.equalsIgnoreCase("IPI")) {
                System.out.print("Alíquota (%): ");
                double aliquota = scanner.nextDouble();
                System.out.print("Valor do produto: ");
                double valorProduto = scanner.nextDouble();
                System.out.print("Valor do frete: ");
                double frete = scanner.nextDouble();
                System.out.print("Valor do seguro: ");
                double seguro = scanner.nextDouble();
                System.out.print("Outras despesas: ");
                double outrasDespesas = scanner.nextDouble();
                pagamentos.adicionarImposto(new IPI(aliquota, valorProduto, frete, seguro, outrasDespesas));
                scanner.nextLine(); // Limpar o buffer do teclado
            } else if (tipoImposto.equalsIgnoreCase("pare")) {
                break;
            } else {
                System.out.println("Tipo de imposto inválido. Por favor, insira PIS, IPI ou 'pare'.");
            }
        }

        // Mostrar total calculado para cada imposto
        System.out.println("\nResumo dos pagamentos:");
        pagamentos.calcularTotalImpostos();
    }
}
 
    
    




