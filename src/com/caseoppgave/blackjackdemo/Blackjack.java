package com.caseoppgave.blackjackdemo;

import java.util.List;
import java.util.stream.IntStream;

public class Blackjack {
    public static void main(String[] args) {

        // Velkomst melding
        System.out.println("Welcome to Blackjack");

        //Oppretter spillebunken
        Deck playingDeck = new Deck();
        playingDeck.createFullDeck();
        playingDeck.shuffle();

        //Create a deck for the player


        System.out.println(playingDeck);







    }
}
