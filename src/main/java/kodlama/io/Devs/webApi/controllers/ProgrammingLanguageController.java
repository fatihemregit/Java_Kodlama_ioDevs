package kodlama.io.Devs.webApi.controllers;


import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "/enginhomework/api")
public class ProgrammingLanguageController {

    private ProgrammingLanguageService programmingLanguageService;

    @Autowired
    public ProgrammingLanguageController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @PostMapping(path = "/addProgrammingLanguage")
    public void addProgrammingLanguage(@RequestBody ProgrammingLanguage programmingLanguage){
        programmingLanguageService.addProgrammingLanguage(programmingLanguage);
    }


    @DeleteMapping(path = "/deleteProgrammingLanguageWithId")
    public void deleteProgrammingLanguage(@RequestParam int id){
        programmingLanguageService.deleteProgrammingLanguage(id);
    }

    @PostMapping(path = "/updateProgrammingLanguage")
    public void updateProgrammingLanguage(@RequestParam int id,@RequestBody ProgrammingLanguage newprogrammingLanguage){
        programmingLanguageService.updateProgrammingLanguage(id,newprogrammingLanguage);
    }

    @GetMapping(path = "/getProgrammingLanguageWithId")
    public ProgrammingLanguage getProgrammingLanguageFromId(@RequestParam int id){
        return programmingLanguageService.getProgrammingLanguagefromid(id);
    }


    @GetMapping(path = "/listProgrammingLanguage")
    public ArrayList<ProgrammingLanguage> listAllProgrammingLanguage(){
        return  programmingLanguageService.listAllProgrammingLanguage();
    }
}
