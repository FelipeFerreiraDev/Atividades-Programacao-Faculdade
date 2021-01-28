/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>
#include <string.h>


  struct tipo_carro
  {
    char tipo[100];
    char placa[100];
  } Carro[100];
  
  
    struct cad_cliente
  {
    int id;
    char placa[100];
  } Cliente[100];




int
main ()
{

  int sair = 1, cont = 0, contA = 0, i = 0, j = 0, contador = 0;


  while (sair == 1)
    {
      printf
	("Digite o tipo do veiculo preferencialmente sem acento e letra minuscula: ");
      fflush(stdin);
      scanf ("%s", Carro[cont].tipo);
      printf ("Digite a placa do veiculo: ");
      fflush(stdin);
      scanf ("%s", Carro[cont].placa);
      printf
	("\n*****************************************************************************************\n");
      printf
	("Para continuar cadastrando mais uma locação digite 1, para ver as outras opções digite 0\n");
      scanf ("%d", &sair);
      printf
	("\n*****************************************************************************************\n");
	cont++;
    }

  sair = 1;

    while (sair == 1)
    {
      printf
	("Digite o Id do cliente: ");
      fflush(stdin);
      scanf ("%d", &Cliente[contA].id);
      printf ("Digite a placa do veiculo: ");
      fflush(stdin);
      scanf ("%s", Cliente[contA].placa);
      printf
	("\n*****************************************************************************************\n");
      printf
	("Para continuar cadastrando mais um cliente digite 1, para ver as outras opções digite 0\n");
      scanf ("%d", &sair);
      printf
	("\n*****************************************************************************************\n");
	cont++;
    }
    
    for(i; i < cont; i++)
    {
        if(strcmp(Carro[i].tipo, "luxo") == 0)
        {
            for(j; j<cont; j++){
                if(strcmp(Carro[i].tipo, Carro[j].tipo) == 0){
                    contador++;
                    if(contador>=10){
                        printf("%s ", Carro[i].placa);
                    }
                }
            }
        // Aqui será ativado quando encontrar um carro de luxo
        // Então basta fazer `carro[i].placa` para acessar a placa
        }
}
  return 0;
}
 
