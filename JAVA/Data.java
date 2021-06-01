/*
*
*   GitHub: https://github.com/FelipeFerreiraDev/Prog-Faculdade
*
* 
*/


import java.util.Scanner;

class Data {
    int dia, mes, ano;
 
    Data() {
        dia = 1;
        mes = 1;
        ano = 2021;
    }   
    
    Data(int ano) {
        dia = 1;
        mes = 1;
        this.ano = ano;
    }
    
    Data(int ano, int mes, int dia) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }
    
    public String formatarData(String s) {
        return this.dia + s + this.mes + s + this.ano;
    }
}

class Main {
    public static void main(String[] args) {
        String s;
        
        Scanner ler = new Scanner(System.in);

        Data data = new Data();

        System.out.print("Digite um caractere / ou -: ");
        s=ler.nextLine();
        
        System.out.println(data.formatarData(s));
        
        Data data2 = new Data(2020);
	    System.out.println(data2.formatarData(s));

        Data data3 = new Data(01, 06, 2021);
	    System.out.println(data3.formatarData(s));
        
    }
}