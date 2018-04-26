package com.studio.lab.avengers;

public enum TransformationType {
    ReverseStringTransform("ReverseString Transform"),
    CaseChangeTransform("CaseChange Transform"),
    CharacterShift("CharacterShift Transform");
    
    private final String text;

       TransformationType(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
