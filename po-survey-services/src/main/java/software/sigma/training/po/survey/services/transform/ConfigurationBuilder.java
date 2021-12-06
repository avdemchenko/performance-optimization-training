package software.sigma.training.po.survey.services.transform;

import java.beans.PropertyDescriptor;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.StringUtils;

import com.google.common.collect.Sets;

public class ConfigurationBuilder {
    
    private ConfigurationImpl config = null;
    
    private ClassConfigurationImpl currentType;
    
    private KeysCapitalization keysCapitalization = KeysCapitalization.CAMEL_CASE;
    
    private Set<String> ignoredProperties = new HashSet<>();
    
    public ConfigurationBuilder() {
        config = new ConfigurationImpl();
    }

    public Configuration build() {
        saveLastType();
        return config;
    }
    
    public ConfigurationBuilder setKeysCapitalization(KeysCapitalization capitalizationMode) {
        this.keysCapitalization = capitalizationMode;
        return this;
    }
    
    public ConfigurationBuilder ignoreAllProperties(String ...names) {
        ignoredProperties.addAll(Sets.newHashSet(names));
        return this;
    }
    
    public <T> ConfigurationBuilder addType(Class<T> clazz) {
        saveLastType();
        currentType = new ClassConfigurationImpl<>(clazz);

        PropertyDescriptor[] propertyDescriptors = PropertyUtils.getPropertyDescriptors(clazz);
        currentType.boundPropertyTypes = new HashMap<>();
        currentType.bindings = new HashMap<>();
        for (PropertyDescriptor descriptor : propertyDescriptors) {
            if (descriptor.getWriteMethod() != null && descriptor.getReadMethod() != null 
                    && !ignoredProperties.contains(descriptor.getName())) {
                currentType.boundPropertyTypes.put(descriptor.getName(), descriptor.getPropertyType());
                currentType.bindings.put(descriptor.getName(), keysCapitalization == KeysCapitalization.CAPITAL 
                        ? StringUtils.capitalize(descriptor.getName()) : descriptor.getName());
            }
        }
        
        return this;
    }

    private void saveLastType() {
        if (currentType != null) {
            config.beanConfigurations.put(currentType.typeClass, currentType);
        }
    }
    
    public ConfigurationBuilder ignoreProperties(String ...names) {
        currentType.boundPropertyTypes.remove(Sets.newHashSet(names));
        currentType.bindings.remove(Sets.newHashSet(names));
        return this;
    }
    
    public ConfigurationBuilder mapProperty(String propertyName, String keyName) {
        currentType.bindings.put(propertyName, keyName);
        return this;
    }
    
    class ClassConfigurationImpl<T> implements ClassConfiguration {
        
        private final Class<T> typeClass;
        
        private Map<String, Class<?>> boundPropertyTypes;
        
        private Map<String, String> bindings;
        
        ClassConfigurationImpl(Class<T> clazz) {
            this.typeClass = clazz;
        }
        
        @Override
        public Collection<String> getBoundPropertyNames() {
            return boundPropertyTypes.keySet();
        }
        
        @Override
        public <T> Class<T> getBoundPropertyClass(String propertyName) {
            return (Class<T>) boundPropertyTypes.get(propertyName);
        }
        
        @Override
        public String getKeyName(String propertyName) {
            return bindings.get(propertyName);
        }
        
    }
    
    class ConfigurationImpl implements Configuration {
        
        private Map<Class, ClassConfigurationImpl> beanConfigurations = new HashMap<>();

        @Override
        public ClassConfiguration getConfiguration(Class<?> clazz) {
            return beanConfigurations.get(clazz);
        }
        
        @Override
        public Collection<Class> getConfiguredClasses() {
            return beanConfigurations.keySet();
        }
        
    }
    
    public enum KeysCapitalization {
        CAMEL_CASE,
        CAPITAL
    }
    
}
