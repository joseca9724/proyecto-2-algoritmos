/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.ArrayList;

/**
 *
 * @author byron
 */
public class Arbol {

    private NodoPalabra raiz;
     
    public Arbol(){
         this.raiz=null;
     }

    public NodoPalabra getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoPalabra raiz) {
        this.raiz = raiz;
    }
    
    public void addNodo(NodoPalabra nodo,NodoPalabra raiz){
        if(this.raiz==null){
            this.setRaiz(nodo);
        }
        else{
            if(nodo.getValor()%2==0){
                
                
                if (raiz.getIzquierda()== null) {
                    raiz.setIzquierda(nodo);
                }
                else {
                    addNodo( nodo , raiz.getIzquierda() );
                }
            }
            
            else {
                if (raiz.getDerecha() == null) {
                    raiz.setDerecha(nodo);
                }
                else {
                    addNodo( nodo, raiz.getDerecha() );
                }
            }
        
        }
    }
}
