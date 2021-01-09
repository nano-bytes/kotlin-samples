package org.decorator.entity

import org.decorator.interfaces.HostingDecorator
import org.decorator.interfaces.Hosting
import java.math.BigDecimal

/**
 * @author Paul Rodriguez-Ch
 */
class BronzeFeatures (
    override val hosting: Hosting
    ) : HostingDecorator(hosting) {

    override fun getFeatures(): String {
        return super.getFeatures() + "\n" + getBronzeFeatures()
    }

    override fun getMonthlyPrice(): BigDecimal {
        return super.getMonthlyPrice().add(getAdditionalMonthlyValue())
    }

    private fun getBronzeFeatures(): String {
        return """
            Bronze Features:
            - SSH Access
            - 20 GB SSD Additional Storage
            - Free CDN Included
        """.trimIndent()
    }

    private fun getAdditionalMonthlyValue(): BigDecimal {
        return BigDecimal("2.25")
    }
}