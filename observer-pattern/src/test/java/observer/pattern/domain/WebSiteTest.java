package observer.pattern.domain;

import observer.pattern.domain.impl.AnadoluAgency;
import observer.pattern.domain.impl.WebSite;
import observer.pattern.factory.NewsFactory;
import observer.pattern.factory.WebSiteFactory;
import observer.pattern.models.LastNews;
import observer.pattern.models.News;
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
        News news = NewsFactory.createNews("test");

        //When
        anadoluAgency.addNews(news);

        //Then
        assertEquals("test", lastNews.getNews().getText() );
    }

    @Test
    @Order(2)
    public void isTheMessagePublishedWhenUnfollow() {
        //Given
        AnadoluAgency anadoluAgency = new AnadoluAgency();
        LastNews lastNews = new LastNews();
        WebSite aposto = WebSiteFactory.createAposto(anadoluAgency, lastNews);
        News news = NewsFactory.createNews("test");

        //When
        aposto.unfollow();
        anadoluAgency.addNews(news);

        //Then
        assertEquals(lastNews.getNews().getText(), "");
    }
}
