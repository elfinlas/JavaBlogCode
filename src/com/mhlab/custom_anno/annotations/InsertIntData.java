package com.mhlab.custom_anno.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 정수형 주입 어노테이션
 *
 * Created by MHLab on 08/09/2019..
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface InsertIntData {
    int data() default 0;
}
