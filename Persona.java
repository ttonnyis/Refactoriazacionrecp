package sample;

import java.util.List;

public class Persona {
    String numeroDeTelefono;

    public Persona (String numeroDeTelefono){
        super();
        this.numeroDeTelefono = numeroDeTelefono;
    }

    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public void setNumeroDeTelefono(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }
}
public class Profesor extends Persona{
    String nombre;
    int edad;
    List<Prestamo> prestamos;

    public Profesor (String numeroDeTelefono){
        super(numeroDeTelefono);
    }

    @Override
    public void printInformacionPersonal() {
        System.out.println("Nombre" + nombre);
        System.out.println("Edad" + edad);
        System.out.println("Teléfono: " + numeroDeTelefono);

    }
    public void printInformacion() {
        this.printInformacionPersonal();
        for (Prestamo p:  prestamos) {
            System.out.println(p);
        }
    }

}


