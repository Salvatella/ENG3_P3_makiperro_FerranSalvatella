package com.codurance.dip;

import java.time.MonthDay;

public class Clock implements DeviceInterface {
    @Override
    public MonthDay monthDay(){
        return MonthDay.now();
    }
}