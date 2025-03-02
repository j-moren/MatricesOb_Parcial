import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner (System.in);

    public Producto[][] llenarMatriz(int dimension) {
        Producto[][] m = new Producto [dimension][dimension];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                Producto o = new Producto();
                System.out.println("Ingrese el Titulo del Libro:");
                o.setTitulo(sc.next());
                System.out.println("Ingrese el Autor del Libro:");
                o.setAutor(sc.next());
                System.out.println("Ingrese el año del Libro:");
                o.setAño(sc.nextInt());
                System.out.println("Ingrese el Precio del Libro:");
                o.setPrecio(sc.nextDouble());
                m[i][j] = o;
            }
        }
        return m;
    
    }
}