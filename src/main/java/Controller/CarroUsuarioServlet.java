
import DAO.UsuarioDAO;
import Models.Usuario;
import Models.Carro;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "CarroUsuarioServlet", value = "/CarroUsuario")
public class CarroUsuarioServlet extends HttpServlet {

    private final UsuarioDAO usuarioDao = UsuarioDAO.getInstance();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        List<Usuario> usuarios = usuarioDao.getAll();

        PrintWriter out = response.getWriter();
        out.println("<html><body>");

        for (Usuario usuario : usuarios) {
            out.println("<h1> Usuario: " + usuario.getNome() + "</h1>");
            out.println("<h2> Carros: </h2>");
            for (Carro carro : usuario.getCarros()) {
                out.println("<h3>" + carro.getMarca() +" "+ carro.getCor() +" "+ carro.getPlaca()+ "</h3>");
            }
        }

        out.println("</body></html>");
    }
}