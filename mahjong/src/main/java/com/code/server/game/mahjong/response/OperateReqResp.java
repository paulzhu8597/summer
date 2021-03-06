package com.code.server.game.mahjong.response;

import java.util.List;

/**
 * Created by win7 on 2016/12/2.
 */
public class OperateReqResp {
    public static final int type_gang = 1;
    public static final int type_peng = 2;
    public static final int type_ting = 3;
    public static final int type_hu = 4;
    public static final int type_chi = 5;
    public static final int type_chi_ting = 6;
    public static final int type_peng_ting = 7;
    public static final int type_dan = 8;
    public static final int type_xuanfengdan = 9;





    private int operateType = 0;
    private String card;
    private int fromUserId;
    private int userId;
    private boolean isMing;
    private List<String> chiCards;
    private List<String> xuanfengCards;

    public int getOperateType() {
        return operateType;
    }

    public void setOperateType(int operateType) {
        this.operateType = operateType;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public int getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(int fromUserId) {
        this.fromUserId = fromUserId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public boolean isMing() {
        return isMing;
    }

    public void setIsMing(boolean isMing) {
        this.isMing = isMing;
    }

    public List<String> getChiCards() {
        return chiCards;
    }

    public OperateReqResp setChiCards(List<String> chiCards) {
        this.chiCards = chiCards;
        return this;
    }

    public List<String> getXuanfengCards() {
        return xuanfengCards;
    }

    public OperateReqResp setXuanfengCards(List<String> xuanfengCards) {
        this.xuanfengCards = xuanfengCards;
        return this;
    }
}
