package FigurasGeometricas;
import java.util.InputMismatchException;

public class TroncodeCono extends CuerposGeometricos{
private double AreaLateral, AreaTotal, Volumen, Altura, RadioMenor, RadioMayor, AreaBaseMayor, AreaBaseMenor, Generatriz;

public TroncodeCono(double Volumen, double Altura, double Radio, String NuevaF, double AreaLateral, double AreaTotal, double RadioMenor, double RadioMayor, double AreaBaseMayor, double AreaBaseMenor, double Generatriz) {
	super(Volumen, Altura, Radio, NuevaF);
	this.AreaLateral = AreaLateral;
	this.AreaTotal = AreaTotal;
	this.Volumen = Volumen;
	this.Altura = Altura;
	this.RadioMenor = RadioMenor;
	this.RadioMayor = RadioMayor;
	this.AreaBaseMayor = AreaBaseMayor;
	this.AreaBaseMenor = AreaBaseMenor;
	this.Generatriz = Generatriz;
}
public void CalcularTroncodeCono() {
	do {
		try {
			Continuar = false;
			
	System.out.print("Ingrese la altura del tronco del cono: ");
	setAltura(sc.nextDouble());
	while(getAltura() <= 0) {
			System.out.println("No puede ingresar valores negativos");
			System.out.print("Valor: ");
			setAltura(sc.nextDouble());
			}
			
	System.out.print("Ingrese el radio menor del tronco del cono: ");
	setRadio(sc.nextDouble());
	while(getRadio() <= 0) {
		System.out.println("No puede ingresar valores negativos");
		System.out.print("Valor: ");
		setRadio(sc.nextDouble());
	}
	
	System.out.print("Ingrese el radio mayor del tronco del cono: ");
	RadioMayor = sc.nextDouble();
	while(RadioMayor <= 0) {
		System.out.println("No puede ingresar valores negativos");
		System.out.print("Valor: ");
		RadioMayor = sc.nextDouble();
	}
		Generatriz= Math.sqrt(Math.pow(Altura,2)+Math.pow(getRadio(),2));
		AreaLateral = Math.PI*Generatriz*(RadioMayor+getRadio());
		AreaBaseMayor = Math.PI*(Math.pow(RadioMayor,2));
		AreaBaseMenor= Math.PI*(Math.pow(getRadio(),2));
		AreaTotal = AreaLateral + AreaBaseMayor + AreaBaseMenor;
		Volumen = 0.333333333* Math.PI*getAltura()*(Math.pow(RadioMayor,2)+ Math.pow(getRadio(),2)+ RadioMayor*getRadio());
		
		System.out.println("El área lateral del tronco del cono es: "+AreaLateral);
		System.out.println("El área total del tronco del cono es: "+AreaTotal);
		System.out.println("El volumen del tronco del cono es: "+Volumen);
		} catch (InputMismatchException ex) {
		    System.out.println("No puede ingresar signos, números, letras o símbolos");
			  sc.next();
			  System.out.println();
			  Continuar = true;
				}
			} while (Continuar);
		}
@Override
	public void NuevaFigura() {
	System.out.println("Se ha creado el tronco de cono");
	}
	
	
}
