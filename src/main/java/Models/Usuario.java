/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author joao.chaicoski
 */
@Entity(name = "usuario")
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue
    @Column(name = "id", updatable = false, nullable = false)
    private int id;
    private String nome;
    private boolean admin;

    public Usuario(String nome, boolean admin) {;
        this.nome = nome;
        this.admin = admin;
    }

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
    
}
