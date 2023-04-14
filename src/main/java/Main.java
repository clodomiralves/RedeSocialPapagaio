import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Organizador bigBrother = new Organizador();
        String opcao = "0";

        do {
            opcao = JOptionPane.showInputDialog("""
                    Digite 1 para criar uma conta
                    Digite 2 para ver o mural
                    Digite 3 para exibir todos os usuários cadastrados
                    
                    Digite 6 para sair
                    """);
// FSDGDFGHFGHFGJGHJKJIPUUIOJK
            switch (opcao) {
                case "1":
                    String nome = JOptionPane.showInputDialog("Digite seu nome ");
                    Pessoa usuario = new Pessoa(nome);
                    bigBrother.cadastrar(usuario);
                    break;
                case "2":
                case "3":
                    for (Pessoa p: bigBrother.getPessoas().values()){
                        System.out.println(p.getNome());
                    }

            }
        }while (!opcao.equals("6"));

    }
}