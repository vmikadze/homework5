package org.example.homework5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FreelancerTest {
    @Test
    public void testCalculateRestMonths() {
        Assertions.assertEquals(3, Freelancer.calculateRestMonths(10000, 3000, 20000));
        Assertions.assertEquals(2, Freelancer.calculateRestMonths(100000, 60000, 150000));
    }
}
