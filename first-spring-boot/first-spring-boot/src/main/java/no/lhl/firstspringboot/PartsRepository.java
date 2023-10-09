package no.lhl.firstspringboot;

//import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Component
//@Bean
//@Repository
//@Service              BEAN REPO and SERVICE is the same as Component (bean is more specialized)
public class PartsRepository { // handles connecting code in our project???
    private ArrayList<Part> parts = new ArrayList<>();

    public PartsRepository() {
        parts.add(new Part("gear"));
        parts.add(new Part("cog"));
    }

    public ArrayList<Part> getParts(){
        return parts;
    }

    public void addPart(Part part){
        parts.add(part);
    }

}
