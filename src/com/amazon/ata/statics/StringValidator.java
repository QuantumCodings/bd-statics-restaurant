package com.amazon.ata.statics;

public final class StringValidator {

    
    private static final String FORBIDDEN_WORD = "fish";
    private static final int MAX_LENGTH = 250;

    
    private StringValidator() {}

    /**
     * Checks to see if the string entered contains a forbidden string (e.g., "fish").
     *
     * @param input string that's being checked
     * @throws InvalidStringException if the input contains a forbidden string
     */
    public static void containsForbiddenWord(String input) throws InvalidStringException {
        if (input != null && input.toLowerCase().contains(FORBIDDEN_WORD.toLowerCase())) {
            throw new InvalidStringException("The given String contains a forbidden word.");
        }
    }

    /**
     * Checks to see if the string entered has a length greater than the max allowed length (250).
     *
     * @param input string that's being checked
     * @throws InvalidStringException if the input exceeds the maximum allowed length
     */
    public static void greaterThanMaxLength(String input) throws InvalidStringException {
        if (input != null && input.length() > MAX_LENGTH) {
            throw new InvalidStringException("The given String has a length greater than the max length allowed.");
        }
    }
}
