package com.appdev.schoudhary.jcpInKotlin

import com.appdev.schoudhary.jcpInKotlin.EventListener as EventListener1

class SafeListener {
    private val  listener: EventListener1 = object : EventListener1 {
        override fun onEvent(e: Event?) {
            doSomething(e)
        }
    }

    fun newInstance(source: EventSource): SafeListener {
        val safeListener = SafeListener()
        source.registerListener(safeListener.listener)
        return safeListener
    }
}