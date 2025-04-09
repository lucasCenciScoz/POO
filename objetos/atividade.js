

const prompt = require('prompt-sync')();
// Modelo atributos e funções para a criação de um objeto
class TelefoneCelular {
    #marca;
    #modelo;
    #preco;
    #memoria;

    getDescricao(){
        return "marca:" + this.#marca + "\n modelo:" + this.#modelo + "\n preco:" + this.#preco + "\n memoria:" + this.#memoria ;
    }

    getMarca() {
        return this.#marca
    }
    setMarca(value) {
        this.#marca = value
    }

    getModelo() {
        return this.#modelo
    }
    setModelo(value) {
        this.#modelo = value
    }
    getPreco() {
        return this.#preco
    }
    setPreco(value) {
        this.#preco = value
    }
    getMemoria() {
        return this.#memoria
    }
    setMemoria(value) {
        this.#memoria = value
    }
}
//Objeto que possui as informacoes da classe de funções para a criação de um objeto
let telefone = new TelefoneCelular();

telefone.setMarca(prompt("digite a marca do telefone:"));
telefone.setModelo(prompt("digite o modelo do telefone:"));
telefone.setPreco(prompt("digite o preço do telefone:"));
telefone.setMemoria(prompt("digite a memoria do telefone:"));

console.log(telefone.getDescricao());
