package com.example.demo.app

import com.example.demo.view.WeatherForecast
import javafx.stage.Stage
import tornadofx.*

class MyApp: App(WeatherForecast::class, Styles::class) {
    init {
        reloadViewsOnFocus()
        reloadStylesheetsOnFocus()
    }
    override fun start(stage: Stage) {
        with(stage) {
            width = 1200.0
            height = 600.0
        }
        super.start(stage)
    }
}
