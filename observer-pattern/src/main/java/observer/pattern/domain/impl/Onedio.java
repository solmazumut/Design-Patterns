package observer.pattern.domain.impl;

import observer.pattern.models.EksiTrends;
import observer.pattern.models.FinancialNews;
import observer.pattern.models.LastNews;
import observer.pattern.models.News;

public class Onedio extends WebSite{

    public Onedio(AnadoluAgency anadoluAgency, LastNews lastNews) {
        super(anadoluAgency, lastNews);
    }

    @Override
    public void update(News news) {
        if(news instanceof EksiTrends) {
            publish(news);
        }
    }

    @Override
    public void publish(News news) {
        lastNews.setNews(news);
        System.out.println("Onedio - " + news.getText());
    }
}