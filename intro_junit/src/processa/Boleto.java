package processa;

public class Boleto {
	
	private String codigo;
	private String data;
	private double valorPago;

	
	public Boleto(String codigo, String data, double valorPago) {
		super();
		this.codigo = codigo;
		this.data = data;
		this.valorPago = valorPago;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public double getValorPago() {
		return valorPago;
	}
	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
	
	@Override
	public boolean equals(Object p) {
		return ((Boleto) p).getCodigo().equals(this.getCodigo());
	}
	
	

}
