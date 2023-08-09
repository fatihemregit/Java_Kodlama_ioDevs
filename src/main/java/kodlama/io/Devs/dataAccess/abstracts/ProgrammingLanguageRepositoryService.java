package kodlama.io.Devs.dataAccess.abstracts;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

import java.util.ArrayList;

public interface ProgrammingLanguageRepositoryService {
    void addProgrammingLanguage(ProgrammingLanguage programmingLanguage);
    void deleteProgrammingLanguage(int id);

    void updateProgrammingLanguage(int id,ProgrammingLanguage newProgrammingLanguage);

    ArrayList<ProgrammingLanguage> listAllProgrammingLanguage();
    ProgrammingLanguage getProgrammingLanguagefromid(int id);

}
