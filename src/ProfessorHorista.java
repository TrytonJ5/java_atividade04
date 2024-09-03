//Classe ProfessorHorista herda de professor
public class ProfessorHorista extends Professor{
    double valorHora;//atributo sobre o valor das horas trabalhadas
    int horasTrabalhadas;//atributo sobre as horas trabalhadas

    // construtor de professor horista
    public ProfessorHorista(String nome,int id,double valorHora,int horasTrabalhadas){
        super(nome, id, "Horista");//herda o construtor da superclasse
        this.valorHora = valorHora;//adiciona o valor da hora
        this.horasTrabalhadas = horasTrabalhadas;//adiciona as horas trabalhadas
    }

    // metodo que retorna o salario mensal de Horista
    public double calcularSalario(){
        double salario = this.horasTrabalhadas * this.valorHora;
        return salario;
    }

    @Override
    public String toString(){//funçao herdada da super classe que ajuda na hora de printar o objeto
        return "O professor(a): " + this.nome + " é " + this.tipo + " e recebe " + this.valorHora + " por hora trabalhada";
    }

}