#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int conta() {
    FILE *arq = fopen("teste.txt", "r");
    int caracteres = 0;
    char c;
    while ((c=getc(arq)) != EOF)
    {
        caracteres++;
    }
    return caracteres;
}

int main()
{   
    char str[conta()];
    FILE *arq = fopen("teste.txt", "r");
    int count = 0;    
    
    if (arq == NULL)
        exit(1);

    while (fgets(str, conta(), arq) != NULL)
    {
        count++;
        printf("%d:%s", count, str);
    }
    fclose(arq);
}