package no.lhl.firstspringboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parts")
@Slf4j
public class PartsController {


    @Autowired
    private PartsService partsService;

    //@GetMapping()// if ("/something here") additive to /api in requestMapping
    //public List<Part> getParts(){
    //    return partsService.getParts();
    //}
    //SAME AS BELOW

    @GetMapping()

    public ResponseEntity<List<Part>> getParts(){
        return ResponseEntity.ok(partsService.getParts());
    }

    @PostMapping()
    public void addPart(@RequestBody Part part){
        partsService.addPart(part);
    }

    @DeleteMapping()
    public void deletePart(@PathVariable String name) {

    }
}
