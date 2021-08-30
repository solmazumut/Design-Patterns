package observer.pattern.models;

public class LastNews {
    public News news;

    public LastNews() {
        News news = new News("");
        this.news = news;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }
}
