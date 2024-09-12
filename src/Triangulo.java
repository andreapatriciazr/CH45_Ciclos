
public class Triangulo {

    public static void main(String[] args) {
        int firstRow = 6; // cantidad de estrellas en la primera línea

        for (int row = 0; row < firstRow; row++) {  // inicia contador en 0 y se incrementa en 1 cada fila 
        	
            // calcula cantidad de estrellas en cada línea
            int numberStars = firstRow - row; // le restas una estrella de la cantidad de primera línea
            for (int star = 0; star < numberStars; star++) { // inicia contador en 0 e itera mientras la cantidad de la línea sea menor que el número de estrellas
                System.out.print("* ");
            } // for row

            System.out.println(); // salto para imprimir en cada línea 
        } // for star
    } // main
} // class Triangulo


