package dafagame.test;

import pers.utils.dafaRequest.DafaRequest;
import pers.utils.httpclientUtils.HttpConfig;

/***
 *报表给游戏服务每天盈利数据，内部接口
 * */
public class GameAmountDaily {
    private static String host = "http://a4cdf4aef23dc11ea8f02061e82846b5-26ec5fa4ac0099ca.elb.ap-east-1.amazonaws.com";
    private static String gameAmountDaily = host + "/v1/report/platformReport/gameAmountDaily?date=2020-02-05";

    public static void main(String[] args) {
        System.out.println(DafaRequest.get(HttpConfig.custom().url(gameAmountDaily)));
    }
}
