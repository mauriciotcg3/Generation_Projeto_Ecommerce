package controller;

import java.util.ArrayList;

import interfaces.PedidoRepository;
import model.Pedido;

public class Controller implements PedidoRepository{

	private ArrayList<Pedido> listaDePedidos = new ArrayList<Pedido>();
	int numero = 0;
	
	@Override
	public void procurarVenda(int numero) {
		
		var pedido = buscarNaCollection(numero);
		
		if (pedido != null) {
			pedido.visualizar();
		}else {
			System.out.println("\n\tA Venda de Número: " + numero + " Não Foi Localizada .·´¯`(>▂<)´¯`·.\n");
		}
		
	}

	@Override
	public void create(Pedido pedido) {
		listaDePedidos.add(pedido);
		System.out.println("\n\tPedido de Número: " + pedido.getNumero() + " Foi Cadastrado No Sistema ╰(◕ᗜ◕)╯\n");
		
	}

	@Override
	public void uptate(Pedido pedido) {
		var buscarPedido = buscarNaCollection(pedido.getNumero());
		
		if (buscarPedido != null) {
			listaDePedidos.set(listaDePedidos.indexOf(buscarPedido), pedido);
			System.out.println("\n\tPedido de Número: " + pedido.getNumero() + " Foi Atualizada com Sucesso ╰(◕ᗜ◕)╯\n");
		}else {
			System.out.println("\n\tPedido de Número: " + pedido.getNumero() + " Não Foi Localizada .·´¯`(>▂<)´¯`·.\n");
		}
		
		
	}

	@Override
	public void delete(int numero) {
		var pedido = buscarNaCollection(numero);
		
		if (pedido != null) {
			if (listaDePedidos.remove(pedido) == true) {
				System.out.println("\n\tPedido de Número: " + pedido.getNumero() + " Foi Deletado Com Sucesso ╰(◕ᗜ◕)╯\n");
			}
		}else {
			System.out.println("\n\tPedido de Número: " + pedido.getNumero() + " Não Foi Localizada .·´¯`(>▂<)´¯`·.\n");
		}	
		
	}

	
	public int gerarNumero() {
		return ++ numero;
	}
	
	public Pedido buscarNaCollection(int numero) {
		
		for (var pedido : listaDePedidos) {
			if (pedido.getNumero() == numero) {
				return pedido;
			}
		}
		
		return null;
	}
	
	public int retornaTipo(int numero) {
		for (var pedido : listaDePedidos) {
			if (pedido.getNumero() == numero) {
				return pedido.getTipo();
			}
		}
		
		return 0;
	}
	
}
