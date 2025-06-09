package com.jiawa.wiki.service;

import com.jiawa.wiki.domain.Test;
import com.jiawa.wiki.mapper.TestMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list() {
        try {
            List<Test> tests = testMapper.list();

        } catch (Exception e) {
            e.printStackTrace();  // 打印堆栈信息

        }


        return testMapper.list();
    }
}