
package sumativa1;

import java.util.Scanner;

public class Sumativa1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = null;
        int opcion = 0; 

        do {
            

            try{
                mostrarMenu();
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer de entrada
                

                switch (opcion) {
                    case 1:
                        cliente = registrarCliente(scanner);
                        break;
                    case 2:
                        if (cliente != null) {
                            cliente.verDatosCliente();
                        } else {
                            System.out.println("No se ha registrado ningún cliente.");
                        }
                        break;
                    case 3:
                        if (cliente != null) {
                            System.out.println("Ingrese el monto a depositar:");
                            int montoDeposito = scanner.nextInt();
                            scanner.nextLine(); // Limpiar el buffer de entrada
                            cliente.depositar(montoDeposito);
                        } else {
                            System.out.println("No se ha registrado ningún cliente.");
                        }
                        break;
                    case 4:
                        if (cliente != null) {
                            System.out.println("Ingrese el monto a girar:");
                            int montoGiro = scanner.nextInt();
                            scanner.nextLine(); // Limpiar el buffer de entrada
                            cliente.girar(montoGiro);
                        } else {
                            System.out.println("No se ha registrado ningún cliente.");
                        }
                        break;
                    case 5:
                        if (cliente != null) {
                            cliente.consultarSaldo();
                        } else {
                            System.out.println("No se ha registrado ningún cliente.");
                        }
                        break;
                    case 6:
                        System.out.println("¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                        break;
                }
            } catch (Exception e){
                System.out.println("Ocurrio un error intentelo de nuevo;");
                scanner.nextLine(); // Limpiar el buffer de entrada
            }
            
            System.out.println();
        } while (opcion != 6);
    }
    
        public static void mostrarMenu() {
        System.out.println("Bienvenido(a) a West Bank");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Registrar cliente");
        System.out.println("2. Ver datos de cliente");
        System.out.println("3. Realizar depósito");
        System.out.println("4. Realizar giro");
        System.out.println("5. Consultar saldo");
        System.out.println("6. Salir");
        System.out.print("Opción: ");
    }

    public static Cliente registrarCliente(Scanner scanner) {
        System.out.println("Ingrese el RUT del cliente:");
        String rut = scanner.nextLine();

        // Validar longitud del RUT
        if (rut.length() < 11 || rut.length() > 12) {
            System.out.println("RUT inválido. El RUT debe tener entre 11 y 12 caracteres, incluyendo puntos y guion.");
            return null;
        }

        System.out.println("Ingrese el nombre del cliente:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el apellido paterno del cliente:");
        String apellidoPaterno = scanner.nextLine();

        System.out.println("Ingrese el apellido materno del cliente:");
        String apellidoMaterno = scanner.nextLine();

        System.out.println("Ingrese el domicilio del cliente:");
        String domicilio = scanner.nextLine();

        System.out.println("Ingrese la comuna del cliente:");
        String comuna = scanner.nextLine();

        System.out.println("Ingrese el teléfono del cliente:");
        String telefono = scanner.nextLine();

        System.out.println("Ingrese el número de cuenta del cliente:");
        int numeroCuenta = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada
        
         // Validar longitud del número de cuenta
        if (String.valueOf(numeroCuenta).length() != 9) {
            System.out.println("Número de cuenta inválido. El número de cuenta debe tener 9 dígitos.");
            return null;
        }

        Cliente cliente = new Cliente(rut, nombre, apellidoPaterno, apellidoMaterno, domicilio, comuna, telefono, numeroCuenta);
        System.out.println("Cliente registrado correctamente.");

        return cliente;
    }
}
