/******************************************************************************
Retornar os pares até N
*******************************************************************************/

#include <stdio.h>

int retNaturais(int n) {
	if(n == -1) {
		return 0;
	}
	1 + retNaturais(n - 1);
	if(n%2==0)
    	printf("%d ", n);
}

int retNaturaisSig(int n) {
	if(n < 0 && n%2==0) {
		return retNaturais(n * -1);
	}
	return retNaturais(n);
}

int main()
{
    int i=0;
    
    scanf("%d", &i);
    retNaturais(i);

    return 0;
}

