import java.util.Scanner;

class Contas {
    private String nome;
    private int numeroConta;
    private int numeroAgencia;
    private double saldoConta;
    
    
    public void setNome(String nome) {
      this.nome = nome;
    }
    public String getNome() {
      return nome;
    }


    public void setNumeroConta(int numeroConta) {
      this.numeroConta = numeroConta;
    }
    public int getNumeroConta() {
      return numeroConta;
    }


    public void setNumeroAgencia(int numeroAgencia) {
      this.numeroAgencia = numeroAgencia;
    }
    public int getNumeroAgencia() {
      return numeroAgencia;
    }

    public void setSaldoConta(double saldoConta) {
      this.saldoConta = saldoConta;
    }
    public double getSaldoConta() {
      return saldoConta;
    }


    public void Cadastrar(String nome, int numeroConta, int numeroAgencia, double saldoConta) {
      setNome(nome);
      setNumeroConta(numeroConta);
      setNumeroAgencia(numeroAgencia);
      setSaldoConta(saldoConta);
    }


    public String Buscar() {
      String nome = getNome();
      int numeroConta = getNumeroConta();
      int numeroAgencia = getNumeroAgencia();
      double saldoConta = getSaldoConta();
  
      return "Nome do títular da conta: " + nome + "\n Número da conta: " + numeroConta + "\n Número da Agência: " + numeroAgencia + "\n Saldo da Conta: " + saldoConta;
    }

    public String Deposito(double qtd) {
      double saldoAtual = getSaldoConta();
      setSaldoConta(saldoAtual + qtd);

      double novoSaldo = getSaldoConta();

      return "Deposito realizado com sucesso!\nSaldo de :" +novoSaldo;
    }

    public String Saque(double qtd) {
      double saldoAtual = getSaldoConta();
      setSaldoConta(saldoAtual - qtd);

      double novoSaldo = getSaldoConta();

      return "Saque realizado com sucesso!\nSaldo restante de :" +novoSaldo;
    }
}
class Main {
    public static void main(String[] args) {
        int opc = 0;
        int sair = 0;
        String n = "";

        String nome = "";
        int numeroConta = 0, numeroAgencia = 0;
        double saldo = 0.0, adicionar = 0.0, sacar = 0.0;

        Scanner ler = new Scanner(System.in);
        Contas contas[] = new Contas[11];
        
        for(int i = 0; i<11; i++) {
          contas[i] = new Contas();
        }
        while(sair != 1) {
        System.out.print("\n\n*************** Escolha *******************\n");
        System.out.print("********** 1- Cadastrar conta ************\n");
        System.out.print("********** 2- Buscar contas ***********\n");
        System.out.print("********** 3- Depositar ***********\n");
        System.out.print("********** 4- Sacar ***********\n");
        System.out.print("********** 5- Encerrar Programa ***********\n");
        System.out.print("*******************************************\n");
        opc = ler.nextInt();
          switch(opc) {
            case 1:
              {
                for(int ultimo = 0; ultimo<11; ultimo++) {
                  
                    System.out.print("Digite o nome do proprietário da conta: ");
                    ler.nextLine();
                    nome = ler.nextLine();

                    System.out.print("\nNúmero da conta:");
                    numeroConta = ler.nextInt();
                    ler.nextLine();

                    System.out.print("\nNúmero da agência:");
                    numeroAgencia = ler.nextInt();
                    ler.nextLine();

                    System.out.print("\nSaldo:");
                    saldo = ler.nextDouble();
                    ler.nextLine();

                    contas[ultimo].Cadastrar(nome, numeroConta, numeroAgencia, saldo);

                    System.out.print("Para sair pressione 1, para permanecer pressione qualquer tecla\n");

                    sair = ler.nextInt();
                    ultimo = 0;
                    break;
                }
              }
              break;
            case 2: {
              System.out.print("Digite o nome de quem deseja buscar\n");
              ler.nextLine();
              n = ler.nextLine();
              for(int i=0; i<10; i++) {
                  if(contas[i].getNome().equals(n)) {
                    System.out.print(contas[i].Buscar());
                    break;
                  }
              }
              break;
            }
            case 3: {
              System.out.print("Digite o nome de quem deseja depositar\n");
              ler.nextLine();
              n = ler.nextLine();
              for(int i=0; i<10; i++) {
                if(contas[i].getNome().equals(n)) {
                    System.out.print("Digite a quantidade para depositar: ");
                    adicionar = ler.nextDouble();
                    System.out.print(contas[i].Deposito(adicionar));
                  }
              }
              break;
            }
            case 4: {
              System.out.print("Digite o nome de quem deseja sacar\n");
              ler.nextLine();
              n = ler.nextLine();
                  for(int i = 0; i<10; i++) {
                    if(contas[i].getNome().equals(n)) {
                    System.out.print("Digite a quantidade para Sacar: ");
                    sacar = ler.nextDouble();
                      if(contas[i].getSaldoConta()<sacar) {
                      System.out.print("A quantidade na conta é menor que o valor digitado!");
                      } else {
                        contas[i].Saque(sacar);
                      }
                    } 
                  }
              break;
            }
            case 5: {
              System.out.print("\n****************** ENCERRANDO PROGRAMA ****************\n");
              sair = 1;
              break;
            }
          }
        }
    }
}