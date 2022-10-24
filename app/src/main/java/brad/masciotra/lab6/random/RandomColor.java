package brad.masciotra.lab6.random;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import brad.masciotra.lab6.fragments.FragmentImplementer;


public class RandomColor{

    final static int MAX = 255;
    final static int MIN = 0;
    final static int RGB_SIZE = 3;
    final static int RGB_COLOR_FIRST = 0;
    final static int RGB_COLOR_SECOND = 1;
    final static int RGB_COLOR_THIRD = 2;

    public static List<Integer> generateRandomColor() {
        int rgb;
        List<Integer> rgbValues = new ArrayList<>();

        for (int i = 0; i < RGB_SIZE; i++) {
            rgb = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
            rgbValues.add(rgb);
        }
        return rgbValues;
    }

    /**
     * Changes the background color of the main activity to a randomized color.
     *
     */
    public static void changeBackground(FragmentImplementer frag) {
        List<Integer> colorValues = generateRandomColor();
        frag.getView().setBackgroundColor(Color.rgb(colorValues.get(RGB_COLOR_FIRST), colorValues.get(RGB_COLOR_SECOND),colorValues.get(RGB_COLOR_THIRD)));
    }

}
