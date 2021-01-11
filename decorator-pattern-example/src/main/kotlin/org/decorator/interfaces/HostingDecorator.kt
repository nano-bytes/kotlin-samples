package org.decorator.interfaces

import java.math.BigDecimal

/**
 * @author Paul Rodriguez-Ch
 */
abstract class HostingDecorator(
    open val hosting: Hosting
): Hosting {

    override fun getFeatures(): String {
        return hosting.getFeatures()
    }

    override fun getMonthlyPrice(): BigDecimal {
        return hosting.getMonthlyPrice()
    }
}