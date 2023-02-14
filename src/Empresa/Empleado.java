package Empresa;

// Clase abstracta Empleado
abstract class Empleado {
// Encapsulamiento: Las propiedades están protegidas mediante getters y setters
private String nombre;
private String apellido;
private String identificacion;
private int salario;


// Constructor: Inicializa las propiedades de la clase
public Empleado(String nombre, String apellido, String identificacion, int salario) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.identificacion = identificacion;
    this.salario = salario;
}

// Polimorfismo: El método calcularSalario es un método abstracto que será implementado por las clases hijas
public abstract double calcularSalario();

// Encapsulamiento: Getters y setters para las propiedades de la clase
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getApellido() {
    return apellido;
}
public void setApellido(String apellido) {
    this.apellido = apellido;
}
public String getIdentificacion() {
    return identificacion;
}
public void setIdentificacion(String identificacion) {
    this.identificacion = identificacion;
}
public int getSalario() {
    return salario;
}
public void setSalario(int salario) {
    this.salario = salario;
}
}

// Clase hija EmpleadoPorHoras
class EmpleadoPorHoras extends Empleado {
// Propiedades específicas de la clase hija
private int horasTrabajadas;
private double tarifaPorHora;



// Constructor: Inicializa las propiedades de la clase hija y las propiedades de la clase base
public EmpleadoPorHoras(String nombre, String apellido, String identificacion, int salario, int horasTrabajadas, double tarifaPorHora) {
    super(nombre, apellido, identificacion, salario);
    this.horasTrabajadas = horasTrabajadas;
    this.tarifaPorHora = tarifaPorHora;
}

// Herencia: La clase hija proporciona una implementación concreta para el método calcularSalario
@Override
public double calcularSalario() {
    return horasTrabajadas * tarifaPorHora;
}

// Método main
public static void main(String[] args) {
    Empleado empleado = new EmpleadoPorHoras("Juan", "Pérez", "123456", 0, 40, 15.5);
    double salario = empleado.calcularSalario();
    System.out.println("El salario del empleado por horas es: " + salario);
}
}