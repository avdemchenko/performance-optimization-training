package software.sigma.training.po.survey.services.impl;

import software.sigma.training.po.survey.services.api.StatusTracker;

import java.util.concurrent.atomic.AtomicLong;

public class StatusTrackerImpl implements StatusTracker {

    private final long totalCount;
    
    private AtomicLong currentRecord;
    
    StatusTrackerImpl(long totalCount) {
        this.totalCount = totalCount;
        currentRecord = new AtomicLong(0L);
    }
    
    void increment() {
        currentRecord.incrementAndGet();
    }

    @Override
    public long getTotalCount() {
        return totalCount;
    }

    @Override
    public long getCurrent() {
        // TODO Auto-generated method stub
        return currentRecord.get();
    }

    @Override
    public int getPercentage() {
        return (int) (100 * currentRecord.get() / totalCount);
    }
    
    
    
}
