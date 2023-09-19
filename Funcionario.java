import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private String nome;
    private double salario;
    private int idade;

    public Funcionario(String nome, double salario, int idade) {
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public int getIdade() {
        return idade;
    }
    

    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Matheus", 65000, 22));
        funcionarios.add(new Funcionario("Guilherme", 40000, 25));
        funcionarios.add(new Funcionario("Rennan", 60000, 29));
        funcionarios.add(new Funcionario("Arthur", 65000, 32));

        System.out.println("Informe os funcionários que ganham mais de 50k por ano e menos de 30 anos de idade: ");

        for (Funcionario funcionario : funcionarios) {
            if(funcionario.getSalario() > 50000 && funcionario.getIdade() < 30){
                System.out.println(funcionario.getNome());
            }
        }

    }
    /* public static void main(String[] args) {
        // exemplo:
        Funcionario[] funcionarios = new Funcionario[3];

        funcionarios[0] = new Funcionario("Matheus", 60000, 20);
        funcionarios[1] = new Funcionario("Marina", 30000, 30);
        funcionarios[2] = new Funcionario("Bruna", 52000,36);
        
        System.out.println("Informe os funcionários que ganham mais de 50k por ano e menos de 30 anos de idade: ");
        
        for (int i = 0; i < funcionarios.length; i++) {
            Funcionario funcionario = funcionarios[i];
            if (funcionario != null && funcionario.getSalario() > 50000 && funcionario.getIdade() < 30) {
                System.out.println(funcionario.getNome());
            }
        }
        System.out.println("Fim.");
    }*/

    /*  private String nome;
    private double salario;
    private int idade;

    public Funcionario(String nome, double salario, int idade) {
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public int getIdade() {
        return idade;
    }
    

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", salario=" + salario + ", idade=" + idade + "]";
    }

    public static void main(String[] args) {
        // exemplo:
        Funcionario[] funcionarios = new Funcionario[3];

        funcionarios[0] = new Funcionario("Matheus", 60000, 20);
        funcionarios[1] = new Funcionario("Marina", 30000, 30);
        funcionarios[2] = new Funcionario("Bruna", 52000,36);
        
        System.out.println("Informe os funcionários que ganham mais de 50k por ano e menos de 30 anos de idade: ");
        
        for (int i = 0; i < funcionarios.length; i++) {
            Funcionario funcionario = funcionarios[i];
            if (funcionario != null && funcionario.getSalario() > 50000 && funcionario.getIdade() < 30) {
                System.out.println(funcionario.getNome());
            }
        }
        System.out.println("Fim.");
    }*/
    
}
