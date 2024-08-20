/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizzzz_facturacion;

/**
 *
 * @author camper
 */
public class Joven {
    private static int nextId= 1;
    private int id;
    private String nombre;
    
    public Joven(String nombre){
        this.nombre = nombre;
        this.id = nextId++;
    }

    public int getId() {
        return id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Joven{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    

}
