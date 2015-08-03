package com.gkmohit.unknown.shitnobodyknows;

import android.util.Log;

import java.util.Random;

/**
 * Created by gkmohit on 15-07-12.
 */
public class FactBook {

    public static final String TAG = FactBook.class.getSimpleName();
    //TODO
    //Implement this into a database for faster and more optimal storage.
    /**
     * Most of these facts were takes from websites or books mentioned below.
     * Uncle John's Absolutely Absorbing Bathroom Reader.
     * http://www.nobelprize.org/
     * http://healthresearchfunding.org/
     * http://www.sciencekids.co.nz/
     * http://www.cnn.com/
     * http://all-that-is-interesting.com/
     * http://wtffunfact.com/
     *
     */
    public String[] mFacts = {
            "The human body has about 60,00 miles of blood vessels.",
            "Sloths sneeze slowly and they give birth upside down SLOWLY.",
            "Its illegal to slurp your soup in New Jersey.",
            "Ants stretch when they wake up in the morning.",
            "Women have a keener sense of smell than men.",
            "Benjamin Franklin gave guitar lessons.",
            "One mother shark can give birth up to 70 baby sharks per litter.",
            "The covering on the end of a shoelace is called Aglet.",
            "Ketchup was once sold as a medicine.",
            "In Antarctica the sunsets can be green.",
            "Bugs Bunny is the world's most popular Rabbit.",
            "Bugs Bunny has starred in more than 175 films.",
            "Bugs Bunny has been nominated for three Oscars, and wont one in 1958.",
            "1 in 6,500 people could be injured by a toilet seat.",
            "Hibernation bears can go up to six months without a bathroom break.",
            "Rabbits and horses cannot vomit.",
            "Both gorillas and house cats purr.",
            "It takes 720 peanuts to make a pound of peanut butter.",
            "Peanut butter sandwiches became popular in 1920s.",
            "James Hetherington invented the top hat in 1797, when he first wore it in public he was arrested for disturbing peace.",
            "The approximate value of a single pair of Elvis's underpants was $1,300.",
            "A turkey whistles when it is panicking.",
            "Moths do not eat clothes, but moths lay their eggs on your clothes. When the eggs develop into larvae they eat tiny parts of your clothes;" +
                    " adult moths do not eat clothes.",
            "Whales do not spout water, they actually exhale air through their blowholes. This creates a mist that looks like a water spout.",
            "The common assumption that Monkeys remove fleas in each others fur is wrong. Monkeys do not have fleas, they remove dead skin.",
            "Bats are not blind, but they can see better in half-light than in day-light.",
            "Bats have evolved as nocturnal hunters.",
            "Summers in Neptune are 40 years longs.",
            "There are only 6 known Autographs of Shakespeare.",
            "Paul McCarthney's birth name is James Paul McCarthney.",
            "A person who pointlessly repeats themselves is know as Battologist.",
            "There is a place called Slaughter Beach in Delaware.",
            "A person who compulsively steals ladies underwear is known as MELCRYPTOVESTIMENTAPHILIAC.",
            "The name of the Looney Tunes theme song is \"The Merry-Go-Round Broke Down\". It was released in 1930s.",
            "The cost of an Academy Award Oscar statuette is about $300.",
            "A poison frog only found in Cuba is the smallest known amphibian.",
            "The rare Goliath frog from Africa is the largest frog in the world.",
            "Chinese giant Salamander is the largest amphibian in the world.",
            "The indentation at the bottom of wine bottles is known as a Kick or Punt.",
            "The movie nixon was called the \"The Big Liar\" after being Re-Dubbed in Hong Kong.",
            "If your second toe is longer than the big toe, you are said to have Morton's Toe, only 10% of the people have this.",
            "The Simian Crease is the line that stretches all they way across your palm.",
            "Only 2% of the adult population are naturally blond.",
            "Cheek dimples are caused by short face muscles.",
            "There were no winners of Nobel Prize in Physics during 1916, 1931, 1934, 1940, 1941 and 1942.",
            "Between 1901 and 2014, 47 Nobel Prizes were awarded to women.",
            "Adolf Hitler restrained three German Nobel Laureates, Richard Kuhn, Adolf Butenandt and Gerhard Domagk, from accepting the Nobel Prize.",
            "Madam Marie Curie has won the Nobel Prize twice, once in Physics - 1903 and the second in chemistry - 1911.",
            "The first modern map was printed over 500 years ago.",
            "The toothbrush we use today was not invented until 1938.",
            "The Earth weighs about 5,972,190,000,000,000 billion kilograms.",
            "The first petrol or gasoline powered auto-mobile the Benz Patent-Motorwagen was invented by Karl Benz in 1886.",
            "A group of cockroaches is known as intrusion.",
            "Venetia Burney named Pluto when she was 11 years old.",
            "During the attack on Pearl Harbour three Civilian Aircraft were shot.",
            "All prisoners in Norway have access to internet.",
            "Advertising children the age of 12 is illegal in Quebec, Sweden and Norway.",
            "Peter Dinklage is a very strict vegetarian, every time you see him eating meat in \"Game of Thrones\" he is actually eating tofu.",
            "73 million people died in World War II.",
            "Google hired a camel to get street view images in a desert.",
            "God is the only character in show \"The Simpsons'\" who has 5 fingers, the rest have only 4.",
            "A \'Butt\', was a unit to measure wine in Medieval England.",
            "The famous Windows startup was composed using a Mac.",
            "You cannot cry in space because there is no gravity to make tears flow."
    };

    public String getFact(){
        Log.d(TAG, "getFact() was called.");
        String fact = new String();
        //Randomly select a fact
        Random randomGenerator = new Random();
        Log.d(TAG, "mFacts was initialized with " + mFacts.length + " facts.");
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];
        Log.d(TAG, "Returning fact : " + fact);
        return fact;

    }
}

