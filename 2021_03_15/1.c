/*******************************************************************************
*******************************************************************************/

#include <stdio.h>

int main()
{
    int **matriz, c = 0, l = 0, i, j;
    
    
    printf("Digite o número de colunas: ");
    scanf("%d", &c);
    printf("Digite o número de linhas: ");
    scanf("%d", &l);

    matriz = (int **) malloc(l * sizeof(int *));  //Alocando Valor da Linha
    
    for (i = 0; i < l; i++) {
        matriz[i] = (int *) malloc(c * sizeof(int));  //Alocando Valor da coluna
        
        for(j = 0; j<c; j++){
            printf("Digite o valor para a posição da linha %d da coluna %d: ", i+1, j+1);
            scanf("%d", &matriz[i][j]);
        }
    }

    for (i = 0; i<l; i++) {
        for(j = 0; j<c; j++){
            if(matriz[i][j]%2==1 && matriz[i][j]%7==0) {
              printf("O elemento é : %d\n", matriz[i][j]);
            }
        }
    }

    return 0;
}

