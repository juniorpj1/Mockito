
public class Cliente {

	private Integer codigo;
	
	private String nome;
	
	private Double desconto;

	public Cliente(Integer codigo, String nome, Double desconto) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.desconto = desconto;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	
	
}
