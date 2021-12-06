package software.sigma.training.po.survey.webui.context;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "software.sigma.training.po.survey.webui.controllers"
})
public class POSurveyWebUIContext {
}
