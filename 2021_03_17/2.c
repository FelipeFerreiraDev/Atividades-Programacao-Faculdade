#include<stdio.h>
#include<stdlib.h>

typedef struct bancoDeDados {
	int numMatricula;
	char nome[100];
	int opcInscricao;
	int escola;
	int valor;
} inscricoes;

void InsereInscricoes(inscricoes *inscricao, int quant) {
	for(int i = 0; i < quant; i++) {
	    printf("Digite o número da matricula: ");
		scanf("%d", &inscricao[i].numMatricula);
		getchar();
        printf("Digite o nome do aluno: ");
      	fgets(inscricao[i].nome, 100, stdin);
		printf("Tipos de inscrição:\n");
		printf("1- inscrição + 1 minicurso: R$50,00\n");
		printf("2- inscrição + 2 minicurso: R$65,00\n");
		printf("3- inscrição + 3 minicurso: R$80,00\n");
		printf("4- inscrição + participação em todos: R$100,00\n");
		printf("Digite um número correspondente: \n");
		scanf("%d", &inscricao[i].opcInscricao);
		printf("\nDigite 1 se for aluno de escola pública e 0 caso não for: ");
		scanf("%d", &inscricao[i].escola);
		if(inscricao[i].opcInscricao == 1) {
		    inscricao[i].valor = 50;
		    if(inscricao[i].escola == 1) {
		        inscricao[i].valor = 50-50*0.3;
		    }
		} else if (inscricao[i].opcInscricao == 2) {
		    inscricao[i].valor = 65;
		    if(inscricao[i].escola == 1) {
		        inscricao[i].valor = 65-65*0.3;
		    }
		} else if (inscricao[i].opcInscricao == 3) {
		    inscricao[i].valor = 80;
		    if(inscricao[i].escola == 1) {
		        inscricao[i].valor = 80-80*0.3;
		    }
		} else {
		    inscricao[i].valor = 100;
		    if(inscricao[i].escola == 1) {
		        inscricao[i].valor = 100-100*0.3;
		    }
		}
  	}
}

int exibeInscricao(inscricoes *inscricao, int quant) {
    int total = 0;
	for(int i=0; i< quant; i++) {
		total+=inscricao[i].valor;
	}
	return printf("O total arrecadaddo é de %d\n\n", total);
}

void totalAlunos(inscricoes *inscricao, int quant) {
        int opcA = 0, opcB = 0, opcC = 0, opcD = 0, opcE = 0;
    	for(int i=0; i< quant; i++) {
    		if (1 == inscricao[i].opcInscricao) {
    		    opcA++;
    		} else if (2 == inscricao[i].opcInscricao) {
    		    opcB++;
    		} else if (3 == inscricao[i].opcInscricao) {
    		    opcC++;
    		} else if (4 == inscricao[i].opcInscricao) {
    		    opcD++;
    		} else {
    		    opcE++;
    		}
    	}
    	
    	printf("%d para a opcão de inscrição 1\n", opcA);
    	printf("%d para a opcão de inscrição 2\n", opcB);
    	printf("%d para a opcão de inscrição 3\n", opcC);
    	printf("%d para a opcão de inscrição 4\n", opcD);
        printf("%d para a opcões não correspondentes\n", opcE);
}

int main() {
	inscricoes *inscricao;
   	int i, quant, codigo, resultado;
   	
   	printf("Digite quantas inscrições deseja cadastrar: ");
   	scanf("%d",&quant);
   	
   	inscricao = (inscricoes *) malloc (quant * sizeof(inscricoes));
   	
   	if (inscricao == NULL) 
   		exit(1);
   		
   	InsereInscricoes(inscricao, quant);
   	
    exibeInscricao(inscricao, quant);
    
    totalAlunos(inscricao, quant);
    
      	
	free(inscricao);
  return 0;
}
