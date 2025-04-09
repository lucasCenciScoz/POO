const prompt = require('prompt-sync')();
// Modelo atributos e funções para a criação de um objeto
class Cliente {
    #nome; //atributo
    idade;
    cpf;
    agencia;

    getNome() {
        return this.#nome;
    }

    setNome(value) {
        this.#nome = value;
    }
}
//Objeto que possui as informacoes da classe de funções para a criação de um objeto
let cliente = new Cliente();

// cliente.#nome = prompt("digite o nome do cliente:");


cliente.setNome(prompt("digite o nome do cliente:"));// chamando a função
cliente.idade = 20;
cliente.cpf = "854.982.234.01";
cliente.agencia = 101010;

console.log(cliente);
console.log(cliente.getNome());