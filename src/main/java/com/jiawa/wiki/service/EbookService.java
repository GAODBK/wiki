package com.jiawa.wiki.service;

import com.jiawa.wiki.domain.Ebook;
import com.jiawa.wiki.domain.EbookExample;
import com.jiawa.wiki.mapper.EbookMapper;
import com.jiawa.wiki.req.EbookReq;
import com.jiawa.wiki.resp.EbookResp;
import com.jiawa.wiki.resp.PageResp;
import com.jiawa.wiki.util.CopyUtil;
import jakarta.annotation.Resource;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class EbookService {

    @Resource
    private EbookMapper eBookMapper;

    public PageResp<EbookResp> list(EbookReq req) {
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();

        if (!ObjectUtils.isEmpty(req.getName())) {
            criteria.andNameLike("%" + req.getName() + "%");
        }

        int page = req.getPage() != 0 ? req.getPage() : 1;
        int size = req.getSize() != 0 ? req.getSize() : 10;
        RowBounds rowBounds = new RowBounds((page - 1) * size, size);

        // 查询分页数据
        List<Ebook> ebooksList = eBookMapper.selectByExample(ebookExample, rowBounds);
        List<EbookResp> list = CopyUtil.copyList(ebooksList, EbookResp.class);

        // 查询总记录数
        long total = eBookMapper.countByExample(ebookExample);

        // 封装分页结果
        PageResp<EbookResp> pageResp = new PageResp<>();
        pageResp.setTotal(total);
        pageResp.setList(list);

        return pageResp;
    }}