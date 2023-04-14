import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private ArrayList<String> postagens;
    private ArrayList<Pessoa> seguidores;

    public Pessoa (String nome){
        this.nome = nome;
    }
    public void postar (String postagem){
        postagens.add(postagem);
    }
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

