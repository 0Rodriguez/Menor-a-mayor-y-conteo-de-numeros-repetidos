import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		int[] ar = { 40, 50, 60, 100, 66, 60, 50, 150, 80, 100, 66 };
		int[][] resultado = encontrarElementosRepetidos(ar);
		for (int[] subarreglo : resultado) {
			if (subarreglo[0] > 1) {
				System.out.print(Arrays.toString(subarreglo));
			}
		}
	}

	private static int[][] encontrarElementosRepetidos(int[] arOriginal) {

		Arrays.sort(arOriginal);

		int[][] arNumElementos = new int[arOriginal.length][2];

		int contador = 0;
		int aux = arOriginal[0];
		int iterador = 0;
		for (int numero : arOriginal) {
			if (aux == numero) {
				contador++;
			} else {
				arNumElementos[iterador][1] = contador;
				arNumElementos[iterador][0] = aux;
				contador = 1;
				aux = numero;
				iterador++;
			}
		}
		arNumElementos[iterador][1] = contador;
		arNumElementos[iterador][0] = aux;
		return arNumElementos;
	}

}
