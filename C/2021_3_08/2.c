/*
*   Implemente um programa para cadastrar cadLojas
*   nome da loja
*   enderço
*   telefone
*   preço de um produto
*
*   exiba a média dos preços e as lojas cujo o preço do produto
*   é menor q a média geral
*/

#include <stdio.h>

#define MAX 100

struct cadLojas {
	char nomeLoja[100];
	char endereco[200];
	char telefone[20];
	int preco;
};

int main()
{
    struct cadLojas loja[MAX];
    int ext = 1, i = 0, soma = 0, media = 0, j = 0;
    while (ext == 1 && i < 100) {
        fgets(loja[i].nomeLoja, 100, stdin);
        fgets(loja[i].endereco, 200, stdin);
        fgets(loja[i].telefone, 20, stdin);
        scanf("%d", &loja[i].preco);
        getchar();
        printf("Digite 1 para sair ou digite qualquer valor para prosseguir: ");
        scanf("%d", &ext);
        getchar();
        soma += loja[i].preco;
        i++;
    }
    media = soma / i;
    printf("%d \n", media);
    
    for(j; j<=i; j++) {
        if(loja[j].preco < media) {
            printf("%s", loja[j].nomeLoja);
            printf("%s", loja[j].endereco);
            printf("%s", loja[j].telefone);
        }
    }
    
    return 0;
}

