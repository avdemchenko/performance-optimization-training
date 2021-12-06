package software.sigma.training.po.survey.services.transform;

import java.util.Map;

public interface Transformer<T> {

    T transform(Map<String, String> source, String propertyName) throws TransformerException;
    
}
