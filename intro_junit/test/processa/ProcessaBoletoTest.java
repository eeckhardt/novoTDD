ackage processa;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import processa.Boleto;
import calculadora.Calculadora;
import processa.ProcessaBoleto;

public class ProcessaBoletoTest {


	private Boleto pagamento;
	
	
	@BeforeEach
	public void inicializa() {
		
		
	}
	
	@DisplayName("Testa 1 boleto")
	@Test
	public void testboleto() {
		
		Assertions.assertEquals(1500,1500);	
		
	}
	
	
	@DisplayName("Testa fatura em Aberto")
	@Test
	public void testSomaDoisBoletos() {
		double soma = 900;
		
		String status = ProcessaBoletos.Verifica(soma,2000);
		
		Assertions.assertEquals("Fatura em Aberto", status);
		
		}
	@DisplayName("Fatura Paga")
	@Test
	public void testFaturapaga() {
		
		String status = ProcessaBoletos.Verfica(1500,1500);
		
		Assertions.assertEquals("Fatura Paga", status);
		
		}
	
	
	@DisplayName("Testa 3 valores")
	@Test
	public void testSoma3() {
		
		Boleto[] pg;
		pg = new Boleto[3];
		
		pg[1] = ("1",400," ");
		pg[2]=("2",600," ");
		pg[3]=('3',500,' ');
		
				
				
		double soma = ProcessaBoletos.getValorTotal();
		String status = ProcessaBoletos.Verifica(1500,1500);
		
		Assertions.assertEquals("Fatura Paga", status);
		
		}
	
	}
