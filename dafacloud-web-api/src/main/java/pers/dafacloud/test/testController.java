package pers.dafacloud.test;

import org.apache.ibatis.session.SqlSession;
import pers.dafacloud.mapper.apiContent.ApiContentMapper;
import pers.dafacloud.model.ApiContent;
import pers.dafacloud.utils.SqlSessionFactoryUtils;

import java.util.List;

public class testController {

    public static void main(String[] args) {
        SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession();
        ApiContentMapper apiContentMapper = sqlSession.getMapper(ApiContentMapper.class);
        ApiContent apiContent =new ApiContent();
        apiContent.setApiName("login");
        apiContent.setPath("/v1/userCenter/login");
        apiContent.setMethod("get");
        //apiContent.setBody("inviteCode=&accountNumber=qwerty&password=b4e82b683394b50b679dc2b51a79d987&userType=1&random=12");
        //apiContent.setHeader("");
        //apiContent.setDependApiName("");
        apiContent.setModule("用户");
        apiContent.setCmsFront("登陆页");
        apiContent.setProject(1);
        apiContent.setDescription("登陆");
        apiContent.setOwner("alysia");
        //addApi
//        int i = apiContentMapper.addApi(apiContent);
//        System.out.println(i);
        //System.out.println(count);
        //queryApi
        ApiContent apiContent1 =new ApiContent();
        apiContent1.setOwner("duke");
        apiContent1.setApiName("log");
        List<ApiContent> list = apiContentMapper.queryApi(apiContent1);
        System.out.println(list.size());
        System.out.println(list);
        //deleteApi
        //int delete = apiContentMapper.deleteApi(2);
       // System.out.println(delete);




    }
}