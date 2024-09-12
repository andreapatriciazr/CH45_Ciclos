
public class TrianguloReversa {

    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++) {  // inicia contador en 1 y se incrementa en 1 hasta que sea mayor que 5
            for (int star = 0; star < row; star++) { // inicia contador en 0 e incrementa 1 estrella en cada línea
                System.out.print("* ");
            } // for star

            System.out.println(); // salto para imprimir en cada línea 
        } // for row
    } // main
} // class TrianguloReversa
