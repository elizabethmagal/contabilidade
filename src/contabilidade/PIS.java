
package contabilidade;

/**
 *
 * @author bmaga
 */
public class PIS extends ImpostoComDebitoECredito {
    public PIS(double debito, double credito) {
        super(debito, credito);
    }

    @Override
    public double calcularImposto() {
        return (getDebito() - getCredito()) * 0.0165;
    }

    @Override
    public String getDescricao() {
        return "PIS";
    }
    
    
}

