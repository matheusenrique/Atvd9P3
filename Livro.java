public class Livro {
    private String autor;
    private String titulo;
    private boolean disponivel;

    public Livro(String autor, String titulo,boolean disponivel){
        this.autor = autor;
        this.titulo = titulo;
        this.disponivel = disponivel;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public boolean verificarDisponibilidade(boolean disponivel){
        if(disponivel =  this.disponivel) {
            return false;
        }
        else{
            return true;
        }
    }

    public static void main(String[] args) {
        Livro livro =  new Livro("XXX", "XXX", false);
        Livro livro2 = new Livro("YYY", "YYY", true);

        System.out.println(livro2.verificarDisponibilidade());
    }
}
