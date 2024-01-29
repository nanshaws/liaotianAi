package com.example.liaotian.xiancheng;

import com.example.liaotian.context.BigModelNew;

public class SendThread extends Thread{

    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public SendThread(String  text){
        this.text=text;
    }

    public SendThread() {

    }

    @Override
    public void run() {
        try {
            BigModelNew.play(text);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
