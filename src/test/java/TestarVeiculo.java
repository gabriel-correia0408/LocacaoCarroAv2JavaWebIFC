
import Models.Veiculo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joao.chaicoski
 */
public class TestarVeiculo {
    public static void main(String[] args) {

 Veiculo v = new Veiculo("","","",0f);
 EntityManagerFactory emf = Persistence.createEntityManagerFactory("meuPU");
 EntityManager em = emf.createEntityManager();

 EntityTransaction tx = em.getTransaction();

 tx.begin();
 em.persist(v);
 tx.commit();
 Veiculo a = em.createQuery("from Veiculo", Veiculo.class)
 .getSingleResult();
 System.out.println(a);

 em.close();
 }
}
