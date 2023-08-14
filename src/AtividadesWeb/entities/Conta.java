package AtividadesWeb.entities;

public class Conta implements ContaInterface {
    private int id;
    private String titular;

    public Conta(int id, String titular, double saldo) {
        this.id = id;
        this.titular = titular;
        this.saldo = saldo;
    }

    private double saldo;

    public Conta() {
    }

    public int getId() {
        return id;
    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double sacar(double valorSaque) {
        this.saldo = saldo- valorSaque;
        return this.saldo;
    }
    public double depositar(double valorDeposito) {
        this.saldo = saldo+ valorDeposito;
        return this.saldo;
    }
}
