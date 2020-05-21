package com.study.dailylearning.listner;

import java.util.EventListener;

/**
 * @description
 * @date 16:13 2020/5/21
 */
public class ButtonClickListenerInner implements EventListener {

    public void ButtonClicked(ButtonClickEvent event) {
        ButtonDemo eventSource = (ButtonDemo) event.getEventSource();
        System.out.println(eventSource);
    }
}
