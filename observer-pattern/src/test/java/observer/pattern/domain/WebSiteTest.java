package observer.pattern.domain;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class WebSiteTest {
    @Test
    @Order(1)
    public void isTheMessagePublished() {
        //Given
        AnadoluAgency anadoluAgency = new AnadoluAgency();
        LastNews lastNews = new LastNews();
        WebSite aposto = WebSiteFactory.createAposto(anadoluAgency, lastNews);
        News news = NewsFactory.CreateNews("test");

        //When
        anadoluAgency.addNews(news);

        //Then
        assertEquals(lastNews.getNews, "test");
    }

    @Test
    @Order(1)
    public void isTheMessagePublishedWhenUnfollow() {
        //Given
        AnadoluAgency anadoluAgency = new AnadoluAgency();
        LastNews lastNews = new LastNews();
        WebSite aposto = WebSiteFactory.createAposto(anadoluAgency, lastNews);
        News news = NewsFactory.CreateNews("test");

        //When
        aposto.unfollow();
        anadoluAgency.addNews(news);

        //Then
        assertEquals(lastNews.getNews, "");
    }
}
