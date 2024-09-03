//Classe ProfessorCLt herda de professor
public class ProfessorClt extends Professor{
    double salarioMensal;//atributo salario

    //construtor de um clt
    public ProfessorClt(String nome,int id, double salarioMensal){
        super(nome,id,"CLT");//herda o construtor da superclasse
        this.salarioMensal = salarioMensal;//adiciona o valor do atributo salario mensal
    }

    //funçao que retorna o valor do salario de Clt
    public double calcularSalario(){
        return salarioMensal;
    }

    @Override
    public String toString(){//funçao herdada da super classe que ajuda na hora de printar o objeto
        return "O professor(a): " + this.nome + " é " + this.tipo  + " e recebe " + salarioMensal + " por mes";
    }

}
