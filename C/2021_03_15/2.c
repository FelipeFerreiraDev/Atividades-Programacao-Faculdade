/*******************************************************************************
*******************************************************************************/

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main()
{
    char **string;
    int i, j, caracteres = 0, vogais = 0;

    string = (char **) malloc(250 * sizeof(char *));  //Alocando Valor da Linha
    
    for (i = 0; i < 250; i++) {
        string[i] = (char *) malloc(250 * sizeof(int));  //Alocando Valor da coluna
    }


    printf("Digite a String: ");
    fgets(string, 250, stdin);
    
    caracteres=strlen(string)-1;
    
    free(string);
    
    printf("%d caracteres", caracteres);
    
    return 0;
}


