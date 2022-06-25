package com.wb.apps;

import com.wb.io.Entrada;
import com.wb.listagemII.*;
import com.wb.listar.Listagem;
import com.wb.modelo.Empresa;


public class ListagensII extends Execucao{
	private Empresa empresa;
	
	public ListagensII(Empresa empresa) {
		this.empresa = empresa;
	}
	
	@Override
	public void executar() {
		
		boolean  op = true;
		
		while ( op ) {
			System.out.println("\nQue tipo de listagem voc� deseja realizar?:");
			System.out.println("1 - Listar todos os Clientes por G�nero");
			System.out.println("2 - Listar Produtos/Servi�os mais consumidos por G�nero");
			System.out.println("3 - Listar os 10 clientes que mais consumiram Prdoutos/Servi�os (quantidade)");
			System.out.println("4 - Listar os 10 clientes que menos consumiram Produtos/Servi�os");
			System.out.println("5 - Listar os 5 clientes que mais consumiram Produtos/Servi�os (valor)");
			System.out.println("6 - Listar os Produtos/Servi�os mais consumidos");
			System.out.println("0 - Voltar");
		
			Entrada entradaList = new Entrada();
			int listagens = entradaList.receberNumeroInteiro();
		
			switch ( listagens ) {
			case 0:
				
				System.out.println("Voltando para o menu inicial.");
				op = false;
				break;
				
			case 1:
				
				Listagem listagemCliGen = new ListarGenero(empresa.getClientes());
				listagemCliGen.listar();
				break;
		
			case 2:
				
				Listagem listagemProdGen = new ListarCGenero(empresa.getClientes());
				listagemProdGen.listar();
				break;
				
			case 3:
				
				Listagem listagemCliMaisCons = new ListarConsumistas(empresa.getClientes());
				listagemCliMaisCons.listar();
				break;
				
			case 4:
				
				Listagem listagemCliMenosCons = new ListarCliMenos(empresa.getClientes());
				listagemCliMenosCons.listar();
				break;
				
			case 5:
				
				Listagem listagemCliMaisVal = new ListarCliMais(empresa.getClientes());
				listagemCliMaisVal.listar();
				break;
			case 6:
				
				Listagem listagemProdServCons = new ListarProdServ(empresa.getClientes());
				listagemProdServCons.listar();
				break;
				
			default:
				
				System.out.println("\nOpera��o n�o entendida");
			}
		}
	}
}
