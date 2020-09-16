package com.example.demo.controller

import com.example.demo.domain.EnquiryCaseInfo
import com.example.demo.service.EnquiryCaseInfoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 *
 * @author leon
 * @date 2020/9/16
 */
@RestController
@RequestMapping("/enquiry/case")
class EnquiryCaseInfoController {

    @Autowired
    lateinit var enquiryCaseInfoService: EnquiryCaseInfoService

    /**
     * 获取询价详情
     */
    @GetMapping("/findOne/{id}")
    fun findOne(@PathVariable id :Int) :EnquiryCaseInfo{
        return enquiryCaseInfoService.findOne(id)
    }

    /**
     * 获取询价列表
     */
    @GetMapping("/findList")
    fun findList(@RequestParam pageNum: Long, @RequestParam pageSize: Long): List<EnquiryCaseInfo> {
        return enquiryCaseInfoService.findList(pageNum, pageSize)
    }

    /**
     * 添加询价案例
     */
    @PostMapping("/add")
    fun add(@RequestBody enquiryCaseInfo: EnquiryCaseInfo): Int {
        return enquiryCaseInfoService.add(enquiryCaseInfo);
    }
}