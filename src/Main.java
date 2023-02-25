/*  Ejemplificación de principios Sólid: */

//Principio de Responsabilidad Única (SRP):
//Cada una de las clases realiza una acción individual y una responsabilidad única.

// Código para leer un archivo del disco
class FileReader {
    public void readFile(String fileName) {

    }
}

// Código para escribir un archivo en el disco
class FileWriter {
    public void writeFile(String fileName, String data) {

    }
}

// Código para copiar un archivo de origen a destino
class FileCopier {
    public void copyFile(String sourceFile, String destinationFile) {

    }
}

//Principio de Abierto/Cerrado (OCP):
// La interfaz se ve extendida en sus clases hijas y no es modificada de origen
//Principio de Sustitución de Liskov (LSP):
//El método funciona correctamente en las clases Square
//Este principio establece que una clase debe estar abierta a la extensión, pero cerrada a la modificación.
//Principio de Segregación de Interfaces (ISP):
//Se aplica este principio debido a que cada uno de los métodos en la interfaz son aplicados y usados por la clase hija
interface GeometricFigure {
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}

class Square implements GeometricFigure{

    public Square(String name, double side) {
        this.name = name;
        this.side = side;

    }

    @Override
    public double calcularArea() {
        return side*side;
    }
    @Override
    public double calcularPerimetro() {
        return side*4;
    }
}