package brad.masciotra.lab6.random;

import android.graphics.Color;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class RandomColor{

    final static int MAX = 255;
    final static int MIN = 0;
    final static int RGB_SIZE = 4;
    final static int RGB_COLOR_FIRST = 0;
    final static int RGB_COLOR_SECOND = 1;
    final static int RGB_COLOR_THIRD = 2;
    final static int RGB_COLOR_FOURTH = 3;

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
     * @param view the view.
     */
    public static void changeBackground(View view, int background, List<Integer> colorValues) {

        View layoutBackground = view.findViewById(background);
//        List<Integer> colorValues = generateRandomColor();
        int color = Color.argb(colorValues.get(RGB_COLOR_FIRST), colorValues.get(RGB_COLOR_SECOND),
                colorValues.get(RGB_COLOR_THIRD), colorValues.get(RGB_COLOR_FOURTH));
        layoutBackground.setBackgroundColor(color);
    }

}
