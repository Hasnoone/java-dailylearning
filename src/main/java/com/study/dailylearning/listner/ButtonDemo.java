package com.study.dailylearning.listner;

import lombok.Getter;
import lombok.Setter;

import java.util.EventListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @description
 * @date 16:16 2020/5/21
 */
@Getter
@Setter
public class ButtonDemo {
    private String msg ;
    private Set<EventListener> listeners;


    public ButtonDemo(String msg, Set<EventListener> listeners) {
        this.msg = msg;
        this.listeners = listeners;
    }


    public ButtonDemo() {
        this.msg = "default listener msg";
        this.listeners = new HashSet<>();
    }

    public ButtonDemo(String msg) {
        this.msg = msg;
        this.listeners = new HashSet<>();
    }


    public void AddItemClickListener(EventListener listener){
        // 添加到监听器列表
        this.listeners.add(listener) ;
    }


    public void ButtonClick() {
        // 通知所有监听者
        notifies() ;
    }


    private void notifies() {
        Iterator<EventListener> iterator = listeners.iterator();
        while (iterator.hasNext()) {
            // 获取当前的对象
            ButtonClickListenerInner listener = (ButtonClickListenerInner) iterator.next();
            // 事件触发,事件的构造函数参数为事件源
            listener.ButtonClicked(new ButtonClickEvent(this));
        }
    }

    public static void main(String[] args) {
        ButtonDemo buttonDemo = new ButtonDemo("Hello, I am a ButtonDemo") ;
        // 添加监听器
        buttonDemo.AddItemClickListener(new ButtonClickListenerInner()) ;
        // 事件触发
        buttonDemo.ButtonClick();
    }

}
