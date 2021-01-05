package com.cdt.curriculumdesign.base.common;


import java.io.Serializable;

/**
 *
 * @author  pandora gen
 * @param <T>
 */
public class DataResult<T> implements Serializable {
    private static final long serialVersionUID = -1954065564856833013L;
    /**
     *  返回码0 -> 成功,401 -> 没有权限,404 -> 查询的对象不存在,408 -> 请求超时,500 -> 未知错误  201~250 -> 业务自定义返回码
     */
    private int code = 0;
    /**
     * 提示语
     */
    private String message = "";
     /**
     * 返回数据
     */
    private T data;

    public DataResult() {
    }

    public static <T> com.cdt.curriculumdesign.base.common.DataResult<T> success(T data, String message) {
        com.cdt.curriculumdesign.base.common.DataResult<T> result = new com.cdt.curriculumdesign.base.common.DataResult<>();
        result.setCode(RespCode.SUCCESS.getCode()).setMessage(message).setData(data);
        return result;
    }

    public static <T> com.cdt.curriculumdesign.base.common.DataResult<T> success(T data) {
        com.cdt.curriculumdesign.base.common.DataResult<T> result = new com.cdt.curriculumdesign.base.common.DataResult<>();
        result.setCode(RespCode.SUCCESS.getCode()).setMessage("success").setData(data);
        return result;
    }

    public static <T> com.cdt.curriculumdesign.base.common.DataResult<T> timeout(String message) {
        com.cdt.curriculumdesign.base.common.DataResult<T> result = new com.cdt.curriculumdesign.base.common.DataResult<>();
        result.setCode(RespCode.TIMEOUT.getCode()).setMessage(message);
        return result;
    }


    public static <T> com.cdt.curriculumdesign.base.common.DataResult<T> serverError(String message) {
        com.cdt.curriculumdesign.base.common.DataResult<T> result = new com.cdt.curriculumdesign.base.common.DataResult<>();
        result.setCode(RespCode.UNKNOWN_ERROR.getCode()).setMessage(message);
        return result;
    }



    public int getCode() {
        return this.code;
    }

    public com.cdt.curriculumdesign.base.common.DataResult<T> setCode(int code) {
        this.code = code;
        return this;
    }




    public String getMessage() {
        return this.message;
    }

    public com.cdt.curriculumdesign.base.common.DataResult<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getData() {
        return this.data;
    }

    public com.cdt.curriculumdesign.base.common.DataResult<T> setData(T data) {
        this.data = data;
        return this;
    }
}
