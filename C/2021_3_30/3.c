/******************************************************************************
Converter N para Binario

*******************************************************************************/

#include <stdio.h>

void binario(int n) {
	int nBits = 1;
	int m = n;
	while(m > 1) {   /* Calcula quantidade de bits do numero n*/
		nBits++;
		m /= 2;
	}

	int * interna(int n, int i, int * vet) {
		if(n < 2) {
			vet[i] = n;
			return vet;
		}
		vet[i] = (n % 2);
		return interna(n / 2, i + 1, vet);
	}

	int i = 0;
	int v[nBits];
	int * vetor = interna(n, i, v);

	int j;
	for(j = nBits - 1; j >= 0; j--) {
		printf("%d",vetor[j]);
	}
}

int main()
{
    int i=0;
    
    scanf("%d", &i);
    binario(i);

    return 0;
}

