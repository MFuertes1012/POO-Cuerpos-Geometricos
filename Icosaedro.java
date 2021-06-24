package FigurasGeometricas;
import java.util.InputMismatchException;

public class Icosaedro extends CuerposGeometricos {
	private double Area, Volumen, LongitudArista;
	
	public Icosaedro(double Volumen, double Altura, double Radio, String NuevaF, double Area, double LongitudArista) {
		super(Volumen, Altura, Radio, NuevaF);
		this.Area = Area;
		this.Volumen = Volumen;
		this.LongitudArista = LongitudArista;
	}
	public void CalcularIcosaedro() {
		do {
			try {
				Continuar = false;
				
		System.out.print("Ingrese la Longitud de la arista: ");
		LongitudArista = sc.nextDouble();
		while(LongitudArista <= 0) {
			System.out.println("No puede ingresar valores negativos");
			System.out.print("Valores: ");
			LongitudArista = sc.nextDouble();
		}
		Area = 5* Math.pow(LongitudArista,2)*Math.sqrt(3);
		Volumen = 0.416666666* 3+ Math.sqrt(5)*Math.pow(LongitudArista,3);
		
		System.out.println("El area del icosaedro es: "+Area);
		System.out.println("El volumen del icosaedro es: "+Volumen);
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
	System.out.println("Se ha creado un icosaedro");
	}
		
}
