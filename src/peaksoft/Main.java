package peaksoft;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> randomNumbers = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            randomNumbers.add(new Random().nextInt(1, 100));
        }

        System.out.println("Рандомный 50 сан (1-100): " + randomNumbers);

        ArrayList<Integer> takSandar = new ArrayList<>();

        for (int i = 0; i < randomNumbers.size(); i++) {
            if (randomNumbers.get(i) % 2 == 1) {
                takSandar.add(randomNumbers.get(i));
            }
        }

        System.out.println("Рандомный так сандар: " + takSandar);
        
        
        ArrayList<Integer> jupSandar = new ArrayList<>();

        for (int i = 0; i < randomNumbers.size(); i++) {
            if (randomNumbers.get(i) % 2 == 0) {
                jupSandar.add(randomNumbers.get(i));
            }
        }

        System.out.println("Рандомный жуп сандар: " + jupSandar);
    }
}
