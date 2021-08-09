entrada = document.getElementById("inputEntrada");
final = document.getElementById("inputFinal");
inputTransaction = document.getElementById("inputTransiction");

estado = 0;
posicao = 0;

//aceitacao = [1];

//transicao = [0,1][1,0];


function automato() {
  while(posicao < entrada.value.length) {
  imprimeCI(entrada.value, estado, posicao);
  elemento = entrada.value[posicao]
    
    if(estado == 0 && elemento == '0') {
      estado = 0;
    } else if(estado == 0 && elemento == '1') {
      estado = 1;
    } else if(estado == 1 && elemento == '0') {
      estado = 1;
    } else if(estado == 1 && elemento == '1') {
      estado = 0;
    }
    
  posicao++;   
  }
  imprimeCI(entrada.value, estado, posicao);
  
  if(estado == 1) {
    console.log("ACEITO");
     estado = 0;
     posicao = 0;
     entrada.value = "";
  } else if(estado == 0) {
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