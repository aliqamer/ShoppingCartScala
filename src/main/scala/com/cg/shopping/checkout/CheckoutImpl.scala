package com.cg.shopping.checkout

import com.cg.shopping.service.{PriceCalculator, PriceCalculatorImpl}
import com.cg.shopping.util.CurrencyFormatter

/**
  * Created by Ali on 8/20/2017.
  */
class CheckoutImpl(priceCalculator: PriceCalculator)  {

  def doCheckout(fruits : List[String]) : String = {

      CurrencyFormatter.formatGB(priceCalculator.caclulatePrice(fruits))
  }


}
