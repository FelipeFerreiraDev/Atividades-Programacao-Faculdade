#include <stdio.h>
#include <string.h>

char * inverte( char * str )
{
    int length = strlen(str) ;
    int contador, i = 0, j;

    for (j=length-1; i < j; i++, j--)
    {
        contador = str[i];
        str[i] = str[j];
        str[j] = contador;
    }
    return str;
}


int main( void )
{
    char str[] = "Teste Testando Testado";

    printf("%s\n", inverte(str));

    return 0;
}
