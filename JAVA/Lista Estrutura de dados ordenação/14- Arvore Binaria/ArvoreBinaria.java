public class ArvoreBinaria {

    No raiz;

    public void insere(No n){
        if (raiz == null){
            raiz = n;
            System.out.println("Inserido na raiz");
        }
        else{
            No aux = raiz;
            while(aux!=null){
                if (n.getKey() > aux.getKey()){
                    No filhoDir = aux.getFilhoDireita();
                    if (filhoDir!=null){
                        aux = aux.getFilhoDireita();
                    }
                    else{
                        aux.setFilhoDireita(n);
                        n.setPai(aux);
                        aux=null;
                        System.out.println("Inserido no filho a direita");
                    }
                }
                else{
                    No filhoEsq = aux.getFilhoEsquerda();
                    if (filhoEsq!=null){
                        aux = aux.getFilhoEsquerda();
                    }
                    else{
                        aux.setFilhoEsquerda(n);
                        n.setPai(aux);
                        aux=null;
                        System.out.println("Inserido no filho a esquerda");
                    }
                }
            }
        }
    }

    public No search(int buscar){
        No aux = raiz;
        while(aux!=null){
            if (aux.getKey() == buscar)
                return aux;
            else if(buscar > aux.getKey()){
                aux = aux.getFilhoDireita();
            }
            else{
                aux = aux.getFilhoEsquerda();
            }
        }
        return null;
    }

    public void preOrdem(No root){
        if (root!=null){
            System.out.println(root.toString());
            preOrdem(root.getFilhoEsquerda());
            preOrdem(root.getFilhoDireita());
        }
    }

    public void posOrdem(No root){
        if (root!=null){
            posOrdem(root.getFilhoEsquerda());
            posOrdem(root.getFilhoDireita());
            System.out.println(root.toString());
        }
    }

    public void emOrdem(No root){
        if (root!=null){
            emOrdem(root.getFilhoEsquerda());
            System.out.println(root.toString());
            emOrdem(root.getFilhoDireita());
        }
    }
}