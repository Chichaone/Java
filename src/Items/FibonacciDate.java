package Items;

import IO.Input;
import IO.Output;
import Menu.MenuItem;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import static Validation.DataValidation.valueData;
import static Validation.StringValidation.sDate;
import static calculation.CalcGeneral.calcFibonacci;


// 2 лаб - 8 вариант
public class FibonacciDate extends MenuItem {

    public FibonacciDate() {
        _title = "Fibonacci date";
    }

    public void execute() {
        executeThree();
    }

    public static void executeThree() {
        SimpleDateFormat dFormat = new SimpleDateFormat("dd.MM.yyyy");
        dFormat.setLenient(false);

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> d = new ArrayList<>();

        try {

            //Выводим 4 отрезка и добавляем в массив
            for (int i = 1; i < 5; i++) {
                Output.println("Enter 4 dates with format: dd.MM.yyyy !\n" + "Enter " + i + " segment:");
                String date = Input.getStr();
                dFormat.parse(date);
                Output.println(sDate(date));
                Output.println(i + " segment: " + date);
                d.add(date);
            }

            //Проверяем на хронологичность
            Date date1 = dFormat.parse(d.get(0));
            Date date2 = dFormat.parse(d.get(1));

            int result = date1.compareTo(date2);
            valueData(result, "result");

            Date date3 = dFormat.parse(d.get(2));
            Date date4 = dFormat.parse(d.get(3));

            int result2 = date3.compareTo(date4);
            valueData(result2, "result2");

            long milliseconds = date2.getTime() - date1.getTime();
            long millisecondsOne = date4.getTime() - date3.getTime();
            int days = (int) (milliseconds / (24 * 60 * 60 * 1000));
            int daysOne = (int) (millisecondsOne / (24 * 60 * 60 * 1000));

            //заносим 1 и 2 отрезки в отдельные ArrayList
            for (int i = 0; i < days + 1; i++) {
                Calendar calendar = Calendar.getInstance();
                String s = d.get(0);
                calendar.setTime(dFormat.parse(s));
                calendar.add(Calendar.DATE, i);
                s = dFormat.format(calendar.getTime());
                list.add(s);
            }

            for (int i = 0; i < daysOne + 1; i++) {
                Calendar calendar = Calendar.getInstance();
                String s = d.get(2);
                calendar.setTime(dFormat.parse(s));
                calendar.add(Calendar.DATE, i);
                s = dFormat.format(calendar.getTime());
                list2.add(s);
            }

            list.retainAll(list2);

            int iN = list.size();
            Output.println("\nN: " + iN + "\n");

            // проверка N на наличие результата
            if (iN == 0) {
                System.out.println("Calculation is not possible");
            }

            // вывод последовательности Фибоначчи
            for (int k = 0; k < iN; k++) {
                if (k != 41)
                {
                    Output.println("Fibonacci " + k + " : " + calcFibonacci(k));
                }else{
                    Output.println("\nN is greater than 40 and cannot be computed in the allotted time");
                    break;
                }
            }



        } catch (Exception e) {
            Output.println(e.getMessage());
            executeThree();
        }
    }
}






