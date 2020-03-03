package edu.effectivejava.item18;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Exemplo retirado do livro Effective Java 3rd edition,<br>
 * Item 18 - Prefira a composição à herança <br>
 * @author frfontoura
 * @version 1.0 03/03/2020
 */
public class InstrumentedSetTest {

    @Test
    public void addCountTest() {
        final InstrumentedSet<String> instrumentedSet = new InstrumentedSet<>(new HashSet<>());
        assertEquals(0, instrumentedSet.size());

        instrumentedSet.add("String 1");
        assertEquals(1, instrumentedSet.size());

        instrumentedSet.addAll(List.of("String 2", "String 3", "String 4", "String 5"));

        assertEquals(5, instrumentedSet.size());
    }

}