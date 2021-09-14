public void troca(No elN1, No elN2) {
    No antN1 = elN1.getAnterior();
    No proxN1 = elN1.getProximo();
    No antN2 = elN1.getAnterior();
    No proxN2 = elN1.getProximo();

    antN1.setProximo(elN2);
    elN2.setAnterior(antN1);
    antN2.setProximo(elN1);
    elN1.setAnterior(antN2);
    antN1.setProximo(elN2);
    elN2.setAnterior(proxN1);
    antN2.setProximo(elN1);
    elN1.setAnterior(proxN2);
}