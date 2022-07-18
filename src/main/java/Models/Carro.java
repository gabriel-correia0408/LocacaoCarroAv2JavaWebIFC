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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author joao.chaicoski
 */
@Entity
@Table(name = "carro")
public class Carro extends BaseEntity{
    @Id
    @GeneratedValue
    private int id;
    @Column
    private int portas;
    @Column
    private String marca;
    @Column
    private String cor;
    @Column
    private String placa;
    @Column
    private float preco;
    @ManyToOne(cascade = CascadeType.ALL)
    private Usuario usuario;

    public Carro(int portas, String marca, String cor, String placa, float preco) {
        this.portas = portas;
        this.marca = marca;
        this.cor = cor;
        this.placa = placa;
        this.preco = preco;
    }
    
    public Carro(){};
    
    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    
    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
     
}
