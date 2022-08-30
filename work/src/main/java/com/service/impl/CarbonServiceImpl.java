package com.service.impl;

import com.mapper.CarbonMapper;
import com.pojo.Carbon;
import com.service.CarbonService;
import com.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class CarbonServiceImpl implements CarbonService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public List<Carbon> selectAll() {
        SqlSession sqlSession = factory.openSession();
        CarbonMapper carbonMapper = sqlSession.getMapper(CarbonMapper.class);
        List<Carbon> carbons = carbonMapper.selectAll();
        sqlSession.close();
        return carbons;
    }

    @Override
    public Carbon selectOne(String id) {
        SqlSession sqlSession = factory.openSession();
        CarbonMapper carbonMapper = sqlSession.getMapper(CarbonMapper.class);
        Carbon carbon = carbonMapper.selectOne(id);
        sqlSession.close();
        return carbon;
    }

    @Override
    public void add(String id) {
        SqlSession sqlSession = factory.openSession();
        CarbonMapper carbonMapper = sqlSession.getMapper(CarbonMapper.class);
        carbonMapper.add(id);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void update(Carbon carbon) {
        SqlSession sqlSession = factory.openSession();
        CarbonMapper carbonMapper = sqlSession.getMapper(CarbonMapper.class);
        carbonMapper.update(carbon);
        sqlSession.commit();
        sqlSession.close();
    }
}
