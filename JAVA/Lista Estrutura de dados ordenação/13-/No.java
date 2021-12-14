No rotacaoEsquerda(No raiz) {
    No direita = raiz.getDireita();
    direita.setPai(raiz.getPai());
    raiz.setDireita(direita.getEsquerda());
    if (raiz.getDireita() != null) {
        raiz.getDireita().setPai(raiz);
    }
    direita.setEsquerda(raiz);
    inicial.setPai(direita);
    if (direita.getPai() != null) {
        if (direita.getPai().getDireita() == inicial) {
            direita.getPai().setDireita(direita);
            } else if (direita.getPai().getEsquerda() == inicial) {
                direita.getPai().setEsquerda(direita);
                }
                }
                setBalanceamento(raiz);
                setBalanceamento(direita);
                return direita;
}