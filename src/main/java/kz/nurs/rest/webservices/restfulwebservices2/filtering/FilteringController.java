package kz.nurs.rest.webservices.restfulwebservices2.filtering;


import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {
    // want to send field1, field2
    @GetMapping("/filtering")
    public MappingJacksonValue retieveSomeBean(){
        SomeBean someBean =  new SomeBean("value1","value2","value3");
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("value1","value2");
        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);

        MappingJacksonValue mapping = new MappingJacksonValue(someBean);
        mapping.setFilters(filters);

        return mapping;
    }

    // want to send field2, field3
    @GetMapping("/filtering-list")
    public MappingJacksonValue retieveListOfSomeBeans(){
        List<SomeBean> listOfBeans = Arrays.asList(new SomeBean("value1","value2","value3"),
                new SomeBean("value12","value22","value32"),
                new SomeBean("value13","value23","value33"));
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("value2", "value3");
        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter",filter);

        MappingJacksonValue mapping = new MappingJacksonValue(listOfBeans);
        mapping.setFilters(filters);

        return mapping;
    }
}
