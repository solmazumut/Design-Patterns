package observer.pattern.factory;

import observer.pattern.models.EksiTrends;
import observer.pattern.models.FinancialNews;
import observer.pattern.models.News;
import observer.pattern.models.TechnologyNews;

public class NewsFactory {
    public static News createNews(String text) {
        return new News(text);
    }

    public static News createNews(String type, String text) {

        switch (type) {
            case "Technology":
                return new TechnologyNews(text);
            case "Financial":
                return new FinancialNews(text);
            case "EksiTrends":
                return new EksiTrends(text);
            default:
                return createNews(text);
        }

    }
}
