/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

/**
 *
 * @author joao.chaicoski
 */
@Entity(name = "veiculo")
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Veiculo {
    @Id
    @GeneratedValue
    @Column(name = "id", updatable = false, nullable = false)
    private int id;
    @Column
    private String marca;
    @Column
    private String cor;
    @Column
    private String placa;
    @Column
    private float preco;

    public Veiculo(String marca, String cor, String placa, float preco) {
        this.marca = marca;
        this.cor = cor;
        this.placa = placa;
        this.preco = preco;
    }
    
    public int getId() {
        return id;
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

    @Override
    public String toString() {
        return this.getClass()+"{" + 
                "id=" + id + 
                ", marca=" + marca + 
                ", cor=" + cor + 
                ", placa=" + placa + 
                ", preco=" + preco + 
                '}';
    }
}
