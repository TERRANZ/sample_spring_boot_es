package by.epam.sample.esboot.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import by.epam.sample.esboot.domain.Twit;
import by.epam.sample.esboot.service.TwitService;

import java.util.UUID;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TwitServiceTest {
    @Autowired
    private TwitService twitService;
    private Twit t1;
    private Twit t2;
    private Twit t3;

    @Before
    public void setUp() {
        t1 = new Twit(UUID.randomUUID().toString(), "t1", "u1");
        t2 = new Twit(UUID.randomUUID().toString(), "t2", "u2");
        t3 = new Twit(UUID.randomUUID().toString(), "t2", "u2");

        t1 = twitService.save(t1);
        t2 = twitService.save(t2);
        t3 = twitService.save(t3);
    }

    @After
    public void cleanUp() {
        twitService.deleteAll();
    }

    @Test
    public void testFindByText() {
        Assert.assertEquals(1, twitService.findByText(t1.getText()).size());
        Assert.assertEquals(2, twitService.findByText(t2.getText()).size());
    }

    @Test
    public void testFindByUserId() {
        Assert.assertEquals(1, twitService.findByUserId(t1.getUserId()).size());
        Assert.assertEquals(2, twitService.findByUserId(t2.getUserId()).size());
    }
}
