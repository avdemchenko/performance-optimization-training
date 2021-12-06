package software.sigma.training.po.survey.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import software.sigma.training.po.survey.context.POSurveyApplicationContext;
import software.sigma.training.po.survey.services.context.POSurveyServiceContext;

@SpringBootApplication
@Import({
        POSurveyApplicationContext.class,
        POSurveyServiceContext.class
})
public class POSurveyApplication {

    public static void main(String[] args) {
        SpringApplication.run(POSurveyApplication.class, args);
    }

}
