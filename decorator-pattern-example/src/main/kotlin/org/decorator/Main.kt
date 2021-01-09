package org.decorator

import org.decorator.entity.BronzeFeatures
import org.decorator.entity.GoldFeatures
import org.decorator.interfaces.Hosting

/**
 * @author Paul Rodriguez-Ch
 */
object Main {
    @JvmStatic
    fun main(args: Array<String>){
        print(" ============= MY CUSTOMIZED HOSTING PLAN =============\n")
        val myCustomizedHostingPlan: Hosting = GoldFeatures(BronzeFeatures (HostingImpl()))
        print(myCustomizedHostingPlan.getFeatures())
        print("\nTOTAL MONTHLY PRICE: " + myCustomizedHostingPlan.getMonthlyPrice() + "\n")
    }
}