public class SelectionSort {
  static void selectionSort(Objeto vetObj[]) {
        int n = vetObj.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (vetObj[j].chave < vetObj[min_idx].chave)
                    min_idx = j;
            int temp = vetObj[min_idx].chave;
            vetObj[min_idx].chave = vetObj[i].chave;
            vetObj[i].chave = temp;
        }
  }  
}