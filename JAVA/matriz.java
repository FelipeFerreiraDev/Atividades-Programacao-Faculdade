/*
*
*   GitHub: https://github.com/FelipeFerreiraDev/Prog-Faculdade
*
* 
*/

class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        matriz[1][1] = 1;
        matriz[1][2] = 2;
        matriz[1][3] = 3;
        matriz[2][1] = 4;
        matriz[2][2] = 5;
        matriz[2][3] = 6;
        matriz[3][1] = 7;
        matriz[3][2] = 8;
        matriz[3][3] = 9;

        for(int linha = 1; linha < 4;linha++) {
          for(int coluna = 1; coluna < 4; coluna++) {
            System.out.print(matriz[linha][coluna]);
          }
            System.out.print("\n");
        }
    }
}
