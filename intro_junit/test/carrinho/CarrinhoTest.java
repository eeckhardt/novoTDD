package carrinho;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import produto.Produto;

@DisplayName("Classe para teste do Carrinho")

class CarrinhoTest {
	
			
			Produto item1;
			Produto item2;
			
					
		@BeforeEach
		public void inicializa() {
						
			
		
			item1.setNome("Introdu��o ao Teste de Software");
			item1.setPreco(100.00);
			item2.setNome("Engenharia de Software");
			item2.setPreco(250.00);
			
			
		}
		
		@Test
		public void testCriaCarrinho() {
			Assertions.assertAll("item1",
					() -> assertEquals("Introdu��o ao Teste de Software", item1.getNome()),
					() -> assertTrue(100.00 == item1.getPreco())						
					);
			Assertions.assertAll("item2",
					() -> assertEquals("Engenharia de Software", item2.getNome()),
					() -> assertTrue(250.00 == item2.getPreco())						
					);
		}
		
			
		private double getPreco() {
			// TODO Auto-generated method stub
			
			// grar
			return getPreco();
		}

		private Object getNome() {
			// TODO Auto-generated method stub
			return getNome();
		}
		

		
		
		

	}


