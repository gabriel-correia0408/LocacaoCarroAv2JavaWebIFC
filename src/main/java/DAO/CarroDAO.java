/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Models.Carro;
/**
 *
 * @author joao.chaicoski
 */
public class CarroDAO extends HibernateDAO<Carro> {

    private static CarroDAO instance;

    public static CarroDAO getInstance() {
        if (instance == null) {
            instance = new CarroDAO();
        }
        return instance;
    }

    private CarroDAO(){}

    @Override
    protected Class<Carro> getEntityClass() { return Carro.class; }
    
}
