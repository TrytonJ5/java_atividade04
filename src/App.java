public class App {
    public static void main(String[] args) throws Exception {
        Professor lefundes = new ProfessorHorista("lefundes", 0,15, 10);
        Professor carlosEduardo = new ProfessorClt("carlos eduard", 0, 1412);
        Professor rafudo = new ProfessorClt("rafoncil", 2, 2300);

        GerenciadorProfessor lista = new GerenciadorProfessor();

        lista.cadastrarProfessor(lefundes);
        lista.cadastrarProfessor(rafudo);
        lista.cadastrarProfessor(carlosEduardo);

        lista.listarProfessores();
    }
}
