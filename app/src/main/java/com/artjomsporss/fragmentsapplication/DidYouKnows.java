package com.artjomsporss.fragmentsapplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by User1 on 09/11/2015.
 */
public class DidYouKnows {
    private static ArrayList<String> info = new ArrayList(Arrays.asList(new String[]{
            "Did you know 11% of people are left handed",
            "Did you know August has the highest percentage of births",
            "Did you know unless food is mixed with saliva you can't taste it",
            "Did you know the average person falls asleep in 7 minutes",
            "Did you know a bear has 42 teeth",
            "Did you know an ostrich's eye is bigger than it's brain",
            "Did you know most lipsticks contain fish scales",
            "Did you know no two corn flakes look the same",
            "Did you know lemons contain more sugar than strawberries",
            "Did you know 8% of people have an extra rib",
            "Did you know 85% of plant life is found in the ocean",
            "Did you know Ralph Lauren's original name was Ralph Lifshitz",
            "Did you know rabbits like licorice",
            "Did you know the Hawaiian alphabet has 12 letters",
            "Did you know 'Topolino' is the name for Mickey Mouse Italy",
            "Did you know a lobsters blood is colorless but when exposed to oxygen it turns blue",
            "Did you know armadillos have 4 babies at a time and are all the same sex",
            "Did you know reindeer like bananas",
            "Did you know the longest recorded flight of a chicken was 13 seconds",
            "Did you know birds need gravity to swallow",
            "Did you know the most commonly used letter in the alphabet is E",
            "Did you know the least used letter in the alphabet is Q",
            "Did you know the 3 most common languages in the world are Mandarin Chinese, Spanish and English",
            "Did you know dreamt is the only word that ends in mt",
            "Did you know the names of all continents both start and end with the same letter",
            "Did you know the first letters of the months July through to November spell JASON",
            "Did you know if you try to say the alphabet without moving your lips or tongue every letter will sound the same",
            "Did you know a cat has 32 muscles in each ear",
            "Did you know Perth is Australia's windiest city",
            "Did you know Elvis's middle name was Aron",
            "Did you know the flag for Libya is unlike any other being a solid green color",
            "Did you know goldfish can see both infrared and ultraviolet light",
            "Did you know the smallest bones in the human body are found in your ear",
            "Did you know cats spend 66% of their life asleep",
            "Did you know Switzerland eats the most chocolate equating to 10 kilos per person per year",
            "Did you know money is the number one thing that couples argue about",
            "Did you know macadamia nuts are toxic to dogs",
            "Did you know when lightning strikes it can reach up to 30,000 degrees celsius (54,000 degrees fahrenheit)",
            "Did you know spiders are arachnids and not insects",
            "Did you know each time you see a full moon you always see the same side",
    }));

    public static String getRandomInfo() {
        Random r = new Random();
        return info.get(r.nextInt(info.size()));
    }
}
