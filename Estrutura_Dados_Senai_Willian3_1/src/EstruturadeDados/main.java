package EstruturadeDados;


public class main {
	
	public static int binarySearch(int[] arr, int target) {
		int left=0, right = arr.length -1;
		
		while (left <= right) {
			int mid = left + right - left/2;
			if(arr[mid] == target) {
				return mid;
			}else if(arr[mid] < target) {
				left = mid + 1;
				
			}else {
				right =  mid -1;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int[] lista = {1,3,5,7,9,11};
		int alvo = 7;
		
		int resultado = binarySearch(lista, alvo);
		
		if (resultado != -1) {
			System.out.println("Elemento encontrado no indice: " + resultado);
		}else {
			System.out.println("Elemento nao encontrado");
		}

	}

}
