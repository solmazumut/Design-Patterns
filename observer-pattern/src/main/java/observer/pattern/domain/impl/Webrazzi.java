package observer.pattern.domain.impl;

import observer.pattern.models.LastNews;
import observer.pattern.models.News;
import observer.pattern.models.TechnologyNews;

public class Webrazzi extends WebSite{

    public Webrazzi(AnadoluAgency anadoluAgency, LastNews lastNews) {
        super(anadoluAgency, lastNews);
    }

    @Override
    public void update(News news) {
        if(news instanceof TechnologyNews) {
            publish(news);
        }
    }

    @Override
    public void publish(News news) {
        lastNews.setNews(news);
        System.out.println("Webrazzi - " + news.getText());
    }
}
