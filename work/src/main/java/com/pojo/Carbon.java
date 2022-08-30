package com.pojo;

public class Carbon {

    //标识
    private String id;
    //光盘打卡
    private Integer punchTheClock;
    //绿色用水
    private Integer water;
    //绿色用电
    private Integer electric;
    //绿色出行
    private Integer goOut;
    //回收减碳
    private Integer retrieve;
    //打包减碳
    private Integer bale;
    //公益减碳
    private Integer commonweal;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getPunchTheClock() {
        return punchTheClock;
    }

    public void setPunchTheClock(Integer punchTheClock) {
        this.punchTheClock = punchTheClock;
    }

    public Integer getWater() {
        return water;
    }

    public void setWater(Integer water) {
        this.water = water;
    }

    public Integer getElectric() {
        return electric;
    }

    public void setElectric(Integer electric) {
        this.electric = electric;
    }

    public Integer getGoOut() {
        return goOut;
    }

    public void setGoOut(Integer goOut) {
        this.goOut = goOut;
    }

    public Integer getRetrieve() {
        return retrieve;
    }

    public void setRetrieve(Integer retrieve) {
        this.retrieve = retrieve;
    }

    public Integer getBale() {
        return bale;
    }

    public void setBale(Integer bale) {
        this.bale = bale;
    }

    public Integer getCommonweal() {
        return commonweal;
    }

    public void setCommonweal(Integer commonweal) {
        this.commonweal = commonweal;
    }

    @Override
    public String toString() {
        return "Carbon{" +
                "id='" + id + '\'' +
                ", PunchTheClock=" + punchTheClock +
                ", water=" + water +
                ", electric=" + electric +
                ", goOut=" + goOut +
                ", retrieve=" + retrieve +
                ", bale=" + bale +
                ", commonweal=" + commonweal +
                '}';
    }
}
