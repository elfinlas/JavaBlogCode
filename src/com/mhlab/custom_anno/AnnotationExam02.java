package com.mhlab.custom_anno;

import com.mhlab.custom_anno.annotations.InsertStringData;

/**
 * 문자열 어노테이션 예제 클래스
 *
 * Created by MHLab on 08/09/2019..
 */

public class AnnotationExam02 {
    @InsertStringData(data = "MHLab")
    private String myData;

    @InsertStringData
    private String defaultData;

    public AnnotationExam02() {
        myData = "No data";
        defaultData = "No data";
    }

    public String getMyData() {
        return myData;
    }

    public String getDefaultData() {
        return defaultData;
    }
}
