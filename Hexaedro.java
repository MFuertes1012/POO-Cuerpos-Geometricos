package FigurasGeometricas;
import java.util.InputMismatchException;

public class Hexaedro extends CuerposGeometricos {
	private double Area, Volumen, Diagonal, LongitudArista;
	
	public Hexaedro (double Volumen, double Altura, double Radio, String NuevaF, double Area, double Diagonal, double LongitudArista) {
		super(Volumen, Altura, Radio, NuevaF);
		this.Area = Area;
		this.Volumen = Volumen;
		this.Diagonal = Diagonal;
		this.LongitudArista = LongitudArista;
	}
	public void CalcularHexaedro() {
		do {
			try {
				Continuar = false;
				
		System.out.print("Ingrese la Longitud de la arista: ");
		LongitudArista = sc.nextDouble();
		while(LongitudArista <= 0) {
			System.out.println("No puede ingresar valores negativos");
			System.out.print("Valor: ");
			LongitudArista = sc.nextDouble();
		}
		Area = 6* Math.pow(LongitudArista,2);
		Volumen = Math.pow(LongitudArista,3);
		Diagonal = LongitudArista * Math.sqrt(3);
		
		System.out.println("El área del hexaedro es: "+Area);
		System.out.println("El volumen del hexaedro es: "+Volumen);
		System.out.println("El valor de la diagonal del hexaedro es: "+Diagonal);
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
	System.out.println("Se ha creado un hexaedro");
	}

}
