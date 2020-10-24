package com.nenya.common.response;

import com.github.pagehelper.PageInfo;

import java.io.Serializable;
import java.util.List;

/**
 * @author mingyang.ma created on 2020-09-16
 * @version 1.0.0
 * @description 统一结果分页返回
 */
public class CommonPage<T> implements Serializable {
    /**
     * 状态码
     */
    private int code;
    /**
     * 提示信息
     */
    private String msg;
    /**
     * 数据封装
     */
    private List<T> data;
    /**
     * 当前页码
     */
    private Integer pageNum;
    /**
     * 每页数量
     */
    private Integer pageSize;
    /**
     * 总页数
     */
    private Integer totalPage;
    /**
     * 总条数
     */
    private Long total;

    /**
     * 方法描述:集合分页
     * 创建时间:2020-09-19 07:40
     *
     * @param data     集合数据
     * @param pageInfo 分页信息
     * @return com.nenya.common.response.CommonPage<T>
     * @author mingyang.ma
     */
    public static <T> CommonPage<T> success(List<T> data, PageInfo pageInfo) {
        CommonPage<T> result = new CommonPage<T>();
        result.setCode(CommonCode.SUCCESS.getCode());
        result.setMsg(CommonCode.SUCCESS.getMsg());
        result.setTotalPage(pageInfo.getPages());
        result.setPageNum(pageInfo.getPageNum());
        result.setPageSize(pageInfo.getPageSize());
        result.setTotal(pageInfo.getTotal());
        result.setData(data);
        return result;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public CommonPage<T> setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public CommonPage<T> setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public CommonPage<T> setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    public Long getTotal() {
        return total;
    }

    public CommonPage<T> setTotal(Long total) {
        this.total = total;
        return this;
    }

    public int getCode() {
        return code;
    }

    public CommonPage<T> setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public CommonPage<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public List<T> getData() {
        return data;
    }

    public CommonPage<T> setData(List<T> data) {
        this.data = data;
        return this;
    }
}
