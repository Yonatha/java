package sparta.teste;

import sparta.model.Usuario;
import sparta.dao.UsuarioDao;
import sparta.exceptions.NonexistentEntityException;
import sparta.util.UsuarioLogado;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 *
 * @author yonatha
 */
public class TesteUsuario {

    public static void main(String[] args) throws UnsupportedEncodingException, NonexistentEntityException {

//        criar();
//        listar();
//        deletar();
        exibir(3);
//        login("yonatha.almeida", "123");
    }

    static void criar() {
        Usuario usuario1 = new Usuario();
        usuario1.setLogin("yonatha.almeida");
        usuario1.setNome("Fulano Sobrenome");
        usuario1.setSenha("123");
        UsuarioDao.getInstance().create(usuario1);
    }

    static void listar() {
        List<Usuario> usuarios = UsuarioDao.getInstance().findUsuarioEntities(10, 0);

        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println(usuarios.get(i).getNome());
        }
    }

    static void deletar() throws NonexistentEntityException {

        UsuarioDao ujpa = new UsuarioDao();
        ujpa.destroy(1);
    }

    static void exibir(int id) {
        UsuarioDao ujpa = new UsuarioDao();
        System.out.print(ujpa.findUsuario(id).getNome());
    }

    static void login(String login, String password) {

        if (UsuarioDao.getInstance().autenticar(login, password)) {
            System.out.print("Autenticado com sucesso");
        } else {
            System.out.print("Login e/ou senha inválido(s)");
        }
    }

    // Retorna qual usuário que esta logado no momento
    static void logado() {
        UsuarioLogado.getInstance().setID(1);
        UsuarioLogado.getInstance().setNome("Teste");

        System.out.println(UsuarioLogado.getInstance().getID());
        System.out.println(UsuarioLogado.getInstance().getNome());
    }
}
