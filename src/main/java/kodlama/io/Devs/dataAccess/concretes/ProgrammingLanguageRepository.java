package kodlama.io.Devs.dataAccess.concretes;


import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepositoryService;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProgrammingLanguageRepository  implements ProgrammingLanguageRepositoryService {

    ArrayList<ProgrammingLanguage> programmingLanguages = new ArrayList<ProgrammingLanguage>();


    @Override
    public void addProgrammingLanguage(ProgrammingLanguage programmingLanguage) {
        programmingLanguages.add(programmingLanguage);
    }



    @Override
    public void deleteProgrammingLanguage(int id) {
        programmingLanguages.remove(this.getProgrammingLanguagefromid(id));
    }

    @Override
    public void updateProgrammingLanguage(int id, ProgrammingLanguage newProgrammingLanguage) {
        for (int i = 0;i < programmingLanguages.size();i++){
            ProgrammingLanguage programmingLanguagesElement = programmingLanguages.get(i);
            if(programmingLanguagesElement.getId() == id){
                programmingLanguages.set(i,newProgrammingLanguage);
                return;
            }
        }
    }


    @Override
    public ArrayList<ProgrammingLanguage> listAllProgrammingLanguage() {
        return programmingLanguages;
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguagefromid(int id) {
        for(ProgrammingLanguage programmingLanguage : programmingLanguages ){
            if(programmingLanguage.getId() == id){
                return programmingLanguage;
            }
        }
        return null;
    }
}
