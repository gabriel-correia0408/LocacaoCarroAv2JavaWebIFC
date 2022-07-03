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
@Entity(name = "caminhao")
@Table(name = "caminhao")
public class Caminhao extends Veiculo{
    @Column
    private int eixos;

    public Caminhao(String marca, String cor, String placa, float preco, int eixos) {
        super(marca, cor, placa, preco);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    
    
}
