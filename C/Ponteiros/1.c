/******************************************************************************
Implemente um programa que leia trˆes n ́umeros x, y e z e ordene-os em ordem crescente. Para
resolver esse problema, utilize a estrat ́egia de assumir que algo  ́e verdade  ́e s ́o fazer alguma
coisa se estivermos errados. Utilize a fun ̧c ̃ao utilizando ponteiros troca (int *a, int *b){...}
implementada em aula, a qual realizava a troca de valores de duas vari ́aveis dadas.
*******************************************************************************/
#include <stdio.h>

void troca(int *a, int *b) {
    int aux = *a;
    *a = *b;
    *b = aux;
}

int main()
{
    int x, y, z;
    
    scanf("%d", &x);
    scanf("%d", &y);    
    scanf("%d", &z);
    
    if(x > y || x > z) {
        if(y < z) {
            troca(&x, &y);
        } else {
            troca(&x, &z);
        }
    }
    
    if (y > z) {
        troca(&y, &z);
    }
    
    printf("%d %d %d", x, y, z);
}

