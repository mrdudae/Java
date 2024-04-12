import java.time.LocalDate;


public class Funcionario extends Pessoa {
    private int mtr;
    private String funcao;
    private float salario;
    
    public Funcionario(String nome, int nascimento, String apelido, int mtr, String funcao, double salario) {
        super(nome, nascimento, apelido);
        this.mtr = mtr;
        this.funcao = funcao;
        this.salario = salario;
    }


    @Override
    public String saudacao(){
   return super.saudacao + "Sou, " + this.getNome() + ", sou funcionaria" + this.getFuncao() + " e fui contratada em " + this.getMtr;
    }
}