package observer.pattern.domain.impl;

import observer.pattern.domain.Subject;
import observer.pattern.domain.impl.WebSite;
import observer.pattern.models.News;

import java.util.ArrayList;

public class AnadoluAgency implements Subject {

    private ArrayList<WebSite> webSites;
    private ArrayList<News> newsList;

    public AnadoluAgency() {
        webSites = new ArrayList<WebSite>();
        newsList = new ArrayList<News>();
    }

    @Override
    public void registerObserver(WebSite webSite) {
        webSites.add(webSite);
    }

    @Override
    public void removeObserver(WebSite webSite) {
        webSites.remove(webSite);
    }

    @Override
    public void notifyObservers() {
        News news = newsList.get(newsList.size() - 1);
        for (WebSite webSite : webSites) {
            webSite.update(news);
        }
    }

    public void addNews(News news) {
        newsList.add(news);
        notifyObservers();
    }
}
