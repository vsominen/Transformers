package com.studio.lab.avengers;

import java.util.HashMap;
import java.util.Map;

public class Transformer {
    
    Map<TransformationType,Transform> transformer;
    
    public Transformer() {
        transformer = new HashMap<TransformationType, Transform>();
        transformer.put(TransformationType.ReverseStringTransform, new ReverseStringTransform());
        transformer.put(TransformationType.CaseChangeTransform, new CaseChangeTransform());
        transformer.put(TransformationType.CharacterShift, new CharacterShift());
    }
    
    public String transform(TransformationType[] forwardTransformOrder,String inputString)
    {
        String outputString = new String(inputString);
        for(TransformationType type : forwardTransformOrder) {
            outputString = this.transformer.get(type).forwardTransform(outputString);
            System.out.println("Interim forward transform = "+outputString);
        }
        return outputString;
    }
    public String revTransform(TransformationType[] reverseTransformOrder,String inputString)
    {
        String outputString = new String(inputString);
        for(TransformationType type : reverseTransformOrder) {
            outputString = this.transformer.get(type).reverseTransform(outputString);
            System.out.println("Interim forward transform = "+outputString);
        }
        return outputString;
    }
}
