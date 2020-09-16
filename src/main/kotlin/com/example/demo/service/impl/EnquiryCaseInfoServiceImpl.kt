package com.example.demo.service.impl

import com.baomidou.mybatisplus.extension.plugins.pagination.Page
import com.example.demo.domain.EnquiryCaseInfo
import com.example.demo.mapper.EnquiryCaseInfoMapper
import com.example.demo.service.EnquiryCaseInfoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 *
 * @author leon
 * @date 2020/9/16
 */
@Service
class EnquiryCaseInfoServiceImpl : EnquiryCaseInfoService {

    @Autowired
    lateinit var enquiryCaseInfoMapper: EnquiryCaseInfoMapper


    override fun add(enquiryCaseInfo: EnquiryCaseInfo): Int {
        return enquiryCaseInfoMapper.insert(enquiryCaseInfo)
    }

    override fun findOne(id: Int): EnquiryCaseInfo {
        return enquiryCaseInfoMapper.selectById(id)
    }

    override fun findList(pageNum: Long, pageSize: Long): List<EnquiryCaseInfo> {
        var page: Page<EnquiryCaseInfo> = Page(pageNum, pageSize)
        return enquiryCaseInfoMapper.selectPage(page, null).records
    }
}