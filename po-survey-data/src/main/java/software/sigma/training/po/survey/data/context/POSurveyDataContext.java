package software.sigma.training.po.survey.data.context;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EntityScan(basePackages = {"software.sigma.training.po.survey.data.domain"})
@ComponentScan(basePackages = {
        "software.sigma.training.po.survey.data.dao"
})
public class POSurveyDataContext {
}
