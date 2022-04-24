package com.course.pojo;

import java.io.Serializable;
import java.util.Calendar;

/**
 * @author lixuy
 * Created on 2019-04-10
 */
public class PointObject implements Serializable{

    private static final long serialVersionUID = 123456789L;

    //id
    private Integer id;
    //成长积分数
    private Integer growScore;
    //可兑换积分数
    private Integer exchangeScore;
    //总积分数
    private Integer scoreTotal;
    //参加科研招募
    private Integer researchRecruitment;
    //可兑换积分有效期时间
    private Calendar ExchangePointTime;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGrowScore() {
        return growScore;
    }

    public void setGrowScore(Integer growScore) {
        this.growScore = growScore;
    }

    public Integer getExchangeScore() {
        return exchangeScore;
    }

    public void setExchangeScore(Integer exchangeScore) {
        this.exchangeScore = exchangeScore;
    }

    public Integer getScoreTotal() {
        return scoreTotal;
    }

    public void setScoreTotal(Integer scoreTotal) {
        this.scoreTotal = scoreTotal;
    }


    //参加科研
    public void setResearchRecruitment(Integer researchRecruitment) {
        this.researchRecruitment = researchRecruitment;
    }

    public Integer getResearchRecruitment() {
        return researchRecruitment;
    }

    //可兑换积分的清零时间
    public void setExchangePointTime() {
        this.ExchangePointTime = Calendar.getInstance();
    }
    public Calendar getExchangePointTime() {
        return ExchangePointTime;
    }
}
