package com.studio.lab.avengers;

public class CharacterShiftTransform implements Transform{

	public String forwardTransform(String stringToBeTranformed) {
		return forwardCharacterShiftTransform(stringToBeTranformed);
	}

	public String reverseTransform(String stringToBeTranformed) {
		
		return reverseCharacterShiftTransform(stringToBeTranformed);
	}
	
	public String forwardCharacterShiftTransform(String stringToBeTransformed)
    {
    	String transformedString = "";
    	
    	for(int indexOfChar = 0 ; indexOfChar < stringToBeTransformed.length() ; indexOfChar++)
    	{
    		char charToBeShifted = stringToBeTransformed.charAt(indexOfChar);
    		//System.out.println(charToBeShifted);
            int AsciiOfChar = (int) charToBeShifted;
            char charShifted = charToBeShifted;
            if(AsciiOfChar == (int)'Z' || AsciiOfChar == (int)'z' )
            {
            	charShifted = wrapAtoZAndZtoA(charShifted);
            }
            else
            {
	            if(Character.isLowerCase(charToBeShifted))
	            {
	            	charShifted = (char)((AsciiOfChar + 1));
	            }
	            if(Character.isUpperCase(charToBeShifted))
	            {
	            	charShifted = (char)((AsciiOfChar + 1));
	            }
            }
            
            transformedString += charShifted;
    	}
    	return transformedString;
    }
	
    public String reverseCharacterShiftTransform(String stringToBeTransformed)
    {
    	String transformedString = "";
    	
    	for(int indexOfChar = 0 ; indexOfChar < stringToBeTransformed.length() ; indexOfChar++)
    	{
    		char charToBeShifted = stringToBeTransformed.charAt(indexOfChar);
    		int AsciiOfChar = (int) charToBeShifted;
            char charShifted = charToBeShifted;
            if(AsciiOfChar == (int)'A' || AsciiOfChar == (int)'a' )
            {
            	charShifted = wrapAtoZAndZtoA(charToBeShifted);
            }
            else
            {
	            if(Character.isLowerCase(charToBeShifted))
	            {
	            	charShifted = (char)((AsciiOfChar - 1));
	            }
	            if(Character.isUpperCase(charToBeShifted))
	            {
	            	charShifted = (char)((AsciiOfChar - 1));
	            }
            }
            transformedString += charShifted;
    	}
    	
    	return transformedString;
    }
	
    public char wrapAtoZAndZtoA(char charToBeShifted)
    {
    	char wrappedAroundChar = 0;
    	if(charToBeShifted == 'Z')
    	{
    		wrappedAroundChar = 'A'; 
    	}
    	if(charToBeShifted == 'z')
    	{
    		wrappedAroundChar = 'a'; 
    	}
    	if(charToBeShifted == 'A')
    	{
    		wrappedAroundChar = 'Z'; 
    	}
    	if(charToBeShifted == 'a')
    	{
    		wrappedAroundChar = 'z'; 
    	}
    	return wrappedAroundChar;
    }

}
