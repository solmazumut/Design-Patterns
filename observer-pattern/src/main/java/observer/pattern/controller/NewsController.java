package observer.pattern.controller;

import observer.pattern.models.NewsRequestObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class NewsController {
    @PostMapping(path = "/add-news")
    public ResponseEntity<String> addProductToBasket(@RequestBody NewsRequestObject newsRequestObject) {



        return new ResponseEntity<String>("News is added", HttpStatus.OK);
    }
}
