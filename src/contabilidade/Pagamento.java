
package contabilidade;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bmaga
 */
public class Pagamento {
    
    private final String nomeEmpresa;
    private final List<Imposto> impostos;

    public Pagamento(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.impostos = new ArrayList<>();
    }

    public void adicionarImposto(Imposto imposto) {
        impostos.add(imposto);
    }

    public void calcularTotalImpostos() {
        for (Imposto imposto : impostos) {
            System.out.println("Descrição: " + imposto.getDescricao());
            System.out.println("Total calculado: R$" + imposto.calcularImposto());
        }
    }
}

