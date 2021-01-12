import java.io.IOException;

public class Triangele {
    private String nameTriangele; /*имя треугольника*/
    private double[] sides = new double[3]; /*стороны треугольника*/
    private double ariaTriangele; /*площадь треугольника*/

    public void setParamTriangle(String clianStr) throws IOException {/*получаем из строки ввода имя и длины сторон*/
        String[] item = new String[4];
        item = clianStr.split(",");
        this.nameTriangele = item[0];
        this.sides[0] = Double.parseDouble(item[1]);
        this.sides[1] = Double.parseDouble(item[2]);
        this.sides[2] = Double.parseDouble(item[3]);
        InputValues afterCheck = new InputValues();
        if (!Validation.realTriangele(sides)) { /*отправляем на проверку соотвецтвия треугольнику*/
            System.out.println("треугольника с такими сторонами на существует!");
            afterCheck.getValues(); /*получаем "очищенные" параметры треугольника*/
        }
    }

    public void setAreaTriangele(double[] sides) {/*вычисляем площадь треугольника по формуле Герона*/
        double p = (sides[0] + sides[1] + sides[2]) / 2;
        this.ariaTriangele = Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
    }

    // гетеры для Треугольника
    public String getNameTriangele() {
        return nameTriangele;
    }

    public double getAriaTriangele() {
        return ariaTriangele;
    }


    public double[] getSides() {
        return sides;
    }

}
