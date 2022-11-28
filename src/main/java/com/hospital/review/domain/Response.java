package com.hospital.review.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Response<T> {
    private String resultCode;
    private T result;  // 성공 결과값은 T(리스폰스 객체)로 감싸서 리턴.

    public static Response<Void> error (String resultCode) {
        return new Response(resultCode, null);
    }
    public static <T> Response<T> success(T result) {
        return new Response("SUCCESS", result);
    }

}
