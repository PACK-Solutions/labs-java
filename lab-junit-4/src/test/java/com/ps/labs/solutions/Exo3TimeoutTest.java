package com.ps.labs.solutions;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exo3TimeoutTest {

    private static final Logger logger = LoggerFactory.getLogger(Exo3TimeoutTest.class);

    @Rule
    public final Timeout timeout = Timeout.millis(150);

    @Test(timeout = 100)
    public void testSlaIsRespected1() throws InterruptedException {
        sleepInMillis(50);
    }

    @Test
    public void testSlaIsRespected2() throws InterruptedException {
        sleepInMillis(100);
    }

    // Décommentez ce test et vous verrez qu'il est en échec car il dure plus de 150ms.
    // @Test
    // public void testSlaIsNotRespected() throws InterruptedException {
    //     sleepInMillis(200);
    // }

    private void sleepInMillis(final long millis) throws InterruptedException {
        final Instant start = Instant.now();
        TimeUnit.MILLISECONDS.sleep(millis);
        final Instant end = Instant.now();
        logger.info("Duration: {} ms", Duration.between(start, end).toMillis());
    }

}
