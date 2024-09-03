import java.util.ArrayList;


public class GerenciadorProfessor {// classe para administrar a arraylist do tipo professor
    private ArrayList<Professor> professores;//atributo arraylist

    public GerenciadorProfessor(){
        professores = new ArrayList<>();//construtor que nao recebe parametro
    }

    //metodo para adicionar um professor a arraylist
    public void cadastrarProfessor(Professor professor){
        //se o professor ja existe na lista o usuario é avisado
        if(buscarProfessor(professor.id) != null)
            System.out.println("Professor com id " + professor.id + " ja foi cadastrado, tente novamente");
        else
            //se não for encontrado o mesmo id entao é adicionado na arraylist
            professores.add(professor);
    }

    public void excluirProfessor(int id){
        if(buscarProfessor(id) == null)//se o metodo buscar professor retornar nulo o professor com esse id nao existe
            System.out.println("Não existe professor com esse id");
        else//se encontrar ele vai ser apagado
            professores.remove(buscarProfessor(id));
    }

    public Professor buscarProfessor(int id){
        for(int i = 0; i < professores.size(); i++){//percorre toda a array lista professores
            if(professores.get(i).id == id){//comparaçao de ids
                return professores.get(i);//retorna o professor na posiçao encontrada
            }
        }
        return null;//retorna nulo se nao achou
    }

    public void listarProfessores(){
        //funçao que vai percorrer toda arraylist
        for(int i = 0; i < professores.size(); i++){
            System.out.println(professores.get(i).toString());//exibir o metodo ToString de cada um objeto
        }
    }

    public void atualizarProfessor(int id, double salario){
        if(buscarProfessor(id) != null){//vai procurar se existe realmente esse objeto
            int posicao = professores.indexOf(buscarProfessor(id));//consegue o indice de onde o objeto encontrado esta na arraylist 
            Professor novoPorfessor = new ProfessorClt(professores.get(posicao).nome,professores.get(posicao).id , salario); //cria um novo objeto so que de outro tipo
            professores.set(posicao, novoPorfessor);//troca o objeto existente pelo novo
            System.out.println(professores.get(posicao));//printa oq esta na nova posiçao
        }
    }

    public void atualizarProfessor(int id, double valorHora, int horasTrabalhadas){

        if(buscarProfessor(id) != null){
            int posicao = professores.indexOf(buscarProfessor(id));
            Professor novoPorfessor = new ProfessorHorista(professores.get(posicao).nome,professores.get(posicao).id,valorHora,horasTrabalhadas);
            professores.set(posicao, novoPorfessor); 
            System.out.println(professores.get(posicao));
        }
    }
    

    public void exibirSalario(int id){
        if(buscarProfessor(id) != null){
            double salario = buscarProfessor(id).calcularSalario();
            System.out.println("usuario de id: " + id + " tem o salario mensal de " + salario);
        }else
            System.out.println("usuario de id: " + id + " não foi encotrado");
    }
}