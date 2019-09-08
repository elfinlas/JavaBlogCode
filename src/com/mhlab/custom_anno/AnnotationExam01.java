package com.mhlab.custom_anno;

import com.mhlab.custom_anno.annotations.InsertIntData;

/**
 * 정수형 어노테이션 에제 클래스
 * Created by MHLab on 08/09/2019..
 */

public class AnnotationExam01 {
    @InsertIntData(data = 30)
    private int myAge;

    @InsertIntData
    private int defaultAge;

    public AnnotationExam01() {
        this.myAge = -1;
        this.defaultAge = -1;
    }

    public int getMyAge() {
        return myAge;
    }

    public int getDefaultAge() {
        return defaultAge;
    }
}
