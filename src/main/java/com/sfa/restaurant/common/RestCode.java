package com.sfa.restaurant.common;

public enum RestCode {
    OK(0,"ok"),
    UNKNOWN_ERROR(1,"未知异常/用户服务异常"),
    TOKEN_INVALID(2,"TOKEN失效"),
    DATA_MAIN_SUCCESS(3,"资料维护成功"),
    DATA_MAIN_FAIL(4,"资料维护失败"),
    USER_NOT_EXIST(50003,"用户不存在"),
    WRONG_PAGE(10100,"页码不合法"),
    LACK_PARAMS(10101,"缺少参数"),
    NOT_DATA_FOUND(10102,"查无资料"),
    NO_DATA_FOUND(10102,"查无资料"),
    INSERT_FAIL(-1,"更新資料失敗"),
    OPERATE_FAIL(-2,"操作失败"),

    SERVER_ERROR(4004,"服务异常"),


    VERSION_OK(5,"版本正常"),
    VERSION_UPDATE(6,"版本需要更新"),

    DAILY_VISIT_INIT_FAIL(20020,"初始每日拜访资料失败"),
    DAILY_VISIT_UPDATE_FAIL(1,"更新資料失敗"),


    ILLEGAL_PARAMS_RULE(10103,"无资料内容"),
    ILLEGAL_PARAMS(10102,"参数不合法"),
    FAILURE_ADD(10103,"新增失败"),


    COMMODITY_IN_SH(50101,"产品库已存在"),
    COMMODITY_IN_STORE(50102,"该商店存在"),
    COMMODITY_NOT_IN_SH(50103,"第三方查询"),
    
    //验证码失效或不正确
    FAILURE_ERROR(50012,"验证码失效或错误"),
	//第一次登陆
	FIRST_LOGIN(50011,"第一次登陆，设定密码"),
    PASSWORD_ERROR(50013,"密码錯誤"),
    PASSWORD_RULE_ERROR_1(50014,"密码验证规则不符（至少6-16 位，需要有字母数字混和且不能为888888)"),
    PASSWORD_RULE_ERROR_2(50015,"旧密码错误"),
	PASSWORD_RULE_ERROR_3(50016,"两次密码不一致"),
    //验证码失效或不正确
    ACCOUNT_DISABLED(50017,"您的帐号已被注销");

    public final int code;
    public final String msg;

    private RestCode(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

}
