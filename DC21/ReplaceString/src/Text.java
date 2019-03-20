public class Text {
    public static String replaceWith(String text, String target, String substitute){

        //Stringbuilder to build the output
        StringBuilder result = new StringBuilder();

        //Loop through the entire text
        for (int i = 0; i < text.length(); i++ ) {
            //Only looks for the target if i is less than the target so we don't exceed the text length.
            if (i < text.length() - target.length()) {
                //Checks for a match with target in the text
                if (text.substring(i, i + target.length()).equals(target)) {
                    if (i > 0 && Character.isLetter(text.charAt(i - 1)) || Character.isLetter((text.charAt(i + target.length())))) {
                        //Checks if the match is standalone or in the middle of another word.
                        result.append(text.substring(i, i + 1));
                    } else {
                        //Replaces target with the substitute
                        result.append(substitute);
                        i += target.length() - 1;
                    }
                } else {
                    //Puts the checked string in the stringbuilder
                    result.append(text.substring(i, i + 1));
                }
            } else {
                //Goes through the rest of the text so it's not cut short.
                result.append(text.substring(i,i + 1));
            }
        }



        return result.toString();
    }
}
