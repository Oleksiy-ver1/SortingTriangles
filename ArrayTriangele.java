import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ArrayTriangele { /*наработка массива треугольников, его сортировка и вывод*/
    InputValues triangeleString = new InputValues();/* ввод данных через консоль*/
    Triangele triangele = new Triangele();
    HashMap<String, Double> mapTriangeles = new HashMap<>();/*словарь имяТреугольника - площадьТреугольника*/

    public void setArrayTriangele(String nameTriangele, double ariaTriangele) {/*сетер для словаря*/
        mapTriangeles.put(nameTriangele, ariaTriangele);
    }

    public void repeatEnter() throws IOException {/*запуск программы заполнения данных с повтором Yes/No */

        triangele.setParamTriangle(triangeleString.getValues());/* построение треугольника из полученных данных*/
        triangele.setAreaTriangele(triangele.getSides());/* расчет площади треугольника*/
        setArrayTriangele(triangele.getNameTriangele(), triangele.getAriaTriangele());

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Хотите добавить треугольники (Yes/No)  ");
        String answerStr = reader.readLine().toLowerCase(Locale.ROOT);
        if (answerStr.equals("y") || answerStr.equals("yes")) {
            repeatEnter();
        }

    }

    public void sortAndPrint() {/*сортировка и вывод на печать словаря из треугольников */


        mapTriangeles.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .forEach(System.out::println); // или любой другой конечный метод

    }

}
