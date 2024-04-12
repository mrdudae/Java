import java.time.LocalDate;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;


    //construtor
   public Aluno(String nome, int nascimento, String apelido, int matricula, String curso) {    
    super(nome, nascimento, apelido);
       this.matricula = matricula;
      this.curso = curso;
  }

  @Override
  public String Saudacao(){
    return super.saudacao + "Eu sou matriculada em " + this.getMatricula() + " e estou cursando " + this.getCurso(); 
    
  }

   

}
