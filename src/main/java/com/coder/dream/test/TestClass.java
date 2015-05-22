package com.coder.dream.test;

import com.coder.dream.base.dao.query.support.DefaultDynamicQuery;
import com.coder.dream.dao.mapper.user.UserMapper;
import com.coder.dream.dao.model.user.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;
import java.util.List;

public class TestClass {

    public static SqlSession getTestSqlSession(){
        Reader reader = null;
        try{
            reader = Resources.getResourceAsReader("mybatis.xml");
        }catch (Exception e){

        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }

    public static void main(String[] args) throws Exception{
        SqlSession sqlSession = getTestSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        DefaultDynamicQuery filters = new DefaultDynamicQuery();
//        filters.eq("name","123");
        List<User> users = userMapper.list(filters);
        System.out.println(users.size());
        sqlSession.close();
    }
}
