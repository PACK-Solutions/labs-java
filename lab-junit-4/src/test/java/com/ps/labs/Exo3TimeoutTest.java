package com.ps.labs;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exo3TimeoutTest {

    private static final Logger logger = LoggerFactory.getLogger(Exo3TimeoutTest.class);

    @Test
    public void testSlaIsRespected1() throws InterruptedException {
        sleepInMillis(50);
    }

    @Test
    public void testSlaIsRespected2() throws InterruptedException {
        sleepInMillis(100);
    }

    @Test
    public void testSlaIsNotRespected() throws InterruptedException {
        sleepInMillis(200);
    }

    private void sleepInMillis(final long millis) throws InterruptedException {
        Instant start = Instant.now();
        TimeUnit.MILLISECONDS.sleep(millis);
        Instant end = Instant.now();
        logger.info("Duration: {} ms", Duration.between(start, end).toMillis());
    }

}
