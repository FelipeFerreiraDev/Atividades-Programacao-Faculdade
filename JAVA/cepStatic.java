/*
*
*   GitHub: https://github.com/FelipeFerreiraDev/Prog-Faculdade
*
* 
*/

class Frete {    
    public static double calcularFrete(String cep, double valor) {
        double newValue = 0.0;
        char firstCep = cep.charAt(0);

        if(firstCep == '1' || firstCep == '2' || firstCep == '3') {
            newValue = valor * 3 / 100;
            return newValue;
        } else if(firstCep == '4' || firstCep == '5') {
            newValue = valor * 4 / 100;
            return newValue;
        } else if(firstCep == '6') {
            newValue = valor * 4 / 100;
            return newValue;
        } else if(firstCep == '7') {
            newValue = valor * 5 / 100;
            return newValue;
        } else if(firstCep == '8' || firstCep == '9') {
            newValue = valor * 2 / 100;
            return newValue;
        } else {
            return newValue;
        }
    }
}

class Main {
    public static void main(String[] args) {
        System.out.print(Frete.calcularFrete("12345-000", 100.00));
    }
}
