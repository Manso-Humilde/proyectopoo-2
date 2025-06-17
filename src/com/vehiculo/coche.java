package com.vehiculo;

public class coche {
   private String marca;
   private String modelo;
   private int velocidad;
   private int velocidadActual;

    
   private int velocidadMaxima;

    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) throws Exception {
        if (velocidadMaxima > 180) {
            throw new Exception("La velocidad no puede ser mayor de 180");
        }else{
            this.velocidadMaxima = velocidadMaxima;
        }
        
    }

    public int getVelocidadActual() {
        return this.velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
