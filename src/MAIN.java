import java.util.Scanner;
public class MAIN {
	int[] notas;
	Scanner sc;
	
	public void pedirNotas(int cantidad) {
		sc = new Scanner(System.in);
		notas = new int [cantidad];
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Introduzca la nota del alumno %d: ", i + 1);
			notas[i] = sc.nextInt();
		}
	}
	
	public void calcularDiferencia() {
		
	    for (int x = 0; x < notas.length; x++) {
	        for (int i = 0; i < notas.length-x-1; i++) {
	            if(notas[i] > notas[i+1]){
	                int tmp = notas[i+1];
	                notas[i+1] = notas[i];
	                notas[i] = tmp;
	            }
	        }
	    }
		int diferencia = notas[notas.length - 1] - notas[0];
		System.out.println("La diferencia es: " + diferencia);
	}
	
	public static void main(String[] args) {
		MAIN ejemplo = new MAIN();
		
		int elementos =  Integer.parseInt(args[0]);
		ejemplo.pedirNotas(elementos);
		ejemplo.calcularDiferencia();		
	}
}

