/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.CarroDAO;
import DAO.UsuarioDAO;
import Models.Carro;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CarroServlet", urlPatterns = {"/Carro"})
public class CarroServlet extends HttpServlet {

    private final CarroDAO carroDao = CarroDAO.getInstance();
    private final UsuarioDAO usuarioDao = UsuarioDAO.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("usuarios", usuarioDao.getAll());
        getServletContext().getRequestDispatcher("/bookRegister.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Carro car = new Carro();
        car.setCor(req.getParameter("cor"));
        car.setMarca(req.getParameter("marca"));
        car.setPlaca(req.getParameter("placa"));
        car.setPortas(Integer.parseInt(req.getParameter("portas")));
        car.setPreco( Float.valueOf(req.getParameter("preco")));
        car.setUsuario(UsuarioDAO.getInstance().getBydId(Integer.parseInt(req.getParameter("usuario"))));
        carroDao.insert(car);
        getServletContext().getRequestDispatcher("/success.jsp").forward(req, resp);
    }
}