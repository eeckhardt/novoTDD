package processa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ProcessaBoleto {
	
	   public void processa(List<Boleto> boletos, Fatura fatura){
		   double total = 0;
		   double pagamento = 0;
           double[] pagamentos;
           
		      for(Boleto boleto : boletos){

		         pagamento = boleto.getValorPago();
		         
		         pagamentos = fatura.getPagamentos();
		         // adicionar no array pagamentos .add(pagamento);
		         
		         //gravar na classe fatura fatura.setPagamentos()
		         total += boleto.getValorPago();

	          }
	      if(total >= fatura.getValorFatura()){
	         //print Fatura paga fatura.setStatus(true); else set false
	    	  
	    	  
	      }
	   }
	}