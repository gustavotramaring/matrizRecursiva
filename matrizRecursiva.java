import java.util.Scanner;

public class matrizRecursiva {

    public static int[][] criarMatriz(int linhas, int colunas, Scanner scanner) {
        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        return matriz;
    }

    public static void exibirMatrizRecursivo(int[][] matriz, int i, int j) {
        if (i < matriz.length) {
            if (j < matriz[i].length) {
                System.out.print(matriz[i][j] + " ");
                exibirMatrizRecursivo(matriz, i, j + 1);
            } else {
                System.out.println();
                exibirMatrizRecursivo(matriz, i + 1, 0);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int linhas = scanner.nextInt();

        System.out.print("Digite o número de colunas: ");
        int colunas = scanner.nextInt();

        int[][] matriz = criarMatriz(linhas, colunas, scanner);
        System.out.println("Matriz criada:");
        exibirMatrizRecursivo(matriz, 0, 0);

        scanner.close();
    }
}
