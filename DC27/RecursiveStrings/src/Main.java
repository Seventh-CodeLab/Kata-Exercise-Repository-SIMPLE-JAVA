public class Main {
    public static void main(String[] args) {

        //Test NoZeeS Method
        System.out.println(noZeeS("zHzezzlzlzoz"));
        System.out.println(noZeeS("zzwzozrzlzzdz"));
        System.out.println(noZeeS("zzzzz"));

        //Test starItUp method
        System.out.println(starItUp("Hello",1));
        System.out.println(starItUp("World",1));
        System.out.println(starItUp("SUPERSTAR",1));

    }

    public static String noZeeS(String s){
        int i = s.indexOf('z');
        // NOTE: When indexOf doesn't find it's target, it simply returns -1, meaning it doesn't exist.
        if (i == -1){
            return s;
        }
        return noZeeS(s.substring(0,i) + s.substring(i+1));
    }

    public static String starItUp(String s, int i){
        if (i > s.length()-1){
            return s;
        }
        return starItUp(s.substring(0,i)+"*"+s.substring(i),i+2);
    }
}
