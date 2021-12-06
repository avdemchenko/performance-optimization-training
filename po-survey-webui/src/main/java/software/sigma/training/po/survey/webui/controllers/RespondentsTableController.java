package software.sigma.training.po.survey.webui.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import software.sigma.training.po.survey.services.api.RespondentsService;
import software.sigma.training.po.survey.services.api.dto.RespondentDTO;

import java.util.Collection;
import java.util.Map;

@Controller
public class RespondentsTableController {

    @Autowired
    private RespondentsService respondentsService;

    @GetMapping("/results")
    public String results(Map<String, Object> model) {

        Collection<RespondentDTO> respondents = respondentsService.getAll();

        model.put("respondents", respondents);

        return "results";
    }


}
