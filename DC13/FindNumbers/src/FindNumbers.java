import java.util.*;

public class FindNumbers {
    public static void main(String[] args) {
        String myText = "Det var en gang en liten geitekilling som hadde lært å telle til 3. " +
                "Da han kom til en vannpytt, stod han lenge og så på speilbildet sitt i " +
                "vannet, og nå skal du høre hvordan det gikk: 1, sa geitekillingen. " +
                "Dette hørte en kalv som gikk i nærheten og åt gras. – Hva gjør du for noe? sa kalven. " +
                "Jeg teller meg, sa geitekillingen. – Skal jeg telle deg også? Hvis det ikke gjør vondt, " +
                "så, sa kalven. Det gjør det vel ikke, stå stille, så skal jeg telle deg også? " +
                "Nei, jeg tør ikke, kanskje jeg ikke får lov av mora mi engang, sa kalven og " +
                "trakk seg unna. Men geitekillingen fulgte etter, og så sa han: Jeg er 1, og du er 2, 1-2. " +
                "Mo-er! rautet kalven og begynte å gråte, og så kom mora til kalven, og det var selveste bjellekua " +
                "på garden. Hva er det du rauter for? sa bjellekua. Geitekillingen teller meg! rautet kalven. " +
                "Hva er det for noe? sa bjellekua. Jeg teller, sa geitekillingen. Jeg har lært å telle til 3, " +
                "jeg gjør bare sånn: Jeg er 1, kalven 2, kua 3, 1-2-3. Å, nå telte han deg også! rautet kalven. " +
                "Og da bjellekua skjønte det, ble den sint. Jeg skal lære deg å gjøre narr av kalven min og meg! " +
                "Kom, kalven min, så tar vin’n.";
        System.out.println(findSum(myText));
    }

    public static int findSum(String text){
        ArrayList<Integer> textNumbers = new ArrayList<>();
        System.out.println("=== Numbers found in text: ===");

        for(int i = 0; i < text.length(); i++){
            if (Character.isDigit(text.charAt(i))){
                textNumbers.add(Integer.parseInt(text.substring(i,i+1)));
            }
        }

        int sum = 0;
        for (int i = 0; i < textNumbers.size(); i++){
            int value = textNumbers.get(i);
            System.out.print(value);
            if(i == textNumbers.size()-1){
                System.out.print(" = ");
            } else {
                System.out.print(" + ");
            }
            sum+= value;
        }
        return sum;
    }
}