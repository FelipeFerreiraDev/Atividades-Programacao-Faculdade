entrada = document.getElementById("inputEntrada");
final = document.getElementById("inputFinal");
inputTransaction = document.getElementById("inputTransiction");

estado = 0;
posicao = 0;

aceitacao = [1];
transicao = [[0,1],[1,0]];

function automato() {
  while(posicao < entrada.value.length) {
  imprimeCI(entrada.value, estado, posicao);
  elemento = entrada.value[posicao]
    estado = transicao[estado][Number(elemento)];
  posicao++;   
  }
  imprimeCI(entrada.value, estado, posicao);
  
  aceita = false;
 
  for(i in aceitacao) {
    if(estado==1){
      aceita=true
    } else {
      aceita=false
    }
  }
  
  if(aceita) {
    console.log("ACEITO");
     estado = 0;
     posicao = 0;
     entrada.value = "";
  } else {
     console.log("REJEITA");
     estado = 0;
     posicao = 0;
     entrada.value = "";
  }
}

function imprimeCI(e, est, posi){
  console.log(e.substring(0, posi)+"[q"+est+"]"+e.substring(posi))  
}

buttonExecute.addEventListener("click",() => {automato()});