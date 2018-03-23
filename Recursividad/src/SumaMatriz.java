
public class SumaMatriz {

	public int suma(int[][] matriz) {

		return sumaRecu(matriz, 0, 0);
	}

	public int sumaRecu(int[][] matriz, int n, int m) {

		if (n == matriz.length - 1 && m == matriz[0].length - 1) {
			return matriz[matriz.length - 1][matriz[0].length - 1];
		} else if (n >= matriz.length) {
			return sumaRecu(matriz, 0, m + 1);
		} else {
			return matriz[n][m] + sumaRecu(matriz, n + 1, m);
		}

	}
	
	public void llenarMatriz(int[][] matriz) {
		int k = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				k+=2;
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
	
	public  int sumaM(int mat[][]) {
		return sumaM(mat.length-1, mat[mat.length-1].length-1,mat);
	}
	
	public  int sumaM(int fila, int col, int mat[][]) {
		if(fila==0&&col==0)
			return mat[0][0];
		else if(col<0)
			return sumaM(fila-1, mat[fila-1].length-1,mat);
		else return mat[fila][col]+sumaM(fila,col-1,mat);
				
	}
	
	public static void main(String[] args) {
		SumaMatriz sum = new SumaMatriz();
		
		int[][] matriz = new int[5][10];
		sum.llenarMatriz(matriz);
		System.out.println("Matriz ");
		sum.printMatriz(matriz);
		System.out.println();
		System.out.println("Suma matriz: " + sum.suma(matriz));
		
		System.out.println(sum.hashCode());

	}

}
