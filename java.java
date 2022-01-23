public class E3 {

	public static void main(String[] args) {
		double valorDado = Math.floor(Math.random()*6+1);
		double valorDado2 = Math.floor(Math.random()*6+1);
		
		System.out.println("El primer dado saca un "+ valorDado +"");
		System.out.println("El segundo dado saca un "+ valorDado2 +"");
		
		
		double total= valorDado + valorDado2;
		
		System.out.println("Tu tirada suma "+ total +"");
		
	}
		
		
	}