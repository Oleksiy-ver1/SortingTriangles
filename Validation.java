public class Validation {
    public static boolean checkInput(String fromConsole) {
        if (fromConsole.length() == 0 || fromConsole == null) {
            System.out.println("String is wrong");/*проверка на пустую строку и null*/
            return false;
        }

        return true;
    }

    public static boolean checkFormat(String fromConsole) {

        if (!fromConsole.matches("^\\w*,\\d+\\.?\\d*,\\d+\\.?\\d*,\\d+\\.?\\d*")) { /*проверка на соответствие шаблону */
            System.out.println("не верный формат ввода данных");
            return false;
        }
        return true;

    }

    public static boolean realTriangele(double[] sides) { /*проверка на матиматическое соответствие параметрам треугольника*/
        if (sides[0] <= 0 || sides[1] <= 0 || sides[2] <= 0) return false;
        if (sides[0] + sides[1] <= sides[2] || sides[0] + sides[2] <= sides[1] || sides[1] + sides[2] <= sides[0])
            return false;
        return true;
    }
}
