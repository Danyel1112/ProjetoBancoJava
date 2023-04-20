package banco;

public class Banco {
	private String nome;
	private double saldo;
	
	
	public String getNome() {
		return nome;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double valor) {
		this.saldo = valor;
	}
	
	public double depositar(double valor, Banco banco) {
		return this.saldo += valor;
		
	}
	
	public double sacar(double valor, Banco banco) {
		if(valor > saldo) {
			System.out.println("Não é possível sacar um valor maior que o saldo");
			return 0;
		} else {
			saldo -= valor;
			return saldo;
		}
	}
	
	public double exibeSaldo(double valor) {
		return valor;
	}
	
	
}
