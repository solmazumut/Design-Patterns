package observer.pattern.controller;

import observer.pattern.domain.impl.AnadoluAgency;
import observer.pattern.domain.impl.WebSite;
import observer.pattern.factory.NewsFactory;
import observer.pattern.factory.WebSiteFactory;
import observer.pattern.models.LastNews;
import observer.pattern.models.News;
import observer.pattern.models.NewsRequestObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/observer-pattern")
public class NewsController {
    final AnadoluAgency anadoluAgency;
    final LastNews lastNews;

    public NewsController() {
        this.anadoluAgency = new AnadoluAgency();
        this.lastNews = new LastNews();
        WebSiteFactory.createAposto(anadoluAgency,lastNews);
        WebSiteFactory.createBloomberg(anadoluAgency,lastNews);
        WebSiteFactory.createWebrazzi(anadoluAgency,lastNews);
        WebSiteFactory.createOnedio(anadoluAgency,lastNews);

    }


    @PostMapping(path = "/add-news")
    public ResponseEntity<String> addNews(@RequestBody NewsRequestObject newsRequestObject) {
        News news = NewsFactory.createNews(newsRequestObject.getType(), newsRequestObject.getText());
        anadoluAgency.addNews(news);
        return new ResponseEntity<String>("News is added", HttpStatus.OK);
    }
}
