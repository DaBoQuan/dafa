package pers.dafacloud.dao.mapper.onlineQestion;

import pers.dafacloud.dao.pojo.OnlineQuestion;

import java.util.List;
import java.util.Map;

//@Component
public interface OnlineQuestionMapper {

    List<Map> getQuestion(Map map);

    int getQuestionCount(Map map);

    List<OnlineQuestion> exportQuestion(Map map);

    int addQuestion(Map map);

    int deleteQuestion(int id);

    int updateQuestion(Map map);

}
