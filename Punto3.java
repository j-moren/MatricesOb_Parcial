public class Punto3 {
    public void P3 (int d) {
        Metodos m = new Metodos();
        Producto[][] M = new Producto [d][d];
        M = m.llenarMatriz(d);
        m.libroMasCostoso(M);
    }
}
