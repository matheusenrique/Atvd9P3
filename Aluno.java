import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private String matricula;
    private double notas;

    public Aluno(String nome, String matricula, double notas){
        this.nome = nome;
        this.matricula = matricula;
        this.notas =  notas;
    }

    public double calcularMedia(double[] notas){
        int soma = 0;
       for (double nota : notas) {
            soma += nota;
       }
       return soma / notas.size();
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[3];

        alunos[0] = new Aluno("Matheus", "01", new double[]{7.5 , 9.0 , 5.0});
        alunos[1] =  new Aluno("Rennan", "02", new double[]{7.0 , 6.0 , 10.0});
        alunos[2] = new Aluno("Guilherme", "03", new double[]{8.0 , 6.5 , 7.0});

        System.out.println("Aprovados: ");
        for (int i = 0; i < alunos.length; i++) {
            double media = alunos[i].calcularMedia(null);
            if(media >= 7){
                System.out.println(alunos[i].getNome());
            }
        }
        System.out.println("Reprovados: ");
        for (int i = 0; i < alunos.length; i++) {
            double media = alunos[i].calcularMedia(null);
            if(media < 7){
                System.out.println(alunos[i].getNome());
            }
        }

        
    }
    
}