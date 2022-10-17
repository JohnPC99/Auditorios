package usa.mintic.retos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import usa.mintic.retos.entity.Audience;
import usa.mintic.retos.services.AudienceService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/Audience")
public class AudienceController {

    @Autowired
    private AudienceService audienceService;

    @GetMapping("/all")
    public List<Audience> getAll(){
        return audienceService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Audience> getById(@PathVariable("id") int id){
        return audienceService.getById(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Audience save(@RequestBody Audience c){
        return audienceService.save(c);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Audience update(@RequestBody Audience c){
        return audienceService.update(c);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id){
        return audienceService.delete(id);
    }




}
