package observer.pattern.domain;

import observer.pattern.models.News;

public interface Observer {
    void update(News news);
}
