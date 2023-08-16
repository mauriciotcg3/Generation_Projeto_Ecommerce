package main;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

import controller.Controller;
import model.Pedido;

public class Main {

	public static void main(String[] args) {
		
		Controller pedidos = new Controller();
		Scanner sc = new Scanner(System.in);
		NumberFormat formatador = NumberFormat.getCurrencyInstance();
		
		int op, numero, tipo, qnt = 0, prod, pag;
		String cliente, pet;
		float valor = 0;
		
		System.out.println("Bem Vindo a PetByte (つ◕౪◕)つ━☆ﾟ.*･｡ﾟ ");
		
		keyPress();
		
		while (true) {

			System.out.println(
					  " |———————————————————————————————————————————————————————————|\r\n"
					+ " |██████╗ ███████╗████████╗██████╗ ██╗   ██╗████████╗███████╗|\r\n"
					+ " |██╔══██╗██╔════╝╚══██╔══╝██╔══██╗╚██╗ ██╔╝╚══██╔══╝██╔════╝|\r\n"
					+ " |██████╔╝█████╗     ██║   ██████╔╝ ╚████╔╝    ██║   █████╗  |\r\n"
					+ " |██╔═══╝ ██╔══╝     ██║   ██╔══██╗  ╚██╔╝     ██║   ██╔══╝  |\r\n"
					+ " |██║     ███████╗   ██║   ██████╔╝   ██║      ██║   ███████╗|\r\n"
					+ " |╚═╝     ╚══════╝   ╚═╝   ╚═════╝    ╚═╝      ╚═╝   ╚══════╝|\r\n"
					+ " |———————————————————————————————————————————————————————————|");
			
			System.out.println("                                                     	   	");
			System.out.println("            	  1 - Cadastrar Pedido                     	");
			System.out.println("            	  2 - Forma De Pagamento				    ");
			System.out.println("            	  3 - Procurar Pedido		               	");
			System.out.println("            	  4 - Deletar Pedido	  	     		   	");
			System.out.println("            	  5 - Informações Adicionais	  	     	");
			System.out.println("            	  0 - Sair                                 	");
			System.out.println("                                                     	   	");
			System.out.println(" |———————————————————————————————————————————————————————————|");
			System.out.print("            Entre Com a Opção Desejada:  ");
			
			try {
				op = sc.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\n\tHey, Nada de Números Decimais Ou Letras Por Aqui (っ-̶●̃益●̶̃)っ");
				System.out.println("\tDigite o Valor Inteiro");
				sc.nextLine();
				op=9;
			}


			if (op == 0) {
				System.out.println("\n\tPetByte Agradece Pelo Uso!");
				System.out.println("\tAté Mais (っ◕‿◕)っ ♥");
				sc.close();
				System.exit(0);
			}

			switch (op) {
				case 1 -> {
					
					System.out.println("\n\tCadastrar Pedido  （*´▽｀*）\n");
					System.out.print("\tDigite o Nome do Cliente: ");
					cliente = sc.next();
					System.out.print("\tDigite o Nome do Seu Pet: ");
					pet = sc.next();
					
					do {
						System.out.println("\t1- Cachorro   U´ᴥ`U");
						System.out.println("\t2- Gato   ◎ヽ(^･ω･^=)~");
						System.out.println("\t3- Passaro   ˏ₍•ɞ•₎ˎ");
						System.out.print("\tSelecione Uma Das Opções Anteriores: ");
						
						try {
							tipo = sc.nextInt();
						}catch(InputMismatchException e){
							System.out.println("\n\tHey, Nada de Números Decimais Ou Letras Por Aqui (っ-̶●̃益●̶̃)っ");
							System.out.println("\tDigite o Valor Inteiro");
							sc.nextLine();
							tipo=9;
						}
						
						if(tipo < 1 && tipo > 3 ) {
							System.out.println("\nOpção Inválida （︶︿︶）");
							System.out.println("Por favor Selecione Uma Opção Válida!\n");
						}
						
					}while(tipo < 1 && tipo > 3 );
					
					switch (tipo) {
					case 1 -> {
						System.out.println("\n\tProdutos Para Cachorros   U´ᴥ`U\"");
						System.out.println("\t1- Filhote Ração Golden Sabor Carne e Arroz 1kg - Preço R$: 21,90");
						System.out.println("\t2- Filhote Ração Golden Sabor Carne e Arroz 3kg - Preço R$: 57,90");
						System.out.println("\t3- Adulto Ração Golden Sabor Carne e Arroz 1kg - Preço R$: 20,90");
						System.out.println("\t4- Adulto Ração Golden Sabor Carne e Arroz 3kg - Preço R$: 54,90");
						System.out.println("\t5- Coleira Antipulgas Mundo Animal Pulgoff - Preço R$: 40,90");
						System.out.println("\t6- Macacão Dinossauro de Desenho Animado Com Capuz - Preço R$: 35,95");
								
						System.out.println("");
						
						System.out.print("\tDigite o Codigo do Produto Desejado: ");
						prod = sc.nextInt();
						System.out.print("\tDigite a Quantidade: ");
						qnt = sc.nextInt();
								
						switch (prod) {
						case 1:
							valor += qnt * 21.90;
							System.out.println("");
							System.out.println("\tProduto Selecionado: Filhote Ração Golden Sabor Carne e Arroz 1kg\n"
									+ "\tValor Total do Pedido: " + formatador.format(valor));
							break;
						case 2:
							valor += qnt * 57.90;
							System.out.println("");
							System.out.println("\tProduto Selecionado: Filhote Ração Golden Sabor Carne e Arroz 3kg\n"
									+ "\tValor Total do Pedido: " + formatador.format(valor));
							break;
						case 3:
							valor += qnt * 20.90;
							System.out.println("");
							System.out.println("\tProduto Selecionado: Adulto Ração Golden Sabor Carne e Arroz 1kg\n"
									+ "\tValor Total do Pedido: " + formatador.format(valor));
							break;
						case 4:
							valor += qnt * 54.90;
							System.out.println("");
							System.out.println("\tProduto Selecionado: Adulto Ração Golden Sabor Carne e Arroz 3kg\n"
									+ "\tValor Total do Pedido: " + formatador.format(valor));
							break;
						case 5:
							valor += qnt * 40.90;
							System.out.println("");
							System.out.println("\tProduto Selecionado: Coleira Antipulgas Mundo Animal Pulgoff\n"
									+ "\tValor Total do Pedido: " + formatador.format(valor));
							break;
						case 6:
							valor += qnt * 35.95;
							System.out.println("");
							System.out.println("\tProduto Selecionado: Macacão Dinossauro de Desenho Animado Com Capuz\n"
									+ "\tValor Total do Pedido: " + formatador.format(valor));
							break;
						default:
								System.out.println("\nOpção Inválida （︶︿︶）");
								break;
						}
					}
					
					case 2 -> {
						System.out.println("\n\tProdutos Para Gatos   ◎ヽ(^･ω･^=)~");
						System.out.println("\t1- Filhote Ração Golden Sabor Peixe 1kg - Preço R$: 21,90");
						System.out.println("\t2- Filhote Ração Golden Sabor Peixe 3kg - Preço R$: 57,90");
						System.out.println("\t3- Adulto Ração Golden Sabor Peixe 1kg - Preço R$: 20,90");
						System.out.println("\t4- Adulto Ração Golden Sabor Peixe 3kg - Preço R$: 54,90");
						System.out.println("\t5- Filhote Sache Golden Gourmet Atum - Preço R$: 3,96");
						System.out.println("\t6- Adulto Sache Golden Gourmet Atum - Preço R$: 2,96");
						System.out.println("\t7- Arranhador Para Gatos Com Bolinha - Preço R$: 42,90");
								
						System.out.println("");
						
						System.out.print("\tDigite o Codigo do Produto Desejado: ");
						prod = sc.nextInt();
						System.out.print("\tDigite a Quantidade: ");
						qnt = sc.nextInt();
								
						switch (prod) {
						case 1:
							valor += qnt * 21.90;
							System.out.println("");
							System.out.println("\tProduto Selecionado: Filhote Ração Golden Sabor Peixe 1kg\n"
									+ "\tValor Total do Pedido: " + formatador.format(valor));
							break;
						case 2:
							valor += qnt * 57.90;
							System.out.println("");
							System.out.println("\tProduto Selecionado: Filhote Ração Golden Sabor Peixe 3kg\n"
									+ "\tValor Total do Pedido: " + formatador.format(valor));
							break;
						case 3:
							valor += qnt * 20.90;
							System.out.println("");
							System.out.println("\tProduto Selecionado: Adulto Ração Golden Sabor Peixe 1kg\n"
									+ "\tValor Total do Pedido: " + formatador.format(valor));
							break;
						case 4:
							valor += qnt * 54.90;
							System.out.println("");
							System.out.println("\tProduto Selecionado: Adulto Ração Golden Sabor Peixe 3kg\n"
									+ "\tValor Total do Pedido: " + formatador.format(valor));
							break;
						case 5:
							valor += qnt * 3.96;
							System.out.println("");
							System.out.println("\tProduto Selecionado: Filhote Sache Golden Gourmet Atum\n"
									+ "\tValor Total do Pedido: " + formatador.format(valor));
							break;
						case 6:
							valor += qnt * 2.96;
							System.out.println("");
							System.out.println("\tProduto Selecionado: Filhote Sache Golden Gourmet Atum\n"
									+ "\tValor Total do Pedido: " + formatador.format(valor));
							break;
						case 7:
							valor += qnt * 42.90;
							System.out.println("");
							System.out.println("\tProduto Selecionado: Arranhador Para Gatos Com Bolinha\n"
									+ "\tValor Total do Pedido: " + formatador.format(valor));
							break;
						default:
								System.out.println("\nOpção Inválida （︶︿︶）");
						}	
					}
					
					case 3 -> {
						System.out.println("\n\tProdutos Para Passaros   ˏ₍•ɞ•₎ˎ");
						System.out.println("\t1- Mistura Para Calopsita 500g - Preço R$: 7,90");
						System.out.println("\t2- Mistura Para Calopsita 10kg - Preço R$: 137,90");
						System.out.println("\t3- Mistura Para Papagaio 500g - Preço R$: 9,90");
						System.out.println("\t4- Mistura Para Papagaio 10kg - Preço R$: 163,90");
						System.out.println("\t5- Mistura Para Periquito 500g - Preço R$: 6,90");
						System.out.println("\t6- Mistura Para Periquito 10kg - Preço R$: 123,90");
								
						System.out.println("");
						
						System.out.print("\tDigite o Codigo do Produto Desejado: ");
						prod = sc.nextInt();
						System.out.print("\tDigite a Quantidade: ");
						qnt = sc.nextInt();
								
						switch (prod) {
						case 1:
							valor += qnt * 7.90;
							System.out.println("");
							System.out.println("\tProduto Selecionado: Mistura Para Calopsita 500g 500g\n"
									+ "\tValor Total do Pedido: " + formatador.format(valor));
							break;
						case 2:
							valor += qnt * 137.90;
							System.out.println("");
							System.out.println("\tProduto Selecionado: Mistura Para Calopsita 10kg\n"
									+ "\tValor Total do Pedido: " + formatador.format(valor));
							break;
						case 3:
							valor += qnt * 9.90;
							System.out.println("");
							System.out.println("\tProduto Selecionado: Mistura Para Papagaio 500g\n"
									+ "\tValor Total do Pedido: " + formatador.format(valor));
							break;
						case 4:
							valor += qnt * 163.90;
							System.out.println("");
							System.out.println("\tProduto Selecionado: Mistura Para Papagaio 500kg\n"
									+ "\tValor Total do Pedido: " + formatador.format(valor));
							break;
						case 5:
							valor += qnt * 6.90;
							System.out.println("");
							System.out.println("\tProduto Selecionado: Mistura Para Periquito 500g\n"
									+ "\tValor Total do Pedido: " + formatador.format(valor));
							break;
						case 6:
							valor += qnt * 123.90;
							System.out.println("");
							System.out.println("\tProduto Selecionado: Mistura Para Periquito 10kg\n"
									+ "\tValor Total do Pedido: " + formatador.format(valor));
							break;
						default:
								System.out.println("\nOpção Inválida （︶︿︶）");
						}	
					}
					
					default ->
						System.out.println("\nOpção Inválida （︶︿︶）");
					}
					
					pedidos.create(new Pedido(pedidos.gerarNumero(), cliente, pet, tipo, pet, qnt, valor));
					
					break;
					
				}
					
				case 2 -> {
					
					do {
						
						System.out.println("\t\nFormas De Pagamento [̲̅$̲̅(̲̅ ͡° ͜ʖ ͡°̲̅)̲̅$̲̅]");
						System.out.println("\t1 - Cartão de Crédito");
						System.out.println("\t2 - Cartão de Débito");
						System.out.println("\t3 - Pix");
						System.out.println("\t4 - Dinheiro");
						System.out.println("\t0 - Sair");
						System.out.print("\tSelecione Uma Das Opções Anteriores: ");
						
						try {
							pag = sc.nextInt();
						}catch(InputMismatchException e){
							System.out.println("\n\tHey, Nada de Números Decimais Ou Letras Por Aqui (っ-̶●̃益●̶̃)っ");
							System.out.println("\tDigite o Valor Inteiro");
							sc.nextLine();
							pag=9;
						}
						
						if(pag < 0 && pag > 4 ) {
							System.out.println("\nOpção Inválida （︶︿︶）");
							System.out.println("Por favor Selecione Uma Opção Válida!\n");
						}
						
					} while (pag == 0);
					
					switch (pag) {
					case 1 -> {
						System.out.println("\t\nValor: " + formatador.format(valor) + " pago no Cartão de Crédito, pressione 0 para sair");
						break;
					}
					case 2 -> {
						System.out.println("\t\nValor: " + formatador.format(valor) + " pago no Cartão de Débito, pressione 0 para sair");
						break;
					}
					case 3 -> {
						System.out.println("\t\nValor: " + formatador.format(valor) + " pago no Pix, pressione 0 para sair");
						break;
					}
					case 4 -> {
						System.out.println("\t\nValor: " + formatador.format(valor) + " pago em Dinheiro, pressione 0 para sair");
						break;
					}
					default -> {
						System.out.println("\t\nOpção Inválida （︶︿︶）");
						System.out.println("\tPor favor Selecione Uma Opção Válida!\n");
					}		
					}
					
					
					break;
				}
					
				case 3 -> {
					
					System.out.println("\t\nBuscar Pedido ﾍ(￣▽￣*)ﾉ\n");
					System.out.print("\tDigite o Numero do Pedido: ");
					numero = sc.nextInt();
					
					pedidos.procurarVenda(numero);
					break;
					
				}
				
				case 4 -> {
					System.out.println("\t\nDeletar Pedido (۶ૈ ۜ ᵒ̌▱๋ᵒ̌ )۶ૈ=͟͟͞͞ ⌨\n");
					System.out.print("\tDigite o Numero do Pedido: ");
					numero = sc.nextInt();
					
					pedidos.delete(numero);
					break;
				}
		
				case 5 -> {
					sobre();
				}
				
				default ->{
					System.out.println("\n\tOpção Inválida （︶︿︶）");
					System.out.println("\tPor favor Selecione Uma Opção Válida!\n");
					break;
				}
			
				
			}
	}
}
	
	public static void keyPress() {
		try {
			System.out.println("Pressione Enter para Continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}	
	

	public static void sobre() {
		System.out.println("  ———————————————————————————————————————————————————————————");
		System.out.println("    Projeto Realizado Por Maurício Freire Dos Santos /(^^)/");
		System.out.println("    GitHub: https://github.com/mauriciotcg3");
		System.out.println("  ———————————————————————————————————————————————————————————");
	}
}


