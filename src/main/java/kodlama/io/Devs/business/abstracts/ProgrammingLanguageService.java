package kodlama.io.Devs.business.abstracts;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;



public interface ProgrammingLanguageService{
    void addProgrammingLanguage(ProgrammingLanguage programmingLanguage);
    void deleteProgrammingLanguage(int id);

    void updateProgrammingLanguage(int id,ProgrammingLanguage newProgrammingLanguage);

    ArrayList<ProgrammingLanguage> listAllProgrammingLanguage();
    ProgrammingLanguage getProgrammingLanguagefromid(int id);
}
