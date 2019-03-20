public class Text {
    public static String replaceWith(String text, String target, String substitute){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++ ) {
            if (i < text.length() - target.length()) {
                if (text.substring(i, i + target.length()).equals(target)) {
                    if (i > 0 && Character.isLetter(text.charAt(i - 1)) || Character.isLetter((text.charAt(i + target.length())))) {
                        result.append(text.substring(i, i + 1));
                    } else {
                        result.append(substitute);
                        i += target.length() - 1;
                    }
                } else {
                    result.append(text.substring(i, i + 1));
                }
            } else {
                result.append(text.substring(i,i + 1));
            }
        }



        return result.toString();
    }
}
