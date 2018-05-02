package com.studio.lab.avengers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CaseChangeTransformTest {
    private CaseChangeTransform caseTransform;
    @Before
    public void setUp() throws Exception {
        caseTransform = new CaseChangeTransform();
    }

    @Test
    public void testCaseChangeMixedCaseShouldYieldReversedCase() {
        String str = "ChangeCase";
        assertEquals("cHANGEcASE", caseTransform.caseChange(str));
    }
    
    @Test
    public void testCaseChangeNonAlphaCharactersShouldYieldNoChange() {
        String str = "123ChangeCase 123";
        assertEquals("123cHANGEcASE 123", caseTransform.caseChange(str));
    }

    @Test
    public void testCaseChangeNullCharactersShouldYieldNull() {
        String str = null;
        assertEquals(null, caseTransform.caseChange(str));
    }
    
    @Test
    public void testForwardTranformCharactersShouldYieldReversedCase() {
        String str = "123ChangeCase 123";
        assertEquals("123cHANGEcASE 123", caseTransform.forwardTransform(str));
    }
    
    @Test
    public void testReverseTranformCharactersShouldYieldReversedCase() {
        String str = "123cHANGEcASE 123";
        assertEquals("123ChangeCase 123", caseTransform.reverseTransform(str));
    }

}
