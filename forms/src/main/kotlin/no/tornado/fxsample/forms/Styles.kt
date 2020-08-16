package no.tornado.fxsample.forms

import tornadofx.*

class Styles : Stylesheet() {

    companion object {
        val zip by cssclass()
    }

    init {
        s(form) {
            padding = box(30.px)
            prefWidth = 450.px

            s(zip) {
                maxWidth = 60.px
                minWidth = maxWidth
            }
        }
    }
}