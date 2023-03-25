public class Triangulo extends Trigono implements Forma{

    private double lado1;
    private double lado2;
    private double lado3;
    private double base = /*Asignamos valor prueba*/ 7;
    private double altura = 4;

    Triangulo() {
    }

    Triangulo(Punto p1, Punto p2, Punto p3) {
        setVertices(p1, p2, p3);
        this.lado1 = Math.sqrt(Math.pow(p2.pos_x - p1.pos_x,2) + Math.pow(p2.pos_y - p1.pos_y,2));
        this.lado2 = Math.sqrt(Math.pow(p2.pos_x - p1.pos_x,2) + Math.pow(p2.pos_y - p1.pos_y,2));
        this.lado3 = Math.sqrt(Math.pow(p2.pos_x - p1.pos_x,2) + Math.pow(p2.pos_y - p1.pos_y,2));
    }

    public void dibujar_puntos() {
        System.out.println("Dibuja los puntos del triángulo");
    }
    public void rellenar_forma() {
        System.out.println("Rellena la forma del triangulo");
    }
    public double calcular_area() {
        double area = 0; // Por completar (compleja)
        System.out.println("Área triángulo: " + base*altura);
        return area;
    }
    public double calcular_perimetro() {
        double perimetro = lado1 + lado2 + lado3;
        System.out.println("Perímetro triángulo: " + perimetro);
        return perimetro;
    }
}