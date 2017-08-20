package com.cg.shopping.offer

import com.cg.shopping.items.Fruit

/**
  * Created by Ali on 8/21/2017.
  *
  */
trait Offer {

  def applyOffer(fruitsCount : Int) : Double

}

/**
  * Using Strategy Pattern Offers are encapsulated in separate class such that
  * if any new offers are added there won't by any change in PriceCalulator class
  * Which means changes (Offers) can be added without compiling PriceCalculator class !
  */
class AppleOffer extends Offer {

  /**
    * Apple offer return buy 1 get 1 price values
    * @param appleCount
    * @return
    */
  override def applyOffer(appleCount : Int): Double = {

    var offeredAmount : Double = 0
    if(appleCount % 2 == 0){
      offeredAmount = Fruit.fruits("apple") * appleCount / 2
    }else {
      offeredAmount = Fruit.fruits("apple") * (appleCount-1) / 2 + Fruit.fruits("apple")
    }

    offeredAmount
  }
}


class OrangeOffer extends Offer {

  /*
  Oranges offer is buy 3 for price of 2 oranges
 */
  override def applyOffer(orangeCount : Int): Double = {

    var offeredAmount : Double = 0
    if(orangeCount%3 == 0){
      offeredAmount = Fruit.fruits("orange") * (orangeCount / 3 * 2)
    }else if(orangeCount%3 == 1){
      offeredAmount = Fruit.fruits("orange") * (orangeCount / 3 * 2) + Fruit.fruits("orange")
    }else if(orangeCount%3 == 2){
      offeredAmount = Fruit.fruits("orange") * (orangeCount / 3 * 2) + Fruit.fruits("orange") * 2
    }

    offeredAmount
  }
}