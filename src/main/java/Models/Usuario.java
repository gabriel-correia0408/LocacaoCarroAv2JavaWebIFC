/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author joao.chaicoski
 */
@Entity
@Table(name = "usuario")
public class Usuario extends BaseEntity{
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "admin")
    private boolean admin;
    @OneToMany(mappedBy="usuario", cascade = CascadeType.ALL)
    private Set<Carro> carros = new HashSet<>();

    public Usuario(String nome, boolean admin) {;
        this.nome = nome;
        this.admin = admin;
    }
    
    public Usuario(){};

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public Set<Carro> getCarros() {
        return carros;
    }

    public void setCarros(Set<Carro> carros) {
        this.carros = carros;
    }
}
