package observer.pattern.factory;

import observer.pattern.domain.impl.*;
import observer.pattern.models.LastNews;

public class WebSiteFactory {

    public static WebSite createAposto(AnadoluAgency anadoluAgency, LastNews lastNews) {
        Aposto aposto = new Aposto(anadoluAgency, lastNews);
        return aposto;
    }

    public static WebSite createWebrazzi(AnadoluAgency anadoluAgency, LastNews lastNews) {
        Webrazzi webrazzi = new Webrazzi(anadoluAgency, lastNews);
        return webrazzi;
    }

    public static WebSite createOnedio(AnadoluAgency anadoluAgency, LastNews lastNews) {
        Onedio onedio = new Onedio(anadoluAgency, lastNews);
        return onedio;
    }

    public static WebSite createBloomberg(AnadoluAgency anadoluAgency, LastNews lastNews) {
        Bloomberg bloomberg = new Bloomberg(anadoluAgency, lastNews);
        return bloomberg;
    }
}
