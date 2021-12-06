package software.sigma.training.po.survey.services.api;

public interface StatusTracker {

    long getTotalCount();
    
    long getCurrent();
    
    int getPercentage();
    
}
