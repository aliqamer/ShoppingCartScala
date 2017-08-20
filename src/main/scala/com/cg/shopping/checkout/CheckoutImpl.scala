package com.cg.shopping.checkout

import com.cg.shopping.service.PriceCalculator
import com.cg.shopping.util.CurrencyFormatter

/**
  * Created by Ali on 8/20/2017.
  */
class CheckoutImpl(priceCalculator: PriceCalculator)  {

  /**
    * This method is takes list of fruits as input and return final cost
    * @param fruits
    * @return final cost with currency formatted
    */
  def doCheckout(fruits : List[String]) : String = {

      CurrencyFormatter.formatGB(priceCalculator.caclulatePrice(fruits))
  }


}
