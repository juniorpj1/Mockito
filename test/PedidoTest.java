import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

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
		Assert.assertEquals(valor, 146.85, 0.00001);

	}
	
	@Test
	public void testeComMock() {
		Cliente cliente = Mockito.mock(Cliente.class);
		Mockito.when(cliente.getDesconto()).thenReturn(10.2);
		Pedido pedido = new Pedido(1002.40, cliente);
		Assert.assertEquals(pedido.getValorComDesconto(), 900.15, 0.1);
		Mockito.verify(cliente).getDesconto();
	}

}
