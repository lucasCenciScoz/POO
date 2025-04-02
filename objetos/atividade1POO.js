const prompt = require('prompt-sync')();
// Modelo atributos e funções para a criação de um objeto
class Cliente {
    nome;
    idade;
    cpf;
    agencia;
}
//Objeto que possui as informacoes da classe de funções para a criação de um objeto
let cliente = new Cliente();

cliente.nome = prompt("digite o nome do cliente:");
cliente.idade = 20;
cliente.cpf = "854.982.234.01";
cliente.agencia = 101010;

console.log(cliente);
