public class Main {
    public static void main(String[] args) {

        Cuadrado cuadrado1 = new Cuadrado();
        Rectangulo rectangulo1 = new Rectangulo();

        Forma[] arrayMain = new Forma[3];
        arrayMain[0] = cuadrado1;
        arrayMain[1] = rectangulo1;

        arrayMain[0].rellenar_forma();
        arrayMain[1].dibujar_puntos();
    }
}