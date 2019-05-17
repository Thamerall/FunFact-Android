package com.example.funfact;

import java.util.Random;

public class FactBook {
   private final String factArr [] ={
            "The world’s oldest piece of chewing gum is over 9,000 years old!\n" ,
            "A coyote can hear a mouse moving underneath a foot of snow.\n" ,
            "Bolts of lightning can shoot out of an erupting volcano.\n" ,
            "New York drifts about one inch farther away from London each year.\n" ,
            "A sneeze travels about 100 miles per hour.\n" ,
            "Earth has traveled more than 5,000 miles in the past 5 minutes.\n" ,
            "It would take a sloth one month to travel one mile.\n" ,
            "10% of the World’s population is left handed.\n" ,
            "A broken clock is right two times every day.\n" ,
            "Bob Marley’s last words to his son before he died were “Money can’t buy life.”\n" ,
            "A mole can dig a tunnel that is 300 feet long in only one night.\n" ,
            "A hippo’s wide open mouth is big enough to fit a 4-foot-tall child in.\n" ,
            "Chewing gum while you cut an onion will help keep you from crying.\n" ,
            "If you were to stretch a Slinky out until it’s flat, it would measure 87 feet long.\n" ,
            "Al Capone’s business card said he was a used furniture dealer\n" ,
            "There are more collect calls on Father’s Day than on any other day of the year.\n" ,
            "Banging your head against a wall burns 150 calories an hour.\n" ,
            "95% of people text things they could never say in person.\n" ,
            "A crocodile can’t poke its tongue out.\n" ,
           "The average adult human has two to nine pounds of bacteria in his or her body.",
           "Starfish can re-grow their arms. In fact, a single arm can regenerate a whole body.",
           "Janis Joplin left $2,500 in her will for her friends to \"have a ball after I’m gone.\"",
           "Multiple \"Marlboro Men\" have died from lung cancer.",
           "Farts have been clocked at a speed of 10 feet per second.",
           "Donkeys kill more people annually than plane crashes.",
           "On an average work day, a typist’s figures travel 12.6 miles",
           "The longest recorded flight of a chicken is thirteen seconds.",
           "40,000 Americans are injured by toilets each year.",
           "Banging your head against a wall uses 150 calories a hour.",
           "Vending Machines Kill More People per year than sharks.",
           "There are three golf balls sitting on the moon!",
           "Butterflies taste with their feet.",
           "In France, it is legal to marry a dead person.",
           "To produce a single pound of honey, a single bee would have to visit 2 million flowers.",
           "You are born with 300 bones, by the time you are an adult you will have 206.",
           "A cockroach will live for weeks without its head before it starves to death",
           "No word in the English language rhymes with month, orange, silver or purple.",
           "In Tokyo, a bicycle is faster than a car for most trips of less than 50 minutes!",
           "An ostrich’s eye is bigger than its brain",
           "Every year, kids in North America spend close to half a billion dollars on chewing gum!",
           "Ketchup was sold in the 1830s as medicine.",
           "The electric chair was invented by a dentist.",
           "Donald Duck comics were banned from Finland because he doesn’t wear trousers.",
           "It takes more calories to eat a piece of celery than the celery has in it.",
           "Every day more money is printed for monopoly than the US Treasury.",
           "Cost of raising a medium-sized dog to the age of 11: $5500",
           "Coca Cola was originally green.",
           "Elephants are the only mammals that can't jump.",
           "A rat can last longer without water than a camel.",
           "It's possible to lead a cow upstairs...but not downstairs.\n",
           "There are no clocks in Las Vegas gambling casinos",
           "In India, people are legally allowed to marry a dog!",
           "A broken clock is right two times a day.",
           "You breathe on average about 5 million times a year.",
           "It is impossible to sneeze with your eyes open.",
           "Peanuts are one of the ingredients of dynamite.",
           "Some Cats Are Actually Allergic to Humans",
           "The Majority of Your Brain Is Fat",
           "The Moon Is (Slowly) Slowing the Earth’s Rotation",
           "Oranges Aren’t Naturally Occurring Fruitsl",
           "High Heels Were Originally Worn by Men",
           "You Are Drinking Million-Year-Old Water",
           "Queen Elizabeth Is a Trained Mechanic",
           "The Hottest Inhabited Place in the World is in Ethiopia",
           "It is physically impossible for pigs to look up into the sky."
    };
    public String getfact(){

        Random random = new Random();
        int num = random.nextInt(factArr.length);

        return factArr[num];

    }
}
