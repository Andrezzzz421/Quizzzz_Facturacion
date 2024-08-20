/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizzzz_facturacion;

/**
 *
 * @author camper
 */
public class Descuento {
    private final Tarjeta[] tarjetas;
    private int contador;
    
    public Descuento(int cantidad) {
        this.tarjetas = new Tarjeta[cantidad];
        this.contador = 0;
    }
    
    public void crearTar(String numeroDeCuenta, double valorApertura, String mes) {
        if (contador < tarjetas.length) {
            tarjetas[contador++] = new Tarjeta(numeroDeCuenta, valorApertura, mes) {
                @Override
                public double cuotaDeManejo() {
                    throw new UnsupportedOperationException("Not supported yet."); 
                }
            };
        } else {
            System.out.println("Array lleno, no se puede ingresar más datos");
        }
    }
    
    public void leerTarjeta(){
        for (int i = 0; i < contador; i++){
            System.out.println(tarjetas[i]);
        }
    }
    
}

        

