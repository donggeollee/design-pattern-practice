package com.base.proxy;

public class BaristaManager implements Barista{

    private final Barista barista;
    private final String career = "manager";

    public BaristaManager(Barista barista){
        this.barista = barista;
    }

    @Override
    public String getCareer() {
        return this.career;
    }

    @Override
    public void roastingBeans(){
        Logging.println(barista.getCareer() + " 바리스타에게 로스팅을 위임하였습니다");

        long startRoastingTimes = System.currentTimeMillis();
        barista.roastingBeans();
        long endRoastingTimes = System.currentTimeMillis();

        Logging.println("로스팅에 " + (endRoastingTimes-startRoastingTimes) + "(ms)의 시간이 소요되었습니다.");
    }


}
