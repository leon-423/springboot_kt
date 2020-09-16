package com.example.demo

import com.example.demo.enum.ResultStatus

/**
 *
 * @author leon
 * @date 2020/9/16
 */
data class Result(val code: Int, val message: String) {
    constructor(status: ResultStatus) : this(status.code, status.message)
}