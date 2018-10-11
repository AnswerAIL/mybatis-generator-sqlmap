package com.answer.mybatis.generator.entity;

import java.util.Date;

public class RiskScore {
    private String stock_id;

    private Date date_key;

    private String score;

    public String getStock_id() {
        return stock_id;
    }

    public void setStock_id(String stock_id) {
        this.stock_id = stock_id == null ? null : stock_id.trim();
    }

    public Date getDate_key() {
        return date_key;
    }

    public void setDate_key(Date date_key) {
        this.date_key = date_key;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }
}