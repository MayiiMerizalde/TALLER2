public class Descuento {

/* crear una clase descuento con los atributos porcentaje descuento y el total de la compra
cear un contructor que reciba dos parametros de entrada(descuento,total) y un metodo getTotal()
 que retorne el total de la compra*/
	private double descuento;
	private double totalcompra;
	
	public Descuento(double descuentoParam,double totalcompraParam){
		this.descuento=descuentoParam;
		this.totalcompra=totalcompraParam;
	}
	
	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public double getTotalcompra() {
		return totalcompra;
	}

	public void setTotalcompra(double totalcompra) {
		this.totalcompra = totalcompra;
	}

	public double getTotal(){
		double total=totalcompra-totalcompra*descuento;
		return total;
	}
	
}
