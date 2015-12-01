public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Descuento des1=new Descuento(0.1,100);
		des1.setTotalcompra(150);
		
		double total=des1.getTotal();
		System.out.println("totalcompra: "+total);
		System.out.println("totalcompra: "+des1.getTotal());
	}

}
