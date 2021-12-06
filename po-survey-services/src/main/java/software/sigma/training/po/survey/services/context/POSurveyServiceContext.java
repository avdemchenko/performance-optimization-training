package software.sigma.training.po.survey.services.context;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "software.sigma.training.po.survey.services.impl"
})
public class POSurveyServiceContext {
}
