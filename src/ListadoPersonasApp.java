import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ListadoPersonasApp {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        List<Persona> personas = new ArrayList<>();

        //Menu
        var salir = false;
        while (!salir){
            mostrarMenu();
            try {
                salir= ejecutarOperacion(consola, personas);
            }catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
            System.out.println();
        }

    }

    private static void mostrarMenu(){
        //opciones
        System.out.print("""
                ****Listado Personas App***
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Introduce la opcion: ");
    }

    private static boolean ejecutarOperacion(Scanner consola, List<Persona> personas){
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        //verificamos opcion proporcionada
        switch (opcion){
            case 1 ->{
                //agregar persona a lista
                System.out.print("Nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Telefono: ");
                var telefono = consola.nextLine();
                System.out.print("Email: ");
                var email = consola.nextLine();
                //crear objeto persona
                var persona = new Persona(nombre, telefono, email);
                //Agregamos a lista
                personas.add(persona);
                System.out.println();
                System.out.println("Lista de " + personas.size() + " personas");
            }
            case 2 ->{
                //listar personas
                System.out.println("Lista de Personas: ");
                //Usando Lambda y metodo de referencia
                //personas.forEach((persona) -> System.out.println(persona));
                //Usando metodos de referencia
                personas.forEach(System.out::println);
            }
            case 3 ->{
                //salir
                System.out.println("Hasta pronto.");
                salir = true;
            }
            default -> System.out.println("Opcion errorea: " + opcion);
        }
        return salir;
    }
}