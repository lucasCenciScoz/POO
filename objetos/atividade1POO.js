const prompt = require('prompt-sync')();

class Cliente {
    nome;
    idade;
    cpf;
    agencia;
}

let cliente = new Cliente();

cliente.nome = prompt("digite o nome do cliente:");
cliente.idade = 35;
cliente.cpf = "854.982.234.01";
cliente.agencia = 101010;

console.log(cliente);