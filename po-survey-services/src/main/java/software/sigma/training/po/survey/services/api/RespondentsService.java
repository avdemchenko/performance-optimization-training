package software.sigma.training.po.survey.services.api;

import org.springframework.data.domain.Pageable;
import software.sigma.training.po.survey.services.api.dto.RespondentDTO;

import java.util.Collection;

public interface RespondentsService {

    Collection<RespondentDTO> getAll();

    Collection<RespondentDTO> getAll(Pageable pageable);

}
