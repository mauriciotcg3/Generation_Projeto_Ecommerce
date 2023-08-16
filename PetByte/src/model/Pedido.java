package model;

import java.text.NumberFormat;

import interfaces.PedidoRepository;

public class Pedido implements PedidoRepository{

	NumberFormat format = NumberFormat.getCurrencyInstance();
	
	private String cliente, pet, prod;
	private int numero, qnt, tipo;
	private float valor;
	
	
	
	
	public Pedido(int numero, String cliente, String pet, int tipo, String prod, int qnt, float valor) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		this.pet = pet;
		this.tipo = tipo;
		this.prod = prod;
		this.qnt = qnt;
		this.valor = valor;
	}

	
	
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getPet() {
		return pet;
	}

	public void setPet(String pet) {
		this.pet = pet;
	}

	public String getProd() {
		return prod;
	}

	public void setProd(String prod) {
		this.prod = prod;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		this.qnt = qnt;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public void visualizar() {
		String tipoPet = ".";
		
		switch (this.tipo) {
		
			case 1 -> { tipoPet = "Cachorro"; break; }
				
			case 2 -> { tipoPet = "Gato"; break; }
			
			case 3 -> { tipoPet = "Passaro"; break; }
			
		}
		
		System.out.println("\n |———————————————————————————————————————————————————————————|");
		System.out.println("\t                     Dados Da Venda                         ");
		System.out.println("\t |———————————————————————————————————————————————————————————|");
		System.out.println("\t                  Numero da Venda: " + this.numero);
		System.out.println("\t                  Nome do Cliente: " + this.cliente);
		System.out.println("\t                  Nome do Pet: " + this.pet + " | " + tipoPet);
		System.out.println("\t                  Produto: " + this.prod);
		System.out.println("\t                  Quantidade: " + this.qnt );
		System.out.println("\t                  Valor Total: " + format.format(this.valor));
		System.out.println(" |———————————————————————————————————————————————————————————|");
		System.out.println("");
	}

	@Override
	public void procurarVenda(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Pedido pedido) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void uptate(Pedido pedido) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int numero) {
		// TODO Auto-generated method stub
		
	}
	
}
