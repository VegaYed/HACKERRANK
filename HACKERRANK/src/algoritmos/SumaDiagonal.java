package algoritmos;

public interface SumaDiagonal {

	//SUMA DE LA DIAGONAL IZQUIERDA DE UNA MATRIZ DE DOS DIMENCIONES 

	public static void SumDiag(int array[][]) {
		
		int i,j;		
		int sumaIz=0;
		int sumaDer=0;
		for(i=0;i<array.length;i++) {
			
			for(j=0;j<array[i].length;j++) {
				
				if(array[i].equals(array[j])) {
					
					sumaIz=sumaIz+array[i][j];
				}
				
				if(i+j==(array.length-1)) {
					
					sumaDer=sumaDer+array[i][j];
				}
				
			}
		
		}
		
		System.out.println("Suma diagonal Izquierda: " + sumaIz);
		System.out.println("Suma diagonal Derecha: " + sumaDer);
		System.out.println("Diferencia diagonales: " + (sumaDer-sumaIz));
		
	}
}
