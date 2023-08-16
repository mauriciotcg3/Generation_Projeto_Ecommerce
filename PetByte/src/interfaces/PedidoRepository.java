package interfaces;

import model.Pedido;

public interface PedidoRepository {

	public void procurarVenda(int numero);
	public void create(Pedido pedido);
	public void uptate(Pedido pedido);
	public void delete(int numero);
	
}
