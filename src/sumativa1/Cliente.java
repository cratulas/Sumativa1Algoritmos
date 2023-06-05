
package sumativa1;


public class Cliente {
    private String rut;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String domicilio;
    private String comuna;
    private String telefono;
    private CuentaCorriente cuentaCorriente;

    public Cliente(String rut, String nombre, String apellidoPaterno, String apellidoMaterno, String domicilio,
                   String comuna, String telefono, int numeroCuenta) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.domicilio = domicilio;
        this.comuna = comuna;
        this.telefono = telefono;
        this.cuentaCorriente = new CuentaCorriente(numeroCuenta);
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getComuna() {
        return comuna;
    }

    public String getTelefono() {
        return telefono;
    }

    public CuentaCorriente getCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

    public void verDatosCliente() {
        System.out.println("RUT: " + rut);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido Paterno: " + apellidoPaterno);
        System.out.println("Apellido Materno: " + apellidoMaterno);
        System.out.println("Domicilio: " + domicilio);
        System.out.println("Comuna: " + comuna);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Número de cuenta: " + cuentaCorriente.getNumero());
        System.out.println("Saldo: " + cuentaCorriente.getSaldo());
    }

    public void depositar(int monto) {
        cuentaCorriente.depositar(monto);
    }

    public void girar(int monto) {
        cuentaCorriente.girar(monto);
    }

    public void consultarSaldo() {
        System.out.println("Saldo actual: " + cuentaCorriente.getSaldo());
    }
}
