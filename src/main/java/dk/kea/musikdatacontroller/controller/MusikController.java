package dk.kea.musikdatacontroller.controller;

import dk.kea.musikdatacontroller.model.Musikdata;
import dk.kea.musikdatacontroller.repository.MusikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MusikController {
    @Autowired
    MusikRepository musikRepository;

    @GetMapping("/musikdata")
        public String visMusikData (Model model) {

        List<Musikdata> liste = musikRepository.getAll();
        model.addAttribute("data", liste);

            return "musikdata";
        }


}
