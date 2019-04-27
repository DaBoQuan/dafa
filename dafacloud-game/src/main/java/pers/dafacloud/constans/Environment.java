package pers.dafacloud.constans;

public enum Environment {
    DEFAULT("http://app.dfcdn5.com","app.dfcdn5.com"),
//    DEFAULT("http://app.dfcdn5.com","app.dfcdn5.com"),3.1.152.170
    TEST("http://dafacloud-test.com","pers.dafacloud-test.com"),
    PRO("http://caishen01.com","caishen01.com"),
    pre("http://dafacloud-pre.com","dafacloud-pre.com"),//
    TESTAPP("http://app.dfcdn5.com","app.dfcdn5.com");


    public String url;
    public  String domain;
    //构造方法
    Environment(String url, String domain) {
        this.url = url;
        this.domain = domain;
    }

}