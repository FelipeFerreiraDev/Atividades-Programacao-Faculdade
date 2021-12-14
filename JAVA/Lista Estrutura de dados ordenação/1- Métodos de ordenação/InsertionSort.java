public class InsertionSort {
  static void insertionSort(Objeto vetObj[]) {
        int n = vetObj.length;
        for (int j = 1; j < n; j++) {
            int key = vetObj[j].chave;
            int i = j - 1;
            while ((i > -1) && (vetObj[i].chave > key)) {
                vetObj[i + 1].chave = vetObj[i].chave;
                i--;
            }
            vetObj[i + 1].chave = key;
        }
    }
}