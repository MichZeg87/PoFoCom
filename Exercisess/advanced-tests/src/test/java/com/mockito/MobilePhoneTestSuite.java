package com.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MobilePhoneTestSuite {
    MobilePhone myPhone = Mockito.mock(com.mockito.MobilePhone.class);

    @Test
    public void testDefaultBehaviourOfTestDouble() {
        Assertions.assertFalse(myPhone.needsCharging());
        Assertions.assertEquals(0.0, myPhone.getFreeStorage());
    }

    @Test
    public void testExpectation() {
        Assertions.assertFalse(myPhone.needsCharging());
        Mockito.when(myPhone.needsCharging()).thenReturn(true);
        Assertions.assertTrue(myPhone.needsCharging());
    }

    @Test
    public void shouldCallLaunchApplication() {
        myPhone.launchApplication("Tetris4D");
        Mockito.verify(myPhone).launchApplication("Tetris4D");
    }

//    @Test
//    public void testVerificationFailure() { // błedny test
//        myPhone.needsCharging();
//        Mockito.verify(myPhone).getFreeStorage();// weryfikacja innej metody niż przekazanej
//    }

}