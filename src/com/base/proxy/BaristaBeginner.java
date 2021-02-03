package com.base.proxy;

public class BaristaBeginner implements Barista{

    private final String career = "beginner";

    @Override
    public String getCareer() {
        return this.career;
    }

    @Override
    public void roastingBeans(){
        Logging.println(this.career + " 바리스타가 로스팅을 시작합니다.");
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Logging.println(this.career + " 바리스타가 로스팅을 종료했습니다.");
    }

}
