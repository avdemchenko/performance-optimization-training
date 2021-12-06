package software.sigma.training.po.survey.services.transform;

import java.util.Collection;

public interface Configuration {

    ClassConfiguration getConfiguration(Class<?> clazz);
    
    Collection<Class> getConfiguredClasses();
    
}
