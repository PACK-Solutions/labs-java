package com.ps.labs;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.LongStream;

import org.junit.Test;

public class Exo3TimeoutTest {

    @Test
    public void testSlaIsRespected() {
        Instant start = Instant.now();
        LongStream.range(0L, 2000000000L).sum();
        Instant end = Instant.now();
        System.out.println("Duration: " + Duration.between(start, end).toMillis() + " ms");
    }

    @Test
    public void testSlaIsNotRespected() {
        Instant start = Instant.now();
        LongStream.range(0L, 20000000000L).sum();
        Instant end = Instant.now();
        System.out.println("Duration: " + Duration.between(start, end).toMillis() + " ms");
    }

}
