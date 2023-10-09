package no.lhl.firstspringboot;

//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

// @JsonIgnoreProperties // will ignore if jason is trying to add properties where there's no corresponding name.  alt to JsonProperties if you dont want a whole list of alt names as example
public record Part (
        @JsonProperty("nomenclature") // alternative name for the field. for example if service is used by different users w different names for things
        String name
){
}
