package com.cg.shopping.service

import com.cg.shopping.offer.{AppleOffer, OrangeOffer}

/**
  * Created by Ali on 8/20/2017.
  */
trait PriceCalculator {

  def caclulatePrice(fruits : List[String]) : Double

}

class PriceCalculatorImpl(appleOffer : AppleOffer, orangeOffer: OrangeOffer) extends PriceCalculator {

  /**
    * This method returns final cost by applying all offers on list of provided fruits
    * @param fruits
    * @return final cost on list of fruits
    */
  override def caclulatePrice(fruits: List[String]): Double = {

    var res : Double = 0

    var applesCount = 0
    var orangesCount = 0

    for(fruit <- fruits) {
      if("apple".equalsIgnoreCase(fruit)) {
        applesCount += 1
      }else if("orange".equalsIgnoreCase(fruit)) {
        orangesCount += 1;
      }
    }

    /**
      * calculations of price work is delegated to Offer trait
      */
    if(applesCount > 0){
      res += appleOffer.applyOffer(applesCount)
    }

    if(orangesCount > 0){
      res += orangeOffer.applyOffer(orangesCount)
    }

    res/100
  }
}