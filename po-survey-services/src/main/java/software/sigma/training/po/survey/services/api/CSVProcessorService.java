package software.sigma.training.po.survey.services.api;

import java.io.IOException;
import java.io.InputStream;

public interface CSVProcessorService {

    void process(InputStream is) throws IOException;
    
}
