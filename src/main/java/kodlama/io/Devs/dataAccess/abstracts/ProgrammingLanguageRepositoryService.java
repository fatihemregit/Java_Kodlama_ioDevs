package kodlama.io.Devs.dataAccess.abstracts;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;





public interface ProgrammingLanguageRepositoryService extends JpaRepository<ProgrammingLanguage,Integer> {

}
