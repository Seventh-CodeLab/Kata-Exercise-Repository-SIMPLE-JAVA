public class RedBlue {
    public static void main(String[] args) {
        System.out.println(redBlue("redxx"));
        System.out.println(redBlue("xxred"));
        System.out.println(redBlue("BlueTimes"));
    }

    public static String redBlue(String text){
        if(text.substring(0,3).toLowerCase().equals("red")){
            return "red";
        } else if (text.substring(0,4).toLowerCase().equals("blue")){
            return "blue";
        } else {
            return "";
        }
    }
}
