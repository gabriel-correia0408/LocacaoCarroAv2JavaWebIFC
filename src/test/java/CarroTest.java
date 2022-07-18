
import DAO.CarroDAO;
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
public class CarroTest {
     private CarroDAO dao = CarroDAO.getInstance();

    @Test
    public void getAll() {
        dao.getAll();
    }

    @Test
    public void inserirCarro() {
        Usuario usuario = UsuarioDAO.getInstance().getBydId(1);
        Carro carro = new Carro();
        carro.setUsuario(usuario);

        dao.insert(carro);
    }   
}
