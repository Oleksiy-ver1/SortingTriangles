import java.io.IOException;

public class Aplication {
    public static void main(String[] args) throws IOException {
        ArrayTriangele arr = new ArrayTriangele(); /* создаем элемент класса*/
        arr.repeatEnter();/* запускаем рекуурсию получения данных*/
        arr.sortAndPrint();/* сортируем и выводим на петать*/

    }
}

