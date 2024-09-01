// criaçao da classe abstrata professor
public abstract class Professor {
    String nome;// atributo nome
    int id;// atribulo id
    String tipo;// atributo tipo (define o tipo do professor: clt ou horista)

    // metodo contrutor de um professor
    public Professor(String nome, int id, String tipo){
        this.nome = nome;
        this.id = id;
        this.tipo = tipo;
    }

    public abstract double calcularSalario();

    public abstract String toString();
}