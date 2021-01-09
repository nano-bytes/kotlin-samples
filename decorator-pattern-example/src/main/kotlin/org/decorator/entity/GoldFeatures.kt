package org.decorator.entity

import org.decorator.interfaces.Hosting
import org.decorator.interfaces.HostingDecorator
import java.math.BigDecimal

/**
 * @author Paul Rodriguez-Ch
 */
class GoldFeatures (
    override val hosting: Hosting
) : HostingDecorator(hosting) {

    override fun getFeatures(): String {
        return super.getFeatures() + "\n" + getGoldFeatures()
    }

    override fun getMonthlyPrice(): BigDecimal {
        return super.getMonthlyPrice().add(getAdditionalMonthlyValue())
    }

    private fun getGoldFeatures(): String {
        return """
            Gold Features:
            - Java/Ruby/Rust compatibility
            - Unlimited Websites
            - Unlimited Storage
            - Free Dedicated IP
            - Free Automated Backup
        """.trimIndent()
    }

    private fun getAdditionalMonthlyValue(): BigDecimal {
        return BigDecimal("5.99")
    }
}