public class DeadFish {

    public static int[] parse(String data) {

        int value = 0;
        int[] result = new int[0];

        for (int i = 0; i < data.length(); ++i) {
            char letter = data.charAt(i);
            if (letter == 'i') {
                ++value;
            } else if (letter == 'd') {
                --value;
            } else if (letter == 's') {
                value = value * value;
            } else if (letter == 'o') {
                int[] new_result = new int[result.length + 1];
                if (result.length == 0) {
                    new_result[0] = value;
                } else {
                    for (int k = 0; k < result.length; ++k) {
                        new_result[k] = result[k];
                    }
                    new_result[new_result.length - 1] = value;
                }
                result = new_result;
            } else {
                System.err.println("Specified single-character command is invalid");
            }
        }
        
        return result;
    }
}
