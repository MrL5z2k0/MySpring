package com.lzk.springframework.MySHixian;

/**
 * @author kasuo
 * @date 2021/8/27 3:45 下午
 */
//public class ApiVersionRequestCondition implements RequestCondition<ApiVersionRequestCondition> {
//
//    private String value;
//
//    public String getValue(){
//        return value;
//    }
//
//    public void setValue(String value){
//        this.value = value;
//    }
//
//    public ApiVersionRequestCondition(String value){
//        this.value = value;
//    }
//
//    /** 一个http接口上有多个条件规则时，用于合并*/
//    @Override
//    public ApiVersionRequestCondition combine(ApiVersionRequestCondition apiVersion) {
//        return new ApiVersionRequestCondition(apiVersion.value);
//    }
//
//    /** 这个是重点，用于判断当前匹配条件和请求是否匹配；如果不匹配返回null
//     如果匹配，生成一个新的请求匹配条件，该新的请求匹配条件是当前请求匹配条件针对指定请求request的剪裁
//     举个例子来讲，如果当前请求匹配条件是一个路径匹配条件，包含多个路径匹配模板，
//     并且其中有些模板和指定请求request匹配，那么返回的新建的请求匹配条件将仅仅
//     包含和指定请求request匹配的那些路径模板。*/
//    @Override
//    public ApiVersionRequestCondition getMatchingCondition(HttpServletRequest request) {
//        //String version = request.getHeader("version");
//        String version = request.getParameter("version");
//        if(this.value.equals(version)){
//            return this;
//        }
//
//        return null;
//    }
//
//    /**针对指定的请求对象request发现有多个满足条件的，用来排序指定优先级，使用最优的进行响应*/
//    @Override
//    public int compareTo(ApiVersionRequestCondition apiVersion, HttpServletRequest httpServletRequest) {
//        return this.value.compareTo(apiVersion.value);
//    }
//}
