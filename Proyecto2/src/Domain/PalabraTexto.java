/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.ArrayList;

/**
 *
 * @author Josec
 */
public class PalabraTexto {
    private String palabra;
    
    ArrayList<String> posiciones;
    
    public PalabraTexto(String palabra){
        this.palabra=palabra;
        this.posiciones=new ArrayList<>();
    }
    
    public void addPosicion(String posicion){
        this.posiciones.add(posicion);
    }
    
    public ArrayList<String> getPosiciones(){
        return this.posiciones;
    }
    
    public String getPalabra(){
        return this.palabra;
    }
}
