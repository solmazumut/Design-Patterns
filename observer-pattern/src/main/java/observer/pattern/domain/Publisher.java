package observer.pattern.domain;

import observer.pattern.models.News;

public interface Publisher {
    void publish(News news);
}
