
package contabilidade;

/**
 *
 * @author bmaga
 */

   public abstract class ImpostoComDebitoECredito implements Imposto {
    private double debito;
    private double credito;

    public ImpostoComDebitoECredito(double debito, double credito) {
        this.debito = debito;
        this.credito = credito;
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
} 

