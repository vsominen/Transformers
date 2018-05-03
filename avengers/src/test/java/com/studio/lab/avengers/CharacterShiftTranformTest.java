package com.studio.lab.avengers;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CharacterShiftTranformTest {

	@Test
	public void testForwardTranform() {
	
		CharacterShiftTransform characterShiftTransformTest = new CharacterShiftTransform();
		System.out.println(characterShiftTransformTest.forwardCharacterShiftTransform("AZERT"));
		Assert.assertEquals("BAFSU",characterShiftTransformTest.forwardCharacterShiftTransform("AZERT"));
	}
	
	@Test
	public void testReverseTranform() {
	
		CharacterShiftTransform characterShiftTransformTest = new CharacterShiftTransform();
		System.out.println(characterShiftTransformTest.reverseCharacterShiftTransform("BAFSU"));
		Assert.assertEquals("AZERT",characterShiftTransformTest.reverseCharacterShiftTransform("BAFSU"));
	}

}
