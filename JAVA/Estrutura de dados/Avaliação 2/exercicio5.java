public void cadastra(No p) {
    if(ultimo==0) {
        lista[primeiro] = p;
    }

    if(ultimo==0 || ultimo<(lista.length-1)) {
        ultimo++;
        lista[ultimo] = p;
    }

    anterior = ultimo-1;
    proximo = ultimo+1;
    
    if(ultimo == 0 ) {
        lista[ultimo].setAnterior(lista[anteriro]);
    } else if(ultimo<15) {
        lista[ultimo].setProximo(lista[proximo]);
    }
}

public void remove() {
    lista[ultimo] = null;
    ultimo--;
}