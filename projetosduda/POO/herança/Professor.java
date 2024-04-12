import java.time.LocalDate;

public class Professor extends Aluno {
    private int AnoFormado; 

    public Professor(String nome, LocalDate nascimento, String apelido, int matricula, String curso, int AnoFormado) {
        super(nome, nascimento, apelido, matricula, curso);
        this.AnoFormado = AnoFormado;
    }

    @Override
    public String Saudacao(){
        return super.saudacao + "Eu sou, " + this.getNome() + "fiz curso de " + this.getCurso() + " e fui formado em " + this.getAnoFormado();
        }
}
