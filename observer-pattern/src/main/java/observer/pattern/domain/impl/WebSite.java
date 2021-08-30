package observer.pattern.domain.impl;

import observer.pattern.domain.Observer;
import observer.pattern.domain.Publisher;
import observer.pattern.models.LastNews;
import observer.pattern.models.News;

public abstract class WebSite implements Observer, Publisher {

    final AnadoluAgency anadoluAgency;
    final LastNews lastNews;

    public WebSite(AnadoluAgency anadoluAgency, LastNews lastNews) {
        this.anadoluAgency = anadoluAgency;
        this.lastNews = lastNews;

        this.anadoluAgency.registerObserver(this);
    }

    public void unfollow() {
        anadoluAgency.removeObserver(this);
    }

    @Override
    public abstract void update(News news);

    @Override
    public abstract void publish(News news);
}
