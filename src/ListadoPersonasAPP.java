import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasAPP {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        //Definimos lista de personas
        List<Persona> personas = new ArrayList<>();

        //Creamos el menú
        boolean salir = false;
        while (!salir){
            mostrarMenu();
            System.out.println();
            try {
                salir = ejecutarOperacion(consola, personas);
            }catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        }
    }

    private static void mostrarMenu(){
        System.out.println("### APP LISTADO DE PERSONAS ###");
        System.out.println(" 1- Agregar \n 2- Listar \n 3- Salir \n");
        System.out.print("Escoge una opción: ");
    }

    private static boolean ejecutarOperacion( Scanner consola, List<Persona> personas){
        int opcion = consola.nextInt();
        boolean salir = false;

        //revisamos la opción proporcionada

        switch (opcion) {
            case 1:
                consola.nextLine();
                System.out.print("Proporciona el nombre: ");
                String nombre = consola.nextLine();
                System.out.print("Proporciona el teléfono: ");
                int telefono = consola.nextInt();
                consola.nextLine();
                System.out.print("Ingresa el email: ");
                String email = consola.nextLine();

                //Creamos el objeto persona
                Persona persona = new Persona(nombre, telefono, email);

                //Se agrega la nueva persona a la lista
                personas.add(persona);
                System.out.println("La lista tiene: " + personas.size() + " elementos.");
                break;
            case 2:
                //listamos personas
                System.out.println("Listado de personas: ");
                //personas.forEach((persona) -> System.out.println(persona));

                //Método de referencia
                personas.forEach(System.out::println);
                break;

            case 3:
                //Salimos de la app
                System.out.println("Hasta pronto...");
                salir = true;
                break;
            default:
                System.out.println("Opción erronea: "+ opcion);
        }
        return salir;

    }
}