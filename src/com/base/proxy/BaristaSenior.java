package com.base.proxy;

public class BaristaSenior implements Barista{

    private final String career = "senior";

    @Override
    public String getCareer() {
        return this.career;
    }

    @Override
    public void roastingBeans() {
        Logging.println(this.career + " 바리스타가 로스팅을 시작합니다.");
        try {
            Thread.sleep(1000*2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Logging.println(this.career + " 바리스타가 로스팅을 종료했습니다.");
    }
}
