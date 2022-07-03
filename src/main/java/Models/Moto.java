/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 *
 * @author joao.chaicoski
 */
@Entity(name = "moto")
@Table(name = "moto")
public class Moto extends Veiculo {
    public Moto(String marca, String cor, String placa, float preco) {
        super(marca, cor, placa, preco);
    }
}
