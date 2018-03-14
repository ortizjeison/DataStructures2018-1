
public class SumaNumerosMatriz {

	public int suma1(int[][] matriz) {

		return suma1Recu(matriz, 0, 0);
	}

	public int suma1Recu(int[][] matriz, int n, int m) {

		if (n == matriz.length - 1 && m == matriz[0].length - 1) {
			return matriz[matriz.length - 1][matriz[0].length - 1];
		} else if (n >= matriz.length) {
			return suma1Recu(matriz, 0, m + 1);
		} else {
			return matriz[n][m] + suma1Recu(matriz, n + 1, m);
		}
	}

	public int suma2(int[][] matriz) {
		return suma2Recu(matriz, matriz.length - 1, matriz[0].length - 1);
	}

	public int suma2Recu(int[][] matriz, int n, int m) {

		if (n == 0 && m == 0) {
			return matriz[0][0];
		} else if (n < 0) {
			return suma2Recu(matriz, matriz.length-1, m-1);
		} else {
			return matriz[n][m] + suma2Recu(matriz, n-1, m);
		}

	}

	
	public int suma3(int[][] matriz) {
		return suma2Recu(matriz, matriz.length - 1, matriz[0].length - 1);
	}

	public int suma3Recu(int[][] matriz, int n, int m) {

		if (n == matriz.length-1 && m == matriz[m].length-1) {
			return matriz[matriz.length-1][matriz[matriz.length-1].length-1];
		} else if (n == matriz[n].length) {
			return suma3Recu(matriz, n+1,0);
		} else {
			return matriz[n][m] + suma2Recu(matriz, n+1, m);
		}
	}
	
	
	public void llenarMatriz(int[][] matriz) {
		int k = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				k++;
				matriz[i][j] = k;
			}
		}
	}

	public void printMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

	
	public static void main(String[] args) {
		SumaNumerosMatriz sum = new SumaNumerosMatriz();
		int[][] matriz = new int[5][2];
		//sum.printMatriz(matriz);
		sum.llenarMatriz(matriz);
		System.out.println("Matriz llena:");
		sum.printMatriz(matriz);
		//System.out.println("Suma matriz 1:");
		System.out.println(sum.suma1(matriz));
		System.out.println("Suma Matriz 2:");
		System.out.println(sum.suma2(matriz));
		System.out.println("Suma Matriz 3:");
		System.out.println(sum.suma3(matriz));
	}
}