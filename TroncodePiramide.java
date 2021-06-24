package FigurasGeometricas;
import java.util.InputMismatchException;

public class TroncodePiramide extends CuerposGeometricos {
	private double AreaLateral, AreaTotal, Volumen, PerimetroBaseMayor, PerimetroBaseMenor, Apotema, ApotemaBaseMayor, ApotemaBaseMenor,AreaBaseMayor, AreaBaseMenor, Altura, AristaMayor, AristaMenor ;
	
	public TroncodePiramide(double Volumen, double Altura, double Radio, String NuevaF,double AreaLateral, double AreaTotal,double PerimetroBaseMayor, double PerimetroBaseMenor, double Apotema, double ApotemaBaseMayor, double ApotemaBaseMenor, double AreaBaseMayor, double AreaBaseMenor, double AristaMayor, double AristaMenor) {
		super(Volumen, Altura, Radio, NuevaF);
		this.AreaLateral = AreaLateral;
		this.AreaTotal = AreaTotal;
		this.Volumen = Volumen;
		this.PerimetroBaseMayor = PerimetroBaseMayor;
		this.ApotemaBaseMenor = PerimetroBaseMenor;
		this.Apotema = Apotema;
		this.ApotemaBaseMayor = ApotemaBaseMayor;
		this.ApotemaBaseMenor = ApotemaBaseMenor;
		this.AreaBaseMayor = AreaBaseMayor;
		this.AreaBaseMenor = AreaBaseMenor;
		this.AristaMayor = AristaMayor;
		this.AristaMenor = AristaMenor;
	}
	public void CalcularTroncoPiramide() {
		do {
			try {
				Continuar = false;
				
		System.out.print("Ingrese el Apotema de base mayor del tronco de la pirámide: ");
		ApotemaBaseMayor = sc.nextDouble();
		while(ApotemaBaseMayor <= 0) {
			System.out.println("No puede ingresar valores negativos");
			System.out.print("Opcion: ");
			ApotemaBaseMayor = sc.nextDouble();
				}
		
	
		System.out.print("Ingrese el apotema de base menor del tronco de la pirámide: ");
		ApotemaBaseMenor = sc.nextDouble();
		while(ApotemaBaseMenor <= 0) {
			System.out.println("No puede ingresar valores negativos");
			System.out.print("Valor: ");
			ApotemaBaseMenor = sc.nextDouble();
		}
			
		System.out.print("Ingrese la altura del tronco de la pirámide: ");
		setAltura(sc.nextDouble());
		while(getAltura() <= 0) {
			System.out.println("No puede ingresar valores negativos");
			System.out.print("Valor: ");
			setAltura(sc.nextDouble());
		}
				
		System.out.print("Ingrese la longitud de la arista mayor del tronco de la pirámide: ");
		AristaMayor = sc.nextDouble();
		while(AristaMayor <= 0) {
			System.out.println("No puede ingresar valores negativos");
			System.out.print("Valor: ");
			AristaMayor = sc.nextDouble();
		}
		
		System.out.print("Ingrese la longiud de la arista menor del tronco de la pirmide: ");
		AristaMenor = sc.nextDouble();
		while(AristaMenor <= 0) {
			System.out.println("No puede ingresar valores negativos");
			System.out.print("Valor: ");
			AristaMenor = sc.nextDouble();
		}
		
		PerimetroBaseMayor = 4 * AristaMayor;
		PerimetroBaseMenor= 4 * AristaMenor;
		Apotema= Math.sqrt(Math.pow (getAltura(),2)+Math.pow(ApotemaBaseMayor - ApotemaBaseMenor,2));
		AreaLateral = PerimetroBaseMayor + PerimetroBaseMenor/2 * Apotema;
		AreaBaseMayor = Math.pow(AristaMayor,2);
		AreaBaseMenor = Math.pow(AristaMenor,2);
		AreaTotal = AreaLateral+AreaBaseMayor+AreaBaseMenor;
		Volumen = 0.333333333* getAltura() *(AreaBaseMayor+AreaBaseMenor+ Math.sqrt(AreaBaseMayor*AreaBaseMenor));
		
		System.out.println("El área lateral del tronco de la pirámide es: "+AreaLateral);
		System.out.println("El área total del tronco de la pirámide es: "+AreaTotal);
		System.out.println("El volumen del tronco de la pirámide es: "+Volumen);
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
		System.out.println("Se ha creado el tronco de la pirámide");
	}
		
}
