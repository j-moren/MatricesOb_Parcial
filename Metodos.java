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
    public Producto libroMasCostoso(Producto[][] matriz) {
        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            System.out.println("La Matriz está Vacia");
            return null;
        }    
    
        Producto masCostoso = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j].getPrecio() > masCostoso.getPrecio()) {
                    masCostoso = matriz[i][j];
                }
            }
        }
    
        System.out.println("\nEl Libro Más Costoso es:");
        System.out.println("Titulo: " + masCostoso.getTitulo());
        System.out.println("Autor: " + masCostoso.getAutor());
        System.out.println("Año: " + masCostoso.getAño());
        System.out.println("Precio: " + masCostoso.getPrecio());

        return masCostoso;
    }
}