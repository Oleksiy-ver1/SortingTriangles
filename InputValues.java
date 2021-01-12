import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputValues {
    public String fromConsole = new String();

    public String getValues() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //System.in – объект класса InputStream, присвоенный переменной in, находящейся в классе System пакета
        // java.lang. Данный объект выполняет функцию стандартного потока ввода, т. е. ввода с клавиатуры. System.in
        // обеспечивает низкоуровневый ввод, при котором методом read() считываются байты.
        //Первая обертка – класс InputStreamReader, который преобразует набор байтов в символ. Класс BufferedReader
        // буферизует ввод, обеспечивая считывание из потока ввода (клавиатура это или файл – не важно) целых строк,
        // что делает процесс более быстрым.
        System.out.print("Формат ввода (разделитель - запятая): <имя>, <длина стороны>, <длина стороны>, <длина стороны> ");
        fromConsole = reader.readLine().replace(" ", "").replace("    ", "");

        Validation firstCheck = new Validation();/* отправляем на проверку правельность ввода*/
        if (!firstCheck.checkInput(fromConsole)) {
            getValues();
        }
        if (!firstCheck.checkFormat(fromConsole)) { /*проверка формата ввода*/
            getValues();
        }


        return fromConsole;
    }
}
