package day02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    @Test
    void testGetPlusElevation() {
        Hiking hiking = new Hiking();

        assertEquals(13.0, hiking.getPlusElevation(List.of(10.0, 20.0, 15.0, 18.0)));
        assertEquals(0.0, hiking.getPlusElevation(List.of(10.0, 9.0, 8.0, 7.0)));
        assertEquals(3.0, hiking.getPlusElevation(List.of(10.0, 11.0, 12.0, 13.0)));

        assertThrows(IllegalArgumentException.class, () -> hiking.getPlusElevation(List.of()));
        assertThrows(NullPointerException.class, () -> hiking.getPlusElevation(null));
    }
}