/******************************************************************************
 * Author: https://github.com/FelipeFerreiraDev
 * 
 * Link to the repository: https://github.com/FelipeFerreiraDev/Prog-Faculdade
 * 
*******************************************************************************/

#include <stdio.h>

int main()
{
    char type[100][100];
    
    char board[100][100];
    char boardOpc[100][100];
    
    int client[100];
    
    int payment[100];
    
    int count = 0, sair = 1;


    /*
        A)Processamento de um conjunto de locações, sendo que para cada locação são fornecidos
            o tipo de veículo e sua respectiva placa;
    */
    while(sair==1){
        printf("Digite o tipo do veículo: ");
        scanf("%s", type[count]);
        printf("Digite a placa do veículo: ");
        scanf("%s", board[count]);
        printf("Para continuar cadastrando mais uma locação digite 1, para ver as outras opções digite 0\n");
        scanf("%d", &sair);
        count++;
    }
    
    count = 0;
    
    sair = 1;
    
    /*
        B) Processamento de um conjunto de pagamentos de locação podendo ser armazenado a placa e
            o código do cliente
    */
    
    while(sair==1){
        printf("Digite a placa do veículo para o pagamento: ");
        scanf("%s", boardOpc[count]);
        printf("Digite o código do cliente: ");
        scanf("%d",&client[count]);
        printf("Digite o valor que o cliente pagou em inteiros: ");
        scanf("%d",&payment[count]);
        printf("Para continuar cadastrando mais um pagamento digite 1, para ver as outras opções digite 0\n");
        scanf("%d", &sair);
        count++;
    }
    
    printf("%d", client[1]);
}
