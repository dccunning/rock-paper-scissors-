package io.github.dccunning.utils;

import io.github.dccunning.enums.MoveSymbol;

import java.util.Arrays;
import java.util.List;

public class MoveUtils {
    /**
     * Get a string of all the move symbol options, ie. paper, rock, scissors.
     * @param capitalised If the string should begin with a capital letter
     * @return A comma separated string of the MoveSymbol names
     */
    public static String moveOptionsString(boolean capitalised, String delimiter) {
        List<String> moveOptions = Arrays.stream(MoveSymbol.values()).map(MoveSymbol::getName).toList();
        String moveOptionsStringValue = String.join(delimiter, moveOptions);
        if (capitalised) {
            return moveOptionsStringValue.substring(0, 1).toUpperCase() + moveOptionsStringValue.substring(1);
        } else {
            return moveOptionsStringValue;
        }
    }
}
