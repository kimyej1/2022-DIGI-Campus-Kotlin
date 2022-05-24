package com.kbstar.kotlin

class A40KotlinUser {
    companion object {
        const val LEVEL = "KotlinAdmin"
        @JvmStatic fun login() = println("Login From Kotlin")  // Java Virtual Machine Static
    }
}