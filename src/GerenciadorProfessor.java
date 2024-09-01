import java.util.ArrayList;

// classe para administrar a arraylist do tipo professor
public class GerenciadorProfessor {
    private ArrayList<Professor> professores;

    public GerenciadorProfessor(){
        professores = new ArrayList<>();
    }

    //metodo para adicionar um professor a arraylist
    public void cadastrarProfessor(Professor professor){
        if(buscarProfessor(professor.id) != null)
            System.out.println("Professor com id " + professor.id + " ja foi cadastrado, tente novamente");
        else
        professores.add(professor);
    }

    public void excluirProfessor(int id){
        //se o metodo buscar professor retornar nulo o professor com esse id nao existe
        if(buscarProfessor(id) == null)
            System.out.println("Não existe professor com esse id");
            //se encontrar ele vai ser apagado
        else
            professores.remove(buscarProfessor(id));
    }

    public Professor buscarProfessor(int id){
        //for para percorrer toda a array lista professores
        for(int i = 0; i < professores.size(); i++){
            //comparaçao de ids
            if(professores.get(i).id == id){
                //retorna o professor na posiçao encontrada
                return professores.get(i);
            }
        }
        return null;
    }

    public void listarProfessores(){
        for(int i = 0; i < professores.size(); i++){
            System.out.println(professores.get(i).toString());
        }
    }

    public void atualizarProfessor(int id, double salario){
        //comparaçao de ids
        if(buscarProfessor(id) != null){
            int posicao = professores.indexOf(buscarProfessor(id));

            Professor novoPorfessor = new ProfessorClt(professores.get(posicao).nome,professores.get(posicao).id , salario);
            professores.set(posicao, novoPorfessor);
            System.out.println(professores.get(posicao));
        }
    }

    public void atualizarProfessor(int id, double valorHora, int horasTrabalhadas){
        //comparaçao de ids
        if(buscarProfessor(id) != null){
            int posicao = professores.indexOf(buscarProfessor(id));
            Professor novoPorfessor = new ProfessorHorista(professores.get(posicao).nome,professores.get(posicao).id,valorHora,horasTrabalhadas);
            professores.set(posicao, novoPorfessor); 
            System.out.println(professores.get(posicao));
        }
    }
    

    // public double calcularSalarioCLT(int id){
    //     if(buscarProfessor(id) != null){
    //         if(professores.get(id).tipo == "CLt"){
    //             return professores.get(id).calcularSalario();
    //         }else if(professores.get(id).tipo == "Horista"){

    //             return professores.get(id).calcularSalario(331);
    //         }
    //         else{
    //             System.out.println("tipo invalido, tente novamente");
    //         }
    //     }
    // }

    // public double calcularSalarioHorista(int id, int horasTrabalhadas){

    // }
}