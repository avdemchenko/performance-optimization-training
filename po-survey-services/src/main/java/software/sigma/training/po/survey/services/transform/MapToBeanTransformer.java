package software.sigma.training.po.survey.services.transform;

import java.util.Map;

import org.apache.commons.beanutils.PropertyUtils;

public class MapToBeanTransformer<T> implements Transformer<T> {

    private final TransformerFactory transformerFactory;
    
    private final ClassConfiguration bindingConfiguration;
    
    private final Class<T> beanClass;
    
    public MapToBeanTransformer(TransformerFactory factory, ClassConfiguration bindingConfiguration, Class<T> clazz) {
        this.transformerFactory = factory;
        this.bindingConfiguration = bindingConfiguration;
        this.beanClass = clazz;
    }
    
    @Override
    public T transform(Map<String, String> source, String propertyName) throws TransformerException {
        try {
            T bean = beanClass.newInstance();

            for (String boundProperty : bindingConfiguration.getBoundPropertyNames()) {
                Class<Object> boundPropertyClass = bindingConfiguration.getBoundPropertyClass(boundProperty);
                Transformer<Object> propertyTransformer = transformerFactory.getTransformer(boundPropertyClass);
                Object value = propertyTransformer.transform(source, bindingConfiguration.getKeyName(boundProperty));
                PropertyUtils.setProperty(bean, boundProperty, value);
            }

            return bean;
        } catch (Exception e) {
            throw new TransformerException("Error during initializing target bean", e);
        }
    }

    
    
}
