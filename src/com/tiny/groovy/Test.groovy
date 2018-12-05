package com.tiny.groovy

import groovy.transform.Field // 必须要先 import

@Field x = 1 // 在 x 前面加上@Field 标注，这样，x 就彻彻底底是 test 的成员变量了。

def printx(){
    println x
}

printx()