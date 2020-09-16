package com.example.demo.domain

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName

/**
 *
 * @author leon
 * @date 2020/9/16
 */
@TableName("enquiry_case_info")
data class EnquiryCaseInfo (

        @TableId(type = IdType.AUTO)
        var id: Int? = null,

        var agreementPremiseName: String? = null,

        var agreementPremiseAddr: String? = null,

        var type: Int? = null
)