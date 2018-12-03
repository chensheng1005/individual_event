package com.cs.entity;

public class Evaluation {
    private Integer evaluationId;

    private String evaluationGoodPoor;

    public Integer getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(Integer evaluationId) {
        this.evaluationId = evaluationId;
    }

    public String getEvaluationGoodPoor() {
        return evaluationGoodPoor;
    }

    public void setEvaluationGoodPoor(String evaluationGoodPoor) {
        this.evaluationGoodPoor = evaluationGoodPoor == null ? null : evaluationGoodPoor.trim();
    }
}