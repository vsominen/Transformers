package com.studio.lab.avengers;

import java.util.Scanner;

public class TransformerDriver {

    public static void main(String[] args) {
        Transformer mainTransformer = new Transformer();
        TransformationType[] types = new TransformationType[] {
                TransformationType.ReverseStringTransform,
                TransformationType.CaseChangeTransform,
                TransformationType.CharacterShift };
        TransformationType[] order = new TransformationType[3];
        String ch = "Y";
        while (ch.equalsIgnoreCase("Y")) {
        System.out.println(
                "Available Transformation \n 0 - ReverseString \n 1 - CaseChange \n 2 - CharacterShift");
        System.out.println(
                "Enter the desired transformations in order by number, single space delimited: \n");
        Scanner cin = new Scanner(System.in);
            for (int i = 0; i < 3; i++) {
                order[i] = types[cin.nextInt()];
            }
            System.out.println(
                    "Enter the text to transform, limit 2000 chars:\n");
            String input = cin.nextLine();
            System.out.println(
                    "Requested these 3 forward transformations (in order): ");
            System.out.println(
                    "[" + order[0] + "," + order[1] + "," + order[2] + "]");
            String output = mainTransformer.transform(order, input);
            System.out.println("Initial String = " + output);
            System.out
                    .println("Enter Y to play again, any other char to stop: ");
            ch = cin.next();
        }
    }

}
