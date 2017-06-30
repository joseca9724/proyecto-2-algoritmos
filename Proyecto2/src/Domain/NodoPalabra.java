/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author byron
 */
public class NodoPalabra {

    private String palabra;
    private NodoPalabra izquierda,derecha;
    private int valor;
    private Graphics2D g2;
    
    public NodoPalabra(String palabra,int valor){
        this.palabra=palabra;
        this.valor=valor;
        this.izquierda=null;
        this.derecha=null;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public NodoPalabra getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoPalabra izquierda) {
        this.izquierda = izquierda;
    }

    public NodoPalabra getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoPalabra derecha) {
        this.derecha = derecha;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void draw(Graphics g, int x, int y) {
        this.g2 = (Graphics2D) g;
        String a = this.getPalabra();
        g2.setColor(Color.lightGray);
        g2.fillOval(x, y, 100, 50);
        g2.setColor(Color.BLACK);
        g2.drawString(a, x + 15, y + 30);
//        g2.drawLine(x+80, y+50, x+140, y+70);
    }

    public void drawIzquierda(Graphics g, int x, int y) {
        this.g2 = (Graphics2D) g;
        g2.setColor(Color.black);
        g2.drawLine(x + 50, y + 50, x - 50, y + 100);

    }

    public void drawDerecha(Graphics g, int x, int y) {
        this.g2 = (Graphics2D) g;
        g2.setColor(Color.black);
        g2.drawLine(x + 50, y + 50, x + 150, y + 100);

    }
}
