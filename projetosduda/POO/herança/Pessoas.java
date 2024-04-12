public class Pessoas {

    public static void main(String[] args) {
        Aluno jose = new Aluno("Jose", 2000, "jose", 2019, "Ciência da Computação");
        jose.setapelido("Jose");
        System.out.println(jose.saudacao());

        Professor mozean = new Professor("mozean", 2000, "mozao", 2019, "Ciência da Computação", 2020);
        josefina.setapelido("mozao");
        System.out.println(mozean.Saudacao());

        Funcionario humberto = new Funcionario("humberto", 2000, "bebeto", 2019, "Ciência da Computação", 2020);
        josefina.setapelido("Josefina");
        System.out.println(josefina.Saudacao());

        Pessoa wendel = new Pessoa("wendel", 2000, "wn");
        josefina.setapelido("wn");
        System.out.println(wendel.saudacao());
    }

}
