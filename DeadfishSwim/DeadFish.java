public class DeadFish {

    private static int value = 0;
    private static int[] result = new int[0];

    public static int[] parse(String data) {

        for (int i = 0; i < data.length(); ++i) {
            execute_letter_action(data.charAt(i));
        }
        return result;
    }

    private static void execute_letter_action(char letter) {
        if (letter == 'i') {
            increment_value();
        } else if (letter == 'd') {
            decrement_value();
        } else if (letter == 's') {
            square_value();
        } else if (letter == 'o') {
            result = add_output_value(result);
        } else {
            System.err.println("Specified single-character command is invalid");
        }
    }

    private static void increment_value() {
        ++value;
    }

    private static void decrement_value() {
        --value;
    }

    private static void square_value() {
        value = value * value;
    }

    private static int[] add_output_value(int[] result) {
        int[] new_result = new int[result.length + 1];
        if (result.length == 0) {
            new_result[0] = value;
        } else {
            for (int i = 0; i < result.length; ++i) {
                new_result[i] = result[i];
            }
            new_result[new_result.length - 1] = value;
        }
        return new_result;
    }

}
