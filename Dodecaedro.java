package FigurasGeometricas;
import java.util.InputMismatchException;


public class Dodecaedro extends CuerposGeometricos{
	private double Area, Volumen, AreaPentagono, Apotema, AnguloCentral, LongitudArista;

	public Dodecaedro(double Volumen, double Altura, double Radio, String NuevaF, double Area,double AreaPentagono, double Apotema, double AnguloCentral, double LongitudArista) {
		super(Volumen, Altura, Radio, NuevaF);
		this.Area = Area;
		this.Volumen = Volumen;
		this.AreaPentagono = Apotema;
		this.Apotema = Apotema;
		this.AnguloCentral= AnguloCentral;
		this.LongitudArista = LongitudArista;
	}
	public void CalcularDodecaedro() {
		do {
			try {
				Continuar = false;
				
		System.out.print("Ingrese la longitud de la arista: ");
		LongitudArista = sc.nextDouble();
		while(LongitudArista <= 0) {
			System.out.println("No puede ingresar valores negativos");
			System.out.print("Valor: ");
			LongitudArista = sc.nextDouble();
		}
		
		System.out.print("Ingrese el ángulo central: ");
		AnguloCentral = sc.nextDouble();
		while(AnguloCentral <= 0) {
			System.out.println("No puede ingresar valores negativos");
			System.out.print("Valor: ");
			AnguloCentral = sc.nextDouble();
		}
		Area = 3* Math.pow(LongitudArista,2)*Math.sqrt(25+10*Math.sqrt(5));
		Volumen= 0.25*15+7* Math.sqrt(5)*Math.pow(LongitudArista,3);
		Apotema = LongitudArista/2* Math.tan(AnguloCentral/2);
		AreaPentagono = 2.5* LongitudArista*Apotema;
		
		System.out.println("El área del dodecaedro es: "+Area);
		System.out.println("El volumen del dodecaedro es: "+Volumen);
		System.out.println("El area del pentagono del dodecaedro es: "+AreaPentagono);
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
	System.out.println("Se ha creado un dodecaedro");
	}
	
}
