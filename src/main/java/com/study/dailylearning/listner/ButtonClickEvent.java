package com.study.dailylearning.listner;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.EventObject;

/**
 * @description 事件类,包含了事件源
 * @date 16:10 2020/5/21
 */
@Getter
@Setter
@ToString
public class ButtonClickEvent extends EventObject {

    private Object eventSource;
    private String msg;

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ButtonClickEvent(Object source) {
        super(source);
        eventSource = source;
    }


    public ButtonClickEvent(Object source,String msg) {
        super(source);
        eventSource = source;
        this.msg = msg;
    }
}
