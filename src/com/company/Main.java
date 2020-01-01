package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

    	String[] wordListOne = { "Hello","Ade","How", "Impossible", "Whatever", "Samsung"
				,"Super","win-win","web-based","Critical path", "Six-Sigma","Front-end"};

		String[] wordListTwo = { "empowered","Sticky","Value-added", "oriented", "centric", "distributed"
				,"clustered","branded","outside-the-box","position", "networked","focused","leverage",
				"aligned","target","shared","cooperate","accelerated"};

		String[] wordListThree = { "process","tipping-point","solution", "architecture","core", "competency"
				,"strategy","mindshare","portal","space", "vision","paradigm","mission"};

		int wordLengthOne = wordListOne.length;

		int wordLengthTwo = wordListTwo.length;

		int wordLengthThree = wordListThree.length;

		int rand1 = (int) (Math.random()*wordLengthOne);
		int rand2 = (int) (Math.random()*wordLengthTwo);
		int rand3 = (int) (Math.random()*wordLengthThree);

		System.out.println(wordListOne[rand1] +" " + wordListTwo[rand2] + " " + wordListThree[rand3]);

    }
}
