//Classe ProfessorCLt herda de professor
public class ProfessorClt extends Professor{
    double salarioMensal;//atributo salario

    //construtor de um clt
    public ProfessorClt(String nome,int id, double salarioMensal){
        super(nome,id,"CLT");
        this.salarioMensal = salarioMensal;
    }

    //funçao que retorna o valor do salario
    public double calcularSalario(){
        return salarioMensal;
    }

    @Override
    public String toString(){
        return "O professor(a): " + this.nome + " é " + this.tipo  + " e recebe " + salarioMensal + " por mes";
    }

}
