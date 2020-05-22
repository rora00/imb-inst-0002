import java.text.DecimalFormat;
public class DJ{
    public static void main(String[] args) {
        Speaker bose = new Speaker(500, "surround");
        System.out.println("DJ! Your speaker has a power of " + bose.getPower() + " watts and is a " + bose.getType() + " type.");
        
        HomeSpeaker hSpeaker = new HomeSpeaker(6000, "single");
        System.out.println("DJ! Your speaker has a power of " + hSpeaker.getPower() + " watts and is a " + hSpeaker.getType() + " type.");

        Speaker[] allMySpeakers = new Speaker[3];
        allMySpeakers[0] = new Speaker(7000, "Single");
        allMySpeakers[1] = new Speaker(6000, "Surround");
        allMySpeakers[2] = new HomeSpeaker(6000, "Surround");

        DecimalFormat rounder = new DecimalFormat("0");
        double avg;
        int sum = 0;
        for(int index = 0; index < allMySpeakers.length; index++) {
            sum += allMySpeakers[index].getPower();
        }
        avg = sum / allMySpeakers.length;
        System.out.println("Average power of the speakers is: " + rounder.format(avg) + " watts.");
    }
}