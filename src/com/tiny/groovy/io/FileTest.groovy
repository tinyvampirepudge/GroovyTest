package com.tiny.groovy.io

// 打印文件内容
def printFile(){
    // 创建File对象
    def targetFile = new File("../../../../../GroovyTest.iml")
    // 读取该文件中的每一行
    targetFile.eachLine {
        String oneLine ->
            println oneLine
    }
}

printFile()


// copy 文件
def copyFile(){
    def srcFile = new File("../../../../../GroovyTest.iml")
    def targetFile = new File("abc.iml")
    targetFile.withOutputStream {
        os ->
            srcFile.withInputStream {
                ins ->
                    os << ins // 利用OutputStream#leftShift的操作符重载<<，完成从InputStream到OutputStream的输出
            }
    }
}

copyFile()