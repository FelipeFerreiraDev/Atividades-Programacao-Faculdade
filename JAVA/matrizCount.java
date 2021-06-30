/*
*
*   GitHub: https://github.com/FelipeFerreiraDev/Prog-Faculdade
*
* 
*/

class Main {
    public static void main(String[] args) {
        int linha4 = 0, coluna2 = 0, all = 0; 

        int[][] matriz = new int[6][6];
        matriz[1][1] = 1;
        matriz[1][2] = 1;
        matriz[1][3] = 1;
        matriz[1][4] = 1;
        matriz[1][5] = 1;
        matriz[2][1] = 2;
        matriz[2][2] = 2;
        matriz[2][3] = 2;
        matriz[2][4] = 2;
        matriz[2][5] = 2;
        matriz[3][1] = 3;
        matriz[3][2] = 3;
        matriz[3][3] = 3;
        matriz[3][4] = 3;
        matriz[3][5] = 3;
        matriz[4][1] = 4;
        matriz[4][2] = 4;
        matriz[4][3] = 4;
        matriz[4][4] = 4;
        matriz[4][5] = 4;
        matriz[5][1] = 5;
        matriz[5][2] = 5;
        matriz[5][3] = 5;
        matriz[5][4] = 5;
        matriz[5][5] = 5;

        for(int linha = 1; linha <=5;linha++) {
          for(int coluna = 1; coluna <=5; coluna++) {
           System.out.print(matriz[linha][coluna]);
           if(linha == 4) {
             linha4 += matriz[linha][coluna];
           } if (coluna == 2) {
             coluna2 += matriz[linha][coluna];
           }
           all += matriz[linha][coluna];
          }
            System.out.print("\n");
        }
        System.out.print(linha4 + "\n");
        System.out.print(coluna2 + "\n");
        System.out.print(all + "\n");
    }
}
