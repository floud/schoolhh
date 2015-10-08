
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by halturin_a on 06.10.2015.
 */
public class Numbers {
    public static void main(String[] args) throws IOException {
        System.out.println("Программа поиска первого вхождения заданой последовательности в бесконечную последовательность чисел");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите искомую последовательность: ");
        String s = reader.readLine();
        char[] sChars = s.toCharArray();
        char first = sChars[0];
        int max;
        int end;
        StringBuilder sb = new StringBuilder();
        char[] infiniteChars;

        // Формируем бесконечную последовательность
        first: for (int m = 1; m < Integer.MAX_VALUE; m++) {
            sb.append(m);
            infiniteChars = sb.toString().toCharArray();
            max = (infiniteChars.length - sChars.length);
            for (int i = 0; i <= max; i++) {
                // Поиск вхождения первой цифры
                if (infiniteChars[i] != first) {
                    while (++i <= max && infiniteChars[i] != first);
                }
                // Поиск следующих цифр
                if (i <= max) {
                    int j = i + 1;
                    end = j + sChars.length - 1;
                    for (int k = 1; j < end && infiniteChars[j] == sChars[k]; j++, k++);

                    // Последовательность найдена, печать и выход из циклов
                    if (j == end) {
                        System.out.println(i + 1);
                        break first;
                    }
                }
            }
        }
    }
}
