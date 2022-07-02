/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author joao.chaicoski
 */
public class Veiculo {
    private int id;
    private String marca;
    private String cor;
    private String placa;
    private float preco;

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
