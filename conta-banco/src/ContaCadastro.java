
import java.time.LocalDate;

public class ContaCadastro {

    private Cliente cliente;
    private int agencia;
    private int numeroConta;
    private double saldo = 0;
    private LocalDate dataAbertura;
    
    
    public ContaCadastro(Cliente cliente, int agencia, int numeroConta, double saldo, LocalDate dataAbertura) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }


    public Cliente getCliente() {
        return cliente;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public int getAgencia() {
        return agencia;
    }


    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }


    public int getNumeroConta() {
        return numeroConta;
    }


    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }


    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public LocalDate getDataAbertura() {
        return dataAbertura;
    }


    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }


    @Override
    public String toString() {
        return "ContaCadastro [cliente=" + cliente + ", agencia=" + agencia + ", numeroConta=" + numeroConta
                + ", saldo=" + saldo + ", dataAbertura=" + dataAbertura + "]";
    }
    
    
}
