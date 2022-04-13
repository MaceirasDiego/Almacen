/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

/**
 *
 * @author info6
 */
public class Datos {

    Bebidas[][] estanteria;

    public Datos() {
        this.estanteria = new Bebidas[4][4];
    }

    public boolean agregarProducto(Bebidas b) {
        boolean agragado = false;

        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria.length; j++) {
                if (estanteria[i][j] == null) {
                    estanteria[i][j]=b;
                    agragado=true;
                }
            }

        }
        
        return agragado;

    }
    
     public boolean eliminarProducto(Bebidas b) {
        boolean eliminado = false;

        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria.length; j++) {
                if (estanteria[i][j] != null) {
                    estanteria[i][j]= null;
                    eliminado=true;
                }
            }

        }
        
        return eliminado;
        
    }
     public boolean calcularTotal(Bebidas b) {
    
        double total=0;
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria.length; j++) {
                if (estanteria[i][j].Precio += total) {
                    estanteria[i][j]= null;
                    eliminado=true;
                }
            }

        }
        
        return eliminado;
        
    }
    

}
