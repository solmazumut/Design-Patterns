package observer.pattern.domain.impl;

import observer.pattern.models.EksiTrends;
import observer.pattern.models.LastNews;
import observer.pattern.models.News;

public class Aposto extends WebSite{

    public Aposto(AnadoluAgency anadoluAgency, LastNews lastNews) {
        super(anadoluAgency, lastNews);
    }

    @Override
    public void update(News news) {
        publish(news);
    }

    @Override
    public void publish(News news) {
        lastNews.setNews(news);
        System.out.println("Aposto - " + news.getText());
    }
}