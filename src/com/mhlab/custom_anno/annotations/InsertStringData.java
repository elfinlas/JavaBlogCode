package com.mhlab.custom_anno.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 문자열 주입 어노테이션
 *
 * Created by MHLab on 08/09/2019..
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface InsertStringData {
    String data() default "default";
}
