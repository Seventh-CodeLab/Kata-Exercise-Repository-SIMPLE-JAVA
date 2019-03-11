public class JinxedSum {
    public static void main(String[] args) {
        System.out.println(fourCheck(1, 2, 3, 7, 2, 1, 5, 3, 4, 7, 2, 3));
        System.out.println(fourCheck(1, 2, 3, 6, 4));
        System.out.println(fourCheck(1, 4, 3, 2, 4, 2, 1));

    }

    public static int fourCheck(int... values) {
        int result = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] != 4) {
                result += values[i];
            } else {
                return result;
            }
        }
        return result;
    }
}