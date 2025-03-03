public class Punto1 {
    public void P1 (int d) {
        Metodos m = new Metodos();
        Producto[] productos = m.repuerarProductos();             
        
        m.obtenerMasCaro(productos);
    
    }
}
