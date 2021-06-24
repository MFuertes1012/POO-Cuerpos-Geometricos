package FigurasGeometricas;
import java.util.InputMismatchException;

public class Octoedro extends CuerposGeometricos {
private double Area, Volumen, LongitudArista;

public Octoedro (double Volumen, double Altura, double Radio, String NuevaF, double Area, double LongitudArista) {
	super(Volumen, Altura, Radio, NuevaF);
	this.Area = Area;
	this.Volumen = Volumen;
	this.LongitudArista = LongitudArista;
}
public void CalcularOctoadro() {
	do {
		try {
			Continuar = false;
			
	System.out.print("Ingrese la Longitud de una de la arista: ");
	LongitudArista = sc.nextDouble();
	while(LongitudArista <= 0) {
		System.out.println("No puede ingresar valores negativos");
		System.out.print("Valor: ");
		LongitudArista = sc.nextDouble();
	}
	Area = 2* Math.pow(LongitudArista,2)* Math.sqrt(3);
	Volumen = Math.sqrt(2)/3* Math.pow(LongitudArista,3);
	
	System.out.println("El área del octaedro es: "+Area);
	System.out.println("El volumen del octaedro es: "+Volumen);
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
	System.out.println("Se ha creado un octaedro");
	}
	
}

