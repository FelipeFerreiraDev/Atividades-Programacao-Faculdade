/*
*   
*   Lista 2
*   
*   
*   
*
*   
*   
*/

#include <stdio.h>

#define MAX 100

struct cadAluno {
	char codAluno[30];
	char nome[500];
	int idade;
	int sexo;
	int nota;
};

struct cadDisciplina {
	char codDisciplina[25];
	char nomeDiscoplina[500];
};

int main()
{
    struct cadAluno aluno[MAX];
    int ext = 1, i = 0, masc = 0, fem = 0, media = 0, j = 0, soma = 0, maior = 0, somaIdadeN = 0, mediaIdadeN = 0, cont = 0;
    while (ext == 1 && i < 100) {
        fgets(aluno[i].codAluno, 30, stdin);
        fgets(aluno[i].nome, 500, stdin);
        scanf("%d", &aluno[i].idade);
        getchar();
        scanf("%d", &aluno[i].sexo);
        getchar();
        scanf("%d", &aluno[i].nota);
        getchar();
        printf("Digite 1 para cadastrar mais um ou digite qualquer valor para prosseguir: ");
        scanf("%d", &ext);
        getchar();
        if(aluno[i].sexo == 1) {
            masc++;
        } else {
            fem++;
        }
        soma += aluno[i].idade;
        if (aluno[i].nota >7.5) {
            somaIdadeN += aluno[i].idade;
            cont++;
        }
        i++;
        
    }
    
    mediaIdadeN = somaIdadeN / cont;
    media = soma / i;
    
    printf("%d homens\n", masc);
    printf("%d mulheres\n", fem);
    printf("%d anos em média\n", media);
    printf("%d anos pela nota 7,5\n", mediaIdadeN);
    
    return 0;
}

