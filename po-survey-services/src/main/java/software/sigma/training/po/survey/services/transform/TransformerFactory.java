package software.sigma.training.po.survey.services.transform;

public interface TransformerFactory {

    <T> Transformer<T> getTransformer(Class<T> clazz);
    
}
