// criaçao da classe abstrata professor
public abstract class Professor {
    String nome;// atributo nome
    int id;// atribulo id
    String tipo;// atributo tipo (define o tipo do professor: clt ou horista)

    // metodo contrutor de um professor
    public Professor(String nome, int id, String tipo){
        this.nome = nome;//adiciona o valor a nome
        this.id = id;//adiciona o valor ao id
        this.tipo = tipo;//adiciona o valor ao tipo
    }

    public abstract double calcularSalario();//funçao abstrata

    public abstract String toString();//funçao abstrata
}