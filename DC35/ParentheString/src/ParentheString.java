public class ParentheString {
    public static void main(String[] args) {
        System.out.println(easyGetCore("xyz(Happy)123"));
        System.out.println(easyGetCore("x(Easter)"));
        System.out.println(easyGetCore("(Bunny)1"));

        System.out.println(getCore("xyz(Happy)123",0));
        System.out.println(getCore("x(Easter)",0));
        System.out.println(getCore("(Bunny)1",0));
    }

    //Alternate way of getting the same result without a loop/recursion
    static String easyGetCore(String str){
        int start = str.indexOf('(');
        int end = str.indexOf(')');
        return str.substring(start,end+1);
    }

    //Recursive method
    static String getCore(String str, int i){
        if(str.charAt(i) == ')'){
            //Upon finding closing parenthesis the string is returned
            return str.substring(0,i+1);
        } else if (str.charAt(i) == '('){
            return getCore(str.substring(i),i+1);
        }
        return getCore(str, i+1);
    }
}
