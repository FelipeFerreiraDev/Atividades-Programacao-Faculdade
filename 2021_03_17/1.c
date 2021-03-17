#include<stdio.h>
#include<stdlib.h>

typedef struct bancoDeDados {
	int numeroConta;
	int codigoCli;
	int dataVenc;
	int dataPag;
	int valorConta;
	int juros;
} contas;

void InsereContas(contas *conta, int quant) {
	for(int i = 0; i < quant; i++) {
	    printf("Digite o número da conta: ");
		scanf("%d", &conta[i].numeroConta);
	    printf("Digite o código do cliente: ");
		scanf("%d", &conta[i].codigoCli);
	    printf("Digite o dia da data do pagamento: ");
		scanf("%d", &conta[i].dataPag);
		printf("Digite o dia da data do vencimento: ");
		scanf("%d", &conta[i].dataVenc);
      	printf("Digite o valor da conta: ");
		scanf("%d", &conta[i].valorConta);
		if(conta[i].dataPag>conta[i].dataVenc) {
		    conta[i].juros = 0.4 * (conta[i].dataPag - conta[i].dataVenc) * conta[i].valorConta;
		    printf("Com o juros a conta é de %d\n\n", conta[i].juros);
		    conta[i].valorConta=conta[i].juros;
		} else {
		    printf("Não possui juros\n\n");
		}
  	}
}

int buscaConta(int cod, contas *conta, int quant) {
	for(int i=0; i< quant; i++) {
		if (cod == conta[i].numeroConta) {
			    printf("Número da conta : %d\n", conta[i].numeroConta);
                printf("Código do cliente : %d\n", conta[i].codigoCli);
                printf("Data pagamento : %d\n", conta[i].dataPag);
                printf("Data Vencimento : %d\n", conta[i].dataVenc);
                printf("Valor da conta : %d\n", conta[i].valorConta);
                printf("\n\n\n");
		}
	}
	return 0;
}

void exibeContas (contas conta) {
    int total;
    printf("Número da conta : %d\n", conta.numeroConta);
    printf("Código do cliente : %d\n", conta.codigoCli);
    printf("Data pagamento : %d\n", conta.dataPag);
    printf("Data Vencimento : %d\n", conta.dataVenc);
    printf("Valor da conta : %d", conta.valorConta);
    printf("\n\n");
    total+=conta.valorConta;
    printf("O valor total a receber é de: %d\n\n", total);
}

int bomPagador(int cod, contas *conta, int quant) {
	for(int i=0; i< quant; i++) {
		if (cod == conta[i].codigoCli) {
			    if(conta[i].dataVenc<conta[i].dataPag)
			        return 0;
			    else
			        return 1;
		}
	}
}

void exibirStatusCliente(contas conta) {
    printf("cliente %d -----", conta.codigoCli);
    if(conta.dataVenc>conta.dataPag)
        printf("Bom Pagador \n\n");
    else
        printf("Mal pagador \n\n");
}
int main() {
	contas *conta;
   	int i, quant, codigo, resultado;
   	
   	printf("Digite quantas contas deseja cadastrar: ");
   	scanf("%d",&quant);
   	
   	conta = (contas *) malloc (quant * sizeof(contas));
   	
   	if (conta == NULL) 
   		exit(1);
   		
   	InsereContas(conta, quant);
   	
   	printf("Contas cadastradas: \n");
   	for(i=0; i < quant; i++)
      	exibeContas(conta[i]);
      	
	printf("Digite o número da conta para pesquisar: \n");
	scanf("%d", &codigo);
	buscaConta(codigo, conta, quant);
	
	printf("Verificar se o pagador pagou em dia\n");
	printf("Digite o código do usuario para pesquisar: \n");
	scanf("%d", &codigo);
	 	resultado = bomPagador(codigo, conta, quant);
      	if(resultado == 1)
      	    printf("1 --- bom pagador\n\n");
      	else
      	    printf("0 --- mal pagador\n\n");
      	    
	   	printf("Contas cadastradas: \n");
   	    for(i=0; i < quant; i++)
          	exibirStatusCliente(conta[i]);
      	
	free(conta);
  return 0;
}
