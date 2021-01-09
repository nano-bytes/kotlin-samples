package org.decorator.interfaces

import java.math.BigDecimal

/**
 * @author Paul Rodriguez-Ch
 */
interface Hosting {
    fun getFeatures(): String
    fun getMonthlyPrice(): BigDecimal
}