import java.time.LocalDate;
import java.util.Calendar;

public class Pessoa {
    private String nome;
    private int nascimento;
    public String apelido;
    public int idade;

    Calendar data = Calendar.getInstance();
    int anoatual = data.get(Calendar.YEAR);
    int hora = data.get(Calendar.HOUR_OF_DAY);

    public Pessoa(String nome, int nascimento, String apelido) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.apelido = apelido;

    }
    public String getnome() {
        return nome;
    }

    public int getnascimento() {
        return nascimento;

    }

    public String getapelido() {
        return apelido;
    }

    public int getidade() {
        return idade;
    }

    public String Calcidade() {
        this.idade = anoatual - this.nascimento;
        System.out.print("Eu tenho " + this.idade + " anos");

    }
    public String saudacao(){
        Sting msg;
        if (hora >= 5 && hora < 11) {
            msg = "Bom dia";
        } else if (hora >= 12 && hora < 18) {
            msg = "Boa tarde";
        } else if (hora >= 19 && hora < 23) {
            msg = "Boa noite";
        } else {
            msg = "vá dormir";
        }
        return "\n" + msg + "nome: " + this.nome() + "apelido: " + this.apelido + "/n";

    }
 



}