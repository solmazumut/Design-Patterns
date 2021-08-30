package observer.pattern.domain.impl;

import observer.pattern.models.FinancialNews;
import observer.pattern.models.LastNews;
import observer.pattern.models.News;
import observer.pattern.models.TechnologyNews;

public class Bloomberg extends WebSite{

    public Bloomberg(AnadoluAgency anadoluAgency, LastNews lastNews) {
        super(anadoluAgency, lastNews);
    }

    @Override
    public void update(News news) {
        if(news instanceof FinancialNews) {
            publish(news);
        }
    }

    @Override
    public void publish(News news) {
        lastNews.setNews(news);
        System.out.println("Bloomberg - " + news.getText());
    }
}
