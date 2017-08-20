package com.cg.shopping.service

import com.cg.shopping.items.Fruit

/**
  * Created by Ali on 8/20/2017.
  */
trait PriceCalculator {

  def caclulatePrice(fruits : List[String]) : Double

}

class PriceCalculatorImpl extends PriceCalculator {

  override def caclulatePrice(fruits: List[String]): Double = {

    var res : Double = 0

    for(fruit <- fruits) {

      if("apple".equalsIgnoreCase(fruit)) {

        val applePrice : Int = Fruit.fruits("apple")
        res += applePrice

      } else if("orange".equalsIgnoreCase(fruit)) {

        val orangePrice : Int = Fruit.fruits("orange")
        res += orangePrice

      }
    }
    res/100
  }
}