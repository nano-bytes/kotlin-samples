package org.decorator

import org.decorator.interfaces.Hosting
import java.math.BigDecimal

/**
 * @author Paul Rodriguez-Ch
 */
class HostingImpl: Hosting {
    override fun getFeatures(): String {
        return """
            This is a Hosting Service
            Top Features:
            - 1 Website
            - Linux Servers
            - Free SSL
            - 1 Free Domain
            - Unlimited Subdomains
            - 20 GB SSD Storage
            - Python/NodeJs compatibility
            - 5 Databases
            - 24/7 Support
        """.trimIndent()
    }

    override fun getMonthlyPrice(): BigDecimal {
        return BigDecimal("5.99")
    }
}