package org.example;
import java.util.List;
public class prepareResults {


    public class Main {
        public static void main(String[] args) {
            List<String> inputData = List.of("5", "+", "-5"); // Приклад вхідних даних
            double result = 0.0; // Припустимо, результат розрахунку

            // Виклик методу prepareResults
            String output = prepareResults(inputData, result);
            System.out.println(output); // Виведення результату
        }

        public static String prepareResults(List<String> inputData, double result) {
            StringBuilder builder = new StringBuilder();
            for (String data : inputData) {
                builder.append(data);
            }
            builder.append("=").append(result);
            return builder.toString();
        }
    }
}
