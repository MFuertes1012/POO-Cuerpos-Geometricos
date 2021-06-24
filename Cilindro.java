package FigurasGeometricas;
import java.util.InputMismatchException;

public class Cilindro extends CuerposGeometricos {
	private double Radio,Volumen, AreaLateral, AreaTotal;
	
	 public Cilindro(double Volumen, double Altura, double Radio, String NuevaF, double AreaLetarl, double AreaTotal) {
		 super(Volumen, Altura, Radio, NuevaF);
		 this.Volumen = Volumen;
		 this.AreaLateral = AreaLateral;
		 this.AreaTotal = AreaTotal; 
	 }
	 
	 public void CalcularCilindro() {
			do {
				try {
					Continuar = false;
					
			System.out.print("Ingrese el radio del cilindro: ");
		    Radio = sc.nextDouble();
			while(Radio <= 0) {
				System.out.println("No puede ingresar valores negativos");
				System.out.print("Valor: ");
				Radio = sc.nextDouble();
			}
			 System.out.print("Ingrese la Altura del Cilindro: ");
			    setAltura(sc.nextDouble());
				while(getAltura() <= 0) {
					System.out.println("No puede ingresar valores negativos");
					System.out.print("Valor: ");
					setAltura(sc.nextDouble());
				}
				AreaLateral = 2*Math.PI*Radio*getAltura();
				AreaTotal = 2*Math.PI*Radio*(getAltura()+Radio);
				Volumen = Math.PI*Math.pow(Radio,2)*getAltura();
				
				System.out.println("El área lateral del cilindro es: "+AreaLateral);
				System.out.println("El área total del clindro es: "+AreaTotal);
				System.out.println("El volumen del cilindro es: "+Volumen);
				}catch(InputMismatchException ex){
						System.out.println("No puede ingresar signos, números, letras o símbolos");
						 sc.next();
		            	  System.out.println();
		            	  Continuar = true;
					}
				} while (Continuar);
}
	 @Override
		public void NuevaFigura() {
		System.out.println("Se ha creado un cilindro");
	 }
	 
}
			
				
