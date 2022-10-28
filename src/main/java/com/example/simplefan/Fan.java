package com.example.simplefan;

public class Fan {

    private int speed = 0;
    private boolean status = false;
    private boolean reverse = false;



    public int getSpeed(){
        return  speed;
    }


    public boolean getReverse(){
        return  reverse;
    }


    public boolean getStatus(){
        return  status;
    }


    public void pullReverseCord(){
        this.reverse = !reverse;
    }


    public void pullSpeedCord(){
        if(speed == 3){
            this.speed=0;
            this.status = false;
        }
        else {
            this.speed = this.speed + 1;
            if(!getStatus()) this.status = true;
        }
    }


    public String toString(){
        return "Fan Settings: Speed=" + getSpeed()+", on?:" + getStatus()+", Reverse-Mode:"+getReverse();
    }
}
