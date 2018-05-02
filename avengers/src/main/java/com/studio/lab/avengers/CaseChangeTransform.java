package com.studio.lab.avengers;

public class CaseChangeTransform implements Transform {

    public String forwardTransform(String str) {
        String transformedString = caseChange(str);
        return transformedString;
    }

    public String reverseTransform(String str) {
        String transformedString = caseChange(str);
        return transformedString;
    }

    String caseChange(String str) {

        StringBuffer transformedString = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                if (Character.isLowerCase(str.charAt(i))) {
                    transformedString
                            .append(Character.toUpperCase(str.charAt(i)));
                }
                else {
                    transformedString
                            .append(Character.toLowerCase(str.charAt(i)));
                }
            }
            else {

                transformedString.append(str.charAt(i));
            }
        }

        return transformedString.toString();

    }

}
