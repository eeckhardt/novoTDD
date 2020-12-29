	
package processa;

public class Fatura {

		private String nomeCliente;
		private String data;
		private double valorFatura;
		private double[] pagamentos;
		private boolean status;
		
		

		
		public Fatura(String nomeCliente, String data, double valorFatura) {
			super();
			this.nomeCliente = nomeCliente;
			this.data = data;
			this.valorFatura = valorFatura;
		}
		
		public String getNomeCliente() {
			return nomeCliente;
		}
		public void setNomeCliente(String nomeCliente) {
			this.nomeCliente = nomeCliente;
		}
		
		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}
		
		public double getValorFatura() {
			return valorFatura;
		}
		public void setValorFatura(double valorFatura) {
			this.valorFatura = valorFatura;
		}
		
		public double[] getPagamentos() {
			return pagamentos;
		}
		public void setPagamentos(double[] pagamentos) {
			this.pagamentos = pagamentos;
		}
		
		public boolean getStatus() {
			return status;
		}
		public void setStatus(boolean status) {
			this.status = status;
		}
		
		@Override
		public boolean equals(Object p) {
			return ((Fatura) p).getNomeCliente().equals(this.getNomeCliente());
		}
		
		

	}
