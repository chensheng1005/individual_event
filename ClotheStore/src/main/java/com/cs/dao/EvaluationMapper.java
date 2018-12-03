package com.cs.dao;

import com.cs.entity.Evaluation;
import java.util.List;

public interface EvaluationMapper {
    int deleteByPrimaryKey(Integer evaluationId);

    int insert(Evaluation record);

    Evaluation selectByPrimaryKey(Integer evaluationId);

    List<Evaluation> selectAll();

    int updateByPrimaryKey(Evaluation record);
}