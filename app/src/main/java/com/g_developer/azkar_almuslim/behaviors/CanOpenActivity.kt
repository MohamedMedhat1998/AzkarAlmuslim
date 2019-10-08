package com.g_developer.azkar_almuslim.behaviors

interface CanOpenActivity {
    fun openActivity(target: Class<*>, data: Any = Unit)
}