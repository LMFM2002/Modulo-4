package Matriz;
import java.util.Scanner;
public class Matriz {

	public static void main(String[] args) {
		 int linhas , colunas;
	        Scanner leitor = new Scanner(System.in);
	        System.out.print("Quantas linhas? ");
	        linhas = leitor.nextInt();
	        System.out.print("Quantas colunas? ");
	        colunas = leitor.nextInt();
	        int[][] matriz = new int [linhas] [colunas];
	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                System.out.print("Digite o elemento da linha " + (i + 1) + " da coluna " + (j + 1) + ": ");
	                matriz[i][j] = leitor.nextInt();
	                System.out.println("");
	            }
	        }
	        System.out.println("Agora, apresentando a matriz\n\n");
	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                System.out.print(matriz[i][j] + "   ");
	            }
	            System.out.println("");
	        }
	        System.out.println("\nFim");
	    }
	}

	


