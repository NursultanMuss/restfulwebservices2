package kz.nurs.rest.webservices.restfulwebservices2.filtering;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {

    @GetMapping("/filtering")
    public SomeBean retieveSomeBean(){
        return new SomeBean("value1","value2","value3");
    }

    @GetMapping("/filtering-list")
    public List<SomeBean> retieveListOfSomeBeans(){
        return Arrays.asList(new SomeBean("value1","value2","value3"),
                new SomeBean("value12","value22","value32"),
                new SomeBean("value13","value23","value33"));
    }
}
