package com.sf.jkt.k.testex


interface EmailGenerator {
    fun generate(): String
}

class RandomEmailGenerator : EmailGenerator {
    override fun generate(): String {
        return "623667783@qq.com"
    }
}
