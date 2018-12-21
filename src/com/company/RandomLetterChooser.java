package com.company;

public class RandomLetterChooser extends RandomStringChooser {

    public RandomLetterChooser(String str) {
        super(getLetters(str));
    }

    public static String[] getLetters(String str)
    {
        String[] arr = new String[str.length()];
        for (int i = 0; i < str.length(); i++)
        {
            arr[i] = str.substring(i, i+1);
        }
        return arr;
    }
}
