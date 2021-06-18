/*
*
*   GitHub: https://github.com/FelipeFerreiraDev/Prog-Faculdade
*
* 
*/

class CarroF1 {
    String equipe, fabricante, pneus, cor, piloto1, piloto2;
    float peso;
    
    void cadastra(String equipe, String fabricante, String pneus, String cor, String piloto1, String piloto2, float peso) {
        this.equipe = equipe;
        this.fabricante = fabricante;
        this.pneus = pneus;
        this.cor = cor;
        this.piloto1 = piloto1;
        this.piloto2 = piloto2;
        this.peso = peso;
    }
    
    String imprimeDados() {
        return " " + this.equipe + " " + this.fabricante + " " + this.pneus + " " + this.cor + " " + this.piloto1 + " " + this.piloto2 + " " + this.peso + "\n\n";
    }
}

class Main {
    public static int inserirDados(CarroF1 listaCarro[], CarroF1 carro1, int ponteiro)  { 
        if(ponteiro < listaCarro.length) {
            ponteiro++;
            listaCarro[ponteiro] = carro1;
            
            System.out.println("Ponteiro: " + ponteiro);
        } else {
            System.out.println("lista cheia\n\n");
        }
        return ponteiro;
    }

    public static int buscar(String equipe, CarroF1 listaCarro[], int ponteiro) {
        System.out.println("Buscando Carro\n");
        for (int i = 0; i <= ponteiro; i++) {
            if(listaCarro[i].equipe == equipe) {
                return i;
            }
        }
        return -1;
    }

    public static int removeElemento(String equipe, CarroF1 listaCarro[], int ponteiro) {
        int index = buscar(equipe, listaCarro, ponteiro);
        
        if(index == -1) {
            System.out.println("Não foi possivel remover\n");
            return ponteiro;
        }
        
        for (int i = index; i <= ponteiro ; i++) {
            if(i < (listaCarro.length)-1) {
                listaCarro[i] = listaCarro[i+1];
            }  
            if(i+1 == listaCarro.length) {
                listaCarro[i] = new CarroF1();
            }
        }
        System.out.println("\nCarro removido!\n");
        ponteiro = ponteiro - 1;

        return ponteiro;
    }

    public static void main(String[] args) {

      CarroF1 listaCarro[] = new CarroF1[11];

      int ponteiro = -1;

      for(int i = 0; i < listaCarro.length; i++) {
        listaCarro[i] = new CarroF1();
      }      

      CarroF1 carro1 = new CarroF1();
      carro1.cadastra("Mercedes", "Mercedes 1.6 V6", "Pirelli", "Prata", "Hamilton", "Bottas", 650);
      ponteiro = inserirDados(listaCarro, carro1, ponteiro);

      CarroF1 carro2 = new CarroF1();
      carro2.cadastra("Aston Martin", "Mercedes 1.6 V6", "Pirelli", "Verde", "Vettel", "Stroll", 655);
      ponteiro = inserirDados(listaCarro, carro2, ponteiro);

      CarroF1 carro3 = new CarroF1();
      carro3.cadastra("Mclaren", "Mercedes 1.6 V6", "Pirelli", "Amarelo", "Ricciardo", "Norris", 650);
      ponteiro = inserirDados(listaCarro, carro3, ponteiro);

      CarroF1 carro4 = new CarroF1();
      carro4.cadastra("Alpine", "Renault 1.6 V6", "Pirelli", "Preto", "Alonso", "Ocon", 645);
      ponteiro = inserirDados(listaCarro, carro4, ponteiro);

      CarroF1 carro5 = new CarroF1();
      carro5.cadastra("Hass", "Ferrari1.6 V6", "Pirelli", "Branco", "Schummacher", "Mazepin", 660);
      ponteiro = inserirDados(listaCarro, carro5, ponteiro);
      
      CarroF1 carro6 = new CarroF1();
      carro6.cadastra("Alpha Romeo", "Ferrari1.6 V6", "Pirelli", "Vermelho", "Raikkonen", "Giovinazzi", 640);
      ponteiro = inserirDados(listaCarro, carro6, ponteiro);

      CarroF1 carro7 = new CarroF1();
      carro7.cadastra("Alpha Tauri", "Honda 1.6 V6", "Pirelli", "Preto Branco", "Tsunoda", "Gasly", 640);
      ponteiro = inserirDados(listaCarro, carro7, ponteiro);

      CarroF1 carro8 = new CarroF1();
      carro8.cadastra("Williams", "Mercedes 1.6 V6", "Pirelli", "Azul Vermelho", "Russel", "Latifi", 640);
      ponteiro = inserirDados(listaCarro, carro8, ponteiro);
      
      CarroF1 carro9 = new CarroF1();
      carro9.cadastra("Red Bull", "Honda 1.6 V6", "Pirelli", "Preto Vermelho", "Verstappen", "Perez", 630);
      ponteiro = inserirDados(listaCarro, carro9, ponteiro);

      CarroF1 carro10 = new CarroF1();
      carro10.cadastra("Ferrari", "Ferrari 1.6 V6", "Pirelli", "Vermelho", "Sainz", "Leclerc", 630);
      ponteiro = inserirDados(listaCarro, carro10, ponteiro);

      int pont = buscar("Mclaren", listaCarro, ponteiro );
      System.out.println(listaCarro[pont].imprimeDados());


      removeElemento("Alpha Romeo", listaCarro, ponteiro);
        
      if(buscar("Alpha Romeo", listaCarro, ponteiro) == -1 ) {
          System.out.println("Essa equipe de corrida, não existe!!!\n");
      }
    }
}