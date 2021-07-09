/*import java.util.Scanner;
import java.lang.Math;

class Vagas {
    boolean livre;
    double hora;
    String placa;

    public void setLivre(boolean livre) {
      this.livre = livre;
    }

    public boolean getLivre() {
      return livre;
    }

    public void setHora(double hora) {
      this.hora = hora;
    }

    public double getHora() {
      return hora;
    }

    public void setPlaca(String placa) {
      this.placa = placa;
    }

    public String getPlaca() {
      return placa;
    }

    public void entrarCarro(boolean livre, double hora, String placa) {
      setLivre(livre);
      setHora(hora);
      setPlaca(placa);
    }

    public String saidaCarro() {
      boolean livre = getLivre();
      double hora = getHora();
      String placa = getPlaca();

      double total = Math.round(hora) * 5;

      return "O carro da placa " + placa + " ficou " + hora + " horas e deve pagar R$ " +  total;
    }
}

class Main {
    public static void main(String[] args) {
        int opc = 0;
        int sair = 0;
        double hora = 0.0;
        int n;
        String placa = "";

        Scanner ler = new Scanner(System.in);

        Vagas vaga[] = new Vagas[11];
        
        for(int i = 0; i<11; i++) {
          vaga[i] = new Vagas();
        }

        while(sair != 1) {

        System.out.print("\n\n*************** Escolha *******************\n");
        System.out.print("********** 1- Entrada de carro ************\n");
        System.out.print("********** 2- Retirada de carro ***********\n");
        System.out.print("********** 3- Encerrar Programa ***********\n");
        System.out.print("*******************************************\n");

        opc = ler.nextInt();

          switch(opc) {
            case 1:
              {
                for(int ultimo = 0; ultimo<11; ultimo++) {
                  if (ultimo > 11) {
                    System.out.print("Lotado");
                    ultimo = 0;
                    break;
                  } else if(vaga[ultimo].getPlaca() == null) {
                    System.out.print("Digite a placa do carro\n");
                    ler.nextLine();
                    placa = ler.nextLine();
                    System.out.print("A quantidade de horas\n");
                    hora = ler.nextDouble();
                    vaga[ultimo].entrarCarro(false, hora, placa);
                    System.out.print("Bem-Vindo\n");
                    ultimo++;
                    System.out.print("Estacione na vaga: "+ ultimo +"\n");
                    ultimo--;
                    System.out.print("Para sair pressione 1, para permanecer pressione qualquer tecla\n");
                    sair = ler.nextInt();

                    ultimo = 0;
                    break;
                  }
                }

              }
              break;
            case 2: {
              System.out.print("Digite a vaga que o carro estava\n");
              n = ler.nextInt();
                  if(vaga[n-1].getPlaca() != null) {
                    System.out.print(vaga[n-1].saidaCarro());
                    vaga[n-1] = new Vagas();
                  } else {
                    System.out.print("Impossível retirar o carro, a vaga está vazia");
                  }
              break;
            }
            case 3: {
              System.out.print("\n****************** ENCERRANDO PROGRAMA ****************\n");
              sair = 1;
              break;
            }
          }
        }
    }
}*/





import java.util.Scanner;
import java.lang.Math;

import java.text.SimpleDateFormat;
import java.util.Date;

class Vagas {
    boolean livre;
    String hora;
    String placa;

    public void setLivre(boolean livre) {
      this.livre = livre;
    }

    public boolean getLivre() {
      return livre;
    }

    public void setHora(String hora) {
      this.hora = hora;
    }

    public String getHora() {
      return hora;
    }

    public void setPlaca(String placa) {
      this.placa = placa;
    }

    public String getPlaca() {
      return placa;
    }

    public void entrarCarro(boolean livre, String placa) {
      setLivre(livre);
      Date data = new Date();
      SimpleDateFormat formatar = new SimpleDateFormat("k.m");
      setHora(formatar.format(data));
      setPlaca(placa);
    }

    public String saidaCarro() {
      Date data = new Date();
      SimpleDateFormat formatar = new SimpleDateFormat("k.m");
      String horaAtual = formatar.format(data);

      String hora = getHora();
      boolean livre = getLivre();
      String placa = getPlaca();

      double horasFicadas = Double.parseDouble(horaAtual) - Double.parseDouble(hora);
    
            System.out.print(hora + "\n");
            System.out.print(horaAtual + "\n");
            System.out.print(horasFicadas + "\n");


      double total =  Math.round(horasFicadas) * 5;

      if(total<0) {
        total = total * -1;
        horasFicadas = horasFicadas * -1;
      }
      else if (total <= 5) {
        total = 5.0;
      } 
      
      return "O carro da placa " + placa + " ficou " + Math.round(horasFicadas) + " horas e deve pagar R$" + total;
    }
}

class Main {
    public static void main(String[] args) {
        int opc = 0;
        int sair = 0;
        double hora = 0.0;
        int n;
        String placa = "";

        Scanner ler = new Scanner(System.in);

        Vagas vaga[] = new Vagas[11];
        
        for(int i = 0; i<11; i++) {
          vaga[i] = new Vagas();
        }

        while(sair != 1) {

        System.out.print("\n\n*************** Escolha *******************\n");
        System.out.print("********** 1- Entrada de carro ************\n");
        System.out.print("********** 2- Retirada de carro ***********\n");
        System.out.print("********** 3- Encerrar Programa ***********\n");
        System.out.print("*******************************************\n");

        opc = ler.nextInt();

          switch(opc) {
            case 1:
              {
                for(int ultimo = 0; ultimo<11; ultimo++) {
                  if (ultimo > 11) {
                    System.out.print("Lotado");
                    ultimo = 0;
                    break;
                  } else if(vaga[ultimo].getPlaca() == null) {
                    System.out.print("Digite a placa do carro\n");
                    ler.nextLine();
                    placa = ler.nextLine();
                    vaga[ultimo].entrarCarro(false, placa);
                    System.out.print("Bem-Vindo\n");
                    ultimo++;
                    System.out.print("Estacione na vaga: "+ ultimo +"\n");
                    ultimo--;
                    System.out.print("Para sair pressione 1, para ver as opções aperte qualquer tecla + enter \n");
                    sair = ler.nextInt();

                    ultimo = 0;
                    break;
                  }
                }

              }
              break;
            case 2: {
              System.out.print("Digite a vaga que o carro estava\n");
              n = ler.nextInt();
                  if(vaga[n-1].getPlaca() != null) {
                    System.out.print(vaga[n-1].saidaCarro());
                    vaga[n-1] = new Vagas();
                  } else {
                    System.out.print("Impossível retirar o carro, a vaga está vazia");
                  }
              break;
            }
            case 3: {
              System.out.print("\n****************** ENCERRANDO PROGRAMA ****************\n");
              sair = 1;
              break;
            }
          }
        }

    }
}