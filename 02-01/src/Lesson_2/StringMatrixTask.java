package Lesson_2;

public class StringMatrixTask {
    public static void main(String[] args) {
        String[][] stringsArray = new String[][]{
                new String[]{"11", "12", "13", "14"},
                new String[]{"21", "22", "23", "24"},
                new String[]{"31", "3h2", "33", "34"},
                new String[]{"41", "42", "43", "44"},
        };

        try {
            matrixValidationAndSum(stringsArray);
        } catch (MyArraySizeException e) {
            System.out.println("Исправь свою залупу!");
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            System.out.println("Циферки учи!");
            e.printStackTrace();
        }
    }

    static public void matrixValidationAndSum(String[][] strings) throws MyArraySizeException, MyArrayDataException {
        if (strings.length != 4) {
            throw new MyArraySizeException();
        }
        for (String[] s :
                strings) {
            if (s.length != 4) {
                throw new MyArraySizeException();
            }
        }

        for (String[] s :
                strings) {
            for (String string :
                    s) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
        int sum = 0;
        int x;
        int y;
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {

                if (!strings[i][j].matches("\\d+")) {
                    throw new MyArrayDataException(j, i);
                }
                sum += Integer.parseInt(strings[i][j]);
            }
        }
        System.out.println(sum);
    }
}

class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        super("Залупа неправильного формата");
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(int x, int y) {
        super("Неправильный залупёнок в ячейке: " + x + " " + y);
    }
}
