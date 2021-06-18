/*
*
*   GitHub: https://github.com/FelipeFerreiraDev/Prog-Faculdade
*
* 
*/

class Retangulo {
    private int lado1, lado2;

    public void RetanguloVazio() {
      lado1 = 0;
      lado2 = 0;
    }

    public void Retangulo(int lado1, int lado2) {
      this.lado1 = lado1;
      this.lado2 = lado2;
    }

    public void setLado1(int lado1) {
      this.lado1 = lado1;
    }

    public void setLado2(int lado2) {
      this.lado2 = lado2;
    }

    public int getLado1() {
      return lado1;
    }

    public int getLado2() {
      return lado2;
    }

    public boolean verificarIgualdade(Retangulo r) {
      if(r.lado1 == r.lado2) {
        return true;
      } else {
        return false;
      }
    }
}

class Main {
    public static void main(String[] args) {
      Retangulo r1 = new Retangulo();
      Retangulo r2 = new Retangulo();
      Retangulo r3 = new Retangulo();
      
      r1.setLado1(5);
      r1.setLado2(1);
      System.out.print(r1.getLado1()+"\n");
      System.out.print(r1.getLado2()+"\n");

      System.out.print(r1.verificarIgualdade(r1)+"\n");    

      r2.setLado1(8);
      r2.setLado2(8);
      System.out.print(r2.getLado1()+"\n");
      System.out.print(r2.getLado2()+"\n");

      System.out.print(r2.verificarIgualdade(r2)+"\n");    

      System.out.print(r3.getLado1()+"\n");
      System.out.print(r3.getLado2()+"\n"); 

    }
}