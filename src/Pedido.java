
public class Pedido {

	private Integer numero;
	
	private Double valor;
	
	private Cliente cliente;

	public Pedido(Double valor, Cliente cliente) {
		this.valor = valor;
		this.cliente = cliente;
	}
	
	public Double getValorComDesconto(){
		return this.valor - (this.valor*cliente.getDesconto()/100d);
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
	
	
	
	
}
