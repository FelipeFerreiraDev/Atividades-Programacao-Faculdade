
public class Main {
    static void printArray(Objeto vetObj[]){
        System.out.printf("");
        for (int i = 0; i < vetObj.length; i++) {

            if(i == vetObj.length - 1){
                System.out.printf("%d", vetObj[i].chave);
            }
            else if(i == 0) System.out.printf("%d|", vetObj[i].chave);
            else System.out.printf(" %d|",vetObj[i].chave);
        }
        System.out.printf("\n");
    }

    public static void main(String[] args) {
        BubbleSort bubble = new BubbleSort();
        InsertionSort insertion = new InsertionSort();
        SelectionSort selection = new SelectionSort();
        Objeto vetObj[] = new Objeto[10];

        int tam = 10;
        for (int i = 0; i < 10; i++){
            vetObj[i] = new Objeto(tam);
            tam--;
        }
        
        printArray(vetObj);
        bubble.bubbleSort(vetObj);
        //selection.selectionSort(vetObj);
        //insertion.insertionSort(vetObj);
        printArray(vetObj);
    }
}
