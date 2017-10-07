import org.junit.BeforeClass;
import org.junit.Test;
import junit.framework.Assert;

public class PedidoTest {

	Cliente clienteAriel;
	Cliente clienteEduardo;
	Pedido pedido1;
	Pedido pedido2;

	@BeforeClass
	public void inicializa() {
		clienteAriel = new Cliente(1, "Ariel", 5.5);
		clienteEduardo = new Cliente(2, "Eduardo", 5.5);

		pedido1 = new Pedido(155.40, clienteAriel);
		pedido2 = new Pedido(450.40, clienteEduardo);
	}

	@Test
	public void testaDesconto() {
		Double valor = pedido1.getValorComDesconto();
		Assert.assertEquals(valor, 140.40, 0.00001);

	}

}
