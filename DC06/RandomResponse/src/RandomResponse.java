import java.util.Scanner;
import java.util.Random;

public class RandomResponse {
    public static void main(String[] args) {
        String[] FakeNinjaResponses = {
                "Fake Ninja: Who are you and why do you have my number?",
                "Fake Ninja: Where we droppin.",
                "Fake Ninja: *Incoherent screeching*"
        };

        String[] RealNinjaResponses = {
                "Real Ninja: You want to be my disciple?",
                "Real Ninja: Patience is a virtue",
                "Real Ninja: Shurikens are actually very ineffective"
        };


        Scanner scan = new Scanner(System.in);
        System.out.println("=== Send a message ===");
        String firstMsg = scan.nextLine();
        Random rand = new Random();
        int recipentSelector = rand.nextInt(50);
        if(recipentSelector % 2 == 0){
            int fakeResp = rand.nextInt(3);
            System.out.println(FakeNinjaResponses[fakeResp]);
        } else {
            int realResp = rand.nextInt(3);
            System.out.println(RealNinjaResponses[realResp]);
        }
    }
}
