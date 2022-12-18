package practice.twoDimensionalArray;

public class TwoDimensionalArray {

    public static final char SYMBOL = 'X';

    public static char[][] getTwoDimensionalArray(int size) {

        char[][] array = new char[size][size];

        for (int i = 0; i < size; i++) {
            array[i][i] = SYMBOL;
            array[i][array[i].length - i - 1] = SYMBOL;
            for (int j = 0; j < size; j++) {
                if (array[i][j] != SYMBOL) {
                    array[i][j] = ' ';
                }
            }
        }

        return array;
    }
}
