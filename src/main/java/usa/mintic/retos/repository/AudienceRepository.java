package usa.mintic.retos.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usa.mintic.retos.entity.Audience;
import usa.mintic.retos.repository.crud.AudienceCrudRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class AudienceRepository {

    @Autowired
    private AudienceCrudRepository audienceCrudRepository;

    public List<Audience> getAll(){
        return (List<Audience>) audienceCrudRepository.findAll();
    }
    public Optional<Audience> getById(int id){
        return audienceCrudRepository.findById(id);
    }
    public Audience save(Audience c){
        return audienceCrudRepository.save(c);
    }
    public void delete(Audience c){
        audienceCrudRepository.delete(c);
    }

}
