package cribeiro.experiments;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.Arrays;
import java.util.List;

@ApplicationScoped
public class TriviaService {

    List<String> trivia = Arrays.asList(
            "Super Mario Bros. was released in 1985 for the NES.",
            "The original Super Mario Bros. game was created by Shigeru Miyamoto.",
            "Mario was originally called 'Jumpman' in the game Donkey Kong.",
            "Super Mario World was released in 1990 for the Super Nintendo Entertainment System (SNES).",
            "The game Super Mario 64 is widely considered one of the greatest video games of all time.",
            "Super Mario Sunshine was released in 2002 for the Nintendo GameCube.",
            "The character of Luigi was created by Shigeru Miyamoto as Mario's younger brother.",
            "The first Super Mario game to feature Yoshi was Super Mario World.",
            "Super Mario Galaxy was released in 2007 for the Wii.",
            "The game Super Mario Bros. 3 introduced the Koopalings.",
            "Super Mario 3D Land was released in 2011 for the Nintendo 3DS.",
            "The game New Super Mario Bros. U was released in 2012 for the Wii U.",
            "Super Mario Odyssey was released in 2017 for the Nintendo Switch.",
            "The game Super Mario Maker 2 was released in 2019 for the Nintendo Switch.",
            "Mario has appeared in over 200 video games.",
            "The Super Mario series has sold over 330 million copies worldwide.",
            "Super Mario Bros. was the best-selling video game of all time until 2009.",
            "The game Super Mario RPG: Legend of the Seven Stars was developed by Square (now Square Enix).",
            "Super Mario Kart was released in 1992 for the Super Nintendo Entertainment System (SNES).",
            "The game Mario Party was first released in 1998 for the Nintendo 64."
    );

    public String getRandomTrivia() {
        return trivia.get((int) (Math.random() * trivia.size()));
    }
}
