package software.sigma.training.po.survey.services.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import software.sigma.training.po.survey.data.dao.RespondentDao;
import software.sigma.training.po.survey.data.domain.Respondent;
import software.sigma.training.po.survey.services.api.RespondentsService;
import software.sigma.training.po.survey.services.api.dto.RespondentDTO;

@Service("respondentsService")
public class RespondentsServiceImpl implements RespondentsService {

    @Autowired
    private RespondentDao respondentDao;
    
    @Override
    public Collection<RespondentDTO> getAll() {
        List<Respondent> source = respondentDao.getAll();
        List<RespondentDTO> res = new ArrayList<>();

        for (Respondent respondent : source) {
            RespondentDTO dto = new RespondentDTO();
            dto.setId(respondent.getId());
            dto.setCountry(respondent.getCountry());
            dto.setExpectedSalary(respondent.getExpectedSalary());
            dto.setGender(respondent.getGender());
            dto.setInterestedAnswers(respondent.getInterestedAnswers());
            dto.setProfessional(respondent.getProfessional());
            
            res.add(dto);
        }
        
        return res;
    }
    
}
