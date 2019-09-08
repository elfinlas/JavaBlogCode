package com.mhlab;

import com.mhlab.custom_anno.AnnotationExam01;
import com.mhlab.custom_anno.AnnotationExam02;
import com.mhlab.custom_anno.AnnotationHandler;
import com.mhlab.custom_anno.annotations.InsertIntData;
import com.mhlab.custom_anno.annotations.InsertStringData;

/**
 * 메인 클래스
 */

public class Main {

    public static void main(String[] args) {
        runByCustomAnnotationExam();
    }

    /**
     * 커스텀 어노테이션 예제를 실행하는 메서드
     */
    public static void runByCustomAnnotationExam() {
        //어노테이션 핸들러 객체를 생성
        AnnotationHandler handler = new AnnotationHandler();

        //정수형 어노테이션을 체크
        AnnotationExam01 exam01 = (AnnotationExam01)handler.getInstance(AnnotationExam01.class, InsertIntData.class)
                .orElseGet(AnnotationExam01::new);

        //문자열 어노테이션을 체크
        AnnotationExam02 exam02 = (AnnotationExam02) handler.getInstance(AnnotationExam02.class, InsertStringData.class)
                .orElseGet(AnnotationExam02::new);

        //결과 값 확인
        System.out.println("myAge = " + exam01.getMyAge());
        System.out.println("defaultAge = " + exam01.getDefaultAge());

        System.out.println("myData = " + exam02.getMyData());
        System.out.println("defaultData = " + exam02.getDefaultData());
    }
}
