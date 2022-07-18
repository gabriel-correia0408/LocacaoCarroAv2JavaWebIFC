/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Models.Usuario;
/**
 *
 * @author joao.chaicoski
 */
public class UsuarioDAO extends HibernateDAO<Usuario> {

    private static UsuarioDAO instance;

    public static UsuarioDAO getInstance() {
        if (instance == null) {
            instance = new UsuarioDAO();
        }
        return instance;
    }

    private UsuarioDAO(){}

    @Override
    protected Class<Usuario> getEntityClass() { return Usuario.class; }
}
