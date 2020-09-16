package com.example.demo.enum

/**
 *
 * @author leon
 * @date 2020/9/16
 */
enum class ResultStatus(val code: Int, val message: String) {

    DELETE_SUCCESS(204, "删除成功"),
    NOT_FOUND(404, "找不到对应的资源"),
    UNKNOWN_ERROR(500, "未知错误"),
}