package com.company;

public class Main {

    public static void main(String[] args) {
	    String[] wordArray = {"wheels","on","the","bus"};
	    RandomStringChooser s = new RandomStringChooser(wordArray);;
	    System.out.println();
	    for (int i = 0; i < 6; i++)
        {
            System.out.println(s.getNext() + " ");
        }
        System.out.println();
	    RandomLetterChooser l = new RandomLetterChooser("cat");
	    for (int i = 0; i < 4; i++)
        {
            System.out.println(l.getNext());
        }
    }
}
