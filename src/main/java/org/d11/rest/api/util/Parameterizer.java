package org.d11.rest.api.util;

import java.text.Normalizer;

public class Parameterizer {

    /**
     * Turns "Jordão N'Gala-Tözer" into "jordao-n-gala-tozer".
     * 
     * @param string The string we want to parameterize.
     * @return The parameterized string.
     */
    public static String parameterize(String string) {
        String parameterizedName = string.toLowerCase();
        parameterizedName = parameterizedName.replaceAll("['-]", " ");
        parameterizedName = Normalizer.normalize(parameterizedName, Normalizer.Form.NFD);
        parameterizedName = parameterizedName.replaceAll("[^a-z ]", "").trim();
        parameterizedName = parameterizedName.replace(" ", "-");
        return parameterizedName;        
    }
    
}
