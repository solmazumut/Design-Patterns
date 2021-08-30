package observer.pattern.domain;

import observer.pattern.domain.impl.WebSite;

public interface Subject {
    void registerObserver(WebSite webSite);
    void removeObserver(WebSite webSite);
    void notifyObservers();
}
