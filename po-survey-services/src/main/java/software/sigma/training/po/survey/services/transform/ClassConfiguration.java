package software.sigma.training.po.survey.services.transform;

import java.util.Collection;

public interface ClassConfiguration {

    Collection<String> getBoundPropertyNames();
    
    <T> Class<T> getBoundPropertyClass(String propertyName);
    
    String getKeyName(String propertyName);
    
}
