public interface Fatura {

    void pagarFatura(double valor);

    double getValorFatura();

    void setValorFatura(double valor);

    boolean getPago();

    void setPago(boolean pago);

    double getJuros();

    void setJuros(double juros);

}
