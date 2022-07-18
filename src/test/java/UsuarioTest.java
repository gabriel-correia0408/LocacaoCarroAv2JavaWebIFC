
import DAO.UsuarioDAO;
import Models.Carro;
import Models.Usuario;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joao.chaicoski
 */
public class UsuarioTest {
     private UsuarioDAO dao = UsuarioDAO.getInstance();

    @Test
    public void getAll() {
        dao.getAll();
    }

    @Test
    public void inserirCarro() {
        Usuario usuario = new Usuario();
        usuario.setNome("João");
        dao.insert(usuario);
    }   
}
