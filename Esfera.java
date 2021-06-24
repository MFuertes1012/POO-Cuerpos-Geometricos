package FigurasGeometricas;
import java.util.InputMismatchException;

public class Esfera extends CuerposGeometricos{
	private double Area, Volumen, RadioMenor, RadioMayor, Altura, ZonaEsferica, CasqueteEsferico, AreaZonaEsferica,AreaCasqueteEsferico,VolumenZonaEsferica, VolumenCasqueteEsferico;
	
	public Esfera (double Volumen, double Altura, double Radio, String NuevaF, double Area, double RadioMenor,double RadioMayor, double ZonaEsferica,double CasqueteEsferico, double AreaZonaEsferica, double AreaCasqueteEsferico, double VolumenZonaEsferica, double VolumenCasqueteEsferico) {
		super(Volumen, Altura, Radio, NuevaF);
		this.Area = Area;
		this.Volumen = Volumen;
		this.RadioMenor = RadioMenor;
		this.RadioMayor = RadioMayor;
		this.Altura = Altura;
		this.ZonaEsferica = ZonaEsferica;
		this.CasqueteEsferico = CasqueteEsferico;
		this.AreaZonaEsferica = AreaZonaEsferica;
		this.AreaCasqueteEsferico = AreaCasqueteEsferico;
		this.VolumenZonaEsferica = VolumenZonaEsferica;
		this.VolumenCasqueteEsferico = VolumenCasqueteEsferico;	
	}
	public void CalcularEsfera() {
		do {
			try {
				Continuar = false;
				System.out.print("Ingrese el Radio menor de la Esfera: ");
				setRadio(sc.nextDouble());
				while(getRadio() <= 0) {
					System.out.println("No puede ingresar valores negativos");
					System.out.print("Valor: ");
					setRadio(sc.nextDouble());
				}
				
				System.out.print("Ingrese el Radio Mayor de la Esfera: ");
				RadioMayor = sc.nextDouble();
				while(RadioMayor <= 0) {
					System.out.println("No puede ingresar valores negativos");
					System.out.print("Valor: ");
					RadioMayor = sc.nextDouble();
				}
				System.out.print("Ingrese la altura de la Esfera: ");
				setAltura(sc.nextDouble());
				while(getAltura() <= 0) {
					System.out.println("No puede ingresar valores negativos");
					System.out.print("Valor: ");
					setAltura(sc.nextDouble());
				}
				Area = 4*Math.PI*Math.pow(getRadio(),2);
				Volumen = 1.333333333*Math.PI*Math.pow(getRadio(),3);
				AreaZonaEsferica = 2*Math.PI*RadioMayor*getAltura();
				AreaCasqueteEsferico = 2*Math.PI*RadioMayor*getAltura();
				VolumenZonaEsferica = Math.PI*getAltura()*(Math.pow(getAltura(),2)*3*Math.pow(RadioMayor,2)*3*Math.pow(getRadio(),2))/6;
				VolumenCasqueteEsferico = Math.PI*Math.pow(getAltura(),2)*(3*RadioMayor-getAltura())/3;
				
				System.out.println("El área de la esfera es: "+Area);
				System.out.println("El volumen de la esfera es: "+Volumen);
				System.out.println("El área de la zona esférica es: "+AreaZonaEsferica);
				System.out.println("El área del casquete esférico es: "+AreaCasqueteEsferico);
				System.out.println("El volumen de la zona esferica es: "+VolumenZonaEsferica);
				System.out.println("El volumen del casquete esférico es: "+VolumenCasqueteEsferico);
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
	System.out.println("Se ha creado una esfera");
	}
	
}
