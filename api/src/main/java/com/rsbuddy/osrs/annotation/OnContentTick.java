package com.rsbuddy.osrs.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// this class may be deprecated at some point as it is basically a shortcut for @OnGameEvent(GameEvent.CONTENT_TICK)

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface OnContentTick {
    boolean requireLoggedIn() default true;
}
