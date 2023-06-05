
package sumativa1;

public class CuentaCorriente {
    
    private int numero;
    private int saldo;

    public CuentaCorriente(int numero) {
        this.numero = numero;
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void depositar(int monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Monto inválido. Ingrese un monto mayor a cero.");
        }
    }

    public void girar(int monto) {
        if (saldo > 0) {
            if (monto > 0) {
                if (monto <= saldo) {
                    saldo -= monto;
                    System.out.println("Giro exitoso. Nuevo saldo: " + saldo);
                } else {
                    System.out.println("Saldo insuficiente. No se puede realizar el giro.");
                }
            } else {
                System.out.println("Monto inválido. Ingrese un monto mayor a cero.");
            }
        } else {
            System.out.println("Saldo insuficiente. No se puede realizar el giro.");
        }
    }
}
