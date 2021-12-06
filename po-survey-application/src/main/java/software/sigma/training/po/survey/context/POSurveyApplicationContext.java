package software.sigma.training.po.survey.context;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import software.sigma.training.po.survey.data.context.POSurveyDataContext;
import software.sigma.training.po.survey.services.context.POSurveyServiceContext;
import software.sigma.training.po.survey.webui.context.POSurveyWebUIContext;

@Configuration
@Import({
        POSurveyDataContext.class,
        POSurveyServiceContext.class,
        POSurveyWebUIContext.class
})
public class POSurveyApplicationContext {
}
