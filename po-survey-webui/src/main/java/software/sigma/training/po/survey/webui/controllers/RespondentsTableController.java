package software.sigma.training.po.survey.webui.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import software.sigma.training.po.survey.services.api.RespondentsService;
import software.sigma.training.po.survey.services.api.dto.RespondentDTO;

import java.util.Collection;
import java.util.Map;

@Controller
public class RespondentsTableController {

    @Autowired
    private RespondentsService respondentsService;

    @GetMapping("/results")
    public String results(
            @RequestParam(name = "pageNumber", defaultValue = "0") Integer pageNumber,
            @PageableDefault(size = 10) Pageable pageable,
            Map<String, Object> model)
    {

        Collection<RespondentDTO> respondents = respondentsService.getAll(pageable.withPage(pageNumber));

        model.put("respondents", respondents);

        return "results";
    }
}
