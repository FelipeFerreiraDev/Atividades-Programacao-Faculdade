public class BubbleSort {
  void bubbleSort(Objeto vetObj[]) {
        for (int i = 0; i < vetObj.length - 1; i++) {
            for (int j = 0; j < vetObj.length - 1 - i; j++) {
                if (vetObj[j].chave > vetObj[j + 1].chave) {
                    int aux = vetObj[j].chave;
                    vetObj[j].chave = vetObj[j + 1].chave;
                    vetObj[j + 1].chave = aux;
                }
            }
        }
    }  
}