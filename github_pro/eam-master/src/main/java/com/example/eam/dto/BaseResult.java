package com.example.eam.dto;


import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 数据传输对象
 * 返回给前端的对象
 */
@Data
public class BaseResult implements Serializable {
    public static final String RESULT_Ok = "ok";
    public static final String RESULT_NOT_OK = "not_ok";
    public static final String SUCCESS = "成功操作";

    private String result;
    private Object data; //将返回值加入data中
    private String success;
    private Cursor cursor;
    private List<Error> errors;


    public static BaseResult ok(){
        return createResult(RESULT_Ok, null, SUCCESS, null, null);
    }

    public static BaseResult ok(String success){
        return createResult(RESULT_Ok, null, success, null, null);
    }

    public static BaseResult ok(Object data){
        return createResult(RESULT_Ok, data, SUCCESS, null, null);
    }

    public static BaseResult ok(Object data, Cursor cursor){
        return createResult(RESULT_Ok, data, SUCCESS, cursor, null);
    }

    public static BaseResult notOk(List<Error> errors){
        return createResult(RESULT_NOT_OK, null, "", null, errors);
    }


    /**
     *
     * @param result
     * @param data
     * @param success
     * @param cursor
     * @param errors
     * @return
     */
    private static BaseResult createResult(String result, Object data, String success, Cursor cursor, List<Error> errors){
        BaseResult baseResult = new BaseResult();
        baseResult.setCursor(cursor);
        baseResult.setData(data);
        baseResult.setErrors(errors);
        baseResult.setResult(result);
        baseResult.setSuccess(success);
        return baseResult;
    }

    @Data
    public static class Cursor{
        private int total;
        private int offset;
        private int limit;
    }

    @Data
    public static class Error{
        private String field;
        private String message;

        public Error(String field, String message) {
            this.field = field;
            this.message = message;
        }
    }
}
