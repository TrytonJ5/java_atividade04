//Classe ProfessorHorista herda de professor
public class ProfessorHorista extends Professor{
    double valorHora;//atributo sobre o valor das horas trabalhadas
    int horasTrabalhadas;

    // construtor de professor horista
    public ProfessorHorista(String nome,int id,double valorHora,int horasTrabalhadas){
        super(nome, id, "Horista");
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    // metodo que recebe as horas trabalhadas e retorna o salario mensal
    public double calcularSalario(){
        double salario = this.horasTrabalhadas * this.valorHora;
        return salario;
    }

    @Override
    public String toString(){
        return "O professor(a): " + this.nome + " é " + this.tipo + " e recebe " + this.valorHora + " por hora trabalhada";
    }

}