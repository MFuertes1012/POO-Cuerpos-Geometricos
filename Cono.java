package FigurasGeometricas;

import java.util.InputMismatchException;

public class Cono extends CuerposGeometricos {
	private double Generatriz,Volumen, AreaLateral, AreaTotal;
	
	public Cono(double Volumen, double Altura, double Radio, String NuevaF, double Generatriz, double AreaLateral, double AreaTotal) {
		super(Volumen, Altura, Radio, NuevaF);
		this.Generatriz = Generatriz; 
		this.Volumen = Volumen;
		this.AreaLateral = AreaLateral;
		this.AreaTotal = AreaTotal; 
	}
	public void CalcularCono() {
		do {
			try {
				Continuar = false;
				
		System.out.print("Ingrese el Radio del Cono: ");
		setRadio(sc.nextDouble());
		while(getRadio() <= 0) {
			System.out.println("No puede ingresar valores negativos");
			System.out.print("Valor: ");
			setRadio(sc.nextDouble());
		}
		
		System.out.print("Ingrese la Altura del Cono: ");
		setAltura(sc.nextDouble());
		while(getAltura() <= 0) {
			System.out.println("No puede ingresar valores negativos");
			System.out.print("Valor: ");
			setAltura(sc.nextDouble());
		}
		Generatriz = Math.sqrt(Math.pow(getAltura(),2)+Math.pow(getRadio(),2));
		AreaLateral = Math.PI*getRadio()*Generatriz;
		AreaTotal = Math.PI*getRadio()*(Generatriz+getRadio());
		Volumen = Math.PI*Math.pow(getRadio(),2)*getAltura()/3;
		
		System.out.println("El área lateral del cono es: "+AreaLateral);
		System.out.println("El área total del cono es: "+AreaTotal);
		System.out.println("El volumen del cono es: "+Volumen);
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
	System.out.println("Se ha creado un cono");
	}
	
}
