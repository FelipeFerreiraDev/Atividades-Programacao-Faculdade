#include <stdio.h>
#include <stdlib.h>
#include <string.h>
struct voo {
   int numeroVoo;
   int totalLugares;
   int totalMarcados;
};

int buscaVoo(int op) {
   struct voo voos;
   FILE *arq;
   if((arq = fopen("voos.rec", "rb")) == NULL) {
      exit(1);
   }
   while(fread(&voos, sizeof(voos), 1, arq) == 1) {
      if(op == voos.numeroVoo){
         printf("Número do voo: %d\n", voos.numeroVoo);
         printf("Total de lugares: %d\n", voos.totalLugares);
         printf("Total de lugares marcados: %d\n\n", voos.totalMarcados);
      }
   }
}

int main() {
   FILE *arq;
   struct voo voos;
   int opc;
   
   if((arq = fopen("voos.rec", "wb")) == NULL) {
      exit(1);
   }

   printf("Digite o número do voo\n");
   scanf("%d", &voos.numeroVoo);
   while (voos.numeroVoo != 0) {
      printf("Digite o total de lugares\n");
      scanf("%d", &voos.totalLugares);
      printf("Digite o total de lugares marcados\n");
      scanf("%d", &voos.totalMarcados);
      getchar();
      printf("\n");

      fwrite(&voos, sizeof(voos), 1, arq);
         printf("Digite o número do voo\n");
      scanf("%d", &voos.numeroVoo);
   }
   fclose(arq);

   printf("Qual voo deseja buscar? ");
   scanf("%d", &opc);
   buscaVoo(opc);

   return 0;
}