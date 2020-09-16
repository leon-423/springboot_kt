package com.example.demo.service

import com.example.demo.domain.EnquiryCaseInfo

/**
 *
 * @author leon
 * @date 2020/9/16
 */
interface EnquiryCaseInfoService {

    /**
     * 获取询价详情
     */
    fun findOne(id :Int) : EnquiryCaseInfo

    /**
     * 获取询价列表
     */
    fun findList(pageNum :Long, pageSize :Long) :List<EnquiryCaseInfo>

    /**
     * 添加询价案例
     */
    fun add(enquiryCaseInfo: EnquiryCaseInfo): Int
}