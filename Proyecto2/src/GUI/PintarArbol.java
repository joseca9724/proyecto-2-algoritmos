package GUI;

import Domain.Arbol;
import Domain.NodoPalabra;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Josec
 */
public class PintarArbol extends JPanel {

    private Graphics2D g2;
    private Arbol arbol;

    public PintarArbol(Arbol arbol) {
        this.setBounds(0, 0, 900, 800);
        this.setVisible(true);
        this.arbol = arbol;

    }

//    @Override
//    protected void paintComponent(Graphics g) {
//        int x = 600, y = 0;
//        this.g2 = (Graphics2D) g;
//        g.drawRect(x, y, 50, 50);
//
//    }
    
    @Override
    protected void paintComponent(Graphics g) {
        int x = 600, y = 0;
        this.g2 = (Graphics2D) g;
        pintarArbol(this.arbol.getRaiz(), x, y);
        pintarArbol1(this.arbol.getRaiz(), x, y);

    }

    private void pintarArbol(NodoPalabra temp, int x, int y) {
        if (temp != null) {
            temp.draw(g2, x, y);
            pintarArbol(temp.getIzquierda(), x - 100, y + 100);
            pintarArbol(temp.getDerecha(), x + 100, y + 100);
        }
    }

    private void pintarArbol1(NodoPalabra temp, int x, int y) {
        if (temp.getIzquierda()!= null) {
            temp.drawIzquierda(g2, x, y);
            pintarArbol1(temp.getIzquierda(), x - 100, y + 100);

        }
         if (temp.getDerecha()!= null) {
            temp.drawDerecha(g2, x, y);

            pintarArbol1(temp.getDerecha(), x + 100, y + 100);
         }
    }
    

    
}//class
