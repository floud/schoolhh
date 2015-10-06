/**
 * Created by halturin_a on 06.10.2015.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Points {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Программа расчета радиуса и количества соседей у каждой точки на плоскости. Для выхода из программы введите любой символ, отличный от числа");
        System.out.println("Введите требуемое количество точек: ");
        int[][] ints;
        int count = 0;
        try {
            count = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            System.out.println("Выход из программы.");
            System.exit(-1);
        }
        ints = new int[count][];
        System.out.println("Ввод точек");
        int x;
        int y;
        for (int i = 0; i < count; i++) {
            System.out.println("Введите координату х: ");
            try {
                x = Integer.parseInt(reader.readLine());
            } catch (Exception e) {
                System.out.println("Выход из программы.");
                System.exit(-1);
                break;
            }
            System.out.println("Введите координату у: ");
            try {
                y = Integer.parseInt(reader.readLine());
            } catch (Exception e) {
                System.out.println("Выход из программы.");
                System.exit(-1);
                break;
            }
            ints[i]  = new int[]{x, y};
        }
        System.out.println("Добавлено точек: " + count);
        for (int i = 0; i < ints.length; i++) {
            double radius = Double.MAX_VALUE;
            int countOfNeighbours = 0;
            for (int j = 0; j < ints.length; j++) {
                double currentRadius;
                if (i == j) {
                    continue;
                } else {
                    currentRadius = getDistance(ints, i, j);
                    if (currentRadius < radius) {
                        radius = currentRadius;
                    }
                }
            }
            for (int j = 0; j < ints.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    if (getDistance(ints, i, j) <= 2*radius) {
                        countOfNeighbours++;
                    }
                }
            }
            System.out.println("У точки #" + (i + 1) + " " + Arrays.toString(ints[i]) + " : Радиус = " + radius + " и количество соседей: " + countOfNeighbours);
        }
    }


    /**
     * Calculate the distance between two points of array
     *
     * @param ints array[][]
     * @param i first point number in array
     * @param j second point number in array
     * @return distance from one to another
     */
    private static double getDistance(int[][] ints, int i, int j) {
        return Math.sqrt(Math.pow(ints[i][0] - ints[j][0], 2) + Math.pow(ints[i][1] - ints[j][1], 2));
    }
}
