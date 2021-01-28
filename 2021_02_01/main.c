/******************************************************************************
 * Author: https://github.com/FelipeFerreiraDev
 * 
 * Link to the repository: https://github.com/FelipeFerreiraDev/Prog-Faculdade
 * 
*******************************************************************************/
#include <string.h>
#include <stdio.h>

int main()
{
    char type[100][100];
    char typeCar[100][100];

    char board[100][100];
    char boardOpc[100][100];
    char aux[100];

    int quantity = 0, i = 0, j = 0, count = 0; //quantidade de locaçoes

    int compar = 0, comparType = 0;

    char client[100][100];

    int payment[100];
    int total = 0;

    int maior = 0;

    int increment = 0;

    int countA = 0, countB = 0, countC = 0, sair = 1, opc = 0;

    /*
        A)Processamento de um conjunto de locações, sendo que para cada locação são fornecidos
            o tipo de veículo e sua respectiva placa;
    */
    while (sair == 1)
    {
        printf("Digite o tipo do veículo preferencialmente sem acento e letra minúscula: ");
        scanf("%s", type[countA]);
        printf("Digite a placa do veículo: ");
        scanf("%s", board[countA]);
        printf("\n*****************************************************************************************\n");
        printf("Para continuar cadastrando mais uma locação digite 1, para ver as outras opções digite 0\n");
        scanf("%d", &sair);
        printf("\n*****************************************************************************************\n");
        countA++;
    }

    sair = 1;

    /*
        B) Processamento de um conjunto de pagamentos de locação podendo ser armazenado a placa e
            o código do cliente
    */

    while (sair == 1)
    {
        printf("Digite a placa do veículo para o pagamento: ");
        scanf("%s", boardOpc[countB]);
        printf("Digite o código do cliente: ");
        scanf("%s", client[countB]);
        printf("Digite o valor que o cliente pagou em inteiros: ");
        scanf("%d", &payment[countB]);
        printf("\n*****************************************************************************************\n");
        printf("Para continuar cadastrando mais um pagamento digite 1, para ver as outras opções digite 0\n");
        scanf("%d", &sair);
        printf("\n*****************************************************************************************\n");
        countB++;
    }

    sair = 1;

    while (sair == 1)
    {
        printf("Digite o número da opção desejada para emetir um relatório\n");
        printf("1-Número de locações para cada tipo de veículo");
        printf("\n2-Veículos na categoria luxo com mais de 10 locações");
        printf("\n3-Total arrecadado para cada veículo");
        printf("\n4-Valor médio pago por cliente");
        printf("\n5-Total pago por cliente");
        printf("\n6-Cliente com mais locações");
        scanf("%d", &opc);

        switch (opc)
        {
        /* 
            C) Emissão de um relatório com as seguintes informações:
            
            1. número de locações de cada tipo de veículo;
        */
        case 1:
            printf("Digite o tipo do veículo para pesquisar: ");
            scanf("%s", typeCar[0]);
            for (countC; countC <= countA; countC++)
            {
                if (compar = strcmp(typeCar[0], type[countC]) == 0)
                {
                    quantity++;
                }
            }
            printf("A quantidade de locações para o tipo ' %s ' é de: %d\n", typeCar[0], quantity);
            quantity = 0;
            countC = 0;
            printf("Para continuar a pesquisar digite 1 para parar digite 0\n");
            scanf("%d", &sair);
            break;

        /* 
            2. Veiculos do tipo luxo com mais de 10 locações
        */
        case 2:
            for (i = 0; i < countA; i++)
            {
                for (j = i + 1; j < countA; j++)
                {
                    if (compar = strcmp(board[i], board[j]) > 0)
                    {
                        strcpy(aux, board[i]);
                        strcpy(board[i], board[j]);
                        strcpy(board[j], aux);
                    }
                }
            }

            for (i = 0; i < countA; i++)
            {
                if (compar = strcmp(board[i], board[i + 1]) == 0)
                {
                    if (comparType = strcmp(type[i], "luxo") == 0)
                    {
                        count++;
                    }
                }
                else if (comparType = strcmp(type[i], "luxo") == 0 && count >= 10)
                {
                    printf("O veículo da placa %s foi locado %d vezes\n", board[i], count);

                    count = 1;
                }
            }
            if (comparType = strcmp(type[i], "luxo") == 0 && count >= 10)
            {

                printf("O veículo da placa %s foi locado %d vezes\n", board[i], count);
            }

            printf("Para continuar a pesquisar digite 1 para parar digite 0\n");
            scanf("%d", &sair);
            break;

        /*
            3. Total arrecadado para cada veículo e seu tipo
        */
        case 3:
            for (count = 0; count < countB; count++)
            {
                strcpy(aux, boardOpc[count]);
                for (i = 1; i <= countB; i++)
                {
                    if (strcmp(aux, boardOpc[i - 1]) == 0)
                    {
                        total += payment[i - 1];
                    }
                }
                printf("O veículo '%s' arrecadou R$ %d \n", aux, total);
                total = 0;
            }

            printf("Para continuar a pesquisar digite 1 para parar digite 0\n");
            scanf("%d", &sair);
            break;

            /*
                4. Valor médio pago por cliente
            */
        case 4:
            for (count = 0; count < countB; count++)
            {
                strcpy(aux, client[count]);
                for (i = 1; i <= countB; i++)
                {
                    if (strcmp(aux, client[i - 1]) == 0)
                    {
                        total += payment[i - 1];
                        increment++;
                    }
                }
                total = total / increment;
                printf("O usuário '%s' pagou R$ %d em média\n", aux, total);
                total = 0;
                increment = 0;
            }

            printf("Para continuar a pesquisar digite 1 para parar digite 0\n");
            scanf("%d", &sair);
            break;

            /*
                5. Total pago por cliente
            */
        case 5:
            for (count = 0; count < countB; count++)
            {
                strcpy(aux, client[count]);
                for (i = 1; i <= countB; i++)
                {
                    if (strcmp(aux, client[i - 1]) == 0)
                    {
                        total += payment[i - 1];
                    }
                }
                printf("O usuário '%s' pagou R$ %d no total\n", aux, total);
                total = 0;
            }

            printf("Para continuar a pesquisar digite 1 para parar digite 0\n");
            scanf("%d", &sair);
            break;

            /*
                6. Cliente com mais locações
            */
        case 6:
            for (count = 0; count < countB; count++)
            {
                strcpy(aux, client[count]);
                for (i = 1; i <= countB; i++)
                {
                    if (strcmp(aux, client[i - 1]) == 0)
                    {
                        total++;
                    }
                }
            }

            printf("O usuário %s fez %d locações\n", aux, total);
            total = 0;

            printf("Para continuar a pesquisar digite 1 para parar digite 0\n");
            scanf("%d", &sair);
            break;
        } //fim do switch
    }     // fim do while
} //fim do main
