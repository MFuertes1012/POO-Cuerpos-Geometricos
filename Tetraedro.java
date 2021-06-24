package FigurasGeometricas;
import java.util.InputMismatchException;

public class Tetraedro extends CuerposGeometricos {
	private double Area, Volumen, Altura, LongitudArista;
	
	public Tetraedro(double Volumen, double Altura, double Radio, String NuevaF, double Area, double LongitudArista) {
		super(Volumen, Altura, Radio, NuevaF);
		this.Area = Area;
		this.Volumen = Volumen;
		this.LongitudArista = LongitudArista;
	}
	public void CalcularTetraedro() {
		do {
			try {
				Continuar = false;
				
		System.out.print("Ingrese la longitud de la arista:  ");
		LongitudArista = sc.nextDouble();
		while(LongitudArista <= 0) {
			System.out.println("No puede ingresar valores negativos");
			System.out.print("Valor: ");
			LongitudArista = sc.nextDouble();
		}
		Area = Math.pow(LongitudArista,2)*Math.sqrt(3);
		Volumen = Math.sqrt(2)/12 * Math.pow(LongitudArista,3);
		Altura = LongitudArista * Math.sqrt(6)/3;
		
		System.out.println("El área del tetraedro es: "+Area);
		System.out.println("El volumen del tetraedro es: "+Volumen);
		System.out.println("La altura del tetraedro es: "+Altura);
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
		System.out.println("Se ha creado un tetraedro");
	}

}
