package kodlama.io.Devs.business.concretes;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepositoryService;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {


    private ProgrammingLanguageRepositoryService programmingLanguageRepositoryService;

    @Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageRepositoryService programmingLanguageRepositoryService) {
        this.programmingLanguageRepositoryService = programmingLanguageRepositoryService;
    }

    List<ProgrammingLanguage> forRepatProgrammingLanguages = programmingLanguageRepositoryService.findAll();

    @Override
    public void addProgrammingLanguage(ProgrammingLanguage programmingLanguage) {
        //programlama dilinin tekrar edip etmediğini bulma
        for(ProgrammingLanguage programmingLanguage1 : forRepatProgrammingLanguages){
            System.out.println("for loop a girildi");
            if(programmingLanguage.getName().toLowerCase().matches(programmingLanguage1.getName().toLowerCase())){
                //eğer programlama dili daha önceden var ise
                System.out.println("Programlama dili zaten var");
                return;
            }
        }
        //programlama dilinin boş bırakılıp bırakılmadığını bulma
        if(this.programmingLanguageFieldEmptyCheck(programmingLanguage)){
            System.out.println("Programlama dili alanı boş bırakılamaz(add)");
            return;
        }
        this.programmingLanguageRepositoryService.save(programmingLanguage);
    }


    @Override
    public void deleteProgrammingLanguage(int id) {
        this.programmingLanguageRepositoryService.deleteById(id);
    }

    @Override
    public void updateProgrammingLanguage(int id, ProgrammingLanguage newProgrammingLanguage) {
        //programlama dilinin boş bırakılıp bırakılmadığını bulma
        //burada bir mantık hatası olabilir.
        if(this.programmingLanguageFieldEmptyCheck(newProgrammingLanguage)){
            System.out.println("Programlama dili alanı boş bırakılamaz(update)");
            return;
        }

    }


    @Override
    public ArrayList<ProgrammingLanguage> listAllProgrammingLanguage() {
        return (ArrayList<ProgrammingLanguage>) this.programmingLanguageRepositoryService.findAll();
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguagefromid(int id) {
        return this.programmingLanguageRepositoryService.findById(id).get();
    }

    private boolean programmingLanguageFieldEmptyCheck(ProgrammingLanguage programmingLanguage){
        /*
         "" => true
         "asndjadjsn" => false
       */
        Boolean result = programmingLanguage.getName().isEmpty() ||programmingLanguage.getId() == 0;
        return  result;
    }
}
