package com.gy.dfs.enums;

public enum DFSEnum {
    OSS_SERVICE_TYPE(1,"OSS"),
    OBS_SERVICE_TYPE(2,"OBS"),
    QIANNIU_SERVICE_TYPE(1,"OSS");
    private Integer code;
    private String desc;
    DFSEnum(Integer code,String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
