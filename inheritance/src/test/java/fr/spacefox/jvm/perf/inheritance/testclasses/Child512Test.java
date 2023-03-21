package fr.spacefox.jvm.perf.inheritance.testclasses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Child512Test {

    @Test
    void depthTest() {
        final Mamma child512 = new Child512();
        assertEquals(512, child512.depth());
    }
}