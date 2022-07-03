/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 *
 * @author joao.chaicoski
 */
@Entity(name = "carro")
@Table(name = "carro")
public class Carro extends Veiculo {
    @Column
    private int portas;
    @Column
    private boolean conversivel;

    public Carro(String marca, String cor, String placa, float preco, int portas, boolean conversivel) {
        super(marca, cor, placa, preco);
        this.portas = portas;
        this.conversivel = conversivel;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public boolean isConversivel() {
        return conversivel;
    }

    public void setConversivel(boolean conversivel) {
        this.conversivel = conversivel;
    }
     
}
