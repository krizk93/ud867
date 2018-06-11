package com.udacity.gradle.jokes;

import java.util.Random;

public class Joker {
    private String[] jokes = {
            "Q. How does a computer get drunk? A. It takes screenshots.",
            "Q: Why was the cell phone wearing glasses? A: It lost its contacts.",
            "Q. What do you call it when you have your mom’s mom on speed dial? A. Instagram.",
            "Q. What do you call blueberries playing the guitar? A. A jam session.",
            "Q. What do you call a fake noodle? A. An impasta.",
            "Q: What do you call the king of vegetables? A: Elvis Parsley.",
            "Q: Why did the can crusher quit his job? A: Because it was soda pressing.",
            "Q: What did the teddy bear say when it was offered some birthday cake? A: No thanks, I’m stuffed.",
            "Q: What kind of birthday cake do you get for a coffee lover? A: Choco-latte.",
            "Q: How does a tech guy drink coffee? A: He installs Java!",
            "Q: Why was the cat sitting on the computer? A: To keep an eye on the mouse!",
            "Q: Why don’t cats like online shopping? A: They prefer a cat-alogue.",
            "Q: What is a cat’s favorite color? A: Purrrple",
            "Q: What do you call an obnoxious reindeer? A: RUDEolph.",
            "Q: What do you call a bankrupt Santa? A: Saint Nickel-less.",
            "Q: Why did the turkey cross the road twice? A: To prove he wasn’t a chicken!",
            "Q: How are a turkey, a donkey, and a monkey alike? A: They all have keys.",
            "Q. Why shouldn’t you marry a tennis player? A. Because Love means nothing to them.",
            "Q. Why did the golfer wear two pairs of pants? A. In case he got a hole in one.",
            "Q: How are relationships a lot like algebra? A: Sometimes you look at your X and wonder Y."

    };

    public String getJoke() {
        Random rand = new Random();
        int n = rand.nextInt(jokes.length);
        return jokes[n];
    }
}
