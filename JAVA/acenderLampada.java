/*
*
*   GitHub: https://github.com/FelipeFerreiraDev/Prog-Faculdade
*
* 
*/

class Lampada {
    boolean acesa;
    
    void acender(){
        acesa = true;
    }
    
    void apagar(){
        acesa = false;  
    }
    
    void MostrarEstado() {
        if(acesa) {
            System.out.printf("A lampada está acesa");
        } else {
            System.out.printf("A lampada está apagada");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.acender();
        lampada.MostrarEstado();
    }
}
