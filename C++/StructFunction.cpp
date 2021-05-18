/******************************************************************************
 * 
 * https://github.com/FelipeFerreiraDev/Prog-Faculdade
 * 
 * C++
*******************************************************************************/

#include <iostream>

using namespace std;

struct Data {
    int dia;
    int mes;
    int ano;
    
    int mostrar() {
        cout << "Dia: "<< dia << "\n";
        cout<<"Mês: "<< mes <<"\n";
        cout<<"Ano: "<< ano <<"\n";
    }
};

int main()
{
    struct Data data;    
    cin >> data.dia;
    cin >> data.mes;
    cin >> data.ano;
    
    data.mostrar();
    
    return 0;
}
