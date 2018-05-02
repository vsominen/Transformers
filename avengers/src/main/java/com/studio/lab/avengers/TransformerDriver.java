package com.studio.lab.avengers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TransformerDriver {

    public static void main(String[] args) {
        Transformer mainTransformer = new Transformer();
        TransformationType[] types = new TransformationType[] {
                TransformationType.ReverseStringTransform,
                TransformationType.CaseChangeTransform,
                TransformationType.CharacterShift };
        
        List<TransformationType> order = new ArrayList<TransformationType>();
        String ch = "Y";
        while (ch.equalsIgnoreCase("Y")) {
        
            System.out.println(
                "Available Transformation \n 0 - ReverseString \n 1 - CaseChange \n 2 - CharacterShift");
        System.out.println(
                "Enter the desired transformations in order by number, single space delimited: \n");
        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            order.add(types[cin.nextInt()]);
        }
            
        System.out.println(
                    "Enter the text to transform, limit 2000 chars:\n");
        String input = cin.nextLine();
        System.out.println(
                    "Requested these 3 forward transformations (in order): ");
        System.out.println(
                    "[" + order.get(0) + "," + order.get(1) + "," + order.get(2) + "]");
            
        TransformationType[] forwardOrder;
        forwardOrder=(TransformationType[])order.toArray();
        String output = mainTransformer.transform(forwardOrder, input);
        System.out.println("Initial String = " + output);
        TransformationType[] reverseOrder;
        Collections.reverse(order);
        reverseOrder=(TransformationType[])order.toArray();
        String reverseOutput = mainTransformer.revTransform(reverseOrder, output);
        System.out.println(
                    "[" + order.get(0) + "," + order.get(1) + "," + order.get(2) + "]");
        System.out.println(reverseOutput);
        System.out.println("Enter Y to play again, any other char to stop: ");
        ch = cin.next();
        }
    }

}
