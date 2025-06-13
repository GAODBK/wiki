package com.jiawa.wiki.service;

import com.jiawa.wiki.domain.Ebook;
import com.jiawa.wiki.domain.EbookExample;
import com.jiawa.wiki.mapper.EbookMapper;
import com.jiawa.wiki.req.EbookQueryReq;
import com.jiawa.wiki.req.EbookSaveReq;
import com.jiawa.wiki.resp.EbookQueryResp;
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

    public PageResp<EbookQueryResp> list(EbookQueryReq req) {
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
        List<EbookQueryResp> list = CopyUtil.copyList(ebooksList, EbookQueryResp.class);

        // 查询总记录数
        long total = eBookMapper.countByExample(ebookExample);

        // 封装分页结果
        PageResp<EbookQueryResp> pageResp = new PageResp<>();
        pageResp.setTotal(total);
        pageResp.setList(list);

        return pageResp;
    }

    public void save(EbookSaveReq req) {

        Ebook ebook = CopyUtil.copy(req, Ebook.class);

        if (ObjectUtils.isEmpty(req.getId())) {
            // 新增
            eBookMapper.insert(ebook);
        } else {
            // 更新
            eBookMapper.updateByPrimaryKey(ebook);
        }
    }
}