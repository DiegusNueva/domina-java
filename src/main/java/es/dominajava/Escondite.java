package es.dominajava;

public class Escondite {
    public static void main(String[] args) {
        try{
            Fallida f1 = new Fallida();
        } catch (Throwable t) {
            System.out.println("Primera llamada:  " + t
            + " causada por " + t.getCause() + "\n");
        }

        try{
            Fallida f2 = new Fallida();
        } catch (Throwable t) {
            System.out.println("Segunda llamada:  " + t
                    + " causada por " + t.getCause() + "\n");
        }

        try{
            Class.forName("Fallida");
        } catch (ClassNotFoundException e) {
            System.out.println("Class for name (Fallida sin paquete):  "
                   + e + " causada por " + e.getCause() + "\n");
        }

        try{
            Class.forName("es.dominajava.Fallida");
        } catch (ClassNotFoundException e) {
            System.out.println("Class for name: "
                    + e + " causada por " + e.getCause() + "\n");
        } catch (Throwable t) {
            System.out.println("Class for name (Fallida sin paquete):  "
            + t + " causada por " + t.getCause() + "\n");
        }

        try{
            Class.forName("es.dominajava.Movil");
            System.out.println("Class for name (Móvil con paquete) funciona");
        } catch (ClassNotFoundException e) {
            System.out.println("Class for name: " + e + " causada por " + e.getCause());
        } catch (Throwable t) {
            System.out.println("Class for name (Móvil con paquete):  "
                    + t + " causada por " + t.getCause() + "\n");
        }
    }
}
