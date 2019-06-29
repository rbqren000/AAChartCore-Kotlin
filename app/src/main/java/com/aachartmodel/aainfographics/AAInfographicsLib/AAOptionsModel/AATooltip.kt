/**
 * Copyright (C), 2015-2019
 * FileName: AATooltip
 * Author: ios-fn
 * Date: 2019-06-16 19:04
 * Description:
 * History:
 */
package com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel

import com.aachartmodel.aainfographics.AAInfographicsLib.AAChartConfiger.AAEasyTool


class AATooltip {
    private var backgroundColor: String? = null
    private var borderColor: String? = null
    private var borderRadius: Float? = null
    private var borderWidth: Float? = null
    private var style: AAStyle? = null
    private var enabled: Boolean? = null
    private var useHTML: Boolean? = null
    private var formatter: String? = null
    private var headerFormat: String? = null
    private var pointFormat: String? = null
    private var footerFormat: String? = null
    private var valueDecimals: Int? = null
    private var shared: Boolean? = null
    private var crosshairs: Boolean? = null
    private var valueSuffix: String? = null

    fun backgroundColor(prop: String): AATooltip {
        backgroundColor = prop
        return this
    }

    fun borderColor(prop: String): AATooltip {
        borderColor = prop
        return this
    }

    fun borderRadius(prop: Float?): AATooltip {
        borderRadius = prop
        return this
    }

    fun borderWidth(prop: Float?): AATooltip {
        borderWidth = prop
        return this
    }

    fun style(prop: AAStyle): AATooltip {
        style = prop
        return this
    }

    fun enabled(prop: Boolean?): AATooltip {
        enabled = prop
        return this
    }

    fun useHTML(prop: Boolean?): AATooltip {
        useHTML = prop
        return this
    }

    fun formatter(prop: String): AATooltip {
        var pureJSFunctionStr = "($prop)"
        pureJSFunctionStr = AAEasyTool.pureJavaScriptFunctionString(pureJSFunctionStr)
        formatter = pureJSFunctionStr
        return this
    }

    fun headerFormat(prop: String): AATooltip {
        headerFormat = prop
        return this
    }

    fun pointFormat(prop: String): AATooltip {
        pointFormat = prop
        return this
    }

    fun footerFormat(prop: String): AATooltip {
        footerFormat = prop
        return this
    }

    fun valueDecimals(prop: Int?): AATooltip {
        valueDecimals = prop
        return this
    }

    fun shared(prop: Boolean?): AATooltip {
        shared = prop
        return this
    }

    fun crosshairs(prop: Boolean?): AATooltip {
        crosshairs = prop
        return this
    }

    fun valueSuffix(prop: String): AATooltip {
        valueSuffix = prop
        return this
    }


}


class AAStyle {

    private var color: String? = null
    private var fontSize: String? = null
    private var fontWeight: String? = null
    private var textOutLine: String? = null

    fun color(prop: String): AAStyle {
        color = prop
        return this
    }

    fun fontSize(prop: String): AAStyle {
        fontSize = prop
        return this
    }

    fun fontWeight(prop: String): AAStyle {
        fontWeight = prop
        return this
    }

    fun textOutLine(prop: String): AAStyle {
        textOutLine = prop
        return this
    }

}
