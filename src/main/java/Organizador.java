import java.util.HashMap;

public class Organizador {
    private HashMap<String, Pessoa> pessoas;

    public Organizador (){
        this.pessoas = new HashMap<>();
    }

    public void cadastrar(Pessoa usuario){
        this.pessoas.put(usuario.getNome(), usuario);
    }

    public Pessoa getPessoa (String nome){
        return pessoas.get(nome);
    }

    public HashMap<String, Pessoa> getPessoas() {
        return pessoas;
    }
}
