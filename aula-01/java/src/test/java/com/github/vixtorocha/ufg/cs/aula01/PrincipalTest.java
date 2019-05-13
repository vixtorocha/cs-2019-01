package com.github.vixtorocha.ufg.cs.aula01;

import static org.junit.Assert.*;
import org.junit.Test;

public class PrincipalTest {

    @Test
    public void propriedade3025isTrue() {
        assertEquals(true, Principal.propriedade3025(3025));
    }

    @Test
    public void propriedade3025isfalse() {
        assertEquals(false, Principal.propriedade3025(3024));
    }

}