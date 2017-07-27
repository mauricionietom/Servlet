/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

public class ConjuntoLibro {
    private Libro[] libros;
    private int numLibros;

    public ConjuntoLibro() {
       this.libros = new Libro[3];
       this.libros[0] = new Libro("Lean StartUP",5);
       this.numLibros = 1;
    }
    
    public boolean registrar(Libro libro){
        if (this.numLibros<3) {
             this.libros[this.numLibros] =libro;
             this.numLibros++;
             return true;
        } else {
            return false;
        }
    }
    
   public Libro[] listarLibros(){
      return this.libros;
   }
    
    
    
}
